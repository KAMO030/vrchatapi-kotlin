# SystemApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCSS**](SystemApi.md#getCSS) | **GET** /css/app.css | Download CSS
[**getConfig**](SystemApi.md#getConfig) | **GET** /config | Fetch API Config
[**getCurrentOnlineUsers**](SystemApi.md#getCurrentOnlineUsers) | **GET** /visits | Current Online Users
[**getHealth**](SystemApi.md#getHealth) | **GET** /health | Check API Health
[**getInfoPush**](SystemApi.md#getInfoPush) | **GET** /infoPush | Show Information Notices
[**getJavaScript**](SystemApi.md#getJavaScript) | **GET** /js/app.js | Download JavaScript
[**getSystemTime**](SystemApi.md#getSystemTime) | **GET** /time | Current System Time


<a name="getCSS"></a>
# **getCSS**
> kotlin.String getCSS(variant, branch)

Download CSS

Fetches the CSS code to the frontend React website.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = SystemApi()
val variant : kotlin.String = variant_example // kotlin.String | Specifies which `variant` of the site. Public is the end-user site, while `internal` is the staff-only site with special pages for moderation and management.
val branch : kotlin.String = branch_example // kotlin.String | Specifies which git branch the site should load frontend source code from.
try {
    val result : kotlin.String = apiInstance.getCSS(variant, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#getCSS")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#getCSS")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variant** | **kotlin.String**| Specifies which &#x60;variant&#x60; of the site. Public is the end-user site, while &#x60;internal&#x60; is the staff-only site with special pages for moderation and management. | [optional] [default to public] [enum: public, internal]
 **branch** | **kotlin.String**| Specifies which git branch the site should load frontend source code from. | [optional] [default to &quot;main&quot;]

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/css, application/json

<a name="getConfig"></a>
# **getConfig**
> APIConfig getConfig()

Fetch API Config

API config contains configuration that the clients needs to work properly.  Currently the most important value here is &#x60;clientApiKey&#x60; which is used for all other API endpoints.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = SystemApi()
try {
    val result : APIConfig = apiInstance.getConfig()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#getConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#getConfig")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**APIConfig**](APIConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrentOnlineUsers"></a>
# **getCurrentOnlineUsers**
> kotlin.Int getCurrentOnlineUsers()

Current Online Users

Returns the current number of online users.  **NOTE:** The response type is not a JSON object, but a simple JSON integer.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = SystemApi()
try {
    val result : kotlin.Int = apiInstance.getCurrentOnlineUsers()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#getCurrentOnlineUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#getCurrentOnlineUsers")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Int**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getHealth"></a>
# **getHealth**
> APIHealth getHealth()

Check API Health

~~Gets the overall health status, the server name, and the current build version tag of the API.~~  **DEPRECATED:** VRChat has suddenly restricted this endpoint for unknown reasons, and now always return 401 Unauthorized.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = SystemApi()
try {
    val result : APIHealth = apiInstance.getHealth()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#getHealth")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#getHealth")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**APIHealth**](APIHealth.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInfoPush"></a>
# **getInfoPush**
> kotlin.collections.List&lt;InfoPush&gt; getInfoPush(require, include)

Show Information Notices

IPS (Info Push System) is a system for VRChat to push out dynamic information to the client. This is primarily used by the Quick-Menu info banners, but can also be used to e.g. alert you to update your game to the latest version.  &#x60;include&#x60; is used to query what Information Pushes should be included in the response. If include is missing or empty, then no notices will normally be returned. This is an \&quot;any of\&quot; search.  &#x60;require&#x60; is used to limit what Information Pushes should be included in the response. This is usually used in combination with &#x60;include&#x60;, and is an \&quot;all of\&quot; search.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = SystemApi()
val require : kotlin.String = require_example // kotlin.String | Tags to include (comma-separated). All of the tags needs to be present.
val include : kotlin.String = include_example // kotlin.String | Tags to include (comma-separated). Any of the tags needs to be present.
try {
    val result : kotlin.collections.List<InfoPush> = apiInstance.getInfoPush(require, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#getInfoPush")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#getInfoPush")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **require** | **kotlin.String**| Tags to include (comma-separated). All of the tags needs to be present. | [optional]
 **include** | **kotlin.String**| Tags to include (comma-separated). Any of the tags needs to be present. | [optional]

### Return type

[**kotlin.collections.List&lt;InfoPush&gt;**](InfoPush.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJavaScript"></a>
# **getJavaScript**
> kotlin.String getJavaScript(variant, branch)

Download JavaScript

Fetches the JavaScript code to the frontend React website.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = SystemApi()
val variant : kotlin.String = variant_example // kotlin.String | Specifies which `variant` of the site. Public is the end-user site, while `internal` is the staff-only site with special pages for moderation and management.
val branch : kotlin.String = branch_example // kotlin.String | Specifies which git branch the site should load frontend source code from.
try {
    val result : kotlin.String = apiInstance.getJavaScript(variant, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#getJavaScript")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#getJavaScript")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variant** | **kotlin.String**| Specifies which &#x60;variant&#x60; of the site. Public is the end-user site, while &#x60;internal&#x60; is the staff-only site with special pages for moderation and management. | [optional] [default to public] [enum: public, internal]
 **branch** | **kotlin.String**| Specifies which git branch the site should load frontend source code from. | [optional] [default to &quot;main&quot;]

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/javascript, application/json

<a name="getSystemTime"></a>
# **getSystemTime**
> kotlin.String getSystemTime()

Current System Time

Returns the current time of the API server.  **NOTE:** The response type is not a JSON object, but a simple JSON string.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = SystemApi()
try {
    val result : kotlin.String = apiInstance.getSystemTime()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#getSystemTime")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#getSystemTime")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

