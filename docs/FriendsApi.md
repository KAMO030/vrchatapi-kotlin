# FriendsApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteFriendRequest**](FriendsApi.md#deleteFriendRequest) | **DELETE** /user/{userId}/friendRequest | Delete Friend Request
[**friend**](FriendsApi.md#friend) | **POST** /user/{userId}/friendRequest | Send Friend Request
[**getFriendStatus**](FriendsApi.md#getFriendStatus) | **GET** /user/{userId}/friendStatus | Check Friend Status
[**getFriends**](FriendsApi.md#getFriends) | **GET** /auth/user/friends | List Friends
[**unfriend**](FriendsApi.md#unfriend) | **DELETE** /auth/user/friends/{userId} | Unfriend


<a name="deleteFriendRequest"></a>
# **deleteFriendRequest**
> Success deleteFriendRequest(userId)

Delete Friend Request

Deletes an outgoing pending friend request to another user. To delete an incoming friend request, use the &#x60;deleteNotification&#x60; endpoint instead.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = FriendsApi()
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
try {
    val result : Success = apiInstance.deleteFriendRequest(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FriendsApi#deleteFriendRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FriendsApi#deleteFriendRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| Must be a valid user ID. |

### Return type

[**Success**](Success.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="friend"></a>
# **friend**
> Notification friend(userId)

Send Friend Request

Send a friend request to another user.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = FriendsApi()
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
try {
    val result : Notification = apiInstance.friend(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FriendsApi#friend")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FriendsApi#friend")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| Must be a valid user ID. |

### Return type

[**Notification**](Notification.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFriendStatus"></a>
# **getFriendStatus**
> FriendStatus getFriendStatus(userId)

Check Friend Status

Retrieve if the user is currently a friend with a given user, if they have an outgoing friend request, and if they have an incoming friend request. The proper way to receive and accept friend request is by checking if the user has an incoming &#x60;Notification&#x60; of type &#x60;friendRequest&#x60;, and then accepting that notification.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = FriendsApi()
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
try {
    val result : FriendStatus = apiInstance.getFriendStatus(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FriendsApi#getFriendStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FriendsApi#getFriendStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| Must be a valid user ID. |

### Return type

[**FriendStatus**](FriendStatus.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFriends"></a>
# **getFriends**
> kotlin.collections.List&lt;LimitedUser&gt; getFriends(offset, n, offline)

List Friends

List information about friends.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = FriendsApi()
val offset : kotlin.Int = 56 // kotlin.Int | A zero-based offset from the default object sorting from where search results start.
val n : kotlin.Int = 56 // kotlin.Int | The number of objects to return.
val offline : kotlin.Boolean = true // kotlin.Boolean | Returns *only* offline users if true, returns only online and active users if false
try {
    val result : kotlin.collections.List<LimitedUser> = apiInstance.getFriends(offset, n, offline)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FriendsApi#getFriends")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FriendsApi#getFriends")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **kotlin.Int**| A zero-based offset from the default object sorting from where search results start. | [optional]
 **n** | **kotlin.Int**| The number of objects to return. | [optional] [default to 60]
 **offline** | **kotlin.Boolean**| Returns *only* offline users if true, returns only online and active users if false | [optional]

### Return type

[**kotlin.collections.List&lt;LimitedUser&gt;**](LimitedUser.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unfriend"></a>
# **unfriend**
> Success unfriend(userId)

Unfriend

Unfriend a user by ID.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = FriendsApi()
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
try {
    val result : Success = apiInstance.unfriend(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FriendsApi#unfriend")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FriendsApi#unfriend")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| Must be a valid user ID. |

### Return type

[**Success**](Success.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

