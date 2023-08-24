
# Register Token Response

## Structure

`RegisterTokenResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ClientId` | `String` | Optional | key for the accessing endpoint. | String getClientId() | setClientId(String clientId) |
| `JwtToken` | `String` | Optional | secret(JWT) for accessing endpoint should be kept safe. | String getJwtToken() | setJwtToken(String jwtToken) |

## Example (as JSON)

```json
{
  "clientId": "clientId6",
  "jwtToken": "jwtToken0"
}
```

