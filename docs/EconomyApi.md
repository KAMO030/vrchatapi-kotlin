# EconomyApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBalance**](EconomyApi.md#getBalance) | **GET** /user/{userId}/balance | Get Balance
[**getCurrentSubscriptions**](EconomyApi.md#getCurrentSubscriptions) | **GET** /auth/user/subscription | Get Current Subscriptions
[**getLicenseGroup**](EconomyApi.md#getLicenseGroup) | **GET** /licenseGroups/{licenseGroupId} | Get License Group
[**getProductListing**](EconomyApi.md#getProductListing) | **GET** /listing/{productId} | Get Product Listing
[**getProductListings**](EconomyApi.md#getProductListings) | **GET** /user/{userId}/listings | Get User Product Listings
[**getSteamTransaction**](EconomyApi.md#getSteamTransaction) | **GET** /Steam/transactions/{transactionId} | Get Steam Transaction
[**getSteamTransactions**](EconomyApi.md#getSteamTransactions) | **GET** /Steam/transactions | List Steam Transactions
[**getSubscriptions**](EconomyApi.md#getSubscriptions) | **GET** /subscriptions | List Subscriptions
[**getTiliaStatus**](EconomyApi.md#getTiliaStatus) | **GET** /tilia/status | Get Tilia Status
[**getTiliaTos**](EconomyApi.md#getTiliaTos) | **GET** /user/{userId}/tilia/tos | Get Tilia TOS Agreement Status
[**getTokenBundles**](EconomyApi.md#getTokenBundles) | **GET** /tokenBundles | List Token Bundles


<a name="getBalance"></a>
# **getBalance**
> Balance getBalance(userId)

Get Balance

Gets the balance of a user

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = EconomyApi()
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
try {
    val result : Balance = apiInstance.getBalance(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EconomyApi#getBalance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EconomyApi#getBalance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| Must be a valid user ID. |

### Return type

[**Balance**](Balance.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrentSubscriptions"></a>
# **getCurrentSubscriptions**
> kotlin.collections.List&lt;UserSubscription&gt; getCurrentSubscriptions()

Get Current Subscriptions

Get a list of all current user subscriptions.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = EconomyApi()
try {
    val result : kotlin.collections.List<UserSubscription> = apiInstance.getCurrentSubscriptions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EconomyApi#getCurrentSubscriptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EconomyApi#getCurrentSubscriptions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;UserSubscription&gt;**](UserSubscription.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLicenseGroup"></a>
# **getLicenseGroup**
> LicenseGroup getLicenseGroup(licenseGroupId)

Get License Group

Get a single License Group by given ID.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = EconomyApi()
val licenseGroupId : kotlin.String = licenseGroupId_example // kotlin.String | Must be a valid license group ID.
try {
    val result : LicenseGroup = apiInstance.getLicenseGroup(licenseGroupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EconomyApi#getLicenseGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EconomyApi#getLicenseGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **licenseGroupId** | **kotlin.String**| Must be a valid license group ID. |

### Return type

[**LicenseGroup**](LicenseGroup.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductListing"></a>
# **getProductListing**
> ProductListing getProductListing(productId, hydrate)

Get Product Listing

Gets a product listing

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = EconomyApi()
val productId : kotlin.String = productId_example // kotlin.String | Must be a valid product ID.
val hydrate : kotlin.Boolean = true // kotlin.Boolean | Populates some fields and changes types of others for certain objects.
try {
    val result : ProductListing = apiInstance.getProductListing(productId, hydrate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EconomyApi#getProductListing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EconomyApi#getProductListing")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **kotlin.String**| Must be a valid product ID. |
 **hydrate** | **kotlin.Boolean**| Populates some fields and changes types of others for certain objects. | [optional]

### Return type

[**ProductListing**](ProductListing.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductListings"></a>
# **getProductListings**
> kotlin.collections.List&lt;ProductListing&gt; getProductListings(userId, n, offset, hydrate, groupId, active)

Get User Product Listings

Gets the product listings of a given user

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = EconomyApi()
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
val n : kotlin.Int = 56 // kotlin.Int | The number of objects to return.
val offset : kotlin.Int = 56 // kotlin.Int | A zero-based offset from the default object sorting from where search results start.
val hydrate : kotlin.Boolean = true // kotlin.Boolean | Populates some fields and changes types of others for certain objects.
val groupId : kotlin.String = grp_00000000-0000-0000-0000-000000000000 // kotlin.String | Must be a valid group ID.
val active : kotlin.Boolean = true // kotlin.Boolean | Filter for users' listings.
try {
    val result : kotlin.collections.List<ProductListing> = apiInstance.getProductListings(userId, n, offset, hydrate, groupId, active)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EconomyApi#getProductListings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EconomyApi#getProductListings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| Must be a valid user ID. |
 **n** | **kotlin.Int**| The number of objects to return. | [optional] [default to 60]
 **offset** | **kotlin.Int**| A zero-based offset from the default object sorting from where search results start. | [optional]
 **hydrate** | **kotlin.Boolean**| Populates some fields and changes types of others for certain objects. | [optional]
 **groupId** | **kotlin.String**| Must be a valid group ID. | [optional]
 **active** | **kotlin.Boolean**| Filter for users&#39; listings. | [optional]

### Return type

[**kotlin.collections.List&lt;ProductListing&gt;**](ProductListing.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSteamTransaction"></a>
# **getSteamTransaction**
> Transaction getSteamTransaction(transactionId)

Get Steam Transaction

Get a single Steam transactions by ID. This returns the exact same information as &#x60;getSteamTransactions&#x60;, so no point in using this endpoint.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = EconomyApi()
val transactionId : kotlin.String = transactionId_example // kotlin.String | Must be a valid transaction ID.
try {
    val result : Transaction = apiInstance.getSteamTransaction(transactionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EconomyApi#getSteamTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EconomyApi#getSteamTransaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionId** | **kotlin.String**| Must be a valid transaction ID. |

### Return type

[**Transaction**](Transaction.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSteamTransactions"></a>
# **getSteamTransactions**
> kotlin.collections.List&lt;Transaction&gt; getSteamTransactions()

List Steam Transactions

Get all own Steam transactions.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = EconomyApi()
try {
    val result : kotlin.collections.List<Transaction> = apiInstance.getSteamTransactions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EconomyApi#getSteamTransactions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EconomyApi#getSteamTransactions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Transaction&gt;**](Transaction.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSubscriptions"></a>
# **getSubscriptions**
> kotlin.collections.List&lt;Subscription&gt; getSubscriptions()

List Subscriptions

List all existing Subscriptions. For example, \&quot;vrchatplus-monthly\&quot; and \&quot;vrchatplus-yearly\&quot;.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = EconomyApi()
try {
    val result : kotlin.collections.List<Subscription> = apiInstance.getSubscriptions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EconomyApi#getSubscriptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EconomyApi#getSubscriptions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Subscription&gt;**](Subscription.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTiliaStatus"></a>
# **getTiliaStatus**
> TiliaStatus getTiliaStatus()

Get Tilia Status

Gets the status of Tilia integration

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = EconomyApi()
try {
    val result : TiliaStatus = apiInstance.getTiliaStatus()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EconomyApi#getTiliaStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EconomyApi#getTiliaStatus")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TiliaStatus**](TiliaStatus.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTiliaTos"></a>
# **getTiliaTos**
> TiliaTOS getTiliaTos(userId)

Get Tilia TOS Agreement Status

Gets the status of the agreement of a user to the Tilia TOS

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = EconomyApi()
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
try {
    val result : TiliaTOS = apiInstance.getTiliaTos(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EconomyApi#getTiliaTos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EconomyApi#getTiliaTos")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| Must be a valid user ID. |

### Return type

[**TiliaTOS**](TiliaTOS.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTokenBundles"></a>
# **getTokenBundles**
> kotlin.collections.List&lt;TokenBundle&gt; getTokenBundles()

List Token Bundles

Gets the list of token bundles

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = EconomyApi()
try {
    val result : kotlin.collections.List<TokenBundle> = apiInstance.getTokenBundles()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EconomyApi#getTokenBundles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EconomyApi#getTokenBundles")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;TokenBundle&gt;**](TokenBundle.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

