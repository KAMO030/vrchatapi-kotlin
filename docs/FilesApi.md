# FilesApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFile**](FilesApi.md#createFile) | **POST** /file | Create File
[**createFileVersion**](FilesApi.md#createFileVersion) | **POST** /file/{fileId} | Create File Version
[**deleteFile**](FilesApi.md#deleteFile) | **DELETE** /file/{fileId} | Delete File
[**deleteFileVersion**](FilesApi.md#deleteFileVersion) | **DELETE** /file/{fileId}/{versionId} | Delete File Version
[**downloadFileVersion**](FilesApi.md#downloadFileVersion) | **GET** /file/{fileId}/{versionId} | Download File Version
[**finishFileDataUpload**](FilesApi.md#finishFileDataUpload) | **PUT** /file/{fileId}/{versionId}/{fileType}/finish | Finish FileData Upload
[**getFile**](FilesApi.md#getFile) | **GET** /file/{fileId} | Show File
[**getFileAnalysis**](FilesApi.md#getFileAnalysis) | **GET** /analysis/{fileId}/{versionId} | Get File Version Analysis
[**getFileAnalysisSecurity**](FilesApi.md#getFileAnalysisSecurity) | **GET** /analysis/{fileId}/{versionId}/security | Get File Version Analysis Security
[**getFileAnalysisStandard**](FilesApi.md#getFileAnalysisStandard) | **GET** /analysis/{fileId}/{versionId}/standard | Get File Version Analysis Standard
[**getFileDataUploadStatus**](FilesApi.md#getFileDataUploadStatus) | **GET** /file/{fileId}/{versionId}/{fileType}/status | Check FileData Upload Status
[**getFiles**](FilesApi.md#getFiles) | **GET** /files | List Files
[**startFileDataUpload**](FilesApi.md#startFileDataUpload) | **PUT** /file/{fileId}/{versionId}/{fileType}/start | Start FileData Upload


<a name="createFile"></a>
# **createFile**
> io.github.kamo030.vrchatapi.infrastructure.OctetByteArray createFile(createFileRequest)

Create File

Creates a new File object

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = FilesApi()
val createFileRequest : CreateFileRequest =  // CreateFileRequest | 
try {
    val result : io.github.kamo030.vrchatapi.infrastructure.OctetByteArray = apiInstance.createFile(createFileRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#createFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#createFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createFileRequest** | [**CreateFileRequest**](CreateFileRequest.md)|  | [optional]

### Return type

[**io.github.kamo030.vrchatapi.infrastructure.OctetByteArray**](io.github.kamo030.vrchatapi.infrastructure.OctetByteArray.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createFileVersion"></a>
# **createFileVersion**
> io.github.kamo030.vrchatapi.infrastructure.OctetByteArray createFileVersion(fileId, createFileVersionRequest)

Create File Version

Creates a new FileVersion. Once a Version has been created, proceed to the &#x60;/file/{fileId}/{versionId}/file/start&#x60; endpoint to start a file upload.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = FilesApi()
val fileId : kotlin.String = file_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid file ID.
val createFileVersionRequest : CreateFileVersionRequest =  // CreateFileVersionRequest | 
try {
    val result : io.github.kamo030.vrchatapi.infrastructure.OctetByteArray = apiInstance.createFileVersion(fileId, createFileVersionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#createFileVersion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#createFileVersion")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| Must be a valid file ID. |
 **createFileVersionRequest** | [**CreateFileVersionRequest**](CreateFileVersionRequest.md)|  | [optional]

### Return type

[**io.github.kamo030.vrchatapi.infrastructure.OctetByteArray**](io.github.kamo030.vrchatapi.infrastructure.OctetByteArray.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFile"></a>
# **deleteFile**
> io.github.kamo030.vrchatapi.infrastructure.OctetByteArray deleteFile(fileId)

Delete File

Deletes a File object.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = FilesApi()
val fileId : kotlin.String = file_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid file ID.
try {
    val result : io.github.kamo030.vrchatapi.infrastructure.OctetByteArray = apiInstance.deleteFile(fileId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#deleteFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#deleteFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| Must be a valid file ID. |

### Return type

[**io.github.kamo030.vrchatapi.infrastructure.OctetByteArray**](io.github.kamo030.vrchatapi.infrastructure.OctetByteArray.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteFileVersion"></a>
# **deleteFileVersion**
> io.github.kamo030.vrchatapi.infrastructure.OctetByteArray deleteFileVersion(fileId, versionId)

Delete File Version

Delete a specific version of a file. You can only delete the latest version.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = FilesApi()
val fileId : kotlin.String = file_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid file ID.
val versionId : kotlin.Int = 1 // kotlin.Int | Version ID of the asset.
try {
    val result : io.github.kamo030.vrchatapi.infrastructure.OctetByteArray = apiInstance.deleteFileVersion(fileId, versionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#deleteFileVersion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#deleteFileVersion")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| Must be a valid file ID. |
 **versionId** | **kotlin.Int**| Version ID of the asset. |

### Return type

[**io.github.kamo030.vrchatapi.infrastructure.OctetByteArray**](io.github.kamo030.vrchatapi.infrastructure.OctetByteArray.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="downloadFileVersion"></a>
# **downloadFileVersion**
> downloadFileVersion(fileId, versionId)

Download File Version

Downloads the file with the provided version number.  **Version Note:** Version 0 is always when the file was created. The real data is usually always located in version 1 and up.  **Extension Note:** Files are not guaranteed to have a file extensions. UnityPackage files tends to have it, images through this endpoint do not. You are responsible for appending file extension from the &#x60;extension&#x60; field when neccesary.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = FilesApi()
val fileId : kotlin.String = file_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid file ID.
val versionId : kotlin.Int = 1 // kotlin.Int | Version ID of the asset.
try {
    apiInstance.downloadFileVersion(fileId, versionId)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#downloadFileVersion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#downloadFileVersion")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| Must be a valid file ID. |
 **versionId** | **kotlin.Int**| Version ID of the asset. |

### Return type

null (empty response body)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="finishFileDataUpload"></a>
# **finishFileDataUpload**
> io.github.kamo030.vrchatapi.infrastructure.OctetByteArray finishFileDataUpload(fileId, versionId, fileType, finishFileDataUploadRequest)

Finish FileData Upload

Finish an upload of a FileData. This will mark it as \&quot;complete\&quot;. After uploading the &#x60;file&#x60; for Avatars and Worlds you then have to upload a &#x60;signature&#x60; file.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = FilesApi()
val fileId : kotlin.String = file_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid file ID.
val versionId : kotlin.Int = 1 // kotlin.Int | Version ID of the asset.
val fileType : kotlin.String = file // kotlin.String | Type of file.
val finishFileDataUploadRequest : FinishFileDataUploadRequest = {"etags":["xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx","yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy"],"nextPartNumber":"0","maxParts":"0"} // FinishFileDataUploadRequest | Please see documentation on ETag's: [https://teppen.io/2018/06/23/aws_s3_etags/](https://teppen.io/2018/06/23/aws_s3_etags/)  ETag's should NOT be present when uploading a `signature`.
try {
    val result : io.github.kamo030.vrchatapi.infrastructure.OctetByteArray = apiInstance.finishFileDataUpload(fileId, versionId, fileType, finishFileDataUploadRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#finishFileDataUpload")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#finishFileDataUpload")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| Must be a valid file ID. |
 **versionId** | **kotlin.Int**| Version ID of the asset. |
 **fileType** | **kotlin.String**| Type of file. | [enum: file, signature, delta]
 **finishFileDataUploadRequest** | [**FinishFileDataUploadRequest**](FinishFileDataUploadRequest.md)| Please see documentation on ETag&#39;s: [https://teppen.io/2018/06/23/aws_s3_etags/](https://teppen.io/2018/06/23/aws_s3_etags/)  ETag&#39;s should NOT be present when uploading a &#x60;signature&#x60;. | [optional]

### Return type

[**io.github.kamo030.vrchatapi.infrastructure.OctetByteArray**](io.github.kamo030.vrchatapi.infrastructure.OctetByteArray.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFile"></a>
# **getFile**
> io.github.kamo030.vrchatapi.infrastructure.OctetByteArray getFile(fileId)

Show File

Shows general information about the \&quot;File\&quot; object. Each File can have several \&quot;Version\&quot;&#39;s, and each Version can have multiple real files or \&quot;Data\&quot; blobs.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = FilesApi()
val fileId : kotlin.String = file_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid file ID.
try {
    val result : io.github.kamo030.vrchatapi.infrastructure.OctetByteArray = apiInstance.getFile(fileId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#getFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#getFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| Must be a valid file ID. |

### Return type

[**io.github.kamo030.vrchatapi.infrastructure.OctetByteArray**](io.github.kamo030.vrchatapi.infrastructure.OctetByteArray.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFileAnalysis"></a>
# **getFileAnalysis**
> FileAnalysis getFileAnalysis(fileId, versionId)

Get File Version Analysis

Get the performance analysis for the uploaded assets of an avatar

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = FilesApi()
val fileId : kotlin.String = file_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid file ID.
val versionId : kotlin.Int = 1 // kotlin.Int | Version ID of the asset.
try {
    val result : FileAnalysis = apiInstance.getFileAnalysis(fileId, versionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#getFileAnalysis")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#getFileAnalysis")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| Must be a valid file ID. |
 **versionId** | **kotlin.Int**| Version ID of the asset. |

### Return type

[**FileAnalysis**](FileAnalysis.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFileAnalysisSecurity"></a>
# **getFileAnalysisSecurity**
> FileAnalysis getFileAnalysisSecurity(fileId, versionId)

Get File Version Analysis Security

Get the security performance analysis for the uploaded assets of an avatar

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = FilesApi()
val fileId : kotlin.String = file_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid file ID.
val versionId : kotlin.Int = 1 // kotlin.Int | Version ID of the asset.
try {
    val result : FileAnalysis = apiInstance.getFileAnalysisSecurity(fileId, versionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#getFileAnalysisSecurity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#getFileAnalysisSecurity")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| Must be a valid file ID. |
 **versionId** | **kotlin.Int**| Version ID of the asset. |

### Return type

[**FileAnalysis**](FileAnalysis.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFileAnalysisStandard"></a>
# **getFileAnalysisStandard**
> FileAnalysis getFileAnalysisStandard(fileId, versionId)

Get File Version Analysis Standard

Get the standard performance analysis for the uploaded assets of an avatar

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = FilesApi()
val fileId : kotlin.String = file_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid file ID.
val versionId : kotlin.Int = 1 // kotlin.Int | Version ID of the asset.
try {
    val result : FileAnalysis = apiInstance.getFileAnalysisStandard(fileId, versionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#getFileAnalysisStandard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#getFileAnalysisStandard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| Must be a valid file ID. |
 **versionId** | **kotlin.Int**| Version ID of the asset. |

### Return type

[**FileAnalysis**](FileAnalysis.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFileDataUploadStatus"></a>
# **getFileDataUploadStatus**
> FileVersionUploadStatus getFileDataUploadStatus(fileId, versionId, fileType)

Check FileData Upload Status

Retrieves the upload status for file upload. Can currently only be accessed when &#x60;status&#x60; is &#x60;waiting&#x60;. Trying to access it on a file version already uploaded currently times out.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = FilesApi()
val fileId : kotlin.String = file_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid file ID.
val versionId : kotlin.Int = 1 // kotlin.Int | Version ID of the asset.
val fileType : kotlin.String = file // kotlin.String | Type of file.
try {
    val result : FileVersionUploadStatus = apiInstance.getFileDataUploadStatus(fileId, versionId, fileType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#getFileDataUploadStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#getFileDataUploadStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| Must be a valid file ID. |
 **versionId** | **kotlin.Int**| Version ID of the asset. |
 **fileType** | **kotlin.String**| Type of file. | [enum: file, signature, delta]

### Return type

[**FileVersionUploadStatus**](FileVersionUploadStatus.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFiles"></a>
# **getFiles**
> kotlin.collections.List&lt;io.github.kamo030.vrchatapi.infrastructure.OctetByteArray&gt; getFiles(tag, userId, n, offset)

List Files

Returns a list of files

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = FilesApi()
val tag : kotlin.String = tag_example // kotlin.String | Tag, for example \"icon\" or \"gallery\", not included by default.
val userId : kotlin.String = userId_example // kotlin.String | UserID, will always generate a 500 permission error.
val n : kotlin.Int = 56 // kotlin.Int | The number of objects to return.
val offset : kotlin.Int = 56 // kotlin.Int | A zero-based offset from the default object sorting from where search results start.
try {
    val result : kotlin.collections.List<io.github.kamo030.vrchatapi.infrastructure.OctetByteArray> = apiInstance.getFiles(tag, userId, n, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#getFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#getFiles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **kotlin.String**| Tag, for example \&quot;icon\&quot; or \&quot;gallery\&quot;, not included by default. | [optional]
 **userId** | **kotlin.String**| UserID, will always generate a 500 permission error. | [optional]
 **n** | **kotlin.Int**| The number of objects to return. | [optional] [default to 60]
 **offset** | **kotlin.Int**| A zero-based offset from the default object sorting from where search results start. | [optional]

### Return type

[**kotlin.collections.List&lt;io.github.kamo030.vrchatapi.infrastructure.OctetByteArray&gt;**](io.github.kamo030.vrchatapi.infrastructure.OctetByteArray.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="startFileDataUpload"></a>
# **startFileDataUpload**
> FileUploadURL startFileDataUpload(fileId, versionId, fileType, partNumber)

Start FileData Upload

Starts an upload of a specific FilePart. This endpoint will return an AWS URL which you can PUT data to. You need to call this and receive a new AWS API URL for each &#x60;partNumber&#x60;. Please see AWS&#39;s REST documentation on \&quot;PUT Object to S3\&quot; on how to upload. Once all parts has been uploaded, proceed to &#x60;/finish&#x60; endpoint.  **Note:** &#x60;nextPartNumber&#x60; seems like it is always ignored. Despite it returning 0, first partNumber is always 1.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = FilesApi()
val fileId : kotlin.String = file_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid file ID.
val versionId : kotlin.Int = 1 // kotlin.Int | Version ID of the asset.
val fileType : kotlin.String = file // kotlin.String | Type of file.
val partNumber : kotlin.Int = 1 // kotlin.Int | The part number to start uploading. If not provided, the first part will be started.
try {
    val result : FileUploadURL = apiInstance.startFileDataUpload(fileId, versionId, fileType, partNumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#startFileDataUpload")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#startFileDataUpload")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| Must be a valid file ID. |
 **versionId** | **kotlin.Int**| Version ID of the asset. |
 **fileType** | **kotlin.String**| Type of file. | [enum: file, signature, delta]
 **partNumber** | **kotlin.Int**| The part number to start uploading. If not provided, the first part will be started. | [optional]

### Return type

[**FileUploadURL**](FileUploadURL.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

