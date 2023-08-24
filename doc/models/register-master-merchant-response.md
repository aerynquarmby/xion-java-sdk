
# Register Master Merchant Response

## Structure

`RegisterMasterMerchantResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CompanyName` | `String` | Optional | Name of the company. | String getCompanyName() | setCompanyName(String companyName) |
| `WalletAddress` | `String` | Optional | Wallet address of the company. | String getWalletAddress() | setWalletAddress(String walletAddress) |
| `CreatedAt` | `LocalDateTime` | Optional | Date and time master merchant was created. | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |

## Example (as JSON)

```json
{
  "created_at": "01/21/2023 17:32:28",
  "company_name": "company_name6",
  "wallet_address": "wallet_address6"
}
```

