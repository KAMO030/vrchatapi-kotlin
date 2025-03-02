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

package io.github.kamo030.vrchatapi.models


import kotlinx.serialization.*

/**
 * 
 *
 * Values: Mute,Unmute,Block,Unblock,InteractOn,InteractOff
 */
@Serializable
enum class PlayerModerationType(val value: kotlin.String) {

    @SerialName(value = "mute")
    Mute("mute"),

    @SerialName(value = "unmute")
    Unmute("unmute"),

    @SerialName(value = "block")
    Block("block"),

    @SerialName(value = "unblock")
    Unblock("unblock"),

    @SerialName(value = "interactOn")
    InteractOn("interactOn"),

    @SerialName(value = "interactOff")
    InteractOff("interactOff");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is PlayerModerationType) "$data" else null

        /**
         * Returns a valid [PlayerModerationType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): PlayerModerationType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

