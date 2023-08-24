/*
 * RestApiClient
 *
 * This file was automatically generated for XionGlobal by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.xionglobal.api.client.controllers;

import com.xionglobal.api.client.exceptions.ApiException;
import com.xionglobal.api.client.models.MerchantTokenResponse;
import com.xionglobal.api.client.models.RegisterMasterMerchantRequest;
import com.xionglobal.api.client.models.RegisterSubMerchantRequest;
import java.io.IOException;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface MerchantController {
    /**
     * This endpoint is used to register master merchant.
     * @param  body  Optional parameter: Example:
     * @return    Returns the MerchantTokenResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    MerchantTokenResponse registerMasterMerchant(
            final RegisterMasterMerchantRequest body) throws ApiException, IOException;

    /**
     * This endpoint is used to register sub merchant.
     * @param  body  Optional parameter: Example:
     * @return    Returns the MerchantTokenResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    MerchantTokenResponse registerSubMerchant(
            final RegisterSubMerchantRequest body) throws ApiException, IOException;

}