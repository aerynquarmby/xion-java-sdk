
# List Client Apps Response

## Structure

`ListClientAppsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MerchantWalletAddress` | `String` | Optional | Wallet address of merchant. | String getMerchantWalletAddress() | setMerchantWalletAddress(String merchantWalletAddress) |
| `ClientIds` | [`List<ClientId>`](../../doc/models/client-id.md) | Optional | List of client Ids created by the merchant. | List<ClientId> getClientIds() | setClientIds(List<ClientId> clientIds) |

## Example (as JSON)

```json
{
  "merchantWalletAddress": "merchantWalletAddress6",
  "clientIds": [
    {
      "clientId": "clientId3",
      "name": "name9",
      "createdAt": "2016-03-13T12:52:32.123Z"
    },
    {
      "clientId": "clientId4",
      "name": "name0",
      "createdAt": "2016-03-13T12:52:32.123Z"
    },
    {
      "clientId": "clientId5",
      "name": "name1",
      "createdAt": "2016-03-13T12:52:32.123Z"
    }
  ]
}
```

