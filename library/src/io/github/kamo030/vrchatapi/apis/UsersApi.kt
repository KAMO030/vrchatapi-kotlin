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

import io.github.kamo030.vrchatapi.models.CurrentUser
import io.github.kamo030.vrchatapi.models.Error
import io.github.kamo030.vrchatapi.models.Feedback
import io.github.kamo030.vrchatapi.models.GetUserGroupInstances200Response
import io.github.kamo030.vrchatapi.models.Group
import io.github.kamo030.vrchatapi.models.LimitedUser
import io.github.kamo030.vrchatapi.models.LimitedUserGroups
import io.github.kamo030.vrchatapi.models.RepresentedGroup
import io.github.kamo030.vrchatapi.models.UpdateUserNoteRequest
import io.github.kamo030.vrchatapi.models.UpdateUserRequest
import io.github.kamo030.vrchatapi.models.User
import io.github.kamo030.vrchatapi.models.UserNote

import io.github.kamo030.vrchatapi.infrastructure.*
import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import kotlinx.serialization.json.Json
import io.ktor.http.ParametersBuilder
import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

open class UsersApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    jsonSerializer: Json = ApiClient.JSON_DEFAULT
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, jsonSerializer) {

    /**
     * Get User by ID
     * Get public user information about a specific user using their ID.
     * @param userId Must be a valid user ID.
     * @return User
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getUser(userId: kotlin.String): HttpResponse<User> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/users/{userId}".replace("{" + "userId" + "}", "$userId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Get User by Username
     * ~~Get public user information about a specific user using their name.~~  **DEPRECATED:** VRChat API no longer return usernames of other users. [See issue by Tupper for more information](https://github.com/pypy-vrc/VRCX/issues/429). This endpoint now require Admin Credentials.
     * @param username Username of the user
     * @return User
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getUserByName(username: kotlin.String): HttpResponse<User> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/users/{username}/name".replace("{" + "username" + "}", "$username"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Get User Feedback
     * Get user&#39;s submitted feedback
     * @param userId Must be a valid user ID.
     * @param contentId Filter for users&#39; previously submitted feedback, e.g., a groupId, useeId, avatarId, etc. (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @return kotlin.collections.List<Feedback>
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getUserFeedback(userId: kotlin.String, contentId: kotlin.Boolean? = null, n: kotlin.Int? = 60, offset: kotlin.Int? = null): HttpResponse<kotlin.collections.List<Feedback>> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        contentId?.apply { localVariableQuery["contentId"] = listOf("$contentId") }
        n?.apply { localVariableQuery["n"] = listOf("$n") }
        offset?.apply { localVariableQuery["offset"] = listOf("$offset") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/users/{userId}/feedback".replace("{" + "userId" + "}", "$userId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<GetUserFeedbackResponse>().map { value }
    }

    @Serializable
    private class GetUserFeedbackResponse(val value: List<Feedback>) {
        @Serializer(GetUserFeedbackResponse::class)
        companion object : KSerializer<GetUserFeedbackResponse> {
            private val serializer: KSerializer<List<Feedback>> = serializer<List<Feedback>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, obj: GetUserFeedbackResponse) = serializer.serialize(encoder, obj.value)
            override fun deserialize(decoder: Decoder) = GetUserFeedbackResponse(serializer.deserialize(decoder))
        }
    }

    /**
     * Get User Group Instances
     * Returns a list of group instances for a user
     * @param userId Must be a valid user ID.
     * @return GetUserGroupInstances200Response
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getUserGroupInstances(userId: kotlin.String): HttpResponse<GetUserGroupInstances200Response> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/users/{userId}/instances/groups".replace("{" + "userId" + "}", "$userId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Get User Group Requests
     * Returns a list of Groups the user has requested to be invited into.
     * @param userId Must be a valid user ID.
     * @return kotlin.collections.List<Group>
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getUserGroupRequests(userId: kotlin.String): HttpResponse<kotlin.collections.List<Group>> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/users/{userId}/groups/requested".replace("{" + "userId" + "}", "$userId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<GetUserGroupRequestsResponse>().map { value }
    }

    @Serializable
    private class GetUserGroupRequestsResponse(val value: List<Group>) {
        @Serializer(GetUserGroupRequestsResponse::class)
        companion object : KSerializer<GetUserGroupRequestsResponse> {
            private val serializer: KSerializer<List<Group>> = serializer<List<Group>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, obj: GetUserGroupRequestsResponse) = serializer.serialize(encoder, obj.value)
            override fun deserialize(decoder: Decoder) = GetUserGroupRequestsResponse(serializer.deserialize(decoder))
        }
    }

    /**
     * Get User Groups
     * Get user&#39;s public groups
     * @param userId Must be a valid user ID.
     * @return kotlin.collections.List<LimitedUserGroups>
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getUserGroups(userId: kotlin.String): HttpResponse<kotlin.collections.List<LimitedUserGroups>> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/users/{userId}/groups".replace("{" + "userId" + "}", "$userId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<GetUserGroupsResponse>().map { value }
    }

    @Serializable
    private class GetUserGroupsResponse(val value: List<LimitedUserGroups>) {
        @Serializer(GetUserGroupsResponse::class)
        companion object : KSerializer<GetUserGroupsResponse> {
            private val serializer: KSerializer<List<LimitedUserGroups>> = serializer<List<LimitedUserGroups>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, obj: GetUserGroupsResponse) = serializer.serialize(encoder, obj.value)
            override fun deserialize(decoder: Decoder) = GetUserGroupsResponse(serializer.deserialize(decoder))
        }
    }

    /**
     * Get User Note
     * Get a particular user note
     * @param userNoteId Must be a valid user note ID.
     * @return UserNote
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getUserNote(userNoteId: kotlin.String): HttpResponse<UserNote> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/userNotes/{userNoteId}".replace("{" + "userNoteId" + "}", "$userNoteId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Get User Notes
     * Get recently updated user notes
     * @param n The number of objects to return. (optional, default to 60)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @return kotlin.collections.List<UserNote>
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getUserNotes(n: kotlin.Int? = 60, offset: kotlin.Int? = null): HttpResponse<kotlin.collections.List<UserNote>> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        n?.apply { localVariableQuery["n"] = listOf("$n") }
        offset?.apply { localVariableQuery["offset"] = listOf("$offset") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/userNotes",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<GetUserNotesResponse>().map { value }
    }

    @Serializable
    private class GetUserNotesResponse(val value: List<UserNote>) {
        @Serializer(GetUserNotesResponse::class)
        companion object : KSerializer<GetUserNotesResponse> {
            private val serializer: KSerializer<List<UserNote>> = serializer<List<UserNote>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, obj: GetUserNotesResponse) = serializer.serialize(encoder, obj.value)
            override fun deserialize(decoder: Decoder) = GetUserNotesResponse(serializer.deserialize(decoder))
        }
    }

    /**
     * Get user&#39;s current represented group
     * Returns the current group that the user is currently representing
     * @param userId Must be a valid user ID.
     * @return RepresentedGroup
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getUserRepresentedGroup(userId: kotlin.String): HttpResponse<RepresentedGroup> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/users/{userId}/groups/represented".replace("{" + "userId" + "}", "$userId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Search All Users
     * Search and list any users by text query
     * @param search Searches by &#x60;displayName&#x60;. Will return empty array if search query is empty or missing. (optional)
     * @param developerType Active user by developer type, none for normal users and internal for moderators (optional)
     * @param n The number of objects to return. (optional, default to 60)
     * @param offset A zero-based offset from the default object sorting from where search results start. (optional)
     * @return kotlin.collections.List<LimitedUser>
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun searchUsers(search: kotlin.String? = null, developerType: kotlin.String? = null, n: kotlin.Int? = 60, offset: kotlin.Int? = null): HttpResponse<kotlin.collections.List<LimitedUser>> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        search?.apply { localVariableQuery["search"] = listOf("$search") }
        developerType?.apply { localVariableQuery["developerType"] = listOf("$developerType") }
        n?.apply { localVariableQuery["n"] = listOf("$n") }
        offset?.apply { localVariableQuery["offset"] = listOf("$offset") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/users",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<SearchUsersResponse>().map { value }
    }

    @Serializable
    private class SearchUsersResponse(val value: List<LimitedUser>) {
        @Serializer(SearchUsersResponse::class)
        companion object : KSerializer<SearchUsersResponse> {
            private val serializer: KSerializer<List<LimitedUser>> = serializer<List<LimitedUser>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, obj: SearchUsersResponse) = serializer.serialize(encoder, obj.value)
            override fun deserialize(decoder: Decoder) = SearchUsersResponse(serializer.deserialize(decoder))
        }
    }

    /**
     * Update User Info
     * Update a users information such as the email and birthday.
     * @param userId Must be a valid user ID.
     * @param updateUserRequest  (optional)
     * @return CurrentUser
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun updateUser(userId: kotlin.String, updateUserRequest: UpdateUserRequest? = null): HttpResponse<CurrentUser> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = updateUserRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PUT,
            "/users/{userId}".replace("{" + "userId" + "}", "$userId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * Update User Note
     * Updates the currently authenticated user&#39;s note on a user
     * @param updateUserNoteRequest 
     * @return UserNote
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun updateUserNote(updateUserNoteRequest: UpdateUserNoteRequest): HttpResponse<UserNote> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = updateUserNoteRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/userNotes",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



}
