
# Transaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** |  | 
**status** | [**TransactionStatus**](TransactionStatus.md) |  | 
**subscription** | [**Subscription**](Subscription.md) |  | 
**sandbox** | **kotlin.Boolean** |  | 
**createdAt** | **kotlin.String** |  | 
**updatedAt** | **kotlin.String** |  | 
**error** | **kotlin.String** |  | 
**userId** | **kotlin.String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  [optional]
**userDisplayName** | **kotlin.String** |  |  [optional]
**steam** | [**TransactionSteamInfo**](TransactionSteamInfo.md) |  |  [optional]
**agreement** | [**TransactionAgreement**](TransactionAgreement.md) |  |  [optional]
**isGift** | **kotlin.Boolean** |  |  [optional]
**isTokens** | **kotlin.Boolean** |  |  [optional]



