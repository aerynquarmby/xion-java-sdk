
# Merchant Token Response

## Structure

`MerchantTokenResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Optional | Type of the merchant token. | String getType() | setType(String type) |
| `Token` | `String` | Optional | Token of the merchant. | String getToken() | setToken(String token) |
| `ReferralCode` | `String` | Optional | Referral code of the merchant token. | String getReferralCode() | setReferralCode(String referralCode) |
| `Message` | `String` | Optional | Message of the merchant token. | String getMessage() | setMessage(String message) |

## Example (as JSON)

```json
{
  "type": "type0",
  "token": "token6",
  "referral_code": "referral_code2",
  "message": "message0"
}
```

