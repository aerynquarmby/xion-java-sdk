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
import com.xionglobal.api.client.models.ApprovalsRequest;
import com.xionglobal.api.client.models.MultiChainSingleBillPaymentRequest;
import com.xionglobal.api.client.models.MultiChainSinglePaymentResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultMultiChainController extends BaseController implements MultiChainController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultMultiChainController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This endpoint is used to make a multi chain single bill payment.
     * @param  body  Optional parameter: Example:
     * @return    Returns the MultiChainSinglePaymentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public MultiChainSinglePaymentResponse multiChainSingleBillPayment(
            final MultiChainSingleBillPaymentRequest body) throws ApiException, IOException {
        return prepareMultiChainSingleBillPaymentRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for multiChainSingleBillPayment.
     */
    private ApiCall<MultiChainSinglePaymentResponse, ApiException> prepareMultiChainSingleBillPaymentRequest(
            final MultiChainSingleBillPaymentRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<MultiChainSinglePaymentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.WEBSOCKET.value())
                        .path("/multi-chain/single/payment")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, MultiChainSinglePaymentResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad Request",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("Internal Server Error",
                                (reason, context) -> new ErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint is used to post approvals.
     * @param  body  Optional parameter: Example:
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void postApprovals(
            final ApprovalsRequest body) throws ApiException, IOException {
        preparePostApprovalsRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for postApprovals.
     */
    private ApiCall<Void, ApiException> preparePostApprovalsRequest(
            final ApprovalsRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.WEBSOCKET.value())
                        .path("/approvals")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
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