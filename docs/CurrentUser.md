
# CurrentUser

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptedTOSVersion** | **kotlin.Int** |  | 
**ageVerificationStatus** | [**AgeVerificationStatus**](AgeVerificationStatus.md) |  | 
**ageVerified** | **kotlin.Boolean** |  | 
**allowAvatarCopying** | **kotlin.Boolean** |  | 
**bio** | **kotlin.String** |  | 
**bioLinks** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**currentAvatar** | **kotlin.String** |  | 
**currentAvatarAssetUrl** | **kotlin.String** |  | 
**currentAvatarImageUrl** | **kotlin.String** | When profilePicOverride is not empty, use it instead. | 
**currentAvatarThumbnailImageUrl** | **kotlin.String** | When profilePicOverride is not empty, use it instead. | 
**currentAvatarTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**dateJoined** | [**java.time.LocalDate**](java.time.LocalDate.md) |  | 
**developerType** | [**DeveloperType**](DeveloperType.md) |  | 
**displayName** | **kotlin.String** |  | 
**emailVerified** | **kotlin.Boolean** |  | 
**friendGroupNames** | **kotlin.collections.List&lt;kotlin.String&gt;** | Always empty array. | 
**friendKey** | **kotlin.String** |  | 
**friends** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**hasBirthday** | **kotlin.Boolean** |  | 
**hasEmail** | **kotlin.Boolean** |  | 
**hasLoggedInFromClient** | **kotlin.Boolean** |  | 
**hasPendingEmail** | **kotlin.Boolean** |  | 
**homeLocation** | **kotlin.String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. | 
**id** | **kotlin.String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. | 
**isAdult** | **kotlin.Boolean** |  | 
**isFriend** | **kotlin.Boolean** |  | 
**lastLogin** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**lastMobile** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**lastPlatform** | **kotlin.String** | This can be &#x60;standalonewindows&#x60; or &#x60;android&#x60;, but can also pretty much be any random Unity verison such as &#x60;2019.2.4-801-Release&#x60; or &#x60;2019.2.2-772-Release&#x60; or even &#x60;unknownplatform&#x60;. | 
**obfuscatedEmail** | **kotlin.String** |  | 
**obfuscatedPendingEmail** | **kotlin.String** |  | 
**oculusId** | **kotlin.String** |  | 
**pastDisplayNames** | [**kotlin.collections.List&lt;PastDisplayName&gt;**](PastDisplayName.md) |  | 
**profilePicOverride** | **kotlin.String** |  | 
**profilePicOverrideThumbnail** | **kotlin.String** |  | 
**pronouns** | **kotlin.String** |  | 
**state** | [**UserState**](UserState.md) |  | 
**status** | [**UserStatus**](UserStatus.md) |  | 
**statusDescription** | **kotlin.String** |  | 
**statusFirstTime** | **kotlin.Boolean** |  | 
**statusHistory** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**steamDetails** | [**kotlin.Any**](.md) |  | 
**steamId** | **kotlin.String** |  | 
**tags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**twoFactorAuthEnabled** | **kotlin.Boolean** |  | 
**unsubscribe** | **kotlin.Boolean** |  | 
**userIcon** | **kotlin.String** |  | 
**acceptedPrivacyVersion** | **kotlin.Int** |  |  [optional]
**accountDeletionDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional]
**accountDeletionLog** | [**kotlin.collections.List&lt;AccountDeletionLog&gt;**](AccountDeletionLog.md) |  |  [optional]
**activeFriends** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**badges** | [**kotlin.collections.List&lt;Badge&gt;**](Badge.md) |  |  [optional]
**fallbackAvatar** | **kotlin.String** |  |  [optional]
**hideContentFilterSettings** | **kotlin.Boolean** |  |  [optional]
**userLanguage** | **kotlin.String** |  |  [optional]
**userLanguageCode** | **kotlin.String** |  |  [optional]
**isBoopingEnabled** | **kotlin.Boolean** |  |  [optional]
**lastActivity** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**googleId** | **kotlin.String** |  |  [optional]
**googleDetails** | [**kotlin.Any**](.md) |  |  [optional]
**picoId** | **kotlin.String** |  |  [optional]
**viveId** | **kotlin.String** |  |  [optional]
**offlineFriends** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**onlineFriends** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**presence** | [**CurrentUserPresence**](CurrentUserPresence.md) |  |  [optional]
**queuedInstance** | **kotlin.String** |  |  [optional]
**receiveMobileInvitations** | **kotlin.Boolean** |  |  [optional]
**twoFactorAuthEnabledDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**username** | **kotlin.String** | -| **DEPRECATED:** VRChat API no longer return usernames of other users. [See issue by Tupper for more information](https://github.com/pypy-vrc/VRCX/issues/429). |  [optional]



