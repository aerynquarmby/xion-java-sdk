/*
 * RestApiClient
 *
 * This file was automatically generated for XionGlobal by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.xionglobal.api.client.controllers;

import com.xionglobal.api.client.ApiHelper;
import com.xionglobal.api.client.Server;
import com.xionglobal.api.client.exceptions.ApiException;
import com.xionglobal.api.client.http.request.HttpMethod;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultGeneralAPIController extends BaseController implements GeneralAPIController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultGeneralAPIController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This endpoint is used to check the health of the API.
     * @return    Returns the String response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public String health() throws ApiException, IOException {
        return prepareHealthRequest().execute();
    }

    /**
     * Builds the ApiCall object for health.
     */
    private ApiCall<String, ApiException> prepareHealthRequest() throws IOException {
        return new ApiCall.Builder<String, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/health")
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> new String(response))
                        .nullify404(false)
                        .localErrorCase("500",
                                 ErrorCase.setReason("Internal Server Error",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}