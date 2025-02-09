
# CreateInstanceRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**worldId** | **kotlin.String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. | 
**type** | [**InstanceType**](InstanceType.md) |  | 
**region** | [**InstanceRegion**](InstanceRegion.md) |  | 
**ownerId** | **kotlin.String** | A groupId if the instance type is \&quot;group\&quot;, null if instance type is public, or a userId otherwise |  [optional]
**roleIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | Group roleIds that are allowed to join if the type is \&quot;group\&quot; and groupAccessType is \&quot;member\&quot; |  [optional]
**groupAccessType** | [**GroupAccessType**](GroupAccessType.md) |  |  [optional]
**queueEnabled** | **kotlin.Boolean** |  |  [optional]
**closedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The time after which users won&#39;t be allowed to join the instance. This doesn&#39;t work for public instances. |  [optional]
**canRequestInvite** | **kotlin.Boolean** | Only applies to invite type instances to make them invite+ |  [optional]
**hardClose** | **kotlin.Boolean** | Currently unused, but will eventually be a flag to set if the closing of the instance should kick people. |  [optional]
**inviteOnly** | **kotlin.Boolean** |  |  [optional]



