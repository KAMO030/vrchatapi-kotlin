# FavoritesApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFavorite**](FavoritesApi.md#addFavorite) | **POST** /favorites | Add Favorite
[**clearFavoriteGroup**](FavoritesApi.md#clearFavoriteGroup) | **DELETE** /favorite/group/{favoriteGroupType}/{favoriteGroupName}/{userId} | Clear Favorite Group
[**getFavorite**](FavoritesApi.md#getFavorite) | **GET** /favorites/{favoriteId} | Show Favorite
[**getFavoriteGroup**](FavoritesApi.md#getFavoriteGroup) | **GET** /favorite/group/{favoriteGroupType}/{favoriteGroupName}/{userId} | Show Favorite Group
[**getFavoriteGroups**](FavoritesApi.md#getFavoriteGroups) | **GET** /favorite/groups | List Favorite Groups
[**getFavoriteLimits**](FavoritesApi.md#getFavoriteLimits) | **GET** /auth/user/favoritelimits | Get Favorite Limits
[**getFavorites**](FavoritesApi.md#getFavorites) | **GET** /favorites | List Favorites
[**removeFavorite**](FavoritesApi.md#removeFavorite) | **DELETE** /favorites/{favoriteId} | Remove Favorite
[**updateFavoriteGroup**](FavoritesApi.md#updateFavoriteGroup) | **PUT** /favorite/group/{favoriteGroupType}/{favoriteGroupName}/{userId} | Update Favorite Group


<a name="addFavorite"></a>
# **addFavorite**
> Favorite addFavorite(addFavoriteRequest)

Add Favorite

Add a new favorite.  Friend groups are named &#x60;group_0&#x60; through &#x60;group_3&#x60;. Avatar and World groups are named &#x60;avatars1&#x60; to &#x60;avatars4&#x60; and &#x60;worlds1&#x60; to &#x60;worlds4&#x60;.  You cannot add people whom you are not friends with to your friends list. Destroying a friendship removes the person as favorite on both sides.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = FavoritesApi()
val addFavoriteRequest : AddFavoriteRequest = {"type":"friend","favoriteId":"usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469","tags":["group_0"]} // AddFavoriteRequest | 
try {
    val result : Favorite = apiInstance.addFavorite(addFavoriteRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FavoritesApi#addFavorite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FavoritesApi#addFavorite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addFavoriteRequest** | [**AddFavoriteRequest**](AddFavoriteRequest.md)|  | [optional]

### Return type

[**Favorite**](Favorite.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clearFavoriteGroup"></a>
# **clearFavoriteGroup**
> Success clearFavoriteGroup(favoriteGroupType, favoriteGroupName, userId)

Clear Favorite Group

Clear ALL contents of a specific favorite group.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = FavoritesApi()
val favoriteGroupType : kotlin.String = favoriteGroupType_example // kotlin.String | The type of group to fetch, must be a valid FavoriteType.
val favoriteGroupName : kotlin.String = favoriteGroupName_example // kotlin.String | The name of the group to fetch, must be a name of a FavoriteGroup.
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
try {
    val result : Success = apiInstance.clearFavoriteGroup(favoriteGroupType, favoriteGroupName, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FavoritesApi#clearFavoriteGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FavoritesApi#clearFavoriteGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **favoriteGroupType** | **kotlin.String**| The type of group to fetch, must be a valid FavoriteType. | [enum: world, friend, avatar]
 **favoriteGroupName** | **kotlin.String**| The name of the group to fetch, must be a name of a FavoriteGroup. |
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

<a name="getFavorite"></a>
# **getFavorite**
> Favorite getFavorite(favoriteId)

Show Favorite

Return information about a specific Favorite.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = FavoritesApi()
val favoriteId : kotlin.String = favoriteId_example // kotlin.String | Must be a valid favorite ID.
try {
    val result : Favorite = apiInstance.getFavorite(favoriteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FavoritesApi#getFavorite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FavoritesApi#getFavorite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **favoriteId** | **kotlin.String**| Must be a valid favorite ID. |

### Return type

[**Favorite**](Favorite.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFavoriteGroup"></a>
# **getFavoriteGroup**
> FavoriteGroup getFavoriteGroup(favoriteGroupType, favoriteGroupName, userId)

Show Favorite Group

Fetch information about a specific favorite group.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = FavoritesApi()
val favoriteGroupType : kotlin.String = favoriteGroupType_example // kotlin.String | The type of group to fetch, must be a valid FavoriteType.
val favoriteGroupName : kotlin.String = favoriteGroupName_example // kotlin.String | The name of the group to fetch, must be a name of a FavoriteGroup.
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
try {
    val result : FavoriteGroup = apiInstance.getFavoriteGroup(favoriteGroupType, favoriteGroupName, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FavoritesApi#getFavoriteGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FavoritesApi#getFavoriteGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **favoriteGroupType** | **kotlin.String**| The type of group to fetch, must be a valid FavoriteType. | [enum: world, friend, avatar]
 **favoriteGroupName** | **kotlin.String**| The name of the group to fetch, must be a name of a FavoriteGroup. |
 **userId** | **kotlin.String**| Must be a valid user ID. |

### Return type

[**FavoriteGroup**](FavoriteGroup.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFavoriteGroups"></a>
# **getFavoriteGroups**
> kotlin.collections.List&lt;FavoriteGroup&gt; getFavoriteGroups(n, offset, ownerId)

List Favorite Groups

Return a list of favorite groups owned by a user. Returns the same information as &#x60;getFavoriteGroups&#x60;.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = FavoritesApi()
val n : kotlin.Int = 56 // kotlin.Int | The number of objects to return.
val offset : kotlin.Int = 56 // kotlin.Int | A zero-based offset from the default object sorting from where search results start.
val ownerId : kotlin.String = ownerId_example // kotlin.String | The owner of whoms favorite groups to return. Must be a UserID.
try {
    val result : kotlin.collections.List<FavoriteGroup> = apiInstance.getFavoriteGroups(n, offset, ownerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FavoritesApi#getFavoriteGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FavoritesApi#getFavoriteGroups")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **n** | **kotlin.Int**| The number of objects to return. | [optional] [default to 60]
 **offset** | **kotlin.Int**| A zero-based offset from the default object sorting from where search results start. | [optional]
 **ownerId** | **kotlin.String**| The owner of whoms favorite groups to return. Must be a UserID. | [optional]

### Return type

[**kotlin.collections.List&lt;FavoriteGroup&gt;**](FavoriteGroup.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFavoriteLimits"></a>
# **getFavoriteLimits**
> FavoriteLimits getFavoriteLimits()

Get Favorite Limits

Return information about a specific Favorite.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = FavoritesApi()
try {
    val result : FavoriteLimits = apiInstance.getFavoriteLimits()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FavoritesApi#getFavoriteLimits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FavoritesApi#getFavoriteLimits")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FavoriteLimits**](FavoriteLimits.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFavorites"></a>
# **getFavorites**
> kotlin.collections.List&lt;Favorite&gt; getFavorites(n, offset, type, tag)

List Favorites

Returns a list of favorites.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = FavoritesApi()
val n : kotlin.Int = 56 // kotlin.Int | The number of objects to return.
val offset : kotlin.Int = 56 // kotlin.Int | A zero-based offset from the default object sorting from where search results start.
val type : kotlin.String = type_example // kotlin.String | The type of favorites to return, FavoriteType.
val tag : kotlin.String = tag_example // kotlin.String | Tags to include (comma-separated). Any of the tags needs to be present.
try {
    val result : kotlin.collections.List<Favorite> = apiInstance.getFavorites(n, offset, type, tag)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FavoritesApi#getFavorites")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FavoritesApi#getFavorites")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **n** | **kotlin.Int**| The number of objects to return. | [optional] [default to 60]
 **offset** | **kotlin.Int**| A zero-based offset from the default object sorting from where search results start. | [optional]
 **type** | **kotlin.String**| The type of favorites to return, FavoriteType. | [optional]
 **tag** | **kotlin.String**| Tags to include (comma-separated). Any of the tags needs to be present. | [optional]

### Return type

[**kotlin.collections.List&lt;Favorite&gt;**](Favorite.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeFavorite"></a>
# **removeFavorite**
> Success removeFavorite(favoriteId)

Remove Favorite

Remove a favorite from your favorites list.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = FavoritesApi()
val favoriteId : kotlin.String = favoriteId_example // kotlin.String | Must be a valid favorite ID.
try {
    val result : Success = apiInstance.removeFavorite(favoriteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FavoritesApi#removeFavorite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FavoritesApi#removeFavorite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **favoriteId** | **kotlin.String**| Must be a valid favorite ID. |

### Return type

[**Success**](Success.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFavoriteGroup"></a>
# **updateFavoriteGroup**
> updateFavoriteGroup(favoriteGroupType, favoriteGroupName, userId, updateFavoriteGroupRequest)

Update Favorite Group

Update information about a specific favorite group.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = FavoritesApi()
val favoriteGroupType : kotlin.String = favoriteGroupType_example // kotlin.String | The type of group to fetch, must be a valid FavoriteType.
val favoriteGroupName : kotlin.String = favoriteGroupName_example // kotlin.String | The name of the group to fetch, must be a name of a FavoriteGroup.
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
val updateFavoriteGroupRequest : UpdateFavoriteGroupRequest =  // UpdateFavoriteGroupRequest | 
try {
    apiInstance.updateFavoriteGroup(favoriteGroupType, favoriteGroupName, userId, updateFavoriteGroupRequest)
} catch (e: ClientException) {
    println("4xx response calling FavoritesApi#updateFavoriteGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FavoritesApi#updateFavoriteGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **favoriteGroupType** | **kotlin.String**| The type of group to fetch, must be a valid FavoriteType. | [enum: world, friend, avatar]
 **favoriteGroupName** | **kotlin.String**| The name of the group to fetch, must be a name of a FavoriteGroup. |
 **userId** | **kotlin.String**| Must be a valid user ID. |
 **updateFavoriteGroupRequest** | [**UpdateFavoriteGroupRequest**](UpdateFavoriteGroupRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

