# Auth

```java
AuthController authController = client.getAuthController();
```

## Class Name

`AuthController`

## Methods

* [Delete Client App](../../doc/controllers/auth.md#delete-client-app)
* [Get Client Ids](../../doc/controllers/auth.md#get-client-ids)
* [Register](../../doc/controllers/auth.md#register)


# Delete Client App

This endpoint is used to delete a registered client app.

```java
String deleteClientApp(
    final String merchantWalletAddress,
    final String clientId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `merchantWalletAddress` | `String` | Template, Required | - |
| `clientId` | `String` | Template, Required | - |

## Response Type

`String`

## Example Usage

```java
String merchantWalletAddress = "merchantWalletAddress6";
String clientId = "clientId6";

try {
    String result = authController.deleteClientApp(merchantWalletAddress, clientId);
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


# Get Client Ids

This endpoint is used to get a list of client Ids created by the merchant.

```java
ListClientAppsResponse getClientIds(
    final String merchantWalletAddress)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `merchantWalletAddress` | `String` | Template, Required | - |

## Response Type

[`ListClientAppsResponse`](../../doc/models/list-client-apps-response.md)

## Example Usage

```java
String merchantWalletAddress = "merchantWalletAddress6";

try {
    ListClientAppsResponse result = authController.getClientIds(merchantWalletAddress);
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


# Register

This endpoint is used to register a new client access.

```java
RegisterTokenResponse register(
    final RegisterTokenRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`RegisterTokenRequest`](../../doc/models/register-token-request.md) | Body, Optional | - |

## Response Type

[`RegisterTokenResponse`](../../doc/models/register-token-response.md)

## Example Usage

```java
try {
    RegisterTokenResponse result = authController.register(null);
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

