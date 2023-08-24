
# Single Bill Payment Response

## Structure

`SingleBillPaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `OrderCode` | `String` | Optional | Order code for single payment. | String getOrderCode() | setOrderCode(String orderCode) |
| `TransactionHash` | `String` | Optional | Transaction hash of the payment. | String getTransactionHash() | setTransactionHash(String transactionHash) |
| `Status` | `String` | Optional | Status of the payment. | String getStatus() | setStatus(String status) |

## Example (as JSON)

```json
{
  "orderCode": "orderCode8",
  "transactionHash": "transactionHash6",
  "status": "status8"
}
```

