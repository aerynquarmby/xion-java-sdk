
# Approvals Request

## Structure

`ApprovalsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | ID of product. | Integer getId() | setId(Integer id) |
| `SourceUserAddress` | `String` | Optional | Wallet address of buyer. | String getSourceUserAddress() | setSourceUserAddress(String sourceUserAddress) |
| `SourceChain` | `Integer` | Optional | Chain ID for making the approvals. | Integer getSourceChain() | setSourceChain(Integer sourceChain) |
| `SourceToken` | `String` | Optional | Token used for approvals. | String getSourceToken() | setSourceToken(String sourceToken) |
| `DestinationUserAddress` | `String` | Optional | Wallet address of merchant. | String getDestinationUserAddress() | setDestinationUserAddress(String destinationUserAddress) |
| `DestinationChain` | `Integer` | Optional | Chain ID for polygon matic mainnet.<br>**Default**: `137` | Integer getDestinationChain() | setDestinationChain(Integer destinationChain) |
| `DestinationToken` | `String` | Optional | Token used for approvals. | String getDestinationToken() | setDestinationToken(String destinationToken) |
| `AmountUSD` | `Double` | Optional | Amount to be paid (USD). | Double getAmountUSD() | setAmountUSD(Double amountUSD) |
| `Products` | `List<Double>` | Optional | List of product Ids. | List<Double> getProducts() | setProducts(List<Double> products) |

## Example (as JSON)

```json
{
  "destinationChain": 137,
  "id": 112,
  "sourceUserAddress": "sourceUserAddress0",
  "sourceChain": 254,
  "sourceToken": "sourceToken4",
  "destinationUserAddress": "destinationUserAddress8"
}
```

