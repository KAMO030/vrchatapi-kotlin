
# Instance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **kotlin.Boolean** |  | 
**canRequestInvite** | **kotlin.Boolean** |  | 
**capacity** | **kotlin.Int** |  | 
**clientNumber** | **kotlin.String** | Always returns \&quot;unknown\&quot;. | 
**displayName** | **kotlin.String** |  | 
**full** | **kotlin.Boolean** |  | 
**gameServerVersion** | **kotlin.Int** |  | 
**id** | **kotlin.String** | InstanceID can be \&quot;offline\&quot; on User profiles if you are not friends with that user and \&quot;private\&quot; if you are friends and user is in private instance. | 
**instanceId** | **kotlin.String** |  | 
**instancePersistenceEnabled** | **kotlin.String** |  | 
**location** | **kotlin.String** | InstanceID can be \&quot;offline\&quot; on User profiles if you are not friends with that user and \&quot;private\&quot; if you are friends and user is in private instance. | 
**nUsers** | **kotlin.Int** |  | 
**name** | **kotlin.String** |  | 
**permanent** | **kotlin.Boolean** |  | 
**photonRegion** | [**Region**](Region.md) |  | 
**platforms** | [**InstancePlatforms**](InstancePlatforms.md) |  | 
**playerPersistenceEnabled** | **kotlin.Boolean** |  | 
**region** | [**InstanceRegion**](InstanceRegion.md) |  | 
**secureName** | **kotlin.String** |  | 
**tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | The tags array on Instances usually contain the language tags of the people in the instance.  | 
**type** | [**InstanceType**](InstanceType.md) |  | 
**worldId** | **kotlin.String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. | 
**queueEnabled** | **kotlin.Boolean** |  | 
**queueSize** | **kotlin.Int** |  | 
**recommendedCapacity** | **kotlin.Int** |  | 
**strict** | **kotlin.Boolean** |  | 
**userCount** | **kotlin.Int** |  | 
**world** | [**World**](World.md) |  | 
**ageGate** | **kotlin.Boolean** |  |  [optional]
**ownerId** | **kotlin.String** | A groupId if the instance type is \&quot;group\&quot;, null if instance type is public, or a userId otherwise |  [optional]
**shortName** | **kotlin.String** |  |  [optional]
**hidden** | **kotlin.String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  [optional]
**friends** | **kotlin.String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  [optional]
**private** | **kotlin.String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  [optional]
**roleRestricted** | **kotlin.Boolean** |  |  [optional]
**users** | [**kotlin.collections.List&lt;LimitedUser&gt;**](LimitedUser.md) | The users field is present on instances created by the requesting user. |  [optional]
**groupAccessType** | [**GroupAccessType**](GroupAccessType.md) |  |  [optional]
**hasCapacityForYou** | **kotlin.Boolean** |  |  [optional]
**nonce** | **kotlin.String** |  |  [optional]
**closedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**hardClose** | **kotlin.Boolean** |  |  [optional]



