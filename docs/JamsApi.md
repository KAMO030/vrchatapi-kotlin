# JamsApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getJam**](JamsApi.md#getJam) | **GET** /jams/{jamId} | Show jam information
[**getJamSubmissions**](JamsApi.md#getJamSubmissions) | **GET** /jams/{jamId}/submissions | Show jam submissions
[**getJams**](JamsApi.md#getJams) | **GET** /jams | Show jams list


<a name="getJam"></a>
# **getJam**
> Jam getJam(jamId)

Show jam information

Returns a jam.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = JamsApi()
val jamId : kotlin.String = jam_0b7e3f6d-4647-4648-b2a1-1431e76906d9 // kotlin.String | Must be a valid query ID.
try {
    val result : Jam = apiInstance.getJam(jamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JamsApi#getJam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JamsApi#getJam")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jamId** | **kotlin.String**| Must be a valid query ID. |

### Return type

[**Jam**](Jam.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJamSubmissions"></a>
# **getJamSubmissions**
> kotlin.collections.List&lt;Submission&gt; getJamSubmissions(jamId)

Show jam submissions

Returns all submissions of a jam.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = JamsApi()
val jamId : kotlin.String = jam_0b7e3f6d-4647-4648-b2a1-1431e76906d9 // kotlin.String | Must be a valid query ID.
try {
    val result : kotlin.collections.List<Submission> = apiInstance.getJamSubmissions(jamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JamsApi#getJamSubmissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JamsApi#getJamSubmissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jamId** | **kotlin.String**| Must be a valid query ID. |

### Return type

[**kotlin.collections.List&lt;Submission&gt;**](Submission.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJams"></a>
# **getJams**
> kotlin.collections.List&lt;Jam&gt; getJams(type)

Show jams list

Lists World Jams or Avatar Jams, both currently running and ones that have ended.  &#x60;isActive&#x60; is used to select only active or already ended jams.  &#x60;type&#x60; is used to select only world or avatar jams, and can only take &#x60;world&#x60; or &#x60;avatar&#x60;. &#x60;&#x60;

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = JamsApi()
val type : kotlin.String = avatar // kotlin.String | Only show jams of this type (`avatar` or `world`).
try {
    val result : kotlin.collections.List<Jam> = apiInstance.getJams(type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JamsApi#getJams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JamsApi#getJams")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **kotlin.String**| Only show jams of this type (&#x60;avatar&#x60; or &#x60;world&#x60;). | [optional]

### Return type

[**kotlin.collections.List&lt;Jam&gt;**](Jam.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

