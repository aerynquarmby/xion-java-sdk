/*
 * RestApiClient
 *
 * This file was automatically generated for XionGlobal by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.xionglobal.api.client.controllers;

import com.xionglobal.api.client.exceptions.ApiException;
import com.xionglobal.api.client.models.ApprovalsRequest;
import com.xionglobal.api.client.models.MultiChainSingleBillPaymentRequest;
import com.xionglobal.api.client.models.MultiChainSinglePaymentResponse;
import java.io.IOException;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface MultiChainController {
    /**
     * This endpoint is used to make a multi chain single bill payment.
     * @param  body  Optional parameter: Example:
     * @return    Returns the MultiChainSinglePaymentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    MultiChainSinglePaymentResponse multiChainSingleBillPayment(
            final MultiChainSingleBillPaymentRequest body) throws ApiException, IOException;

    /**
     * This endpoint is used to post approvals.
     * @param  body  Optional parameter: Example:
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    void postApprovals(
            final ApprovalsRequest body) throws ApiException, IOException;

}