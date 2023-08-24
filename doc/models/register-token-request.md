
# Register Token Request

## Structure

`RegisterTokenRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MerchantWalletAddress` | `String` | Optional | Wallet address of merchant. | String getMerchantWalletAddress() | setMerchantWalletAddress(String merchantWalletAddress) |
| `Name` | `String` | Optional | Unique name for the third-party application going to use the access token. | String getName() | setName(String name) |

## Example (as JSON)

```json
{
  "merchantWalletAddress": "merchantWalletAddress6",
  "name": "name0"
}
```

