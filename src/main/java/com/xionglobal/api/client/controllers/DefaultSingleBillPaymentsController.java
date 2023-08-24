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
import com.xionglobal.api.client.models.SingleBillPaymentRequest;
import com.xionglobal.api.client.models.SingleBillPaymentResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultSingleBillPaymentsController extends BaseController implements SingleBillPaymentsController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultSingleBillPaymentsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This endpoint is used to make a single bill payment.
     * @param  body  Optional parameter: Example:
     * @return    Returns the SingleBillPaymentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SingleBillPaymentResponse singleBillPayment(
            final SingleBillPaymentRequest body) throws ApiException, IOException {
        return prepareSingleBillPaymentRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for singleBillPayment.
     */
    private ApiCall<SingleBillPaymentResponse, ApiException> prepareSingleBillPaymentRequest(
            final SingleBillPaymentRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<SingleBillPaymentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/single/payment")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SingleBillPaymentResponse.class))
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
     * This endpoint is used to get the status of an order.
     * @param  orderCode  Required parameter: Example:
     * @return    Returns the String response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public String getOrderStatus(
            final String orderCode) throws ApiException, IOException {
        return prepareGetOrderStatusRequest(orderCode).execute();
    }

    /**
     * Builds the ApiCall object for getOrderStatus.
     */
    private ApiCall<String, ApiException> prepareGetOrderStatusRequest(
            final String orderCode) throws IOException {
        return new ApiCall.Builder<String, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/order/status/{orderCode}")
                        .templateParam(param -> param.key("orderCode").value(orderCode)
                                .shouldEncode(true))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
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