/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package io.github.kamo030.vrchatapi.apis

import io.github.kamo030.vrchatapi.models.Error
import io.github.kamo030.vrchatapi.models.ModerateUserRequest
import io.github.kamo030.vrchatapi.models.PlayerModeration
import io.github.kamo030.vrchatapi.models.Success

import io.github.kamo030.vrchatapi.infrastructure.*
import io.ktor.client.HttpClient
import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import kotlinx.serialization.json.Json
import io.ktor.http.ParametersBuilder
import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

open class PlayermoderationApi(
    private val apiClient: ApiClient,
) {

    constructor(
        baseUrl: String = ApiClient.BASE_URL,
        httpClientEngine: HttpClientEngine? = null,
        jsonSerializer: Json = ApiClient.JSON_DEFAULT,
        httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
    ) : this(
        ApiClient(
            baseUrl = baseUrl,
            httpClientEngine = httpClientEngine,
            httpClientConfig = httpClientConfig,
            jsonBlock = jsonSerializer
        )
    )

    constructor(
        baseUrl: String = ApiClient.BASE_URL,
        httpClient: HttpClient,
    ) : this(
        ApiClient(
            baseUrl = baseUrl,
            httpClient = httpClient,
        )
    )

    /**
     * Clear All Player Moderations
     * ⚠️ **This will delete every single player moderation you&#39;ve ever made.**
     * @return Success
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun clearAllPlayerModerations(): HttpResponse<Success> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.DELETE,
            "/auth/user/playermoderations",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
        )

        return apiClient.request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Search Player Moderations
     * Returns a list of all player moderations made by **you**.  This endpoint does not have pagination, and will return *all* results. Use query parameters to limit your query if needed.
     * @param type Must be one of PlayerModerationType, except unblock. Unblocking simply removes a block. (optional)
     * @param targetUserId Must be valid UserID. (optional)
     * @return kotlin.collections.List<PlayerModeration>
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getPlayerModerations(
        type: kotlin.String? = null,
        targetUserId: kotlin.String? = null,
    ): HttpResponse<kotlin.collections.List<PlayerModeration>> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        type?.apply { localVariableQuery["type"] = listOf("$type") }
        targetUserId?.apply { localVariableQuery["targetUserId"] = listOf("$targetUserId") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/auth/user/playermoderations",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
        )

        return apiClient.request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<GetPlayerModerationsResponse>().map { value }
    }

    @Serializable(GetPlayerModerationsResponse.Companion::class)
    private class GetPlayerModerationsResponse(val value: List<PlayerModeration>) {
        companion object : KSerializer<GetPlayerModerationsResponse> {
            private val serializer: KSerializer<List<PlayerModeration>> = serializer<List<PlayerModeration>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, value: GetPlayerModerationsResponse) =
                serializer.serialize(encoder, value.value)

            override fun deserialize(decoder: Decoder) = GetPlayerModerationsResponse(serializer.deserialize(decoder))
        }
    }

    /**
     * Moderate User
     * Moderate a user, e.g. unmute them or show their avatar.  Please see the [Player Moderation docs](https://vrchatapi.github.io/docs/api/#tag--playermoderation) on what playerModerations are, and how they differ from staff moderations.
     * @param moderateUserRequest
     * @return PlayerModeration
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun moderateUser(moderateUserRequest: ModerateUserRequest): HttpResponse<PlayerModeration> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = moderateUserRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/auth/user/playermoderations",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
        )

        return apiClient.jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Unmoderate User
     * Removes a player moderation previously added through &#x60;moderateUser&#x60;. E.g if you previously have shown their avatar, but now want to reset it to default.
     * @param moderateUserRequest
     * @return Success
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun unmoderateUser(moderateUserRequest: ModerateUserRequest): HttpResponse<Success> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = moderateUserRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PUT,
            "/auth/user/unplayermoderate",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
        )

        return apiClient.jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


}
