# UsersApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUser**](UsersApi.md#getUser) | **GET** /users/{userId} | Get User by ID
[**getUserByName**](UsersApi.md#getUserByName) | **GET** /users/{username}/name | Get User by Username
[**getUserFeedback**](UsersApi.md#getUserFeedback) | **GET** /users/{userId}/feedback | Get User Feedback
[**getUserGroupInstances**](UsersApi.md#getUserGroupInstances) | **GET** /users/{userId}/instances/groups | Get User Group Instances
[**getUserGroupRequests**](UsersApi.md#getUserGroupRequests) | **GET** /users/{userId}/groups/requested | Get User Group Requests
[**getUserGroups**](UsersApi.md#getUserGroups) | **GET** /users/{userId}/groups | Get User Groups
[**getUserNote**](UsersApi.md#getUserNote) | **GET** /userNotes/{userNoteId} | Get User Note
[**getUserNotes**](UsersApi.md#getUserNotes) | **GET** /userNotes | Get User Notes
[**getUserRepresentedGroup**](UsersApi.md#getUserRepresentedGroup) | **GET** /users/{userId}/groups/represented | Get user&#39;s current represented group
[**searchUsers**](UsersApi.md#searchUsers) | **GET** /users | Search All Users
[**updateUser**](UsersApi.md#updateUser) | **PUT** /users/{userId} | Update User Info
[**updateUserNote**](UsersApi.md#updateUserNote) | **POST** /userNotes | Update User Note


<a name="getUser"></a>
# **getUser**
> User getUser(userId)

Get User by ID

Get public user information about a specific user using their ID.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = UsersApi()
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
try {
    val result : User = apiInstance.getUser(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| Must be a valid user ID. |

### Return type

[**User**](User.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserByName"></a>
# **getUserByName**
> User getUserByName(username)

Get User by Username

~~Get public user information about a specific user using their name.~~  **DEPRECATED:** VRChat API no longer return usernames of other users. [See issue by Tupper for more information](https://github.com/pypy-vrc/VRCX/issues/429). This endpoint now require Admin Credentials.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = UsersApi()
val username : kotlin.String = username_example // kotlin.String | Username of the user
try {
    val result : User = apiInstance.getUserByName(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUserByName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUserByName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| Username of the user |

### Return type

[**User**](User.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserFeedback"></a>
# **getUserFeedback**
> kotlin.collections.List&lt;Feedback&gt; getUserFeedback(userId, contentId, n, offset)

Get User Feedback

Get user&#39;s submitted feedback

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = UsersApi()
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
val contentId : kotlin.Boolean = true // kotlin.Boolean | Filter for users' previously submitted feedback, e.g., a groupId, useeId, avatarId, etc.
val n : kotlin.Int = 56 // kotlin.Int | The number of objects to return.
val offset : kotlin.Int = 56 // kotlin.Int | A zero-based offset from the default object sorting from where search results start.
try {
    val result : kotlin.collections.List<Feedback> = apiInstance.getUserFeedback(userId, contentId, n, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUserFeedback")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUserFeedback")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| Must be a valid user ID. |
 **contentId** | **kotlin.Boolean**| Filter for users&#39; previously submitted feedback, e.g., a groupId, useeId, avatarId, etc. | [optional]
 **n** | **kotlin.Int**| The number of objects to return. | [optional] [default to 60]
 **offset** | **kotlin.Int**| A zero-based offset from the default object sorting from where search results start. | [optional]

### Return type

[**kotlin.collections.List&lt;Feedback&gt;**](Feedback.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserGroupInstances"></a>
# **getUserGroupInstances**
> InlineResponse200 getUserGroupInstances(userId)

Get User Group Instances

Returns a list of group instances for a user

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = UsersApi()
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
try {
    val result : InlineResponse200 = apiInstance.getUserGroupInstances(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUserGroupInstances")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUserGroupInstances")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| Must be a valid user ID. |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserGroupRequests"></a>
# **getUserGroupRequests**
> kotlin.collections.List&lt;Group&gt; getUserGroupRequests(userId)

Get User Group Requests

Returns a list of Groups the user has requested to be invited into.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = UsersApi()
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
try {
    val result : kotlin.collections.List<Group> = apiInstance.getUserGroupRequests(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUserGroupRequests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUserGroupRequests")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| Must be a valid user ID. |

### Return type

[**kotlin.collections.List&lt;Group&gt;**](Group.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserGroups"></a>
# **getUserGroups**
> kotlin.collections.List&lt;LimitedUserGroups&gt; getUserGroups(userId)

Get User Groups

Get user&#39;s public groups

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = UsersApi()
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
try {
    val result : kotlin.collections.List<LimitedUserGroups> = apiInstance.getUserGroups(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUserGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUserGroups")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| Must be a valid user ID. |

### Return type

[**kotlin.collections.List&lt;LimitedUserGroups&gt;**](LimitedUserGroups.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserNote"></a>
# **getUserNote**
> UserNote getUserNote(userNoteId)

Get User Note

Get a particular user note

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = UsersApi()
val userNoteId : kotlin.String = userNoteId_example // kotlin.String | Must be a valid user note ID.
try {
    val result : UserNote = apiInstance.getUserNote(userNoteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUserNote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUserNote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userNoteId** | **kotlin.String**| Must be a valid user note ID. |

### Return type

[**UserNote**](UserNote.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserNotes"></a>
# **getUserNotes**
> kotlin.collections.List&lt;UserNote&gt; getUserNotes(n, offset)

Get User Notes

Get recently updated user notes

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = UsersApi()
val n : kotlin.Int = 56 // kotlin.Int | The number of objects to return.
val offset : kotlin.Int = 56 // kotlin.Int | A zero-based offset from the default object sorting from where search results start.
try {
    val result : kotlin.collections.List<UserNote> = apiInstance.getUserNotes(n, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUserNotes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUserNotes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **n** | **kotlin.Int**| The number of objects to return. | [optional] [default to 60]
 **offset** | **kotlin.Int**| A zero-based offset from the default object sorting from where search results start. | [optional]

### Return type

[**kotlin.collections.List&lt;UserNote&gt;**](UserNote.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserRepresentedGroup"></a>
# **getUserRepresentedGroup**
> RepresentedGroup getUserRepresentedGroup(userId)

Get user&#39;s current represented group

Returns the current group that the user is currently representing

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = UsersApi()
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
try {
    val result : RepresentedGroup = apiInstance.getUserRepresentedGroup(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUserRepresentedGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUserRepresentedGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| Must be a valid user ID. |

### Return type

[**RepresentedGroup**](RepresentedGroup.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchUsers"></a>
# **searchUsers**
> kotlin.collections.List&lt;LimitedUser&gt; searchUsers(search, developerType, n, offset)

Search All Users

Search and list any users by text query

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = UsersApi()
val search : kotlin.String = search_example // kotlin.String | Searches by `displayName`. Will return empty array if search query is empty or missing.
val developerType : kotlin.String = developerType_example // kotlin.String | Active user by developer type, none for normal users and internal for moderators
val n : kotlin.Int = 56 // kotlin.Int | The number of objects to return.
val offset : kotlin.Int = 56 // kotlin.Int | A zero-based offset from the default object sorting from where search results start.
try {
    val result : kotlin.collections.List<LimitedUser> = apiInstance.searchUsers(search, developerType, n, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#searchUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#searchUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **kotlin.String**| Searches by &#x60;displayName&#x60;. Will return empty array if search query is empty or missing. | [optional]
 **developerType** | **kotlin.String**| Active user by developer type, none for normal users and internal for moderators | [optional]
 **n** | **kotlin.Int**| The number of objects to return. | [optional] [default to 60]
 **offset** | **kotlin.Int**| A zero-based offset from the default object sorting from where search results start. | [optional]

### Return type

[**kotlin.collections.List&lt;LimitedUser&gt;**](LimitedUser.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> CurrentUser updateUser(userId, updateUserRequest)

Update User Info

Update a users information such as the email and birthday.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = UsersApi()
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
val updateUserRequest : UpdateUserRequest =  // UpdateUserRequest | 
try {
    val result : CurrentUser = apiInstance.updateUser(userId, updateUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#updateUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#updateUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| Must be a valid user ID. |
 **updateUserRequest** | [**UpdateUserRequest**](UpdateUserRequest.md)|  | [optional]

### Return type

[**CurrentUser**](CurrentUser.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserNote"></a>
# **updateUserNote**
> UserNote updateUserNote(updateUserNoteRequest)

Update User Note

Updates the currently authenticated user&#39;s note on a user

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = UsersApi()
val updateUserNoteRequest : UpdateUserNoteRequest =  // UpdateUserNoteRequest | 
try {
    val result : UserNote = apiInstance.updateUserNote(updateUserNoteRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#updateUserNote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#updateUserNote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateUserNoteRequest** | [**UpdateUserNoteRequest**](UpdateUserNoteRequest.md)|  |

### Return type

[**UserNote**](UserNote.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

