# Iframe

```java
IframeController iframeController = client.getIframeController();
```

## Class Name

`IframeController`

## Methods

* [Create Iframe Products](../../doc/controllers/iframe.md#create-iframe-products)
* [Get Iframe Product by Code](../../doc/controllers/iframe.md#get-iframe-product-by-code)
* [Get Iframe Products](../../doc/controllers/iframe.md#get-iframe-products)
* [Update Iframe Products](../../doc/controllers/iframe.md#update-iframe-products)


# Create Iframe Products

This endpoint is used to create iframe products.

```java
List<IframeProductsResponse> createIframeProducts(
    final List<IframeProductsRequest> body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`List<IframeProductsRequest>`](../../doc/models/iframe-products-request.md) | Body, Optional | - |

## Response Type

[`List<IframeProductsResponse>`](../../doc/models/iframe-products-response.md)

## Example Usage

```java
List<IframeProductsRequest> body = Arrays.asList(
    new IframeProductsRequest.Builder()
        .build()
);

try {
    List<IframeProductsResponse> result = iframeController.createIframeProducts(body);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 500 | Internal Server Error | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Get Iframe Product by Code

This endpoint is used to get product by code.

```java
IframeProductResponse getIframeProductByCode(
    final String referenceId,
    final String price)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `referenceId` | `String` | Template, Required | - |
| `price` | `String` | Query, Optional | - |

## Response Type

[`IframeProductResponse`](../../doc/models/iframe-product-response.md)

## Example Usage

```java
String referenceId = "referenceId8";

try {
    IframeProductResponse result = iframeController.getIframeProductByCode(referenceId, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 500 | Internal Server Error | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Get Iframe Products

This endpoint is used to get iframe products.

```java
List<IframeProductsResponse> getIframeProducts()
```

## Response Type

[`List<IframeProductsResponse>`](../../doc/models/iframe-products-response.md)

## Example Usage

```java
try {
    List<IframeProductsResponse> result = iframeController.getIframeProducts();
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 500 | Internal Server Error | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Update Iframe Products

This endpoint is used to get product.

```java
List<IframeProductsResponse> updateIframeProducts(
    final List<IframeProductsRequest> body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`List<IframeProductsRequest>`](../../doc/models/iframe-products-request.md) | Body, Optional | - |

## Response Type

[`List<IframeProductsResponse>`](../../doc/models/iframe-products-response.md)

## Example Usage

```java
List<IframeProductsRequest> body = Arrays.asList(
    new IframeProductsRequest.Builder()
        .build()
);

try {
    List<IframeProductsResponse> result = iframeController.updateIframeProducts(body);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 500 | Internal Server Error | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

