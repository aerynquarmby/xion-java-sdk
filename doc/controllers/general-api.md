# General API

```java
GeneralAPIController generalAPIController = client.getGeneralAPIController();
```

## Class Name

`GeneralAPIController`


# Health

This endpoint is used to check the health of the API.

```java
String health()
```

## Response Type

`String`

## Example Usage

```java
try {
    String result = generalAPIController.health();
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
| 500 | Internal Server Error | `ApiException` |

