# GroupsApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addGroupGalleryImage**](GroupsApi.md#addGroupGalleryImage) | **POST** /groups/{groupId}/galleries/{groupGalleryId}/images | Add Group Gallery Image
[**addGroupMemberRole**](GroupsApi.md#addGroupMemberRole) | **PUT** /groups/{groupId}/members/{userId}/roles/{groupRoleId} | Add Role to GroupMember
[**addGroupPost**](GroupsApi.md#addGroupPost) | **POST** /groups/{groupId}/posts | Create a post in a Group
[**banGroupMember**](GroupsApi.md#banGroupMember) | **POST** /groups/{groupId}/bans | Ban Group Member
[**cancelGroupRequest**](GroupsApi.md#cancelGroupRequest) | **DELETE** /groups/{groupId}/requests | Cancel Group Join Request
[**createGroup**](GroupsApi.md#createGroup) | **POST** /groups | Create Group
[**createGroupAnnouncement**](GroupsApi.md#createGroupAnnouncement) | **POST** /groups/{groupId}/announcement | Create Group Announcement
[**createGroupGallery**](GroupsApi.md#createGroupGallery) | **POST** /groups/{groupId}/galleries | Create Group Gallery
[**createGroupInvite**](GroupsApi.md#createGroupInvite) | **POST** /groups/{groupId}/invites | Invite User to Group
[**createGroupRole**](GroupsApi.md#createGroupRole) | **POST** /groups/{groupId}/roles | Create GroupRole
[**deleteGroup**](GroupsApi.md#deleteGroup) | **DELETE** /groups/{groupId} | Delete Group
[**deleteGroupAnnouncement**](GroupsApi.md#deleteGroupAnnouncement) | **DELETE** /groups/{groupId}/announcement | Delete Group Announcement
[**deleteGroupGallery**](GroupsApi.md#deleteGroupGallery) | **DELETE** /groups/{groupId}/galleries/{groupGalleryId} | Delete Group Gallery
[**deleteGroupGalleryImage**](GroupsApi.md#deleteGroupGalleryImage) | **DELETE** /groups/{groupId}/galleries/{groupGalleryId}/images/{groupGalleryImageId} | Delete Group Gallery Image
[**deleteGroupInvite**](GroupsApi.md#deleteGroupInvite) | **DELETE** /groups/{groupId}/invites/{userId} | Delete User Invite
[**deleteGroupPost**](GroupsApi.md#deleteGroupPost) | **DELETE** /groups/{groupId}/posts/{notificationId} | Delete a Group post
[**deleteGroupRole**](GroupsApi.md#deleteGroupRole) | **DELETE** /groups/{groupId}/roles/{groupRoleId} | Delete Group Role
[**getGroup**](GroupsApi.md#getGroup) | **GET** /groups/{groupId} | Get Group by ID
[**getGroupAnnouncements**](GroupsApi.md#getGroupAnnouncements) | **GET** /groups/{groupId}/announcement | Get Group Announcement
[**getGroupAuditLogs**](GroupsApi.md#getGroupAuditLogs) | **GET** /groups/{groupId}/auditLogs | Get Group Audit Logs
[**getGroupBans**](GroupsApi.md#getGroupBans) | **GET** /groups/{groupId}/bans | Get Group Bans
[**getGroupGalleryImages**](GroupsApi.md#getGroupGalleryImages) | **GET** /groups/{groupId}/galleries/{groupGalleryId} | Get Group Gallery Images
[**getGroupInstances**](GroupsApi.md#getGroupInstances) | **GET** /groups/{groupId}/instances | Get Group Instances
[**getGroupInvites**](GroupsApi.md#getGroupInvites) | **GET** /groups/{groupId}/invites | Get Group Invites Sent
[**getGroupMember**](GroupsApi.md#getGroupMember) | **GET** /groups/{groupId}/members/{userId} | Get Group Member
[**getGroupMembers**](GroupsApi.md#getGroupMembers) | **GET** /groups/{groupId}/members | List Group Members
[**getGroupPermissions**](GroupsApi.md#getGroupPermissions) | **GET** /groups/{groupId}/permissions | List Group Permissions
[**getGroupPost**](GroupsApi.md#getGroupPost) | **GET** /groups/{groupId}/posts | Get posts from a Group
[**getGroupRequests**](GroupsApi.md#getGroupRequests) | **GET** /groups/{groupId}/requests | Get Group Join Requests
[**getGroupRoles**](GroupsApi.md#getGroupRoles) | **GET** /groups/{groupId}/roles | Get Group Roles
[**joinGroup**](GroupsApi.md#joinGroup) | **POST** /groups/{groupId}/join | Join Group
[**kickGroupMember**](GroupsApi.md#kickGroupMember) | **DELETE** /groups/{groupId}/members/{userId} | Kick Group Member
[**leaveGroup**](GroupsApi.md#leaveGroup) | **POST** /groups/{groupId}/leave | Leave Group
[**removeGroupMemberRole**](GroupsApi.md#removeGroupMemberRole) | **DELETE** /groups/{groupId}/members/{userId}/roles/{groupRoleId} | Remove Role from GroupMember
[**respondGroupJoinRequest**](GroupsApi.md#respondGroupJoinRequest) | **PUT** /groups/{groupId}/requests/{userId} | Respond Group Join request
[**searchGroups**](GroupsApi.md#searchGroups) | **GET** /groups | Search Group
[**unbanGroupMember**](GroupsApi.md#unbanGroupMember) | **DELETE** /groups/{groupId}/bans/{userId} | Unban Group Member
[**updateGroup**](GroupsApi.md#updateGroup) | **PUT** /groups/{groupId} | Update Group
[**updateGroupGallery**](GroupsApi.md#updateGroupGallery) | **PUT** /groups/{groupId}/galleries/{groupGalleryId} | Update Group Gallery
[**updateGroupMember**](GroupsApi.md#updateGroupMember) | **PUT** /groups/{groupId}/members/{userId} | Update Group Member
[**updateGroupPost**](GroupsApi.md#updateGroupPost) | **PUT** /groups/{groupId}/posts/{notificationId} | Edits a Group post
[**updateGroupRole**](GroupsApi.md#updateGroupRole) | **PUT** /groups/{groupId}/roles/{groupRoleId} | Update Group Role


<a name="addGroupGalleryImage"></a>
# **addGroupGalleryImage**
> GroupGalleryImage addGroupGalleryImage(groupId, groupGalleryId, addGroupGalleryImageRequest)

Add Group Gallery Image

Adds an image to a Group gallery.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val groupGalleryId : kotlin.String = ggal_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group gallery ID.
val addGroupGalleryImageRequest : AddGroupGalleryImageRequest =  // AddGroupGalleryImageRequest | 
try {
    val result : GroupGalleryImage = apiInstance.addGroupGalleryImage(groupId, groupGalleryId, addGroupGalleryImageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#addGroupGalleryImage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#addGroupGalleryImage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **groupGalleryId** | **kotlin.String**| Must be a valid group gallery ID. |
 **addGroupGalleryImageRequest** | [**AddGroupGalleryImageRequest**](AddGroupGalleryImageRequest.md)|  |

### Return type

[**GroupGalleryImage**](GroupGalleryImage.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addGroupMemberRole"></a>
# **addGroupMemberRole**
> kotlin.collections.List&lt;kotlin.String&gt; addGroupMemberRole(groupId, userId, groupRoleId)

Add Role to GroupMember

Adds a Role to a Group Member

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
val groupRoleId : kotlin.String = grol_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group role ID.
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.addGroupMemberRole(groupId, userId, groupRoleId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#addGroupMemberRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#addGroupMemberRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **userId** | **kotlin.String**| Must be a valid user ID. |
 **groupRoleId** | **kotlin.String**| Must be a valid group role ID. |

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addGroupPost"></a>
# **addGroupPost**
> GroupPost addGroupPost(groupId, createGroupPostRequest)

Create a post in a Group

Create a post in a Group.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val createGroupPostRequest : CreateGroupPostRequest =  // CreateGroupPostRequest | 
try {
    val result : GroupPost = apiInstance.addGroupPost(groupId, createGroupPostRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#addGroupPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#addGroupPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **createGroupPostRequest** | [**CreateGroupPostRequest**](CreateGroupPostRequest.md)|  |

### Return type

[**GroupPost**](GroupPost.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="banGroupMember"></a>
# **banGroupMember**
> GroupMember banGroupMember(groupId, banGroupMemberRequest)

Ban Group Member

Bans a user from a Group.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val banGroupMemberRequest : BanGroupMemberRequest =  // BanGroupMemberRequest | 
try {
    val result : GroupMember = apiInstance.banGroupMember(groupId, banGroupMemberRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#banGroupMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#banGroupMember")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **banGroupMemberRequest** | [**BanGroupMemberRequest**](BanGroupMemberRequest.md)|  |

### Return type

[**GroupMember**](GroupMember.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelGroupRequest"></a>
# **cancelGroupRequest**
> cancelGroupRequest(groupId)

Cancel Group Join Request

Cancels a request sent to join the group.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
try {
    apiInstance.cancelGroupRequest(groupId)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#cancelGroupRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#cancelGroupRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |

### Return type

null (empty response body)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createGroup"></a>
# **createGroup**
> Group createGroup(createGroupRequest)

Create Group

Creates a Group and returns a Group object. **Requires VRC+ Subscription.**

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val createGroupRequest : CreateGroupRequest =  // CreateGroupRequest | 
try {
    val result : Group = apiInstance.createGroup(createGroupRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#createGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#createGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createGroupRequest** | [**CreateGroupRequest**](CreateGroupRequest.md)|  |

### Return type

[**Group**](Group.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createGroupAnnouncement"></a>
# **createGroupAnnouncement**
> GroupAnnouncement createGroupAnnouncement(groupId, createGroupAnnouncementRequest)

Create Group Announcement

Creates an Announcement for a Group. Warning: This will also remove all announcements. To make proper announcements, use the posts endpoint instead

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val createGroupAnnouncementRequest : CreateGroupAnnouncementRequest =  // CreateGroupAnnouncementRequest | 
try {
    val result : GroupAnnouncement = apiInstance.createGroupAnnouncement(groupId, createGroupAnnouncementRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#createGroupAnnouncement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#createGroupAnnouncement")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **createGroupAnnouncementRequest** | [**CreateGroupAnnouncementRequest**](CreateGroupAnnouncementRequest.md)|  |

### Return type

[**GroupAnnouncement**](GroupAnnouncement.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createGroupGallery"></a>
# **createGroupGallery**
> GroupGallery createGroupGallery(groupId, createGroupGalleryRequest)

Create Group Gallery

Creates a gallery for a Group.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val createGroupGalleryRequest : CreateGroupGalleryRequest =  // CreateGroupGalleryRequest | 
try {
    val result : GroupGallery = apiInstance.createGroupGallery(groupId, createGroupGalleryRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#createGroupGallery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#createGroupGallery")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **createGroupGalleryRequest** | [**CreateGroupGalleryRequest**](CreateGroupGalleryRequest.md)|  |

### Return type

[**GroupGallery**](GroupGallery.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createGroupInvite"></a>
# **createGroupInvite**
> createGroupInvite(groupId, createGroupInviteRequest)

Invite User to Group

Sends an invite to a user to join the group.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val createGroupInviteRequest : CreateGroupInviteRequest =  // CreateGroupInviteRequest | 
try {
    apiInstance.createGroupInvite(groupId, createGroupInviteRequest)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#createGroupInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#createGroupInvite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **createGroupInviteRequest** | [**CreateGroupInviteRequest**](CreateGroupInviteRequest.md)|  |

### Return type

null (empty response body)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createGroupRole"></a>
# **createGroupRole**
> GroupRole createGroupRole(groupId, createGroupRoleRequest)

Create GroupRole

Create a Group role.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val createGroupRoleRequest : CreateGroupRoleRequest =  // CreateGroupRoleRequest | 
try {
    val result : GroupRole = apiInstance.createGroupRole(groupId, createGroupRoleRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#createGroupRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#createGroupRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **createGroupRoleRequest** | [**CreateGroupRoleRequest**](CreateGroupRoleRequest.md)|  |

### Return type

[**GroupRole**](GroupRole.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGroup"></a>
# **deleteGroup**
> Success deleteGroup(groupId)

Delete Group

Deletes a Group.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
try {
    val result : Success = apiInstance.deleteGroup(groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#deleteGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#deleteGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |

### Return type

[**Success**](Success.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteGroupAnnouncement"></a>
# **deleteGroupAnnouncement**
> Success deleteGroupAnnouncement(groupId)

Delete Group Announcement

Deletes the announcement for a Group.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
try {
    val result : Success = apiInstance.deleteGroupAnnouncement(groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#deleteGroupAnnouncement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#deleteGroupAnnouncement")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |

### Return type

[**Success**](Success.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteGroupGallery"></a>
# **deleteGroupGallery**
> Success deleteGroupGallery(groupId, groupGalleryId)

Delete Group Gallery

Deletes a gallery for a Group.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val groupGalleryId : kotlin.String = ggal_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group gallery ID.
try {
    val result : Success = apiInstance.deleteGroupGallery(groupId, groupGalleryId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#deleteGroupGallery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#deleteGroupGallery")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **groupGalleryId** | **kotlin.String**| Must be a valid group gallery ID. |

### Return type

[**Success**](Success.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteGroupGalleryImage"></a>
# **deleteGroupGalleryImage**
> Success deleteGroupGalleryImage(groupId, groupGalleryId, groupGalleryImageId)

Delete Group Gallery Image

Deletes an image from a Group gallery.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val groupGalleryId : kotlin.String = ggal_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group gallery ID.
val groupGalleryImageId : kotlin.String = ggim_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group gallery image ID.
try {
    val result : Success = apiInstance.deleteGroupGalleryImage(groupId, groupGalleryId, groupGalleryImageId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#deleteGroupGalleryImage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#deleteGroupGalleryImage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **groupGalleryId** | **kotlin.String**| Must be a valid group gallery ID. |
 **groupGalleryImageId** | **kotlin.String**| Must be a valid group gallery image ID. |

### Return type

[**Success**](Success.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteGroupInvite"></a>
# **deleteGroupInvite**
> deleteGroupInvite(groupId, userId)

Delete User Invite

Deletes an Group invite sent to a User

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
try {
    apiInstance.deleteGroupInvite(groupId, userId)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#deleteGroupInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#deleteGroupInvite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **userId** | **kotlin.String**| Must be a valid user ID. |

### Return type

null (empty response body)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteGroupPost"></a>
# **deleteGroupPost**
> Success deleteGroupPost(groupId, notificationId)

Delete a Group post

Delete a Group post

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val notificationId : kotlin.String = notificationId_example // kotlin.String | Must be a valid notification ID.
try {
    val result : Success = apiInstance.deleteGroupPost(groupId, notificationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#deleteGroupPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#deleteGroupPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **notificationId** | **kotlin.String**| Must be a valid notification ID. |

### Return type

[**Success**](Success.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteGroupRole"></a>
# **deleteGroupRole**
> kotlin.collections.List&lt;GroupRole&gt; deleteGroupRole(groupId, groupRoleId)

Delete Group Role

Deletes a Group Role by ID and returns the remaining roles.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val groupRoleId : kotlin.String = grol_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group role ID.
try {
    val result : kotlin.collections.List<GroupRole> = apiInstance.deleteGroupRole(groupId, groupRoleId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#deleteGroupRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#deleteGroupRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **groupRoleId** | **kotlin.String**| Must be a valid group role ID. |

### Return type

[**kotlin.collections.List&lt;GroupRole&gt;**](GroupRole.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroup"></a>
# **getGroup**
> Group getGroup(groupId, includeRoles)

Get Group by ID

Returns a single Group by ID.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val includeRoles : kotlin.Boolean = true // kotlin.Boolean | Include roles for the Group object. Defaults to false.
try {
    val result : Group = apiInstance.getGroup(groupId, includeRoles)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#getGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#getGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **includeRoles** | **kotlin.Boolean**| Include roles for the Group object. Defaults to false. | [optional]

### Return type

[**Group**](Group.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupAnnouncements"></a>
# **getGroupAnnouncements**
> GroupAnnouncement getGroupAnnouncements(groupId)

Get Group Announcement

Returns the announcement for a Group. If no announcement has been made, then it returns **empty object**.  If an announcement exists, then it will always return all fields except &#x60;imageId&#x60; and &#x60;imageUrl&#x60; which may be null.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
try {
    val result : GroupAnnouncement = apiInstance.getGroupAnnouncements(groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#getGroupAnnouncements")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#getGroupAnnouncements")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |

### Return type

[**GroupAnnouncement**](GroupAnnouncement.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupAuditLogs"></a>
# **getGroupAuditLogs**
> PaginatedGroupAuditLogEntryList getGroupAuditLogs(groupId, n, offset, startDate, endDate, actorIds, eventTypes, targetIds)

Get Group Audit Logs

Returns a list of audit logs for a Group.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val n : kotlin.Int = 56 // kotlin.Int | The number of objects to return.
val offset : kotlin.Int = 56 // kotlin.Int | A zero-based offset from the default object sorting from where search results start.
val startDate : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | The start date of the search range.
val endDate : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | The end date of the search range.
val actorIds : kotlin.String = usr_00000000-0000-0000-0000-000000000000,usr_11111111-1111-1111-1111-111111111111 // kotlin.String | The comma-separated actor ids to search for.
val eventTypes : kotlin.String = group.member.remove,group.instance.kick // kotlin.String | The comma-separated event types to search for.
val targetIds : kotlin.String = usr_00000000-0000-0000-0000-000000000000,usr_11111111-1111-1111-1111-111111111111 // kotlin.String | The comma-separated target ids to search for.
try {
    val result : PaginatedGroupAuditLogEntryList = apiInstance.getGroupAuditLogs(groupId, n, offset, startDate, endDate, actorIds, eventTypes, targetIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#getGroupAuditLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#getGroupAuditLogs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **n** | **kotlin.Int**| The number of objects to return. | [optional] [default to 60]
 **offset** | **kotlin.Int**| A zero-based offset from the default object sorting from where search results start. | [optional]
 **startDate** | **java.time.OffsetDateTime**| The start date of the search range. | [optional]
 **endDate** | **java.time.OffsetDateTime**| The end date of the search range. | [optional]
 **actorIds** | **kotlin.String**| The comma-separated actor ids to search for. | [optional]
 **eventTypes** | **kotlin.String**| The comma-separated event types to search for. | [optional]
 **targetIds** | **kotlin.String**| The comma-separated target ids to search for. | [optional]

### Return type

[**PaginatedGroupAuditLogEntryList**](PaginatedGroupAuditLogEntryList.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupBans"></a>
# **getGroupBans**
> kotlin.collections.List&lt;GroupMember&gt; getGroupBans(groupId, n, offset)

Get Group Bans

Returns a list of banned users for a Group.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val n : kotlin.Int = 56 // kotlin.Int | The number of objects to return.
val offset : kotlin.Int = 56 // kotlin.Int | A zero-based offset from the default object sorting from where search results start.
try {
    val result : kotlin.collections.List<GroupMember> = apiInstance.getGroupBans(groupId, n, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#getGroupBans")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#getGroupBans")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **n** | **kotlin.Int**| The number of objects to return. | [optional] [default to 60]
 **offset** | **kotlin.Int**| A zero-based offset from the default object sorting from where search results start. | [optional]

### Return type

[**kotlin.collections.List&lt;GroupMember&gt;**](GroupMember.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupGalleryImages"></a>
# **getGroupGalleryImages**
> kotlin.collections.List&lt;GroupGalleryImage&gt; getGroupGalleryImages(groupId, groupGalleryId, n, offset, approved)

Get Group Gallery Images

Returns a list of images for a Group gallery.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val groupGalleryId : kotlin.String = ggal_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group gallery ID.
val n : kotlin.Int = 56 // kotlin.Int | The number of objects to return.
val offset : kotlin.Int = 56 // kotlin.Int | A zero-based offset from the default object sorting from where search results start.
val approved : kotlin.Boolean = true // kotlin.Boolean | If specified, only returns images that have been approved or not approved.
try {
    val result : kotlin.collections.List<GroupGalleryImage> = apiInstance.getGroupGalleryImages(groupId, groupGalleryId, n, offset, approved)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#getGroupGalleryImages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#getGroupGalleryImages")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **groupGalleryId** | **kotlin.String**| Must be a valid group gallery ID. |
 **n** | **kotlin.Int**| The number of objects to return. | [optional] [default to 60]
 **offset** | **kotlin.Int**| A zero-based offset from the default object sorting from where search results start. | [optional]
 **approved** | **kotlin.Boolean**| If specified, only returns images that have been approved or not approved. | [optional]

### Return type

[**kotlin.collections.List&lt;GroupGalleryImage&gt;**](GroupGalleryImage.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupInstances"></a>
# **getGroupInstances**
> kotlin.collections.List&lt;GroupInstance&gt; getGroupInstances(groupId)

Get Group Instances

Returns a list of group instances

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
try {
    val result : kotlin.collections.List<GroupInstance> = apiInstance.getGroupInstances(groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#getGroupInstances")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#getGroupInstances")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |

### Return type

[**kotlin.collections.List&lt;GroupInstance&gt;**](GroupInstance.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupInvites"></a>
# **getGroupInvites**
> kotlin.collections.List&lt;GroupMember&gt; getGroupInvites(groupId, n, offset)

Get Group Invites Sent

Returns a list of members that have been invited to the Group.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val n : kotlin.Int = 56 // kotlin.Int | The number of objects to return.
val offset : kotlin.Int = 56 // kotlin.Int | A zero-based offset from the default object sorting from where search results start.
try {
    val result : kotlin.collections.List<GroupMember> = apiInstance.getGroupInvites(groupId, n, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#getGroupInvites")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#getGroupInvites")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **n** | **kotlin.Int**| The number of objects to return. | [optional] [default to 60]
 **offset** | **kotlin.Int**| A zero-based offset from the default object sorting from where search results start. | [optional]

### Return type

[**kotlin.collections.List&lt;GroupMember&gt;**](GroupMember.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupMember"></a>
# **getGroupMember**
> GroupLimitedMember getGroupMember(groupId, userId)

Get Group Member

Returns a LimitedGroup Member.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
try {
    val result : GroupLimitedMember = apiInstance.getGroupMember(groupId, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#getGroupMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#getGroupMember")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **userId** | **kotlin.String**| Must be a valid user ID. |

### Return type

[**GroupLimitedMember**](GroupLimitedMember.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupMembers"></a>
# **getGroupMembers**
> kotlin.collections.List&lt;GroupMember&gt; getGroupMembers(groupId, n, offset, sort, roleId)

List Group Members

Returns a List of all **other** Group Members. This endpoint will never return the user calling the endpoint. Information about the user calling the endpoint must be found in the &#x60;myMember&#x60; field of the Group object.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val n : kotlin.Int = 56 // kotlin.Int | The number of objects to return.
val offset : kotlin.Int = 56 // kotlin.Int | A zero-based offset from the default object sorting from where search results start.
val sort : GroupSearchSort =  // GroupSearchSort | The sort order of Group Member results
val roleId : kotlin.String = roleId_example // kotlin.String | Only returns members with a specific groupRoleId
try {
    val result : kotlin.collections.List<GroupMember> = apiInstance.getGroupMembers(groupId, n, offset, sort, roleId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#getGroupMembers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#getGroupMembers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **n** | **kotlin.Int**| The number of objects to return. | [optional] [default to 60]
 **offset** | **kotlin.Int**| A zero-based offset from the default object sorting from where search results start. | [optional]
 **sort** | [**GroupSearchSort**](.md)| The sort order of Group Member results | [optional] [enum: joinedAt:asc, joinedAt:desc]
 **roleId** | **kotlin.String**| Only returns members with a specific groupRoleId | [optional]

### Return type

[**kotlin.collections.List&lt;GroupMember&gt;**](GroupMember.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupPermissions"></a>
# **getGroupPermissions**
> kotlin.collections.List&lt;GroupPermission&gt; getGroupPermissions(groupId)

List Group Permissions

Returns a List of all possible/available permissions for a Group.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
try {
    val result : kotlin.collections.List<GroupPermission> = apiInstance.getGroupPermissions(groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#getGroupPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#getGroupPermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |

### Return type

[**kotlin.collections.List&lt;GroupPermission&gt;**](GroupPermission.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupPost"></a>
# **getGroupPost**
> GroupPost getGroupPost(groupId, n, offset, publicOnly)

Get posts from a Group

Get posts from a Group

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val n : kotlin.Int = 56 // kotlin.Int | The number of objects to return.
val offset : kotlin.Int = 56 // kotlin.Int | A zero-based offset from the default object sorting from where search results start.
val publicOnly : kotlin.Boolean = true // kotlin.Boolean | See public posts only.
try {
    val result : GroupPost = apiInstance.getGroupPost(groupId, n, offset, publicOnly)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#getGroupPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#getGroupPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **n** | **kotlin.Int**| The number of objects to return. | [optional] [default to 60]
 **offset** | **kotlin.Int**| A zero-based offset from the default object sorting from where search results start. | [optional]
 **publicOnly** | **kotlin.Boolean**| See public posts only. | [optional]

### Return type

[**GroupPost**](GroupPost.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupRequests"></a>
# **getGroupRequests**
> kotlin.collections.List&lt;GroupMember&gt; getGroupRequests(groupId, n, offset, blocked)

Get Group Join Requests

Returns a list of members that have requested to join the Group.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val n : kotlin.Int = 56 // kotlin.Int | The number of objects to return.
val offset : kotlin.Int = 56 // kotlin.Int | A zero-based offset from the default object sorting from where search results start.
val blocked : kotlin.Boolean = true // kotlin.Boolean | See blocked join requests
try {
    val result : kotlin.collections.List<GroupMember> = apiInstance.getGroupRequests(groupId, n, offset, blocked)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#getGroupRequests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#getGroupRequests")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **n** | **kotlin.Int**| The number of objects to return. | [optional] [default to 60]
 **offset** | **kotlin.Int**| A zero-based offset from the default object sorting from where search results start. | [optional]
 **blocked** | **kotlin.Boolean**| See blocked join requests | [optional]

### Return type

[**kotlin.collections.List&lt;GroupMember&gt;**](GroupMember.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupRoles"></a>
# **getGroupRoles**
> kotlin.collections.List&lt;GroupRole&gt; getGroupRoles(groupId)

Get Group Roles

Returns a Group Role by ID.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
try {
    val result : kotlin.collections.List<GroupRole> = apiInstance.getGroupRoles(groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#getGroupRoles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#getGroupRoles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |

### Return type

[**kotlin.collections.List&lt;GroupRole&gt;**](GroupRole.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="joinGroup"></a>
# **joinGroup**
> GroupMember joinGroup(groupId)

Join Group

Join a Group by ID and returns the member object.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
try {
    val result : GroupMember = apiInstance.joinGroup(groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#joinGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#joinGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |

### Return type

[**GroupMember**](GroupMember.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="kickGroupMember"></a>
# **kickGroupMember**
> kickGroupMember(groupId, userId)

Kick Group Member

Kicks a Group Member from the Group. The current user must have the \&quot;Remove Group Members\&quot; permission.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
try {
    apiInstance.kickGroupMember(groupId, userId)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#kickGroupMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#kickGroupMember")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **userId** | **kotlin.String**| Must be a valid user ID. |

### Return type

null (empty response body)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="leaveGroup"></a>
# **leaveGroup**
> leaveGroup(groupId)

Leave Group

Leave a group by ID.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
try {
    apiInstance.leaveGroup(groupId)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#leaveGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#leaveGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |

### Return type

null (empty response body)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeGroupMemberRole"></a>
# **removeGroupMemberRole**
> kotlin.collections.List&lt;kotlin.String&gt; removeGroupMemberRole(groupId, userId, groupRoleId)

Remove Role from GroupMember

Removes a Role from a Group Member

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
val groupRoleId : kotlin.String = grol_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group role ID.
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.removeGroupMemberRole(groupId, userId, groupRoleId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#removeGroupMemberRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#removeGroupMemberRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **userId** | **kotlin.String**| Must be a valid user ID. |
 **groupRoleId** | **kotlin.String**| Must be a valid group role ID. |

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="respondGroupJoinRequest"></a>
# **respondGroupJoinRequest**
> respondGroupJoinRequest(groupId, userId, respondGroupJoinRequest)

Respond Group Join request

Responds to a Group Join Request with Accept/Deny

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
val respondGroupJoinRequest : RespondGroupJoinRequest =  // RespondGroupJoinRequest | 
try {
    apiInstance.respondGroupJoinRequest(groupId, userId, respondGroupJoinRequest)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#respondGroupJoinRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#respondGroupJoinRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **userId** | **kotlin.String**| Must be a valid user ID. |
 **respondGroupJoinRequest** | [**RespondGroupJoinRequest**](RespondGroupJoinRequest.md)|  |

### Return type

null (empty response body)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchGroups"></a>
# **searchGroups**
> kotlin.collections.List&lt;LimitedGroup&gt; searchGroups(query, offset, n)

Search Group

Searches Groups by name or shortCode

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val query : kotlin.String = query_example // kotlin.String | Query to search for, can be either Group Name or Group shortCode
val offset : kotlin.Int = 56 // kotlin.Int | A zero-based offset from the default object sorting from where search results start.
val n : kotlin.Int = 56 // kotlin.Int | The number of objects to return.
try {
    val result : kotlin.collections.List<LimitedGroup> = apiInstance.searchGroups(query, offset, n)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#searchGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#searchGroups")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **kotlin.String**| Query to search for, can be either Group Name or Group shortCode | [optional]
 **offset** | **kotlin.Int**| A zero-based offset from the default object sorting from where search results start. | [optional]
 **n** | **kotlin.Int**| The number of objects to return. | [optional] [default to 60]

### Return type

[**kotlin.collections.List&lt;LimitedGroup&gt;**](LimitedGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unbanGroupMember"></a>
# **unbanGroupMember**
> GroupMember unbanGroupMember(groupId, userId)

Unban Group Member

Unbans a user from a Group.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
try {
    val result : GroupMember = apiInstance.unbanGroupMember(groupId, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#unbanGroupMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#unbanGroupMember")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **userId** | **kotlin.String**| Must be a valid user ID. |

### Return type

[**GroupMember**](GroupMember.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateGroup"></a>
# **updateGroup**
> Group updateGroup(groupId, updateGroupRequest)

Update Group

Updates a Group and returns it.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val updateGroupRequest : UpdateGroupRequest =  // UpdateGroupRequest | 
try {
    val result : Group = apiInstance.updateGroup(groupId, updateGroupRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#updateGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#updateGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **updateGroupRequest** | [**UpdateGroupRequest**](UpdateGroupRequest.md)|  | [optional]

### Return type

[**Group**](Group.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateGroupGallery"></a>
# **updateGroupGallery**
> GroupGallery updateGroupGallery(groupId, groupGalleryId, updateGroupGalleryRequest)

Update Group Gallery

Updates a gallery for a Group.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val groupGalleryId : kotlin.String = ggal_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group gallery ID.
val updateGroupGalleryRequest : UpdateGroupGalleryRequest =  // UpdateGroupGalleryRequest | 
try {
    val result : GroupGallery = apiInstance.updateGroupGallery(groupId, groupGalleryId, updateGroupGalleryRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#updateGroupGallery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#updateGroupGallery")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **groupGalleryId** | **kotlin.String**| Must be a valid group gallery ID. |
 **updateGroupGalleryRequest** | [**UpdateGroupGalleryRequest**](UpdateGroupGalleryRequest.md)|  | [optional]

### Return type

[**GroupGallery**](GroupGallery.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateGroupMember"></a>
# **updateGroupMember**
> GroupLimitedMember updateGroupMember(groupId, userId, updateGroupMemberRequest)

Update Group Member

Updates a Group Member

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
val updateGroupMemberRequest : UpdateGroupMemberRequest =  // UpdateGroupMemberRequest | 
try {
    val result : GroupLimitedMember = apiInstance.updateGroupMember(groupId, userId, updateGroupMemberRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#updateGroupMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#updateGroupMember")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **userId** | **kotlin.String**| Must be a valid user ID. |
 **updateGroupMemberRequest** | [**UpdateGroupMemberRequest**](UpdateGroupMemberRequest.md)|  | [optional]

### Return type

[**GroupLimitedMember**](GroupLimitedMember.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateGroupPost"></a>
# **updateGroupPost**
> GroupPost updateGroupPost(groupId, notificationId, createGroupPostRequest)

Edits a Group post

Edits a Group post

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val notificationId : kotlin.String = notificationId_example // kotlin.String | Must be a valid notification ID.
val createGroupPostRequest : CreateGroupPostRequest =  // CreateGroupPostRequest | 
try {
    val result : GroupPost = apiInstance.updateGroupPost(groupId, notificationId, createGroupPostRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#updateGroupPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#updateGroupPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **notificationId** | **kotlin.String**| Must be a valid notification ID. |
 **createGroupPostRequest** | [**CreateGroupPostRequest**](CreateGroupPostRequest.md)|  |

### Return type

[**GroupPost**](GroupPost.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateGroupRole"></a>
# **updateGroupRole**
> kotlin.collections.List&lt;GroupRole&gt; updateGroupRole(groupId, groupRoleId, updateGroupRoleRequest)

Update Group Role

Updates a group role by ID.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = GroupsApi()
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val groupRoleId : kotlin.String = grol_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group role ID.
val updateGroupRoleRequest : UpdateGroupRoleRequest =  // UpdateGroupRoleRequest | 
try {
    val result : kotlin.collections.List<GroupRole> = apiInstance.updateGroupRole(groupId, groupRoleId, updateGroupRoleRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#updateGroupRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#updateGroupRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **kotlin.String**| Must be a valid group ID. |
 **groupRoleId** | **kotlin.String**| Must be a valid group role ID. |
 **updateGroupRoleRequest** | [**UpdateGroupRoleRequest**](UpdateGroupRoleRequest.md)|  | [optional]

### Return type

[**kotlin.collections.List&lt;GroupRole&gt;**](GroupRole.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

