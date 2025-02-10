package io.github.kamo030.vrchatapi.apis

import io.github.kamo030.vrchatapi.infrastructure.ApiClient
import io.github.kamo030.vrchatapi.models.TwoFactorAuthCode
import io.github.kamo030.vrchatapi.models.TwoFactorEmailCode
import io.ktor.client.plugins.cookies.*
import kotlinx.coroutines.runBlocking
import kotlin.test.Test

class ApiTest {
    @Test
    fun testApi() {
        val apiClient = ApiClient {
            install(HttpCookies)
        }

        val authApi = apiClient.createAuthenticationApi()
        runBlocking {
            val currentUser = runCatching {
                val response = authApi.getCurrentUser("username", "password")
                response.body()
            }.getOrElse { e ->
                if (e.toString().contains("emailOtp")) {
                    println("2FA Email code:")
                    val code = TwoFactorEmailCode("code")
                    authApi.verify2FAEmailCode(code)
                } else {
                    println("2FA Authenticator code:")
                    val code = TwoFactorAuthCode("code")
                    authApi.verify2FA(code)
                }
                val response = authApi.getCurrentUser()
                response.body()
            }
            println(currentUser)
        }
    }
}