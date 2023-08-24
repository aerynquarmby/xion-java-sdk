
# Multi Chain Single Bill Payment Request

## Structure

`MultiChainSingleBillPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProductName` | `String` | Optional | Name of the product. | String getProductName() | setProductName(String productName) |
| `AmountUSD` | `Double` | Optional | Amount to be paid (USD). | Double getAmountUSD() | setAmountUSD(Double amountUSD) |
| `Token` | `String` | Optional | Token of the amount to paid. | String getToken() | setToken(String token) |
| `BuyerAddress` | `String` | Optional | Buyer's wallet address. | String getBuyerAddress() | setBuyerAddress(String buyerAddress) |
| `Chain` | `Double` | Optional | Chain to be used for payment. | Double getChain() | setChain(Double chain) |

## Example (as JSON)

```json
{
  "productName": "productName0",
  "amountUSD": 118.92,
  "token": "token6",
  "buyerAddress": "buyerAddress8",
  "chain": 161.78
}
```

