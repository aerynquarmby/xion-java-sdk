/*
 * RestApiClient
 *
 * This file was automatically generated for XionGlobal by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.xionglobal.api.client.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xionglobal.api.client.ApiHelper;
import com.xionglobal.api.client.Server;
import com.xionglobal.api.client.exceptions.ApiException;
import com.xionglobal.api.client.exceptions.ErrorResponseException;
import com.xionglobal.api.client.http.request.HttpMethod;
import com.xionglobal.api.client.models.ListClientAppsResponse;
import com.xionglobal.api.client.models.RegisterTokenRequest;
import com.xionglobal.api.client.models.RegisterTokenResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultAuthController extends BaseController implements AuthController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultAuthController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This endpoint is used to register a new client access.
     * @param  body  Optional parameter: Example:
     * @return    Returns the RegisterTokenResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public RegisterTokenResponse register(
            final RegisterTokenRequest body) throws ApiException, IOException {
        return prepareRegisterRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for register.
     */
    private ApiCall<RegisterTokenResponse, ApiException> prepareRegisterRequest(
            final RegisterTokenRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<RegisterTokenResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/register/token")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, RegisterTokenResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad Request",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("Internal Server Error",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint is used to get a list of client Ids created by the merchant.
     * @param  merchantWalletAddress  Required parameter: Example:
     * @return    Returns the ListClientAppsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListClientAppsResponse getClientIds(
            final String merchantWalletAddress) throws ApiException, IOException {
        return prepareGetClientIdsRequest(merchantWalletAddress).execute();
    }

    /**
     * Builds the ApiCall object for getClientIds.
     */
    private ApiCall<ListClientAppsResponse, ApiException> prepareGetClientIdsRequest(
            final String merchantWalletAddress) throws IOException {
        return new ApiCall.Builder<ListClientAppsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/clientapps/{merchantWalletAddress}")
                        .templateParam(param -> param.key("merchantWalletAddress").value(merchantWalletAddress)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListClientAppsResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad Request",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("Internal Server Error",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint is used to delete a registered client app.
     * @param  merchantWalletAddress  Required parameter: Example:
     * @param  clientId  Required parameter: Example:
     * @return    Returns the String response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public String deleteClientApp(
            final String merchantWalletAddress,
            final String clientId) throws ApiException, IOException {
        return prepareDeleteClientAppRequest(merchantWalletAddress, clientId).execute();
    }

    /**
     * Builds the ApiCall object for deleteClientApp.
     */
    private ApiCall<String, ApiException> prepareDeleteClientAppRequest(
            final String merchantWalletAddress,
            final String clientId) throws IOException {
        return new ApiCall.Builder<String, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/clientapp/{merchantWalletAddress}/{clientId}")
                        .templateParam(param -> param.key("merchantWalletAddress").value(merchantWalletAddress)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("clientId").value(clientId)
                                .shouldEncode(true))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> new String(response))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad Request",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("Internal Server Error",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}