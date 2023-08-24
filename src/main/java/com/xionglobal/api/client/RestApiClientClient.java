/*
 * RestApiClient
 *
 * This file was automatically generated for XionGlobal by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.xionglobal.api.client;

import com.xionglobal.api.client.controllers.AuthController;
import com.xionglobal.api.client.controllers.DefaultAuthController;
import com.xionglobal.api.client.controllers.DefaultGeneralAPIController;
import com.xionglobal.api.client.controllers.DefaultIframeController;
import com.xionglobal.api.client.controllers.DefaultMerchantController;
import com.xionglobal.api.client.controllers.DefaultMultiChainController;
import com.xionglobal.api.client.controllers.DefaultSingleBillPaymentsController;
import com.xionglobal.api.client.controllers.GeneralAPIController;
import com.xionglobal.api.client.controllers.IframeController;
import com.xionglobal.api.client.controllers.MerchantController;
import com.xionglobal.api.client.controllers.MultiChainController;
import com.xionglobal.api.client.controllers.SingleBillPaymentsController;
import com.xionglobal.api.client.http.client.HttpCallback;
import com.xionglobal.api.client.http.client.HttpClientConfiguration;
import com.xionglobal.api.client.http.client.ReadonlyHttpClientConfiguration;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.authentication.Authentication;
import io.apimatic.coreinterfaces.compatibility.CompatibilityFactory;
import io.apimatic.coreinterfaces.http.HttpClient;
import io.apimatic.okhttpclient.adapter.OkClient;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Gateway class for the library.
 * This class acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public final class RestApiClientClient implements RestApiClientClientInterface {

    /**
     * Private store for controllers.
     */
    private GeneralAPIController generalAPI;
    private AuthController auth;
    private SingleBillPaymentsController singleBillPayments;
    private IframeController iframe;
    private MultiChainController multiChain;
    private MerchantController merchant;

    private static final CompatibilityFactory compatibilityFactory = new CompatibilityFactoryImpl();

    private static String userAgent = "xionglobal-sdk v2.0.0 - Java";

    /**
     * Current API environment.
     */
    private final Environment environment;

    /**
     * The HTTP Client instance to use for making HTTP requests.
     */
    private final HttpClient httpClient;

    /**
     * Http Client Configuration instance.
     */
    private final ReadonlyHttpClientConfiguration httpClientConfig;

    /**
     * BearerAuthManager.
     */
    private BearerAuthManager bearerAuthManager;

    /**
     * Map of authentication Managers.
     */
    private Map<String, Authentication> authentications;


    /**
     * Callback to be called before and after the HTTP call for an endpoint is made.
     */
    private final HttpCallback httpCallback;

    private RestApiClientClient(Environment environment, HttpClient httpClient,
            ReadonlyHttpClientConfiguration httpClientConfig, String accessToken,
            Map<String, Authentication> authentications, HttpCallback httpCallback) {
        this.environment = environment;
        this.httpClient = httpClient;
        this.httpClientConfig = httpClientConfig;
        this.httpCallback = httpCallback;
        this.authentications = 
                (authentications == null) ? new HashMap<>() : new HashMap<>(authentications);
        if (this.authentications.containsKey("global")) {
            this.bearerAuthManager = (BearerAuthManager) this.authentications.get("global");
        }

        if (!this.authentications.containsKey("global")
                || !getBearerAuthCredentials().equals(accessToken)) {
            this.bearerAuthManager = new BearerAuthManager(accessToken);
            this.authentications.put("global", bearerAuthManager);
        }

        GlobalConfiguration globalConfig = new GlobalConfiguration.Builder()
                .authentication(this.authentications).compatibilityFactory(compatibilityFactory)
                .httpClient(httpClient).baseUri(server -> getBaseUri(server))
                .callback(httpCallback)
                .userAgent(userAgent)
                .build();
        generalAPI = new DefaultGeneralAPIController(globalConfig);
        auth = new DefaultAuthController(globalConfig);
        singleBillPayments = new DefaultSingleBillPaymentsController(globalConfig);
        iframe = new DefaultIframeController(globalConfig);
        multiChain = new DefaultMultiChainController(globalConfig);
        merchant = new DefaultMerchantController(globalConfig);
    }

    /**
     * Shutdown the underlying HttpClient instance.
     */
    public static void shutdown() {
        OkClient.shutdown();
    }

    /**
     * Get the instance of GeneralAPIController.
     * @return generalAPI
     */
    public GeneralAPIController getGeneralAPIController() {
        return generalAPI;
    }

    /**
     * Get the instance of AuthController.
     * @return auth
     */
    public AuthController getAuthController() {
        return auth;
    }

    /**
     * Get the instance of SingleBillPaymentsController.
     * @return singleBillPayments
     */
    public SingleBillPaymentsController getSingleBillPaymentsController() {
        return singleBillPayments;
    }

    /**
     * Get the instance of IframeController.
     * @return iframe
     */
    public IframeController getIframeController() {
        return iframe;
    }

    /**
     * Get the instance of MultiChainController.
     * @return multiChain
     */
    public MultiChainController getMultiChainController() {
        return multiChain;
    }

    /**
     * Get the instance of MerchantController.
     * @return merchant
     */
    public MerchantController getMerchantController() {
        return merchant;
    }

    /**
     * Current API environment.
     * @return environment
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * The HTTP Client instance to use for making HTTP requests.
     * @return httpClient
     */
    private HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Http Client Configuration instance.
     * @return httpClientConfig
     */
    public ReadonlyHttpClientConfiguration getHttpClientConfig() {
        return httpClientConfig;
    }

    /**
     * The credentials to use with BearerAuth.
     * @return bearerAuthCredentials
     */
    private BearerAuthCredentials getBearerAuthCredentials() {
        return bearerAuthManager;
    }

    /**
     * OAuth 2.0 Access Token.
     * @return accessToken
     */
    public String getAccessToken() {
        return getBearerAuthCredentials().getAccessToken();
    }
    /**
     * The timeout to use for making HTTP requests.
     * @deprecated This method will be removed in a future version. Use
     *             {@link #getHttpClientConfig()} instead.
     *
     * @return timeout
     */
    @Deprecated
    public long timeout() {
        return httpClientConfig.getTimeout();
    }

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(Server server) {
        Map<String, SimpleEntry<Object, Boolean>> parameters = new HashMap<>();
        StringBuilder baseUrl = new StringBuilder(environmentMapper(environment, server));
        ApiHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    public String getBaseUri() {
        return getBaseUri(Server.ENUM_DEFAULT);
    }


    /**
     * Get base URI by current environment.
     * 
     * @param server string for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(String server) {
        return getBaseUri(Server.fromString(server));
    }


    /**
     * Base URLs by environment and server aliases.
     * @param environment Environment for which to get the base URI
     * @param server Server for which to get the base URI
     * @return base URL
     */
    private static String environmentMapper(Environment environment, Server server) {
        if (environment.equals(Environment.PRODUCTION)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "https://prodp-api.xion.app/api/v2";
            }
            if (server.equals(Server.WEBSOCKET)) {
                return "https://prodp-api.xion.app/ws";
            }
        }
        if (environment.equals(Environment.SANDBOX)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "https://devp-api.xion.app/api/v2";
            }
            if (server.equals(Server.WEBSOCKET)) {
                return "https://devp-api.xion.app/ws";
            }
        }
        return "https://prodp-api.xion.app/api/v2";
    }

    /**
     * Converts this RestApiClientClient into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RestApiClientClient [" + "environment=" + environment + ", httpClientConfig="
                + httpClientConfig + ", authentications=" + authentications + "]";
    }

    /**
     * Builds a new {@link RestApiClientClient.Builder} object.
     * Creates the instance with the state of the current client.
     * @return a new {@link RestApiClientClient.Builder} object
     */
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.environment = getEnvironment();
        builder.httpClient = getHttpClient();
        builder.accessToken = getBearerAuthCredentials().getAccessToken();
        builder.authentications = authentications;
        builder.httpCallback = httpCallback;
        builder.httpClientConfig(configBldr -> configBldr =
                ((HttpClientConfiguration) httpClientConfig).newBuilder());
        return builder;
    }

    /**
     * Class to build instances of {@link RestApiClientClient}.
     */
    public static class Builder {

        private Environment environment = Environment.PRODUCTION;
        private HttpClient httpClient;
        private String accessToken = "";
        private Map<String, Authentication> authentications = null;
        private HttpCallback httpCallback = null;
        private HttpClientConfiguration.Builder httpClientConfigBuilder =
                new HttpClientConfiguration.Builder();


        /**
         * Credentials setter for BearerAuth.
         * @param accessToken String value for accessToken.
         * @return Builder
         */
        public Builder accessToken(String accessToken) {
            if (accessToken == null) {
                throw new NullPointerException("AccessToken cannot be null.");
            }
            this.accessToken = accessToken;
            return this;
        }

        /**
         * Current API environment.
         * @param environment The environment for client.
         * @return Builder
         */
        public Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        /**
         * The timeout to use for making HTTP requests.
         * @deprecated This method will be removed in a future version. Use
         *             {@link #httpClientConfig(Consumer) httpClientConfig} instead.
         * @param timeout must be greater then 0.
         * @return Builder
         */
        @Deprecated
        public Builder timeout(long timeout) {
            this.httpClientConfigBuilder.timeout(timeout);
            return this;
        }

        /**
         * HttpCallback.
         * @param httpCallback Callback to be called before and after the HTTP call.
         * @return Builder
         */
        public Builder httpCallback(HttpCallback httpCallback) {
            this.httpCallback = httpCallback;
            return this;
        }

        /**
         * Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param action Consumer for the builder of httpClientConfiguration.
         * @return Builder
         */
        public Builder httpClientConfig(Consumer<HttpClientConfiguration.Builder> action) {
            action.accept(httpClientConfigBuilder);
            return this;
        }

        /**
         * Builds a new RestApiClientClient object using the set fields.
         * @return RestApiClientClient
         */
        public RestApiClientClient build() {
            HttpClientConfiguration httpClientConfig = httpClientConfigBuilder.build();
            httpClient = new OkClient(httpClientConfig.getConfiguration(), compatibilityFactory);

            return new RestApiClientClient(environment, httpClient, httpClientConfig, accessToken,
                    authentications, httpCallback);
        }
    }
}