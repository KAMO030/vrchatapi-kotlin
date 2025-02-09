# PlayermoderationApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clearAllPlayerModerations**](PlayermoderationApi.md#clearAllPlayerModerations) | **DELETE** /auth/user/playermoderations | Clear All Player Moderations
[**getPlayerModerations**](PlayermoderationApi.md#getPlayerModerations) | **GET** /auth/user/playermoderations | Search Player Moderations
[**moderateUser**](PlayermoderationApi.md#moderateUser) | **POST** /auth/user/playermoderations | Moderate User
[**unmoderateUser**](PlayermoderationApi.md#unmoderateUser) | **PUT** /auth/user/unplayermoderate | Unmoderate User


<a name="clearAllPlayerModerations"></a>
# **clearAllPlayerModerations**
> Success clearAllPlayerModerations()

Clear All Player Moderations

⚠️ **This will delete every single player moderation you&#39;ve ever made.**

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = PlayermoderationApi()
try {
    val result : Success = apiInstance.clearAllPlayerModerations()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayermoderationApi#clearAllPlayerModerations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayermoderationApi#clearAllPlayerModerations")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Success**](Success.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPlayerModerations"></a>
# **getPlayerModerations**
> kotlin.collections.List&lt;PlayerModeration&gt; getPlayerModerations(type, targetUserId)

Search Player Moderations

Returns a list of all player moderations made by **you**.  This endpoint does not have pagination, and will return *all* results. Use query parameters to limit your query if needed.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = PlayermoderationApi()
val type : kotlin.String = type_example // kotlin.String | Must be one of PlayerModerationType, except unblock. Unblocking simply removes a block.
val targetUserId : kotlin.String = targetUserId_example // kotlin.String | Must be valid UserID.
try {
    val result : kotlin.collections.List<PlayerModeration> = apiInstance.getPlayerModerations(type, targetUserId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayermoderationApi#getPlayerModerations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayermoderationApi#getPlayerModerations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **kotlin.String**| Must be one of PlayerModerationType, except unblock. Unblocking simply removes a block. | [optional]
 **targetUserId** | **kotlin.String**| Must be valid UserID. | [optional]

### Return type

[**kotlin.collections.List&lt;PlayerModeration&gt;**](PlayerModeration.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="moderateUser"></a>
# **moderateUser**
> PlayerModeration moderateUser(moderateUserRequest)

Moderate User

Moderate a user, e.g. unmute them or show their avatar.  Please see the [Player Moderation docs](https://vrchatapi.github.io/docs/api/#tag--playermoderation) on what playerModerations are, and how they differ from staff moderations.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = PlayermoderationApi()
val moderateUserRequest : ModerateUserRequest =  // ModerateUserRequest | 
try {
    val result : PlayerModeration = apiInstance.moderateUser(moderateUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayermoderationApi#moderateUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayermoderationApi#moderateUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **moderateUserRequest** | [**ModerateUserRequest**](ModerateUserRequest.md)|  |

### Return type

[**PlayerModeration**](PlayerModeration.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unmoderateUser"></a>
# **unmoderateUser**
> Success unmoderateUser(moderateUserRequest)

Unmoderate User

Removes a player moderation previously added through &#x60;moderateUser&#x60;. E.g if you previously have shown their avatar, but now want to reset it to default.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = PlayermoderationApi()
val moderateUserRequest : ModerateUserRequest =  // ModerateUserRequest | 
try {
    val result : Success = apiInstance.unmoderateUser(moderateUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayermoderationApi#unmoderateUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayermoderationApi#unmoderateUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **moderateUserRequest** | [**ModerateUserRequest**](ModerateUserRequest.md)|  |

### Return type

[**Success**](Success.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

