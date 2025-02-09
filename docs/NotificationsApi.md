# NotificationsApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptFriendRequest**](NotificationsApi.md#acceptFriendRequest) | **PUT** /auth/user/notifications/{notificationId}/accept | Accept Friend Request
[**clearNotifications**](NotificationsApi.md#clearNotifications) | **PUT** /auth/user/notifications/clear | Clear All Notifications
[**deleteNotification**](NotificationsApi.md#deleteNotification) | **PUT** /auth/user/notifications/{notificationId}/hide | Delete Notification
[**getNotification**](NotificationsApi.md#getNotification) | **GET** /auth/user/notifications/{notificationId} | Show notification
[**getNotifications**](NotificationsApi.md#getNotifications) | **GET** /auth/user/notifications | List Notifications
[**markNotificationAsRead**](NotificationsApi.md#markNotificationAsRead) | **PUT** /auth/user/notifications/{notificationId}/see | Mark Notification As Read


<a name="acceptFriendRequest"></a>
# **acceptFriendRequest**
> Success acceptFriendRequest(notificationId)

Accept Friend Request

Accept a friend request by notification &#x60;frq_&#x60; ID. Friend requests can be found using the NotificationsAPI &#x60;getNotifications&#x60; by filtering of type &#x60;friendRequest&#x60;.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = NotificationsApi()
val notificationId : kotlin.String = notificationId_example // kotlin.String | Must be a valid notification ID.
try {
    val result : Success = apiInstance.acceptFriendRequest(notificationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationsApi#acceptFriendRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationsApi#acceptFriendRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | **kotlin.String**| Must be a valid notification ID. |

### Return type

[**Success**](Success.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="clearNotifications"></a>
# **clearNotifications**
> Success clearNotifications()

Clear All Notifications

Clear **all** notifications.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = NotificationsApi()
try {
    val result : Success = apiInstance.clearNotifications()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationsApi#clearNotifications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationsApi#clearNotifications")
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

<a name="deleteNotification"></a>
# **deleteNotification**
> Notification deleteNotification(notificationId)

Delete Notification

Delete a notification.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = NotificationsApi()
val notificationId : kotlin.String = notificationId_example // kotlin.String | Must be a valid notification ID.
try {
    val result : Notification = apiInstance.deleteNotification(notificationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationsApi#deleteNotification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationsApi#deleteNotification")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | **kotlin.String**| Must be a valid notification ID. |

### Return type

[**Notification**](Notification.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNotification"></a>
# **getNotification**
> Notification getNotification(notificationId)

Show notification

Get a notification by notification &#x60;not_&#x60; ID.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = NotificationsApi()
val notificationId : kotlin.String = notificationId_example // kotlin.String | Must be a valid notification ID.
try {
    val result : Notification = apiInstance.getNotification(notificationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationsApi#getNotification")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationsApi#getNotification")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | **kotlin.String**| Must be a valid notification ID. |

### Return type

[**Notification**](Notification.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNotifications"></a>
# **getNotifications**
> kotlin.collections.List&lt;Notification&gt; getNotifications(type, sent, hidden, after, n, offset)

List Notifications

Retrieve all of the current user&#39;s notifications.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = NotificationsApi()
val type : kotlin.String = all // kotlin.String | Only send notifications of this type (can use `all` for all). This parameter no longer does anything, and is deprecated.
val sent : kotlin.Boolean = true // kotlin.Boolean | Return notifications sent by the user. Must be false or omitted.
val hidden : kotlin.Boolean = true // kotlin.Boolean | Whether to return hidden or non-hidden notifications. True only allowed on type `friendRequest`.
val after : kotlin.String = five_minutes_ago // kotlin.String | Only return notifications sent after this Date. Ignored if type is `friendRequest`.
val n : kotlin.Int = 56 // kotlin.Int | The number of objects to return.
val offset : kotlin.Int = 56 // kotlin.Int | A zero-based offset from the default object sorting from where search results start.
try {
    val result : kotlin.collections.List<Notification> = apiInstance.getNotifications(type, sent, hidden, after, n, offset)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationsApi#getNotifications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationsApi#getNotifications")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **kotlin.String**| Only send notifications of this type (can use &#x60;all&#x60; for all). This parameter no longer does anything, and is deprecated. | [optional]
 **sent** | **kotlin.Boolean**| Return notifications sent by the user. Must be false or omitted. | [optional]
 **hidden** | **kotlin.Boolean**| Whether to return hidden or non-hidden notifications. True only allowed on type &#x60;friendRequest&#x60;. | [optional]
 **after** | **kotlin.String**| Only return notifications sent after this Date. Ignored if type is &#x60;friendRequest&#x60;. | [optional]
 **n** | **kotlin.Int**| The number of objects to return. | [optional] [default to 60]
 **offset** | **kotlin.Int**| A zero-based offset from the default object sorting from where search results start. | [optional]

### Return type

[**kotlin.collections.List&lt;Notification&gt;**](Notification.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="markNotificationAsRead"></a>
# **markNotificationAsRead**
> Notification markNotificationAsRead(notificationId)

Mark Notification As Read

Mark a notification as seen.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = NotificationsApi()
val notificationId : kotlin.String = notificationId_example // kotlin.String | Must be a valid notification ID.
try {
    val result : Notification = apiInstance.markNotificationAsRead(notificationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationsApi#markNotificationAsRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationsApi#markNotificationAsRead")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | **kotlin.String**| Must be a valid notification ID. |

### Return type

[**Notification**](Notification.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

