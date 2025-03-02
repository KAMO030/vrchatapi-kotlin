
# LimitedUser

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**developerType** | [**DeveloperType**](DeveloperType.md) |  | 
**displayName** | **kotlin.String** |  | 
**id** | **kotlin.String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. | 
**isFriend** | **kotlin.Boolean** |  | 
**lastPlatform** | **kotlin.String** | This can be &#x60;standalonewindows&#x60; or &#x60;android&#x60;, but can also pretty much be any random Unity verison such as &#x60;2019.2.4-801-Release&#x60; or &#x60;2019.2.2-772-Release&#x60; or even &#x60;unknownplatform&#x60;. | 
**status** | [**UserStatus**](UserStatus.md) |  | 
**statusDescription** | **kotlin.String** |  | 
**tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | &lt;- Always empty. | 
**bio** | **kotlin.String** |  |  [optional]
**bioLinks** | **kotlin.collections.List&lt;kotlin.String&gt;** |   |  [optional]
**currentAvatarImageUrl** | **kotlin.String** | When profilePicOverride is not empty, use it instead. |  [optional]
**currentAvatarThumbnailImageUrl** | **kotlin.String** | When profilePicOverride is not empty, use it instead. |  [optional]
**currentAvatarTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**fallbackAvatar** | **kotlin.String** |  |  [optional]
**lastLogin** | **kotlin.String** |  |  [optional]
**profilePicOverride** | **kotlin.String** |  |  [optional]
**pronouns** | **kotlin.String** |  |  [optional]
**userIcon** | **kotlin.String** |  |  [optional]
**username** | **kotlin.String** | -| **DEPRECATED:** VRChat API no longer return usernames of other users. [See issue by Tupper for more information](https://github.com/pypy-vrc/VRCX/issues/429). |  [optional]
**location** | **kotlin.String** |  |  [optional]
**friendKey** | **kotlin.String** |  |  [optional]



