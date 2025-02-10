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

import io.github.kamo030.vrchatapi.models.CreateWorldRequest
import io.github.kamo030.vrchatapi.models.Error
import io.github.kamo030.vrchatapi.models.FavoritedWorld
import io.github.kamo030.vrchatapi.models.Instance
import io.github.kamo030.vrchatapi.models.LimitedWorld
import io.github.kamo030.vrchatapi.models.OrderOption
import io.github.kamo030.vrchatapi.models.ReleaseStatus
import io.github.kamo030.vrchatapi.models.SortOption
import io.github.kamo030.vrchatapi.models.UpdateWorldRequest
import io.github.kamo030.vrchatapi.models.World
import io.github.kamo030.vrchatapi.models.WorldMetadata
import io.github.kamo030.vrchatapi.models.WorldPublishStatus

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

open class WorldsApi(
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
     * Create World
     * Create a new world. This endpoint requires &#x60;assetUrl&#x60; to be a valid File object with &#x60;.vrcw&#x60; file extension, and &#x60;imageUrl&#x60; to be a valid File object with an image file extension.
     * @param createWorldRequest  (optional)
     * @return World
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun createWorld(createWorldRequest: CreateWorldRequest? = null): HttpResponse<World> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = createWorldRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/worlds",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
        )

        return apiClient.jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Delete World
     * Delete a world. Notice a world is never fully \&quot;deleted\&quot;, only its ReleaseStatus is set to \&quot;hidden\&quot; and the linked Files are deleted. The WorldID is permanently reserved.
     * @param worldId Must be a valid world ID.
     * @return void
     */
    open suspend fun deleteWorld(worldId: kotlin.String): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.DELETE,
            "/worlds/{worldId}".replace("{" + "worldId" + "}", "$worldId"),
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
     * List Active Worlds
     * Search and list currently Active worlds by query filters.
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
     * @return kotlin.collections.List<LimitedWorld>
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getActiveWorlds(
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
    ): HttpResponse<kotlin.collections.List<LimitedWorld>> {

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
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/worlds/active",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
        )

        return apiClient.request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<GetActiveWorldsResponse>().map { value }
    }

    @Serializable(GetActiveWorldsResponse.Companion::class)
    private class GetActiveWorldsResponse(val value: List<LimitedWorld>) {
        companion object : KSerializer<GetActiveWorldsResponse> {
            private val serializer: KSerializer<List<LimitedWorld>> = serializer<List<LimitedWorld>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, value: GetActiveWorldsResponse) =
                serializer.serialize(encoder, value.value)

            override fun deserialize(decoder: Decoder) = GetActiveWorldsResponse(serializer.deserialize(decoder))
        }
    }

    /**
     * List Favorited Worlds
     * Search and list favorited worlds by query filters.
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
     * @return kotlin.collections.List<FavoritedWorld>
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getFavoritedWorlds(
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
    ): HttpResponse<kotlin.collections.List<FavoritedWorld>> {

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
            "/worlds/favorites",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
        )

        return apiClient.request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<GetFavoritedWorldsResponse>().map { value }
    }

    @Serializable(GetFavoritedWorldsResponse.Companion::class)
    private class GetFavoritedWorldsResponse(val value: List<FavoritedWorld>) {
        companion object : KSerializer<GetFavoritedWorldsResponse> {
            private val serializer: KSerializer<List<FavoritedWorld>> = serializer<List<FavoritedWorld>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, value: GetFavoritedWorldsResponse) =
                serializer.serialize(encoder, value.value)

            override fun deserialize(decoder: Decoder) = GetFavoritedWorldsResponse(serializer.deserialize(decoder))
        }
    }

    /**
     * List Recent Worlds
     * Search and list recently visited worlds by query filters.
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
     * @return kotlin.collections.List<LimitedWorld>
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getRecentWorlds(
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
    ): HttpResponse<kotlin.collections.List<LimitedWorld>> {

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
            "/worlds/recent",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
        )

        return apiClient.request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<GetRecentWorldsResponse>().map { value }
    }

    @Serializable(GetRecentWorldsResponse.Companion::class)
    private class GetRecentWorldsResponse(val value: List<LimitedWorld>) {
        companion object : KSerializer<GetRecentWorldsResponse> {
            private val serializer: KSerializer<List<LimitedWorld>> = serializer<List<LimitedWorld>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, value: GetRecentWorldsResponse) =
                serializer.serialize(encoder, value.value)

            override fun deserialize(decoder: Decoder) = GetRecentWorldsResponse(serializer.deserialize(decoder))
        }
    }

    /**
     * Get World by ID
     * Get information about a specific World. Works unauthenticated but when so will always return &#x60;0&#x60; for certain fields.
     * @param worldId Must be a valid world ID.
     * @return World
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getWorld(worldId: kotlin.String): HttpResponse<World> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/worlds/{worldId}".replace("{" + "worldId" + "}", "$worldId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
        )

        return apiClient.request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Get World Instance
     * Returns a worlds instance.
     * @param worldId Must be a valid world ID.
     * @param instanceId Must be a valid instance ID.
     * @return Instance
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getWorldInstance(worldId: kotlin.String, instanceId: kotlin.String): HttpResponse<Instance> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/worlds/{worldId}/{instanceId}".replace("{" + "worldId" + "}", "$worldId")
                .replace("{" + "instanceId" + "}", "$instanceId"),
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
     * Get World Metadata
     * Return a worlds custom metadata. This is currently believed to be unused. Metadata can be set with &#x60;updateWorld&#x60; and can be any arbitrary object.
     * @param worldId Must be a valid world ID.
     * @return WorldMetadata
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getWorldMetadata(worldId: kotlin.String): HttpResponse<WorldMetadata> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/worlds/{worldId}/metadata".replace("{" + "worldId" + "}", "$worldId"),
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
     * Get World Publish Status
     * Returns a worlds publish status.
     * @param worldId Must be a valid world ID.
     * @return WorldPublishStatus
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getWorldPublishStatus(worldId: kotlin.String): HttpResponse<WorldPublishStatus> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/worlds/{worldId}/publish".replace("{" + "worldId" + "}", "$worldId"),
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
     * Publish World
     * Publish a world. You can only publish one world per week.
     * @param worldId Must be a valid world ID.
     * @return void
     */
    open suspend fun publishWorld(worldId: kotlin.String): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PUT,
            "/worlds/{worldId}/publish".replace("{" + "worldId" + "}", "$worldId"),
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
    enum class UserSearchWorlds(val value: kotlin.String) {

        @SerialName(value = "me")
        Me("me")

    }

    /**
     * Search All Worlds
     * Search and list any worlds by query filters.
     * @param featured Filters on featured results. (optional)
     * @param sort The sort order of the results. (optional, default to popularity)
     * @param user Set to &#x60;me&#x60; for searching own worlds. (optional)
     * @param userId Filter by UserID. (optional)
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
     * @param fuzzy  (optional)
     * @return kotlin.collections.List<LimitedWorld>
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun searchWorlds(
        featured: kotlin.Boolean? = null,
        sort: SortOption? = SortOption.Popularity,
        user: UserSearchWorlds? = null,
        userId: kotlin.String? = null,
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
        fuzzy: kotlin.Boolean? = null,
    ): HttpResponse<kotlin.collections.List<LimitedWorld>> {

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
        search?.apply { localVariableQuery["search"] = listOf("$search") }
        tag?.apply { localVariableQuery["tag"] = listOf("$tag") }
        notag?.apply { localVariableQuery["notag"] = listOf("$notag") }
        releaseStatus?.apply { localVariableQuery["releaseStatus"] = listOf("$releaseStatus") }
        maxUnityVersion?.apply { localVariableQuery["maxUnityVersion"] = listOf("$maxUnityVersion") }
        minUnityVersion?.apply { localVariableQuery["minUnityVersion"] = listOf("$minUnityVersion") }
        platform?.apply { localVariableQuery["platform"] = listOf("$platform") }
        fuzzy?.apply { localVariableQuery["fuzzy"] = listOf("$fuzzy") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/worlds",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
        )

        return apiClient.request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<SearchWorldsResponse>().map { value }
    }

    @Serializable(SearchWorldsResponse.Companion::class)
    private class SearchWorldsResponse(val value: List<LimitedWorld>) {
        companion object : KSerializer<SearchWorldsResponse> {
            private val serializer: KSerializer<List<LimitedWorld>> = serializer<List<LimitedWorld>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, value: SearchWorldsResponse) =
                serializer.serialize(encoder, value.value)

            override fun deserialize(decoder: Decoder) = SearchWorldsResponse(serializer.deserialize(decoder))
        }
    }

    /**
     * Unpublish World
     * Unpublish a world.
     * @param worldId Must be a valid world ID.
     * @return void
     */
    open suspend fun unpublishWorld(worldId: kotlin.String): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.DELETE,
            "/worlds/{worldId}/publish".replace("{" + "worldId" + "}", "$worldId"),
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
     * Update World
     * Update information about a specific World.
     * @param worldId Must be a valid world ID.
     * @param updateWorldRequest  (optional)
     * @return World
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun updateWorld(
        worldId: kotlin.String,
        updateWorldRequest: UpdateWorldRequest? = null,
    ): HttpResponse<World> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = updateWorldRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PUT,
            "/worlds/{worldId}".replace("{" + "worldId" + "}", "$worldId"),
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
