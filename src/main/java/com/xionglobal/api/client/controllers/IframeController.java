/*
 * RestApiClient
 *
 * This file was automatically generated for XionGlobal by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.xionglobal.api.client.controllers;

import com.xionglobal.api.client.exceptions.ApiException;
import com.xionglobal.api.client.models.IframeProductResponse;
import com.xionglobal.api.client.models.IframeProductsRequest;
import com.xionglobal.api.client.models.IframeProductsResponse;
import java.io.IOException;
import java.util.List;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface IframeController {
    /**
     * This endpoint is used to create iframe products.
     * @param  body  Optional parameter: Example:
     * @return    Returns the List of IframeProductsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    List<IframeProductsResponse> createIframeProducts(
            final List<IframeProductsRequest> body) throws ApiException, IOException;

    /**
     * This endpoint is used to get iframe products.
     * @return    Returns the List of IframeProductsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    List<IframeProductsResponse> getIframeProducts() throws ApiException, IOException;

    /**
     * This endpoint is used to get product by code.
     * @param  referenceId  Required parameter: Example:
     * @param  price  Optional parameter: Example:
     * @return    Returns the IframeProductResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    IframeProductResponse getIframeProductByCode(
            final String referenceId,
            final String price) throws ApiException, IOException;

    /**
     * This endpoint is used to get product.
     * @param  body  Optional parameter: Example:
     * @return    Returns the List of IframeProductsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    List<IframeProductsResponse> updateIframeProducts(
            final List<IframeProductsRequest> body) throws ApiException, IOException;

}