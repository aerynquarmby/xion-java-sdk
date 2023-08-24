# Merchant

```java
MerchantController merchantController = client.getMerchantController();
```

## Class Name

`MerchantController`

## Methods

* [Register Master Merchant](../../doc/controllers/merchant.md#register-master-merchant)
* [Register Sub Merchant](../../doc/controllers/merchant.md#register-sub-merchant)


# Register Master Merchant

This endpoint is used to register master merchant.

```java
MerchantTokenResponse registerMasterMerchant(
    final RegisterMasterMerchantRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`RegisterMasterMerchantRequest`](../../doc/models/register-master-merchant-request.md) | Body, Optional | - |

## Response Type

[`MerchantTokenResponse`](../../doc/models/merchant-token-response.md)

## Example Usage

```java
try {
    MerchantTokenResponse result = merchantController.registerMasterMerchant(null);
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


# Register Sub Merchant

This endpoint is used to register sub merchant.

```java
MerchantTokenResponse registerSubMerchant(
    final RegisterSubMerchantRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`RegisterSubMerchantRequest`](../../doc/models/register-sub-merchant-request.md) | Body, Optional | - |

## Response Type

[`MerchantTokenResponse`](../../doc/models/merchant-token-response.md)

## Example Usage

```java
try {
    MerchantTokenResponse result = merchantController.registerSubMerchant(null);
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

