
# GroupLimitedMember

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** |  |  [optional]
**groupId** | **kotlin.String** |  |  [optional]
**userId** | **kotlin.String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. |  [optional]
**isRepresenting** | **kotlin.Boolean** | Whether the user is representing the group. This makes the group show up above the name tag in-game. |  [optional]
**roleIds** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**mRoleIds** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**joinedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**membershipStatus** | [**GroupMemberStatus**](GroupMemberStatus.md) |  |  [optional]
**visibility** | **kotlin.String** |  |  [optional]
**isSubscribedToAnnouncements** | **kotlin.Boolean** |  |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Only visible via the /groups/:groupId/members endpoint, **not** when fetching a specific user. |  [optional]
**bannedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Only visible via the /groups/:groupId/members endpoint, **not** when fetching a specific user. |  [optional]
**managerNotes** | **kotlin.String** | Only visible via the /groups/:groupId/members endpoint, **not** when fetching a specific user. |  [optional]
**lastPostReadAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**hasJoinedFromPurchase** | **kotlin.Boolean** |  |  [optional]



