
# FileVersion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**status** | [**FileStatus**](FileStatus.md) |  | 
**version** | **kotlin.Int** | Incremental version counter, can only be increased. | 
**deleted** | **kotlin.Boolean** | Usually only present if &#x60;true&#x60; |  [optional]
**delta** | [**FileData**](FileData.md) |  |  [optional]
**file** | [**FileData**](FileData.md) |  |  [optional]
**signature** | [**FileData**](FileData.md) |  |  [optional]



