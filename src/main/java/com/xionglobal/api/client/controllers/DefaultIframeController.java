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
import com.xionglobal.api.client.models.IframeProductResponse;
import com.xionglobal.api.client.models.IframeProductsRequest;
import com.xionglobal.api.client.models.IframeProductsResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.List;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultIframeController extends BaseController implements IframeController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultIframeController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This endpoint is used to create iframe products.
     * @param  body  Optional parameter: Example:
     * @return    Returns the List of IframeProductsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<IframeProductsResponse> createIframeProducts(
            final List<IframeProductsRequest> body) throws ApiException, IOException {
        return prepareCreateIframeProductsRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for createIframeProducts.
     */
    private ApiCall<List<IframeProductsResponse>, ApiException> prepareCreateIframeProductsRequest(
            final List<IframeProductsRequest> body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<List<IframeProductsResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/iframe/create-product")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        IframeProductsResponse[].class))
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
     * This endpoint is used to get iframe products.
     * @return    Returns the List of IframeProductsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<IframeProductsResponse> getIframeProducts() throws ApiException, IOException {
        return prepareGetIframeProductsRequest().execute();
    }

    /**
     * Builds the ApiCall object for getIframeProducts.
     */
    private ApiCall<List<IframeProductsResponse>, ApiException> prepareGetIframeProductsRequest() throws IOException {
        return new ApiCall.Builder<List<IframeProductsResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/iframe/products")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        IframeProductsResponse[].class))
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
     * This endpoint is used to get product by code.
     * @param  referenceId  Required parameter: Example:
     * @param  price  Optional parameter: Example:
     * @return    Returns the IframeProductResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public IframeProductResponse getIframeProductByCode(
            final String referenceId,
            final String price) throws ApiException, IOException {
        return prepareGetIframeProductByCodeRequest(referenceId, price).execute();
    }

    /**
     * Builds the ApiCall object for getIframeProductByCode.
     */
    private ApiCall<IframeProductResponse, ApiException> prepareGetIframeProductByCodeRequest(
            final String referenceId,
            final String price) throws IOException {
        return new ApiCall.Builder<IframeProductResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/iframe/product/{referenceId}")
                        .queryParam(param -> param.key("price")
                                .value(price).isRequired(false))
                        .templateParam(param -> param.key("referenceId").value(referenceId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, IframeProductResponse.class))
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
     * This endpoint is used to get product.
     * @param  body  Optional parameter: Example:
     * @return    Returns the List of IframeProductsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<IframeProductsResponse> updateIframeProducts(
            final List<IframeProductsRequest> body) throws ApiException, IOException {
        return prepareUpdateIframeProductsRequest(body).execute();
    }

    /**
     * Builds the ApiCall object for updateIframeProducts.
     */
    private ApiCall<List<IframeProductsResponse>, ApiException> prepareUpdateIframeProductsRequest(
            final List<IframeProductsRequest> body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<List<IframeProductsResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/iframe/update-product")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PATCH))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        IframeProductsResponse[].class))
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