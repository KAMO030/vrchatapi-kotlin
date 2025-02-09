package io.github.kamo030.vrchatapi

import io.github.kamo030.vrchatapi.apis.AuthenticationApi
import io.github.kamo030.vrchatapi.models.TwoFactorAuthCode
import io.github.kamo030.vrchatapi.models.TwoFactorEmailCode
import kotlinx.coroutines.runBlocking
import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.test.Test


class ApiTest {
    @Test
    fun testApi() {
        val authApi = AuthenticationApi()


        authApi.setUsername("Username")
        authApi.setPassword("Password")
        val reader = BufferedReader(InputStreamReader(System.`in`))
        runBlocking {
            runCatching {
                authApi.getCurrentUser()
            }.getOrElse { e ->
                if (e.toString().contains("emailOtp")) {
                    println("2FA Email code:")
                    val code = TwoFactorEmailCode(reader.readLine())
                    authApi.verify2FAEmailCode(code)
                } else {
                    println("2FA Authenticator code:")
                    val code = TwoFactorAuthCode(reader.readLine())
                    authApi.verify2FA(code)
                }
            }
            val response = authApi.getCurrentUser()
            // 验证登录成功
            response.body()
            assert(response.success) { "登录失败" }
            println(response.body())
        }
    }
}