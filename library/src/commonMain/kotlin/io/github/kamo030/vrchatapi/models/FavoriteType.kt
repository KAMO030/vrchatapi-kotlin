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
 * Values: World,Friend,Avatar
 */
@Serializable
enum class FavoriteType(val value: kotlin.String) {

    @SerialName(value = "world")
    World("world"),

    @SerialName(value = "friend")
    Friend("friend"),

    @SerialName(value = "avatar")
    Avatar("avatar");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FavoriteType) "$data" else null

        /**
         * Returns a valid [FavoriteType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FavoriteType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

