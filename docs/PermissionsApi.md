# PermissionsApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAssignedPermissions**](PermissionsApi.md#getAssignedPermissions) | **GET** /auth/permissions | Get Assigned Permissions
[**getPermission**](PermissionsApi.md#getPermission) | **GET** /permissions/{permissionId} | Get Permission


<a name="getAssignedPermissions"></a>
# **getAssignedPermissions**
> kotlin.collections.List&lt;Permission&gt; getAssignedPermissions()

Get Assigned Permissions

Returns a list of all permissions currently granted by the user. Permissions are assigned e.g. by subscribing to VRC+.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = PermissionsApi()
try {
    val result : kotlin.collections.List<Permission> = apiInstance.getAssignedPermissions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#getAssignedPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#getAssignedPermissions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Permission&gt;**](Permission.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPermission"></a>
# **getPermission**
> Permission getPermission(permissionId)

Get Permission

Returns a single permission. This endpoint is pretty useless, as it returns the exact same information as &#x60;/auth/permissions&#x60;.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = PermissionsApi()
val permissionId : kotlin.String = permissionId_example // kotlin.String | Must be a valid permission ID.
try {
    val result : Permission = apiInstance.getPermission(permissionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#getPermission")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#getPermission")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **permissionId** | **kotlin.String**| Must be a valid permission ID. |

### Return type

[**Permission**](Permission.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

