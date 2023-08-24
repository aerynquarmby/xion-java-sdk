# Single Bill Payments

```java
SingleBillPaymentsController singleBillPaymentsController = client.getSingleBillPaymentsController();
```

## Class Name

`SingleBillPaymentsController`

## Methods

* [Get Order Status](../../doc/controllers/single-bill-payments.md#get-order-status)
* [Single Bill Payment](../../doc/controllers/single-bill-payments.md#single-bill-payment)


# Get Order Status

This endpoint is used to get the status of an order.

```java
String getOrderStatus(
    final String orderCode)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderCode` | `String` | Template, Required | - |

## Response Type

`String`

## Example Usage

```java
String orderCode = "orderCode8";

try {
    String result = singleBillPaymentsController.getOrderStatus(orderCode);
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


# Single Bill Payment

This endpoint is used to make a single bill payment.

```java
SingleBillPaymentResponse singleBillPayment(
    final SingleBillPaymentRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`SingleBillPaymentRequest`](../../doc/models/single-bill-payment-request.md) | Body, Optional | - |

## Response Type

[`SingleBillPaymentResponse`](../../doc/models/single-bill-payment-response.md)

## Example Usage

```java
try {
    SingleBillPaymentResponse result = singleBillPaymentsController.singleBillPayment(null);
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

