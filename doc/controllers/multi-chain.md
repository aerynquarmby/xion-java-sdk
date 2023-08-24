# Multi Chain

```java
MultiChainController multiChainController = client.getMultiChainController();
```

## Class Name

`MultiChainController`

## Methods

* [Multi-Chain-Single Bill Payment](../../doc/controllers/multi-chain.md#multi-chain-single-bill-payment)
* [Post Approvals](../../doc/controllers/multi-chain.md#post-approvals)


# Multi-Chain-Single Bill Payment

This endpoint is used to make a multi chain single bill payment.

```java
MultiChainSinglePaymentResponse multiChainSingleBillPayment(
    final MultiChainSingleBillPaymentRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`MultiChainSingleBillPaymentRequest`](../../doc/models/multi-chain-single-bill-payment-request.md) | Body, Optional | - |

## Server

`Server.WEBSOCKET`

## Response Type

[`MultiChainSinglePaymentResponse`](../../doc/models/multi-chain-single-payment-response.md)

## Example Usage

```java
try {
    MultiChainSinglePaymentResponse result = multiChainController.multiChainSingleBillPayment(null);
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
| 401 | Unauthorized | `ApiException` |
| 500 | Internal Server Error | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Post Approvals

This endpoint is used to post approvals.

```java
Void postApprovals(
    final ApprovalsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApprovalsRequest`](../../doc/models/approvals-request.md) | Body, Optional | - |

## Server

`Server.WEBSOCKET`

## Response Type

`void`

## Example Usage

```java
ApprovalsRequest body = new ApprovalsRequest.Builder()
    .destinationChain(137)
    .build();

try {
    multiChainController.postApprovals(body);
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

