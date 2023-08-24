/*
 * RestApiClient
 *
 * This file was automatically generated for XionGlobal by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.xionglobal.api.client.controllers;

import com.xionglobal.api.client.exceptions.ApiException;
import com.xionglobal.api.client.models.SingleBillPaymentRequest;
import com.xionglobal.api.client.models.SingleBillPaymentResponse;
import java.io.IOException;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface SingleBillPaymentsController {
    /**
     * This endpoint is used to make a single bill payment.
     * @param  body  Optional parameter: Example:
     * @return    Returns the SingleBillPaymentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    SingleBillPaymentResponse singleBillPayment(
            final SingleBillPaymentRequest body) throws ApiException, IOException;

    /**
     * This endpoint is used to get the status of an order.
     * @param  orderCode  Required parameter: Example:
     * @return    Returns the String response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    String getOrderStatus(
            final String orderCode) throws ApiException, IOException;

}