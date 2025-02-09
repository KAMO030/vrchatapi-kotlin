# InstancesApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**closeInstance**](InstancesApi.md#closeInstance) | **DELETE** /instances/{worldId}:{instanceId} | Close Instance
[**createInstance**](InstancesApi.md#createInstance) | **POST** /instances | Create Instance
[**getInstance**](InstancesApi.md#getInstance) | **GET** /instances/{worldId}:{instanceId} | Get Instance
[**getInstanceByShortName**](InstancesApi.md#getInstanceByShortName) | **GET** /instances/s/{shortName} | Get Instance By Short Name
[**getShortName**](InstancesApi.md#getShortName) | **GET** /instances/{worldId}:{instanceId}/shortName | Get Instance Short Name


<a name="closeInstance"></a>
# **closeInstance**
> Instance closeInstance(worldId, instanceId, hardClose, closedAt)

Close Instance

Close an instance or update the closedAt time when it will be closed.  You can only close an instance if the ownerId is yourself or if the instance owner is a group and you have the &#x60;group-instance-moderate&#x60; permission.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = InstancesApi()
val worldId : kotlin.String = worldId_example // kotlin.String | Must be a valid world ID.
val instanceId : kotlin.String = instanceId_example // kotlin.String | Must be a valid instance ID.
val hardClose : kotlin.Boolean = true // kotlin.Boolean | Whether to hard close the instance. Defaults to false.
val closedAt : kotlin.String = 2013-10-20T19:20:30+01:00 // kotlin.String | The time after which users won't be allowed to join the instances. If omitted, the instance will be closed immediately.
try {
    val result : Instance = apiInstance.closeInstance(worldId, instanceId, hardClose, closedAt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstancesApi#closeInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstancesApi#closeInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **worldId** | **kotlin.String**| Must be a valid world ID. |
 **instanceId** | **kotlin.String**| Must be a valid instance ID. |
 **hardClose** | **kotlin.Boolean**| Whether to hard close the instance. Defaults to false. | [optional]
 **closedAt** | **kotlin.String**| The time after which users won&#39;t be allowed to join the instances. If omitted, the instance will be closed immediately. | [optional]

### Return type

[**Instance**](Instance.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInstance"></a>
# **createInstance**
> Instance createInstance(createInstanceRequest)

Create Instance

Create an instance

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = InstancesApi()
val createInstanceRequest : CreateInstanceRequest =  // CreateInstanceRequest | 
try {
    val result : Instance = apiInstance.createInstance(createInstanceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstancesApi#createInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstancesApi#createInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createInstanceRequest** | [**CreateInstanceRequest**](CreateInstanceRequest.md)|  |

### Return type

[**Instance**](Instance.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInstance"></a>
# **getInstance**
> Instance getInstance(worldId, instanceId)

Get Instance

Returns an instance. Please read [Instances Tutorial](https://vrchatapi.github.io/tutorials/instances/) for more information on Instances.  If an invalid instanceId is provided, this endpoint will simply return \&quot;null\&quot;!

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = InstancesApi()
val worldId : kotlin.String = worldId_example // kotlin.String | Must be a valid world ID.
val instanceId : kotlin.String = instanceId_example // kotlin.String | Must be a valid instance ID.
try {
    val result : Instance = apiInstance.getInstance(worldId, instanceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstancesApi#getInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstancesApi#getInstance")
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

<a name="getInstanceByShortName"></a>
# **getInstanceByShortName**
> Instance getInstanceByShortName(shortName)

Get Instance By Short Name

Returns an instance. Please read [Instances Tutorial](https://vrchatapi.github.io/tutorials/instances/) for more information on Instances.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = InstancesApi()
val shortName : kotlin.String = shortName_example // kotlin.String | Must be a valid instance short name.
try {
    val result : Instance = apiInstance.getInstanceByShortName(shortName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstancesApi#getInstanceByShortName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstancesApi#getInstanceByShortName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortName** | **kotlin.String**| Must be a valid instance short name. |

### Return type

[**Instance**](Instance.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getShortName"></a>
# **getShortName**
> InstanceShortNameResponse getShortName(worldId, instanceId)

Get Instance Short Name

Returns an instance short name.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = InstancesApi()
val worldId : kotlin.String = worldId_example // kotlin.String | Must be a valid world ID.
val instanceId : kotlin.String = instanceId_example // kotlin.String | Must be a valid instance ID.
try {
    val result : InstanceShortNameResponse = apiInstance.getShortName(worldId, instanceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstancesApi#getShortName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstancesApi#getShortName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **worldId** | **kotlin.String**| Must be a valid world ID. |
 **instanceId** | **kotlin.String**| Must be a valid instance ID. |

### Return type

[**InstanceShortNameResponse**](InstanceShortNameResponse.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

