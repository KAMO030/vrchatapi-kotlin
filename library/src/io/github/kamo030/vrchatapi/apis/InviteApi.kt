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
import io.github.kamo030.vrchatapi.models.InviteMessage
import io.github.kamo030.vrchatapi.models.InviteMessageType
import io.github.kamo030.vrchatapi.models.InviteRequest
import io.github.kamo030.vrchatapi.models.InviteResponse
import io.github.kamo030.vrchatapi.models.Notification
import io.github.kamo030.vrchatapi.models.RequestInviteRequest
import io.github.kamo030.vrchatapi.models.SentNotification
import io.github.kamo030.vrchatapi.models.UpdateInviteMessageRequest

import io.github.kamo030.vrchatapi.infrastructure.*
import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import kotlinx.serialization.json.Json
import io.ktor.http.ParametersBuilder
import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

open class InviteApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    jsonSerializer: Json = ApiClient.JSON_DEFAULT
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, jsonSerializer) {

    /**
     * Get Invite Message
     * Returns a single Invite Message. This returns the exact same information but less than &#x60;getInviteMessages&#x60;. Admin Credentials are required to view messages of other users!  Message type refers to a different collection of messages, used during different types of responses.  * &#x60;message&#x60; &#x3D; Message during a normal invite * &#x60;response&#x60; &#x3D; Message when replying to a message * &#x60;request&#x60; &#x3D; Message when requesting an invite * &#x60;requestResponse&#x60; &#x3D; Message when replying to a request for invite
     * @param userId Must be a valid user ID.
     * @param messageType The type of message to fetch, must be a valid InviteMessageType. (default to message)
     * @param slot The message slot to fetch of a given message type.
     * @return InviteMessage
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getInviteMessage(userId: kotlin.String, messageType: InviteMessageType = message, slot: kotlin.Int): HttpResponse<InviteMessage> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/message/{userId}/{messageType}/{slot}".replace("{" + "userId" + "}", "$userId").replace("{" + "messageType" + "}", "$messageType").replace("{" + "slot" + "}", "$slot"),
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
     * List Invite Messages
     * Returns a list of all the users Invite Messages. Admin Credentials are required to view messages of other users!  Message type refers to a different collection of messages, used during different types of responses.  * &#x60;message&#x60; &#x3D; Message during a normal invite * &#x60;response&#x60; &#x3D; Message when replying to a message * &#x60;request&#x60; &#x3D; Message when requesting an invite * &#x60;requestResponse&#x60; &#x3D; Message when replying to a request for invite
     * @param userId Must be a valid user ID.
     * @param messageType The type of message to fetch, must be a valid InviteMessageType. (default to message)
     * @return kotlin.collections.List<InviteMessage>
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getInviteMessages(userId: kotlin.String, messageType: InviteMessageType = message): HttpResponse<kotlin.collections.List<InviteMessage>> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/message/{userId}/{messageType}".replace("{" + "userId" + "}", "$userId").replace("{" + "messageType" + "}", "$messageType"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<GetInviteMessagesResponse>().map { value }
    }

    @Serializable
    private class GetInviteMessagesResponse(val value: List<InviteMessage>) {
        @Serializer(GetInviteMessagesResponse::class)
        companion object : KSerializer<GetInviteMessagesResponse> {
            private val serializer: KSerializer<List<InviteMessage>> = serializer<List<InviteMessage>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, obj: GetInviteMessagesResponse) = serializer.serialize(encoder, obj.value)
            override fun deserialize(decoder: Decoder) = GetInviteMessagesResponse(serializer.deserialize(decoder))
        }
    }

    /**
     * Invite Myself To Instance
     * Sends self an invite to an instance
     * @param worldId Must be a valid world ID.
     * @param instanceId Must be a valid instance ID.
     * @return SentNotification
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun inviteMyselfTo(worldId: kotlin.String, instanceId: kotlin.String): HttpResponse<SentNotification> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/invite/myself/to/{worldId}:{instanceId}".replace("{" + "worldId" + "}", "$worldId").replace("{" + "instanceId" + "}", "$instanceId"),
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
     * Invite User
     * Sends an invite to a user. Returns the Notification of type &#x60;invite&#x60; that was sent.
     * @param userId Must be a valid user ID.
     * @param inviteRequest Slot number of the Invite Message to use when inviting a user.
     * @return SentNotification
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun inviteUser(userId: kotlin.String, inviteRequest: InviteRequest): HttpResponse<SentNotification> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = inviteRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/invite/{userId}".replace("{" + "userId" + "}", "$userId"),
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
     * Request Invite
     * Requests an invite from a user. Returns the Notification of type &#x60;requestInvite&#x60; that was sent.
     * @param userId Must be a valid user ID.
     * @param requestInviteRequest Slot number of the Request Message to use when request an invite. (optional)
     * @return Notification
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun requestInvite(userId: kotlin.String, requestInviteRequest: RequestInviteRequest? = null): HttpResponse<Notification> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = requestInviteRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/requestInvite/{userId}".replace("{" + "userId" + "}", "$userId"),
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
     * Reset Invite Message
     * Resets a single Invite Message back to its original message, and then returns a list of all of them. Admin Credentials are required to update messages of other users!  Resetting a message respects the rate-limit, so it is not possible to reset within the 60 minutes countdown. Resetting it does however not set the rate-limit to 60 like when editing it. It is possible to edit it right after resetting it. Trying to edit a message before the cooldown timer expires results in a 429 \&quot;Too Fast Error\&quot;.  Message type refers to a different collection of messages, used during different types of responses.  * &#x60;message&#x60; &#x3D; Message during a normal invite * &#x60;response&#x60; &#x3D; Message when replying to a message * &#x60;request&#x60; &#x3D; Message when requesting an invite * &#x60;requestResponse&#x60; &#x3D; Message when replying to a request for invite  The DELETE endpoint does not have/require any request body.
     * @param userId Must be a valid user ID.
     * @param messageType The type of message to fetch, must be a valid InviteMessageType. (default to message)
     * @param slot The message slot to fetch of a given message type.
     * @return kotlin.collections.List<InviteMessage>
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun resetInviteMessage(userId: kotlin.String, messageType: InviteMessageType = message, slot: kotlin.Int): HttpResponse<kotlin.collections.List<InviteMessage>> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.DELETE,
            "/message/{userId}/{messageType}/{slot}".replace("{" + "userId" + "}", "$userId").replace("{" + "messageType" + "}", "$messageType").replace("{" + "slot" + "}", "$slot"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<ResetInviteMessageResponse>().map { value }
    }

    @Serializable
    private class ResetInviteMessageResponse(val value: List<InviteMessage>) {
        @Serializer(ResetInviteMessageResponse::class)
        companion object : KSerializer<ResetInviteMessageResponse> {
            private val serializer: KSerializer<List<InviteMessage>> = serializer<List<InviteMessage>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, obj: ResetInviteMessageResponse) = serializer.serialize(encoder, obj.value)
            override fun deserialize(decoder: Decoder) = ResetInviteMessageResponse(serializer.deserialize(decoder))
        }
    }

    /**
     * Respond Invite
     * Respond to an invite request by sending a world invite to the requesting user. &#x60;:notificationId&#x60; is the ID of the requesting notification.
     * @param notificationId Must be a valid notification ID.
     * @param inviteResponse Slot number of the Response Message to use when responding to a user.
     * @return Notification
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun respondInvite(notificationId: kotlin.String, inviteResponse: InviteResponse): HttpResponse<Notification> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = inviteResponse

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/invite/{notificationId}/response".replace("{" + "notificationId" + "}", "$notificationId"),
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
     * Update Invite Message
     * Updates a single Invite Message and then returns a list of all of them. Admin Credentials are required to update messages of other users!  Updating a message automatically sets the cooldown timer to 60 minutes. Trying to edit a message before the cooldown timer expires results in a 429 \&quot;Too Fast Error\&quot;.  Message type refers to a different collection of messages, used during different types of responses.  * &#x60;message&#x60; &#x3D; Message during a normal invite * &#x60;response&#x60; &#x3D; Message when replying to a message * &#x60;request&#x60; &#x3D; Message when requesting an invite * &#x60;requestResponse&#x60; &#x3D; Message when replying to a request for invite
     * @param userId Must be a valid user ID.
     * @param messageType The type of message to fetch, must be a valid InviteMessageType. (default to message)
     * @param slot The message slot to fetch of a given message type.
     * @param updateInviteMessageRequest Message of what to set the invite message to. (optional)
     * @return kotlin.collections.List<InviteMessage>
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun updateInviteMessage(userId: kotlin.String, messageType: InviteMessageType = message, slot: kotlin.Int, updateInviteMessageRequest: UpdateInviteMessageRequest? = null): HttpResponse<kotlin.collections.List<InviteMessage>> {

        val localVariableAuthNames = listOf<String>("authCookie")

        val localVariableBody = updateInviteMessageRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PUT,
            "/message/{userId}/{messageType}/{slot}".replace("{" + "userId" + "}", "$userId").replace("{" + "messageType" + "}", "$messageType").replace("{" + "slot" + "}", "$slot"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<UpdateInviteMessageResponse>().map { value }
    }


    @Serializable
    private class UpdateInviteMessageResponse(val value: List<InviteMessage>) {
        @Serializer(UpdateInviteMessageResponse::class)
        companion object : KSerializer<UpdateInviteMessageResponse> {
            private val serializer: KSerializer<List<InviteMessage>> = serializer<List<InviteMessage>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, obj: UpdateInviteMessageResponse) = serializer.serialize(encoder, obj.value)
            override fun deserialize(decoder: Decoder) = UpdateInviteMessageResponse(serializer.deserialize(decoder))
        }
    }

}
