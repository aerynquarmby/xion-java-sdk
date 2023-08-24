
# Single Bill Payment Request

## Structure

`SingleBillPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProductName` | `String` | Optional | Name of the product. | String getProductName() | setProductName(String productName) |
| `Amount` | `Double` | Optional | Amount to be paid (USD). | Double getAmount() | setAmount(Double amount) |
| `Currency` | `String` | Optional | Currency of the amount to paid. | String getCurrency() | setCurrency(String currency) |
| `BuyerAddress` | `String` | Optional | Buyer's wallet address. | String getBuyerAddress() | setBuyerAddress(String buyerAddress) |

## Example (as JSON)

```json
{
  "productName": "productName0",
  "amount": 56.78,
  "currency": "currency0",
  "buyerAddress": "buyerAddress8"
}
```

