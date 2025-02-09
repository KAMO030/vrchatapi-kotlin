# InviteApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInviteMessage**](InviteApi.md#getInviteMessage) | **GET** /message/{userId}/{messageType}/{slot} | Get Invite Message
[**getInviteMessages**](InviteApi.md#getInviteMessages) | **GET** /message/{userId}/{messageType} | List Invite Messages
[**inviteMyselfTo**](InviteApi.md#inviteMyselfTo) | **POST** /invite/myself/to/{worldId}:{instanceId} | Invite Myself To Instance
[**inviteUser**](InviteApi.md#inviteUser) | **POST** /invite/{userId} | Invite User
[**requestInvite**](InviteApi.md#requestInvite) | **POST** /requestInvite/{userId} | Request Invite
[**resetInviteMessage**](InviteApi.md#resetInviteMessage) | **DELETE** /message/{userId}/{messageType}/{slot} | Reset Invite Message
[**respondInvite**](InviteApi.md#respondInvite) | **POST** /invite/{notificationId}/response | Respond Invite
[**updateInviteMessage**](InviteApi.md#updateInviteMessage) | **PUT** /message/{userId}/{messageType}/{slot} | Update Invite Message


<a name="getInviteMessage"></a>
# **getInviteMessage**
> InviteMessage getInviteMessage(userId, messageType, slot)

Get Invite Message

Returns a single Invite Message. This returns the exact same information but less than &#x60;getInviteMessages&#x60;. Admin Credentials are required to view messages of other users!  Message type refers to a different collection of messages, used during different types of responses.  * &#x60;message&#x60; &#x3D; Message during a normal invite * &#x60;response&#x60; &#x3D; Message when replying to a message * &#x60;request&#x60; &#x3D; Message when requesting an invite * &#x60;requestResponse&#x60; &#x3D; Message when replying to a request for invite

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = InviteApi()
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
val messageType : InviteMessageType =  // InviteMessageType | The type of message to fetch, must be a valid InviteMessageType.
val slot : kotlin.Int = 56 // kotlin.Int | The message slot to fetch of a given message type.
try {
    val result : InviteMessage = apiInstance.getInviteMessage(userId, messageType, slot)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InviteApi#getInviteMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InviteApi#getInviteMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| Must be a valid user ID. |
 **messageType** | [**InviteMessageType**](.md)| The type of message to fetch, must be a valid InviteMessageType. | [default to message] [enum: message, response, request, requestResponse]
 **slot** | **kotlin.Int**| The message slot to fetch of a given message type. |

### Return type

[**InviteMessage**](InviteMessage.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInviteMessages"></a>
# **getInviteMessages**
> kotlin.collections.List&lt;InviteMessage&gt; getInviteMessages(userId, messageType)

List Invite Messages

Returns a list of all the users Invite Messages. Admin Credentials are required to view messages of other users!  Message type refers to a different collection of messages, used during different types of responses.  * &#x60;message&#x60; &#x3D; Message during a normal invite * &#x60;response&#x60; &#x3D; Message when replying to a message * &#x60;request&#x60; &#x3D; Message when requesting an invite * &#x60;requestResponse&#x60; &#x3D; Message when replying to a request for invite

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = InviteApi()
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
val messageType : InviteMessageType =  // InviteMessageType | The type of message to fetch, must be a valid InviteMessageType.
try {
    val result : kotlin.collections.List<InviteMessage> = apiInstance.getInviteMessages(userId, messageType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InviteApi#getInviteMessages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InviteApi#getInviteMessages")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| Must be a valid user ID. |
 **messageType** | [**InviteMessageType**](.md)| The type of message to fetch, must be a valid InviteMessageType. | [default to message] [enum: message, response, request, requestResponse]

### Return type

[**kotlin.collections.List&lt;InviteMessage&gt;**](InviteMessage.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="inviteMyselfTo"></a>
# **inviteMyselfTo**
> SentNotification inviteMyselfTo(worldId, instanceId)

Invite Myself To Instance

Sends self an invite to an instance

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = InviteApi()
val worldId : kotlin.String = worldId_example // kotlin.String | Must be a valid world ID.
val instanceId : kotlin.String = instanceId_example // kotlin.String | Must be a valid instance ID.
try {
    val result : SentNotification = apiInstance.inviteMyselfTo(worldId, instanceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InviteApi#inviteMyselfTo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InviteApi#inviteMyselfTo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **worldId** | **kotlin.String**| Must be a valid world ID. |
 **instanceId** | **kotlin.String**| Must be a valid instance ID. |

### Return type

[**SentNotification**](SentNotification.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="inviteUser"></a>
# **inviteUser**
> SentNotification inviteUser(userId, inviteRequest)

Invite User

Sends an invite to a user. Returns the Notification of type &#x60;invite&#x60; that was sent.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = InviteApi()
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
val inviteRequest : InviteRequest =  // InviteRequest | Slot number of the Invite Message to use when inviting a user.
try {
    val result : SentNotification = apiInstance.inviteUser(userId, inviteRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InviteApi#inviteUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InviteApi#inviteUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| Must be a valid user ID. |
 **inviteRequest** | [**InviteRequest**](InviteRequest.md)| Slot number of the Invite Message to use when inviting a user. |

### Return type

[**SentNotification**](SentNotification.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="requestInvite"></a>
# **requestInvite**
> Notification requestInvite(userId, requestInviteRequest)

Request Invite

Requests an invite from a user. Returns the Notification of type &#x60;requestInvite&#x60; that was sent.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = InviteApi()
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
val requestInviteRequest : RequestInviteRequest =  // RequestInviteRequest | Slot number of the Request Message to use when request an invite.
try {
    val result : Notification = apiInstance.requestInvite(userId, requestInviteRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InviteApi#requestInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InviteApi#requestInvite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| Must be a valid user ID. |
 **requestInviteRequest** | [**RequestInviteRequest**](RequestInviteRequest.md)| Slot number of the Request Message to use when request an invite. | [optional]

### Return type

[**Notification**](Notification.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resetInviteMessage"></a>
# **resetInviteMessage**
> kotlin.collections.List&lt;InviteMessage&gt; resetInviteMessage(userId, messageType, slot)

Reset Invite Message

Resets a single Invite Message back to its original message, and then returns a list of all of them. Admin Credentials are required to update messages of other users!  Resetting a message respects the rate-limit, so it is not possible to reset within the 60 minutes countdown. Resetting it does however not set the rate-limit to 60 like when editing it. It is possible to edit it right after resetting it. Trying to edit a message before the cooldown timer expires results in a 429 \&quot;Too Fast Error\&quot;.  Message type refers to a different collection of messages, used during different types of responses.  * &#x60;message&#x60; &#x3D; Message during a normal invite * &#x60;response&#x60; &#x3D; Message when replying to a message * &#x60;request&#x60; &#x3D; Message when requesting an invite * &#x60;requestResponse&#x60; &#x3D; Message when replying to a request for invite  The DELETE endpoint does not have/require any request body.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = InviteApi()
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
val messageType : InviteMessageType =  // InviteMessageType | The type of message to fetch, must be a valid InviteMessageType.
val slot : kotlin.Int = 56 // kotlin.Int | The message slot to fetch of a given message type.
try {
    val result : kotlin.collections.List<InviteMessage> = apiInstance.resetInviteMessage(userId, messageType, slot)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InviteApi#resetInviteMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InviteApi#resetInviteMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| Must be a valid user ID. |
 **messageType** | [**InviteMessageType**](.md)| The type of message to fetch, must be a valid InviteMessageType. | [default to message] [enum: message, response, request, requestResponse]
 **slot** | **kotlin.Int**| The message slot to fetch of a given message type. |

### Return type

[**kotlin.collections.List&lt;InviteMessage&gt;**](InviteMessage.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="respondInvite"></a>
# **respondInvite**
> Notification respondInvite(notificationId, inviteResponse)

Respond Invite

Respond to an invite request by sending a world invite to the requesting user. &#x60;:notificationId&#x60; is the ID of the requesting notification.

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = InviteApi()
val notificationId : kotlin.String = notificationId_example // kotlin.String | Must be a valid notification ID.
val inviteResponse : InviteResponse =  // InviteResponse | Slot number of the Response Message to use when responding to a user.
try {
    val result : Notification = apiInstance.respondInvite(notificationId, inviteResponse)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InviteApi#respondInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InviteApi#respondInvite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | **kotlin.String**| Must be a valid notification ID. |
 **inviteResponse** | [**InviteResponse**](InviteResponse.md)| Slot number of the Response Message to use when responding to a user. |

### Return type

[**Notification**](Notification.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateInviteMessage"></a>
# **updateInviteMessage**
> kotlin.collections.List&lt;InviteMessage&gt; updateInviteMessage(userId, messageType, slot, updateInviteMessageRequest)

Update Invite Message

Updates a single Invite Message and then returns a list of all of them. Admin Credentials are required to update messages of other users!  Updating a message automatically sets the cooldown timer to 60 minutes. Trying to edit a message before the cooldown timer expires results in a 429 \&quot;Too Fast Error\&quot;.  Message type refers to a different collection of messages, used during different types of responses.  * &#x60;message&#x60; &#x3D; Message during a normal invite * &#x60;response&#x60; &#x3D; Message when replying to a message * &#x60;request&#x60; &#x3D; Message when requesting an invite * &#x60;requestResponse&#x60; &#x3D; Message when replying to a request for invite

### Example
```kotlin
// Import classes:
//import io.github.vrchatapi.infrastructure.*
//import io.github.vrchatapi.models.*

val apiInstance = InviteApi()
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
val messageType : InviteMessageType =  // InviteMessageType | The type of message to fetch, must be a valid InviteMessageType.
val slot : kotlin.Int = 56 // kotlin.Int | The message slot to fetch of a given message type.
val updateInviteMessageRequest : UpdateInviteMessageRequest =  // UpdateInviteMessageRequest | Message of what to set the invite message to.
try {
    val result : kotlin.collections.List<InviteMessage> = apiInstance.updateInviteMessage(userId, messageType, slot, updateInviteMessageRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InviteApi#updateInviteMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InviteApi#updateInviteMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| Must be a valid user ID. |
 **messageType** | [**InviteMessageType**](.md)| The type of message to fetch, must be a valid InviteMessageType. | [default to message] [enum: message, response, request, requestResponse]
 **slot** | **kotlin.Int**| The message slot to fetch of a given message type. |
 **updateInviteMessageRequest** | [**UpdateInviteMessageRequest**](UpdateInviteMessageRequest.md)| Message of what to set the invite message to. | [optional]

### Return type

[**kotlin.collections.List&lt;InviteMessage&gt;**](InviteMessage.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

