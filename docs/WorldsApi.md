# WorldsApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorld**](WorldsApi.md#createWorld) | **POST** /worlds | Create World
[**deleteWorld**](WorldsApi.md#deleteWorld) | **DELETE** /worlds/{worldId} | Delete World
[**getActiveWorlds**](WorldsApi.md#getActiveWorlds) | **GET** /worlds/active | List Active Worlds
[**getFavoritedWorlds**](WorldsApi.md#getFavoritedWorlds) | **GET** /worlds/favorites | List Favorited Worlds
[**getRecentWorlds**](WorldsApi.md#getRecentWorlds) | **GET** /worlds/recent | List Recent Worlds
[**getWorld**](WorldsApi.md#getWorld) | **GET** /worlds/{worldId} | Get World by ID
[**getWorldInstance**](WorldsApi.md#getWorldInstance) | **GET** /worlds/{worldId}/{instanceId} | Get World Instance
[**getWorldMetadata**](WorldsApi.md#getWorldMetadata) | **GET** /worlds/{worldId}/metadata | Get World Metadata
[**getWorldPublishStatus**](WorldsApi.md#getWorldPublishStatus) | **GET** /worlds/{worldId}/publish | Get World Publish Status
[**publishWorld**](WorldsApi.md#publishWorld) | **PUT** /worlds/{worldId}/publish | Publish World
[**searchWorlds**](WorldsApi.md#searchWorlds) | **GET** /worlds | Search All Worlds
[**unpublishWorld**](WorldsApi.md#unpublishWorld) | **DELETE** /worlds/{worldId}/publish | Unpublish World
[**updateWorld**](WorldsApi.md#updateWorld) | **PUT** /worlds/{worldId} | Update World


<a name="createWorld"></a>
# **createWorld**
> World createWorld(createWorldRequest)

Create World

Create a new world. This endpoint requires &#x60;assetUrl&#x60; to be a valid File object with &#x60;.vrcw&#x60; file extension, and &#x60;imageUrl&#x60; to be a valid File object with an image file extension.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = WorldsApi()
val createWorldRequest : CreateWorldRequest =  // CreateWorldRequest | 
try {
    val result : World = apiInstance.createWorld(createWorldRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#createWorld")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#createWorld")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createWorldRequest** | [**CreateWorldRequest**](CreateWorldRequest.md)|  | [optional]

### Return type

[**World**](World.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWorld"></a>
# **deleteWorld**
> deleteWorld(worldId)

Delete World

Delete a world. Notice a world is never fully \&quot;deleted\&quot;, only its ReleaseStatus is set to \&quot;hidden\&quot; and the linked Files are deleted. The WorldID is permanently reserved.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = WorldsApi()
val worldId : kotlin.String = worldId_example // kotlin.String | Must be a valid world ID.
try {
    apiInstance.deleteWorld(worldId)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#deleteWorld")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#deleteWorld")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **worldId** | **kotlin.String**| Must be a valid world ID. |

### Return type

null (empty response body)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getActiveWorlds"></a>
# **getActiveWorlds**
> kotlin.collections.List&lt;LimitedWorld&gt; getActiveWorlds(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform)

List Active Worlds

Search and list currently Active worlds by query filters.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = WorldsApi()
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
try {
    val result : kotlin.collections.List<LimitedWorld> = apiInstance.getActiveWorlds(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getActiveWorlds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getActiveWorlds")
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

### Return type

[**kotlin.collections.List&lt;LimitedWorld&gt;**](LimitedWorld.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFavoritedWorlds"></a>
# **getFavoritedWorlds**
> kotlin.collections.List&lt;FavoritedWorld&gt; getFavoritedWorlds(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId)

List Favorited Worlds

Search and list favorited worlds by query filters.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = WorldsApi()
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
    val result : kotlin.collections.List<FavoritedWorld> = apiInstance.getFavoritedWorlds(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getFavoritedWorlds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getFavoritedWorlds")
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

[**kotlin.collections.List&lt;FavoritedWorld&gt;**](FavoritedWorld.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRecentWorlds"></a>
# **getRecentWorlds**
> kotlin.collections.List&lt;LimitedWorld&gt; getRecentWorlds(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId)

List Recent Worlds

Search and list recently visited worlds by query filters.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = WorldsApi()
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
    val result : kotlin.collections.List<LimitedWorld> = apiInstance.getRecentWorlds(featured, sort, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getRecentWorlds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getRecentWorlds")
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

[**kotlin.collections.List&lt;LimitedWorld&gt;**](LimitedWorld.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorld"></a>
# **getWorld**
> World getWorld(worldId)

Get World by ID

Get information about a specific World. Works unauthenticated but when so will always return &#x60;0&#x60; for certain fields.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = WorldsApi()
val worldId : kotlin.String = worldId_example // kotlin.String | Must be a valid world ID.
try {
    val result : World = apiInstance.getWorld(worldId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorld")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorld")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **worldId** | **kotlin.String**| Must be a valid world ID. |

### Return type

[**World**](World.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldInstance"></a>
# **getWorldInstance**
> Instance getWorldInstance(worldId, instanceId)

Get World Instance

Returns a worlds instance.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = WorldsApi()
val worldId : kotlin.String = worldId_example // kotlin.String | Must be a valid world ID.
val instanceId : kotlin.String = instanceId_example // kotlin.String | Must be a valid instance ID.
try {
    val result : Instance = apiInstance.getWorldInstance(worldId, instanceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **worldId** | **kotlin.String**| Must be a valid world ID. |
 **instanceId** | **kotlin.String**| Must be a valid instance ID. |

### Return type

[**Instance**](Instance.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldMetadata"></a>
# **getWorldMetadata**
> WorldMetadata getWorldMetadata(worldId)

Get World Metadata

Return a worlds custom metadata. This is currently believed to be unused. Metadata can be set with &#x60;updateWorld&#x60; and can be any arbitrary object.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = WorldsApi()
val worldId : kotlin.String = worldId_example // kotlin.String | Must be a valid world ID.
try {
    val result : WorldMetadata = apiInstance.getWorldMetadata(worldId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldMetadata")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldMetadata")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **worldId** | **kotlin.String**| Must be a valid world ID. |

### Return type

[**WorldMetadata**](WorldMetadata.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorldPublishStatus"></a>
# **getWorldPublishStatus**
> WorldPublishStatus getWorldPublishStatus(worldId)

Get World Publish Status

Returns a worlds publish status.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = WorldsApi()
val worldId : kotlin.String = worldId_example // kotlin.String | Must be a valid world ID.
try {
    val result : WorldPublishStatus = apiInstance.getWorldPublishStatus(worldId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#getWorldPublishStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#getWorldPublishStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **worldId** | **kotlin.String**| Must be a valid world ID. |

### Return type

[**WorldPublishStatus**](WorldPublishStatus.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="publishWorld"></a>
# **publishWorld**
> publishWorld(worldId)

Publish World

Publish a world. You can only publish one world per week.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = WorldsApi()
val worldId : kotlin.String = worldId_example // kotlin.String | Must be a valid world ID.
try {
    apiInstance.publishWorld(worldId)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#publishWorld")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#publishWorld")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **worldId** | **kotlin.String**| Must be a valid world ID. |

### Return type

null (empty response body)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchWorlds"></a>
# **searchWorlds**
> kotlin.collections.List&lt;LimitedWorld&gt; searchWorlds(featured, sort, user, userId, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, fuzzy)

Search All Worlds

Search and list any worlds by query filters.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = WorldsApi()
val featured : kotlin.Boolean = true // kotlin.Boolean | Filters on featured results.
val sort : SortOption =  // SortOption | The sort order of the results.
val user : kotlin.String = user_example // kotlin.String | Set to `me` for searching own worlds.
val userId : kotlin.String = userId_example // kotlin.String | Filter by UserID.
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
val fuzzy : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : kotlin.collections.List<LimitedWorld> = apiInstance.searchWorlds(featured, sort, user, userId, n, order, offset, search, tag, notag, releaseStatus, maxUnityVersion, minUnityVersion, platform, fuzzy)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#searchWorlds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#searchWorlds")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featured** | **kotlin.Boolean**| Filters on featured results. | [optional]
 **sort** | [**SortOption**](.md)| The sort order of the results. | [optional] [default to popularity] [enum: popularity, heat, trust, shuffle, random, favorites, reportScore, reportCount, publicationDate, labsPublicationDate, created, _created_at, updated, _updated_at, order, relevance, magic, name]
 **user** | **kotlin.String**| Set to &#x60;me&#x60; for searching own worlds. | [optional] [enum: me]
 **userId** | **kotlin.String**| Filter by UserID. | [optional]
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
 **fuzzy** | **kotlin.Boolean**|  | [optional]

### Return type

[**kotlin.collections.List&lt;LimitedWorld&gt;**](LimitedWorld.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unpublishWorld"></a>
# **unpublishWorld**
> unpublishWorld(worldId)

Unpublish World

Unpublish a world.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = WorldsApi()
val worldId : kotlin.String = worldId_example // kotlin.String | Must be a valid world ID.
try {
    apiInstance.unpublishWorld(worldId)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#unpublishWorld")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#unpublishWorld")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **worldId** | **kotlin.String**| Must be a valid world ID. |

### Return type

null (empty response body)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWorld"></a>
# **updateWorld**
> World updateWorld(worldId, updateWorldRequest)

Update World

Update information about a specific World.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = WorldsApi()
val worldId : kotlin.String = worldId_example // kotlin.String | Must be a valid world ID.
val updateWorldRequest : UpdateWorldRequest =  // UpdateWorldRequest | 
try {
    val result : World = apiInstance.updateWorld(worldId, updateWorldRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorldsApi#updateWorld")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorldsApi#updateWorld")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **worldId** | **kotlin.String**| Must be a valid world ID. |
 **updateWorldRequest** | [**UpdateWorldRequest**](UpdateWorldRequest.md)|  | [optional]

### Return type

[**World**](World.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

