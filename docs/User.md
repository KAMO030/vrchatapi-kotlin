
# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ageVerificationStatus** | [**AgeVerificationStatus**](AgeVerificationStatus.md) |  | 
**ageVerified** | **kotlin.Boolean** |  | 
**allowAvatarCopying** | **kotlin.Boolean** |  | 
**bio** | **kotlin.String** |  | 
**bioLinks** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**currentAvatarImageUrl** | **kotlin.String** | When profilePicOverride is not empty, use it instead. | 
**currentAvatarThumbnailImageUrl** | **kotlin.String** | When profilePicOverride is not empty, use it instead. | 
**currentAvatarTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**dateJoined** | [**java.time.LocalDate**](java.time.LocalDate.md) |  | 
**developerType** | [**DeveloperType**](DeveloperType.md) |  | 
**displayName** | **kotlin.String** | A users visual display name. This is what shows up in-game, and can different from their &#x60;username&#x60;. Changing display name is restricted to a cooldown period. | 
**friendKey** | **kotlin.String** |  | 
**id** | **kotlin.String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. | 
**isFriend** | **kotlin.Boolean** | Either their &#x60;friendKey&#x60;, or empty string if you are not friends. Unknown usage. | 
**lastActivity** | **kotlin.String** | Either a date-time or empty string. | 
**lastLogin** | **kotlin.String** | Either a date-time or empty string. | 
**lastPlatform** | **kotlin.String** | This can be &#x60;standalonewindows&#x60; or &#x60;android&#x60;, but can also pretty much be any random Unity verison such as &#x60;2019.2.4-801-Release&#x60; or &#x60;2019.2.2-772-Release&#x60; or even &#x60;unknownplatform&#x60;. | 
**profilePicOverride** | **kotlin.String** |  | 
**profilePicOverrideThumbnail** | **kotlin.String** |  | 
**pronouns** | **kotlin.String** |  | 
**state** | [**UserState**](UserState.md) |  | 
**status** | [**UserStatus**](UserStatus.md) |  | 
**statusDescription** | **kotlin.String** |  | 
**tags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**userIcon** | **kotlin.String** |  | 
**badges** | [**kotlin.collections.List&lt;Badge&gt;**](Badge.md) |  |  [optional]
**friendRequestStatus** | **kotlin.String** |  |  [optional]
**instanceId** | **kotlin.String** | InstanceID can be \&quot;offline\&quot; on User profiles if you are not friends with that user and \&quot;private\&quot; if you are friends and user is in private instance. |  [optional]
**lastMobile** | **kotlin.String** |  |  [optional]
**location** | **kotlin.String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  [optional]
**note** | **kotlin.String** |  |  [optional]
**platform** | **kotlin.String** |  |  [optional]
**travelingToInstance** | **kotlin.String** |  |  [optional]
**travelingToLocation** | **kotlin.String** |  |  [optional]
**travelingToWorld** | **kotlin.String** |  |  [optional]
**username** | **kotlin.String** | -| A users unique name, used during login. This is different from &#x60;displayName&#x60; which is what shows up in-game. A users &#x60;username&#x60; can never be changed.&#39; **DEPRECATED:** VRChat API no longer return usernames of other users. [See issue by Tupper for more information](https://github.com/pypy-vrc/VRCX/issues/429). |  [optional]
**worldId** | **kotlin.String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. |  [optional]



