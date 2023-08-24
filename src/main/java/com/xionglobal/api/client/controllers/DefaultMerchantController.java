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
import com.xionglobal.api.client.models.MerchantTokenResponse;
import com.xionglobal.api.client.models.RegisterMasterMerchantRequest;
import com.xionglobal.api.client.models.RegisterSubMerchantRequest;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultMerchantController extends BaseController implements MerchantController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultMerchantController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This endpoint is used to register master merchant.
     * @param  body  Optional parameter: Example:
     * @return    Returns the MerchantTokenResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public MerchantTokenResponse registerMasterMerchant(
            final RegisterMasterMerchantRequest body) throws ApiException, IOException {
        return prepareRegisterMasterMerchantRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for registerMasterMerchant.
     */
    private ApiCall<MerchantTokenResponse, ApiException> prepareRegisterMasterMerchantRequest(
            final RegisterMasterMerchantRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<MerchantTokenResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/register/master-merchant")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, MerchantTokenResponse.class))
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
     * This endpoint is used to register sub merchant.
     * @param  body  Optional parameter: Example:
     * @return    Returns the MerchantTokenResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public MerchantTokenResponse registerSubMerchant(
            final RegisterSubMerchantRequest body) throws ApiException, IOException {
        return prepareRegisterSubMerchantRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for registerSubMerchant.
     */
    private ApiCall<MerchantTokenResponse, ApiException> prepareRegisterSubMerchantRequest(
            final RegisterSubMerchantRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<MerchantTokenResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/register/sub-merchant")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, MerchantTokenResponse.class))
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