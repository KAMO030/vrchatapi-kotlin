
# Group

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ageVerificationSlotsAvailable** | **kotlin.Boolean** |  |  [optional]
**ageVerificationBetaCode** | **kotlin.String** |  |  [optional]
**ageVerificationBetaSlots** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**badges** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**id** | **kotlin.String** |  |  [optional]
**name** | **kotlin.String** |  |  [optional]
**shortCode** | **kotlin.String** |  |  [optional]
**discriminator** | **kotlin.String** |  |  [optional]
**description** | **kotlin.String** |  |  [optional]
**iconUrl** | **kotlin.String** |  |  [optional]
**bannerUrl** | **kotlin.String** |  |  [optional]
**privacy** | [**GroupPrivacy**](GroupPrivacy.md) |  |  [optional]
**ownerId** | **kotlin.String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  [optional]
**rules** | **kotlin.String** |  |  [optional]
**links** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**languages** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**iconId** | **kotlin.String** |  |  [optional]
**bannerId** | **kotlin.String** |  |  [optional]
**memberCount** | **kotlin.Int** |  |  [optional]
**memberCountSyncedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**isVerified** | **kotlin.Boolean** |  |  [optional]
**joinState** | [**GroupJoinState**](GroupJoinState.md) |  |  [optional]
**tags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**transferTargetId** | **kotlin.String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  [optional]
**galleries** | [**kotlin.collections.List&lt;GroupGallery&gt;**](GroupGallery.md) |  |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**lastPostCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**onlineMemberCount** | **kotlin.Int** |  |  [optional]
**membershipStatus** | [**GroupMemberStatus**](GroupMemberStatus.md) |  |  [optional]
**myMember** | [**GroupMyMember**](GroupMyMember.md) |  |  [optional]
**roles** | [**kotlin.collections.List&lt;GroupRole&gt;**](GroupRole.md) | Only returned if ?includeRoles&#x3D;true is specified. |  [optional]



