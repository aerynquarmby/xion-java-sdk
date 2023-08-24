/*
 * RestApiClient
 *
 * This file was automatically generated for XionGlobal by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.xionglobal.api.client.controllers;

import com.xionglobal.api.client.exceptions.ApiException;
import java.io.IOException;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface GeneralAPIController {
    /**
     * This endpoint is used to check the health of the API.
     * @return    Returns the String response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    String health() throws ApiException, IOException;

}