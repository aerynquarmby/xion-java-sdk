/*
 * RestApiClient
 *
 * This file was automatically generated for XionGlobal by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.xionglobal.api.client.controllers;

import com.xionglobal.api.client.exceptions.ApiException;
import com.xionglobal.api.client.models.ListClientAppsResponse;
import com.xionglobal.api.client.models.RegisterTokenRequest;
import com.xionglobal.api.client.models.RegisterTokenResponse;
import java.io.IOException;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface AuthController {
    /**
     * This endpoint is used to register a new client access.
     * @param  body  Optional parameter: Example:
     * @return    Returns the RegisterTokenResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    RegisterTokenResponse register(
            final RegisterTokenRequest body) throws ApiException, IOException;

    /**
     * This endpoint is used to get a list of client Ids created by the merchant.
     * @param  merchantWalletAddress  Required parameter: Example:
     * @return    Returns the ListClientAppsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ListClientAppsResponse getClientIds(
            final String merchantWalletAddress) throws ApiException, IOException;

    /**
     * This endpoint is used to delete a registered client app.
     * @param  merchantWalletAddress  Required parameter: Example:
     * @param  clientId  Required parameter: Example:
     * @return    Returns the String response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    String deleteClientApp(
            final String merchantWalletAddress,
            final String clientId) throws ApiException, IOException;

}