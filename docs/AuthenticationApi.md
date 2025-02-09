# AuthenticationApi

All URIs are relative to *https://api.vrchat.cloud/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkUserExists**](AuthenticationApi.md#checkUserExists) | **GET** /auth/exists | Check User Exists
[**deleteUser**](AuthenticationApi.md#deleteUser) | **PUT** /users/{userId}/delete | Delete User
[**getCurrentUser**](AuthenticationApi.md#getCurrentUser) | **GET** /auth/user | Login and/or Get Current User Info
[**logout**](AuthenticationApi.md#logout) | **PUT** /logout | Logout
[**verify2FA**](AuthenticationApi.md#verify2FA) | **POST** /auth/twofactorauth/totp/verify | Verify 2FA code
[**verify2FAEmailCode**](AuthenticationApi.md#verify2FAEmailCode) | **POST** /auth/twofactorauth/emailotp/verify | Verify 2FA email code
[**verifyAuthToken**](AuthenticationApi.md#verifyAuthToken) | **GET** /auth | Verify Auth Token
[**verifyRecoveryCode**](AuthenticationApi.md#verifyRecoveryCode) | **POST** /auth/twofactorauth/otp/verify | Verify 2FA code with Recovery code


<a name="checkUserExists"></a>
# **checkUserExists**
> UserExists checkUserExists(email, displayName, username, excludeUserId)

Check User Exists

Checks if a user by a given &#x60;username&#x60;, &#x60;displayName&#x60; or &#x60;email&#x60; exist. This is used during registration to check if a username has already been taken, during change of displayName to check if a displayName is available, and during change of email to check if the email is already used. In the later two cases the &#x60;excludeUserId&#x60; is used to exclude oneself, otherwise the result would always be true.  It is **REQUIRED** to include **AT LEAST** &#x60;username&#x60;, &#x60;displayName&#x60; **or** &#x60;email&#x60; query parameter. Although they can be combined - in addition with &#x60;excludeUserId&#x60; (generally to exclude yourself) - to further fine-tune the search.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = AuthenticationApi()
val email : kotlin.String = email_example // kotlin.String | Filter by email.
val displayName : kotlin.String = displayName_example // kotlin.String | Filter by displayName.
val username : kotlin.String = username_example // kotlin.String | Filter by Username.
val excludeUserId : kotlin.String = excludeUserId_example // kotlin.String | Exclude by UserID.
try {
    val result : UserExists = apiInstance.checkUserExists(email, displayName, username, excludeUserId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#checkUserExists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#checkUserExists")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **kotlin.String**| Filter by email. | [optional]
 **displayName** | **kotlin.String**| Filter by displayName. | [optional]
 **username** | **kotlin.String**| Filter by Username. | [optional]
 **excludeUserId** | **kotlin.String**| Exclude by UserID. | [optional]

### Return type

[**UserExists**](UserExists.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteUser"></a>
# **deleteUser**
> CurrentUser deleteUser(userId)

Delete User

Deletes the account with given ID. Normal users only have permission to delete their own account. Account deletion is 14 days from this request, and will be cancelled if you do an authenticated request with the account afterwards.  **VRC+ NOTE:** Despite the 14-days cooldown, any VRC+ subscription will be cancelled **immediately**.  **METHOD NOTE:** Despite this being a Delete action, the method type required is PUT.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = AuthenticationApi()
val userId : kotlin.String = userId_example // kotlin.String | Must be a valid user ID.
try {
    val result : CurrentUser = apiInstance.deleteUser(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#deleteUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#deleteUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| Must be a valid user ID. |

### Return type

[**CurrentUser**](CurrentUser.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrentUser"></a>
# **getCurrentUser**
> CurrentUser getCurrentUser()

Login and/or Get Current User Info

This endpoint does the following two operations:   1) Checks if you are already logged in by looking for a valid &#x60;auth&#x60; cookie. If you are have a valid auth cookie then no additional auth-related actions are taken. If you are **not** logged in then it will log you in with the &#x60;Authorization&#x60; header and set the &#x60;auth&#x60; cookie. The &#x60;auth&#x60; cookie will only be sent once.   2) If logged in, this function will also return the CurrentUser object containing detailed information about the currently logged in user.  The auth string after &#x60;Authorization: Basic {string}&#x60; is a base64-encoded string of the username and password, both individually url-encoded, and then joined with a colon.    &gt; base64(urlencode(username):urlencode(password))  **WARNING: Session Limit:** Each authentication with login credentials counts as a separate session, out of which you have a limited amount. Make sure to save and reuse the &#x60;auth&#x60; cookie if you are often restarting the program. The provided API libraries automatically save cookies during runtime, but does not persist during restart. While it can be fine to use username/password during development, expect in production to very fast run into the rate-limit and be temporarily blocked from making new sessions until older ones expire. The exact number of simultaneous sessions is unknown/undisclosed.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = AuthenticationApi()
try {
    val result : CurrentUser = apiInstance.getCurrentUser()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#getCurrentUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#getCurrentUser")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CurrentUser**](CurrentUser.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""
Configure authHeader:
    ApiClient.username = ""
    ApiClient.password = ""
Configure twoFactorAuthCookie:
    ApiClient.apiKey["twoFactorAuth"] = ""
    ApiClient.apiKeyPrefix["twoFactorAuth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="logout"></a>
# **logout**
> Success logout()

Logout

Invalidates the login session.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = AuthenticationApi()
try {
    val result : Success = apiInstance.logout()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#logout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#logout")
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

<a name="verify2FA"></a>
# **verify2FA**
> Verify2FAResult verify2FA(twoFactorAuthCode)

Verify 2FA code

Finishes the login sequence with a normal 2FA-generated code for accounts with 2FA-protection enabled.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = AuthenticationApi()
val twoFactorAuthCode : TwoFactorAuthCode =  // TwoFactorAuthCode | 
try {
    val result : Verify2FAResult = apiInstance.verify2FA(twoFactorAuthCode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#verify2FA")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#verify2FA")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **twoFactorAuthCode** | [**TwoFactorAuthCode**](TwoFactorAuthCode.md)|  |

### Return type

[**Verify2FAResult**](Verify2FAResult.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verify2FAEmailCode"></a>
# **verify2FAEmailCode**
> Verify2FAEmailCodeResult verify2FAEmailCode(twoFactorEmailCode)

Verify 2FA email code

Finishes the login sequence with an 2FA email code.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = AuthenticationApi()
val twoFactorEmailCode : TwoFactorEmailCode =  // TwoFactorEmailCode | 
try {
    val result : Verify2FAEmailCodeResult = apiInstance.verify2FAEmailCode(twoFactorEmailCode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#verify2FAEmailCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#verify2FAEmailCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **twoFactorEmailCode** | [**TwoFactorEmailCode**](TwoFactorEmailCode.md)|  |

### Return type

[**Verify2FAEmailCodeResult**](Verify2FAEmailCodeResult.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verifyAuthToken"></a>
# **verifyAuthToken**
> VerifyAuthTokenResult verifyAuthToken()

Verify Auth Token

Verify whether the currently provided Auth Token is valid.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = AuthenticationApi()
try {
    val result : VerifyAuthTokenResult = apiInstance.verifyAuthToken()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#verifyAuthToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#verifyAuthToken")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**VerifyAuthTokenResult**](VerifyAuthTokenResult.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="verifyRecoveryCode"></a>
# **verifyRecoveryCode**
> Verify2FAResult verifyRecoveryCode(twoFactorAuthCode)

Verify 2FA code with Recovery code

Finishes the login sequence with an OTP (One Time Password) recovery code for accounts with 2FA-protection enabled.

### Example
```kotlin
// Import classes:
//import io.github.kamo030.vrchatapi.infrastructure.*
//import io.github.kamo030.vrchatapi.models.*

val apiInstance = AuthenticationApi()
val twoFactorAuthCode : TwoFactorAuthCode =  // TwoFactorAuthCode | 
try {
    val result : Verify2FAResult = apiInstance.verifyRecoveryCode(twoFactorAuthCode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#verifyRecoveryCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#verifyRecoveryCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **twoFactorAuthCode** | [**TwoFactorAuthCode**](TwoFactorAuthCode.md)|  |

### Return type

[**Verify2FAResult**](Verify2FAResult.md)

### Authorization


Configure authCookie:
    ApiClient.apiKey["auth"] = ""
    ApiClient.apiKeyPrefix["auth"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

