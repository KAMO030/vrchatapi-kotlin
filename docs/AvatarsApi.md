# AvatarsApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAvatar**](AvatarsApi.md#createAvatar) | **POST** /avatars | Create Avatar
[**deleteAvatar**](AvatarsApi.md#deleteAvatar) | **DELETE** /avatars/{avatarId} | Delete Avatar
[**getAvatar**](AvatarsApi.md#getAvatar) | **GET** /avatars/{avatarId} | Get Avatar
[**getFavoritedAvatars**](AvatarsApi.md#getFavoritedAvatars) | **GET** /avatars/favorites | List Favorited Avatars
[**getOwnAvatar**](AvatarsApi.md#getOwnAvatar) | **GET** /users/{userId}/avatar | Get Own Avatar
[**searchAvatars**](AvatarsApi.md#searchAvatars) | **GET** /avatars | Search Avatars
[**selectAvatar**](AvatarsApi.md#selectAvatar) | **PUT** /avatars/{avatarId}/select | Select Avatar
[**selectFallbackAvatar**](AvatarsApi.md#selectFallbackAvatar) | **PUT** /avatars/{avatarId}/selectFallback | Select Fallback Avatar
[**updateAvatar**](AvatarsApi.md#updateAvatar) | **PUT** /avatars/{avatarId} | Update Avatar


<a name="createAvatar"></a>
# **createAvatar**
> Avatar createAvatar(createAvatarRequest)

Create Avatar

Create an avatar. It&#39;s possible to optionally specify a ID if you want a custom one. Attempting to create an Avatar with an already claimed ID will result in a DB error.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = AvatarsApi()
val createAvatarRequest : CreateAvatarRequest =  // CreateAvatarRequest | 
try {
    val result : Avatar = apiInstance.createAvatar(createAvatarRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AvatarsApi#createAvatar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AvatarsApi#createAvatar")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createAvatarRequest** | [**CreateAvatarRequest**](CreateAvatarRequest.md)|  | [optional]

### Return type

[**Avatar**](Avatar.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAvatar"></a>
# **deleteAvatar**
> Avatar deleteAvatar(avatarId)

Delete Avatar

Delete an avatar. Notice an avatar is never fully \&quot;deleted\&quot;, only its ReleaseStatus is set to \&quot;hidden\&quot; and the linked Files are deleted. The AvatarID is permanently reserved.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = AvatarsApi()
val avatarId : kotlin.String = avatarId_example // kotlin.String | Must be a valid avatar ID.
try {
    val result : Avatar = apiInstance.deleteAvatar(avatarId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AvatarsApi#deleteAvatar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AvatarsApi#deleteAvatar")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **avatarId** | **kotlin.String**| Must be a valid avatar ID. |

### Return type

[**Avatar**](Avatar.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAvatar"></a>
# **getAvatar**
> Avatar getAvatar(avatarId)

Get Avatar

Get information about a specific Avatar.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = AvatarsApi()
val avatarId : kotlin.String = avatarId_example // kotlin.String | Must be a valid avatar ID.
try {
    val result : Avatar = apiInstance.getAvatar(avatarId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AvatarsApi#getAvatar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AvatarsApi#getAvatar")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **avatarId** | **kotlin.String**| Must be a valid avatar ID. |

### Return type

[**Avatar**](Avatar.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFavoritedAvatars"></a>
# **getFavoritedAvatars**
> kotlin.collections.List&lt;Avatar&gt; getFavoritedAvatars(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId)

List Favorited Avatars

Search and list favorited avatars by query filters.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = AvatarsApi()
val featured : kotlin.Boolean = true // kotlin.Boolean | Filters on featured results.
val sort : SortOption =  // SortOption | The sort order of the results.
val n : kotlin.Int = 56 // kotlin.Int | The number of objects to return.
val order : OrderOption =  // OrderOption | Result ordering
val offset : kotlin.Int = 56 // kotlin.Int | A zero-based offset from the default object sorting from where search results start.
val search : kotlin.String = search_example // kotlin.String | Filters by world name.
val tag : kotlin.String = tag_example // kotlin.String | Tags to include (comma-separated). Any of the tags needs to be present.
val notag : kotlin.String = notag_example // kotlin.String | Tags to exclude (comma-separated).
val releaseStatus : ReleaseStatus =  // ReleaseStatus | Filter by ReleaseStatus.
val maxUnityVersion : kotlin.String = maxUnityVersion_example // kotlin.String | The maximum Unity version supported by the asset.
val minUnityVersion : kotlin.String = minUnityVersion_example // kotlin.String | The minimum Unity version supported by the asset.
val platform : kotlin.String = platform_example // kotlin.String | The platform the asset supports.
val userId : kotlin.String = userId_example // kotlin.String | Target user to see information on, admin-only.
try {
    val result : kotlin.collections.List<Avatar> = apiInstance.getFavoritedAvatars(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AvatarsApi#getFavoritedAvatars")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AvatarsApi#getFavoritedAvatars")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featured** | **kotlin.Boolean**| Filters on featured results. | [optional]
 **sort** | [**SortOption**](.md)| The sort order of the results. | [optional] [default to popularity] [enum: popularity, heat, trust, shuffle, random, favorites, reportScore, reportCount, publicationDate, labsPublicationDate, created, _created_at, updated, _updated_at, order, relevance, magic, name]
 **n** | **kotlin.Int**| The number of objects to return. | [optional] [default to 60]
 **order** | [**OrderOption**](.md)| Result ordering | [optional] [default to descending] [enum: ascending, descending]
 **offset** | **kotlin.Int**| A zero-based offset from the default object sorting from where search results start. | [optional]
 **search** | **kotlin.String**| Filters by world name. | [optional]
 **tag** | **kotlin.String**| Tags to include (comma-separated). Any of the tags needs to be present. | [optional]
 **notag** | **kotlin.String**| Tags to exclude (comma-separated). | [optional]
 **releaseStatus** | [**ReleaseStatus**](.md)| Filter by ReleaseStatus. | [optional] [default to public] [enum: public, private, hidden, all]
 **maxUnityVersion** | **kotlin.String**| The maximum Unity version supported by the asset. | [optional]
 **minUnityVersion** | **kotlin.String**| The minimum Unity version supported by the asset. | [optional]
 **platform** | **kotlin.String**| The platform the asset supports. | [optional]
 **userId** | **kotlin.String**| Target user to see information on, admin-only. | [optional]

### Return type

[**kotlin.collections.List&lt;Avatar&gt;**](Avatar.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOwnAvatar"></a>
# **getOwnAvatar**
> Avatar getOwnAvatar(userId)

Get Own Avatar

Get the current avatar for the user. This will return an error for any other user than the one logged in.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = AvatarsApi()
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
try {
    val result : Avatar = apiInstance.getOwnAvatar(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AvatarsApi#getOwnAvatar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AvatarsApi#getOwnAvatar")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| Must be a valid user ID. |

### Return type

[**Avatar**](Avatar.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchAvatars"></a>
# **searchAvatars**
> kotlin.collections.List&lt;Avatar&gt; searchAvatars(featured, sort, user, userId, n, order, offset, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform)

Search Avatars

Search and list avatars by query filters. You can only search your own or featured avatars. It is not possible as a normal user to search other peoples avatars.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = AvatarsApi()
val featured : kotlin.Boolean = true // kotlin.Boolean | Filters on featured results.
val sort : SortOption =  // SortOption | The sort order of the results.
val user : kotlin.String = user_example // kotlin.String | Set to `me` for searching own avatars.
val userId : kotlin.String = userId_example // kotlin.String | Filter by UserID.
val n : kotlin.Int = 56 // kotlin.Int | The number of objects to return.
val order : OrderOption =  // OrderOption | Result ordering
val offset : kotlin.Int = 56 // kotlin.Int | A zero-based offset from the default object sorting from where search results start.
val tag : kotlin.String = tag_example // kotlin.String | Tags to include (comma-separated). Any of the tags needs to be present.
val notag : kotlin.String = notag_example // kotlin.String | Tags to exclude (comma-separated).
val releaseStatus : ReleaseStatus =  // ReleaseStatus | Filter by ReleaseStatus.
val maxUnityVersion : kotlin.String = maxUnityVersion_example // kotlin.String | The maximum Unity version supported by the asset.
val minUnityVersion : kotlin.String = minUnityVersion_example // kotlin.String | The minimum Unity version supported by the asset.
val platform : kotlin.String = platform_example // kotlin.String | The platform the asset supports.
try {
    val result : kotlin.collections.List<Avatar> = apiInstance.searchAvatars(featured, sort, user, userId, n, order, offset, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AvatarsApi#searchAvatars")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AvatarsApi#searchAvatars")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featured** | **kotlin.Boolean**| Filters on featured results. | [optional]
 **sort** | [**SortOption**](.md)| The sort order of the results. | [optional] [default to popularity] [enum: popularity, heat, trust, shuffle, random, favorites, reportScore, reportCount, publicationDate, labsPublicationDate, created, _created_at, updated, _updated_at, order, relevance, magic, name]
 **user** | **kotlin.String**| Set to &#x60;me&#x60; for searching own avatars. | [optional] [enum: me]
 **userId** | **kotlin.String**| Filter by UserID. | [optional]
 **n** | **kotlin.Int**| The number of objects to return. | [optional] [default to 60]
 **order** | [**OrderOption**](.md)| Result ordering | [optional] [default to descending] [enum: ascending, descending]
 **offset** | **kotlin.Int**| A zero-based offset from the default object sorting from where search results start. | [optional]
 **tag** | **kotlin.String**| Tags to include (comma-separated). Any of the tags needs to be present. | [optional]
 **notag** | **kotlin.String**| Tags to exclude (comma-separated). | [optional]
 **releaseStatus** | [**ReleaseStatus**](.md)| Filter by ReleaseStatus. | [optional] [default to public] [enum: public, private, hidden, all]
 **maxUnityVersion** | **kotlin.String**| The maximum Unity version supported by the asset. | [optional]
 **minUnityVersion** | **kotlin.String**| The minimum Unity version supported by the asset. | [optional]
 **platform** | **kotlin.String**| The platform the asset supports. | [optional]

### Return type

[**kotlin.collections.List&lt;Avatar&gt;**](Avatar.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="selectAvatar"></a>
# **selectAvatar**
> CurrentUser selectAvatar(avatarId)

Select Avatar

Switches into that avatar.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = AvatarsApi()
val avatarId : kotlin.String = avatarId_example // kotlin.String | Must be a valid avatar ID.
try {
    val result : CurrentUser = apiInstance.selectAvatar(avatarId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AvatarsApi#selectAvatar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AvatarsApi#selectAvatar")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **avatarId** | **kotlin.String**| Must be a valid avatar ID. |

### Return type

[**CurrentUser**](CurrentUser.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="selectFallbackAvatar"></a>
# **selectFallbackAvatar**
> CurrentUser selectFallbackAvatar(avatarId)

Select Fallback Avatar

Switches into that avatar as your fallback avatar.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = AvatarsApi()
val avatarId : kotlin.String = avatarId_example // kotlin.String | Must be a valid avatar ID.
try {
    val result : CurrentUser = apiInstance.selectFallbackAvatar(avatarId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AvatarsApi#selectFallbackAvatar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AvatarsApi#selectFallbackAvatar")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **avatarId** | **kotlin.String**| Must be a valid avatar ID. |

### Return type

[**CurrentUser**](CurrentUser.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAvatar"></a>
# **updateAvatar**
> Avatar updateAvatar(avatarId, updateAvatarRequest)

Update Avatar

Update information about a specific avatar.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = AvatarsApi()
val avatarId : kotlin.String = avatarId_example // kotlin.String | Must be a valid avatar ID.
val updateAvatarRequest : UpdateAvatarRequest =  // UpdateAvatarRequest | 
try {
    val result : Avatar = apiInstance.updateAvatar(avatarId, updateAvatarRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AvatarsApi#updateAvatar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AvatarsApi#updateAvatar")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **avatarId** | **kotlin.String**| Must be a valid avatar ID. |
 **updateAvatarRequest** | [**UpdateAvatarRequest**](UpdateAvatarRequest.md)|  | [optional]

### Return type

[**Avatar**](Avatar.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

