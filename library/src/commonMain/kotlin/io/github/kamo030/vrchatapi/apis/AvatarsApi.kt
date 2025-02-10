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

import io.github.kamo030.vrchatapi.models.Avatar
import io.github.kamo030.vrchatapi.models.CreateAvatarRequest
import io.github.kamo030.vrchatapi.models.CurrentUser
import io.github.kamo030.vrchatapi.models.Error
import io.github.kamo030.vrchatapi.models.OrderOption
import io.github.kamo030.vrchatapi.models.ReleaseStatus
import io.github.kamo030.vrchatapi.models.SortOption
import io.github.kamo030.vrchatapi.models.UpdateAvatarRequest

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

fun ApiClient.createAvatarApi() = AvatarsApi(this)

open class AvatarsApi(
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
     * Create Avatar
     * Create an avatar. It&#39;s possible to optionally specify a ID if you want a custom one. Attempting to create an Avatar with an already claimed ID will result in a DB error.
     * @param createAvatarRequest  (optional)
     * @return Avatar
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun createAvatar(createAvatarRequest: CreateAvatarRequest? = null): HttpResponse<Avatar> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = createAvatarRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/avatars",
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
     * Delete Avatar
     * Delete an avatar. Notice an avatar is never fully \&quot;deleted\&quot;, only its ReleaseStatus is set to \&quot;hidden\&quot; and the linked Files are deleted. The AvatarID is permanently reserved.
     * @param avatarId Must be a valid avatar ID.
     * @return Avatar
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun deleteAvatar(avatarId: kotlin.String): HttpResponse<Avatar> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.DELETE,
            "/avatars/{avatarId}".replace("{" + "avatarId" + "}", "$avatarId"),
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
     * Get Avatar
     * Get information about a specific Avatar.
     * @param avatarId Must be a valid avatar ID.
     * @return Avatar
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getAvatar(avatarId: kotlin.String): HttpResponse<Avatar> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/avatars/{avatarId}".replace("{" + "avatarId" + "}", "$avatarId"),
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
     * List Favorited Avatars
     * Search and list favorited avatars by query filters.
     * @param featured Filters on featured results. (optional)
     * @param sort The sort order of the results. (optional, default to popularity)
     * @param n The number of objects to return. (optional, default to 60)
     * @param order Result ordering (optional, default to descending)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param search Filters by world name. (optional)
     * @param tag Tags to include (comma-separated). Any of the tags needs to be present. (optional)
     * @param notag Tags to exclude (comma-separated). (optional)
     * @param releaseStatus Filter by ReleaseStatus. (optional, default to public)
     * @param maxUnityVersion The maximum Unity version supported by the asset. (optional)
     * @param minUnityVersion The minimum Unity version supported by the asset. (optional)
     * @param platform The platform the asset supports. (optional)
     * @param userId Target user to see information on, admin-only. (optional)
     * @return kotlin.collections.List<Avatar>
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getFavoritedAvatars(
        featured: kotlin.Boolean? = null,
        sort: SortOption? = SortOption.Popularity,
        n: kotlin.Int? = 60,
        order: OrderOption? = OrderOption.Descending,
        offset: kotlin.Int? = null,
        search: kotlin.String? = null,
        tag: kotlin.String? = null,
        notag: kotlin.String? = null,
        releaseStatus: ReleaseStatus? = ReleaseStatus.Public,
        maxUnityVersion: kotlin.String? = null,
        minUnityVersion: kotlin.String? = null,
        platform: kotlin.String? = null,
        userId: kotlin.String? = null,
    ): HttpResponse<kotlin.collections.List<Avatar>> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        featured?.apply { localVariableQuery["featured"] = listOf("$featured") }
        sort?.apply { localVariableQuery["sort"] = listOf("$sort") }
        n?.apply { localVariableQuery["n"] = listOf("$n") }
        order?.apply { localVariableQuery["order"] = listOf("$order") }
        offset?.apply { localVariableQuery["offset"] = listOf("$offset") }
        search?.apply { localVariableQuery["search"] = listOf("$search") }
        tag?.apply { localVariableQuery["tag"] = listOf("$tag") }
        notag?.apply { localVariableQuery["notag"] = listOf("$notag") }
        releaseStatus?.apply { localVariableQuery["releaseStatus"] = listOf("$releaseStatus") }
        maxUnityVersion?.apply { localVariableQuery["maxUnityVersion"] = listOf("$maxUnityVersion") }
        minUnityVersion?.apply { localVariableQuery["minUnityVersion"] = listOf("$minUnityVersion") }
        platform?.apply { localVariableQuery["platform"] = listOf("$platform") }
        userId?.apply { localVariableQuery["userId"] = listOf("$userId") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/avatars/favorites",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
        )

        return apiClient.request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<GetFavoritedAvatarsResponse>().map { value }
    }

    @Serializable(GetFavoritedAvatarsResponse.Companion::class)
    private class GetFavoritedAvatarsResponse(val value: List<Avatar>) {
        companion object : KSerializer<GetFavoritedAvatarsResponse> {
            private val serializer: KSerializer<List<Avatar>> = serializer<List<Avatar>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, value: GetFavoritedAvatarsResponse) =
                serializer.serialize(encoder, value.value)

            override fun deserialize(decoder: Decoder) = GetFavoritedAvatarsResponse(serializer.deserialize(decoder))
        }
    }

    /**
     * Get Own Avatar
     * Get the current avatar for the user. This will return an error for any other user than the one logged in.
     * @param userId Must be a valid user ID.
     * @return Avatar
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getOwnAvatar(userId: kotlin.String): HttpResponse<Avatar> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/users/{userId}/avatar".replace("{" + "userId" + "}", "$userId"),
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
     * enum for parameter user
     */
    @Serializable
    enum class UserSearchAvatars(val value: kotlin.String) {

        @SerialName(value = "me")
        Me("me")

    }

    /**
     * Search Avatars
     * Search and list avatars by query filters. You can only search your own or featured avatars. It is not possible as a normal user to search other peoples avatars.
     * @param featured Filters on featured results. (optional)
     * @param sort The sort order of the results. (optional, default to popularity)
     * @param user Set to &#x60;me&#x60; for searching own avatars. (optional)
     * @param userId Filter by UserID. (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param order Result ordering (optional, default to descending)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @param tag Tags to include (comma-separated). Any of the tags needs to be present. (optional)
     * @param notag Tags to exclude (comma-separated). (optional)
     * @param releaseStatus Filter by ReleaseStatus. (optional, default to public)
     * @param maxUnityVersion The maximum Unity version supported by the asset. (optional)
     * @param minUnityVersion The minimum Unity version supported by the asset. (optional)
     * @param platform The platform the asset supports. (optional)
     * @return kotlin.collections.List<Avatar>
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun searchAvatars(
        featured: kotlin.Boolean? = null,
        sort: SortOption? = SortOption.Popularity,
        user: UserSearchAvatars? = null,
        userId: kotlin.String? = null,
        n: kotlin.Int? = 60,
        order: OrderOption? = OrderOption.Descending,
        offset: kotlin.Int? = null,
        tag: kotlin.String? = null,
        notag: kotlin.String? = null,
        releaseStatus: ReleaseStatus? = ReleaseStatus.Public,
        maxUnityVersion: kotlin.String? = null,
        minUnityVersion: kotlin.String? = null,
        platform: kotlin.String? = null,
    ): HttpResponse<kotlin.collections.List<Avatar>> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        featured?.apply { localVariableQuery["featured"] = listOf("$featured") }
        sort?.apply { localVariableQuery["sort"] = listOf("$sort") }
        user?.apply { localVariableQuery["user"] = listOf("${user.value}") }
        userId?.apply { localVariableQuery["userId"] = listOf("$userId") }
        n?.apply { localVariableQuery["n"] = listOf("$n") }
        order?.apply { localVariableQuery["order"] = listOf("$order") }
        offset?.apply { localVariableQuery["offset"] = listOf("$offset") }
        tag?.apply { localVariableQuery["tag"] = listOf("$tag") }
        notag?.apply { localVariableQuery["notag"] = listOf("$notag") }
        releaseStatus?.apply { localVariableQuery["releaseStatus"] = listOf("$releaseStatus") }
        maxUnityVersion?.apply { localVariableQuery["maxUnityVersion"] = listOf("$maxUnityVersion") }
        minUnityVersion?.apply { localVariableQuery["minUnityVersion"] = listOf("$minUnityVersion") }
        platform?.apply { localVariableQuery["platform"] = listOf("$platform") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/avatars",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
        )

        return apiClient.request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<SearchAvatarsResponse>().map { value }
    }

    @Serializable(SearchAvatarsResponse.Companion::class)
    private class SearchAvatarsResponse(val value: List<Avatar>) {
        companion object : KSerializer<SearchAvatarsResponse> {
            private val serializer: KSerializer<List<Avatar>> = serializer<List<Avatar>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, value: SearchAvatarsResponse) =
                serializer.serialize(encoder, value.value)

            override fun deserialize(decoder: Decoder) = SearchAvatarsResponse(serializer.deserialize(decoder))
        }
    }

    /**
     * Select Avatar
     * Switches into that avatar.
     * @param avatarId Must be a valid avatar ID.
     * @return CurrentUser
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun selectAvatar(avatarId: kotlin.String): HttpResponse<CurrentUser> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PUT,
            "/avatars/{avatarId}/select".replace("{" + "avatarId" + "}", "$avatarId"),
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
     * Select Fallback Avatar
     * Switches into that avatar as your fallback avatar.
     * @param avatarId Must be a valid avatar ID.
     * @return CurrentUser
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun selectFallbackAvatar(avatarId: kotlin.String): HttpResponse<CurrentUser> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PUT,
            "/avatars/{avatarId}/selectFallback".replace("{" + "avatarId" + "}", "$avatarId"),
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
     * Update Avatar
     * Update information about a specific avatar.
     * @param avatarId Must be a valid avatar ID.
     * @param updateAvatarRequest  (optional)
     * @return Avatar
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun updateAvatar(
        avatarId: kotlin.String,
        updateAvatarRequest: UpdateAvatarRequest? = null,
    ): HttpResponse<Avatar> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = updateAvatarRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PUT,
            "/avatars/{avatarId}".replace("{" + "avatarId" + "}", "$avatarId"),
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
