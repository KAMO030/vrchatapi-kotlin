
# UserSubscription

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** |  | 
**transactionId** | **kotlin.String** |  | 
**store** | **kotlin.String** | Which \&quot;Store\&quot; it came from. Right now only Stores are \&quot;Steam\&quot; and \&quot;Admin\&quot;. | 
**amount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**description** | **kotlin.String** |  | 
**period** | [**SubscriptionPeriod**](SubscriptionPeriod.md) |  | 
**tier** | **kotlin.Int** |  | 
**active** | **kotlin.Boolean** |  | 
**status** | [**TransactionStatus**](TransactionStatus.md) |  | 
**expires** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**licenseGroups** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**isGift** | **kotlin.Boolean** |  | 
**isBulkGift** | **kotlin.Boolean** |  | 
**steamItemId** | **kotlin.String** |  |  [optional]
**starts** | **kotlin.String** |  |  [optional]



