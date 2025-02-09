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
 * Values: group_all,group_announcement_manage,group_audit_view,group_bans_manage,group_data_manage,group_default_role_manage,group_galleries_manage,group_instance_age_gated_create,group_instance_join,group_instance_manage,group_instance_moderate,group_instance_open_create,group_instance_plus_create,group_instance_plus_portal,group_instance_plus_portal_unlocked,group_instance_public_create,group_instance_queue_priority,group_instance_restricted_create,group_invites_manage,group_members_manage,group_members_remove,group_members_viewall,group_roles_assign,group_roles_manage
 */
@Serializable
enum class GroupPermissions(val value: kotlin.String) {

    @SerialName(value = "*")
    group_all("*"),

    @SerialName(value = "group-announcement-manage")
    group_announcement_manage("group-announcement-manage"),

    @SerialName(value = "group-audit-view")
    group_audit_view("group-audit-view"),

    @SerialName(value = "group-bans-manage")
    group_bans_manage("group-bans-manage"),

    @SerialName(value = "group-data-manage")
    group_data_manage("group-data-manage"),

    @SerialName(value = "group-default-role-manage")
    group_default_role_manage("group-default-role-manage"),

    @SerialName(value = "group-galleries-manage")
    group_galleries_manage("group-galleries-manage"),

    @SerialName(value = "group-instance-age-gated-create")
    group_instance_age_gated_create("group-instance-age-gated-create"),

    @SerialName(value = "group-instance-join")
    group_instance_join("group-instance-join"),

    @SerialName(value = "group-instance-manage")
    group_instance_manage("group-instance-manage"),

    @SerialName(value = "group-instance-moderate")
    group_instance_moderate("group-instance-moderate"),

    @SerialName(value = "group-instance-open-create")
    group_instance_open_create("group-instance-open-create"),

    @SerialName(value = "group-instance-plus-create")
    group_instance_plus_create("group-instance-plus-create"),

    @SerialName(value = "group-instance-plus-portal")
    group_instance_plus_portal("group-instance-plus-portal"),

    @SerialName(value = "group-instance-plus-portal-unlocked")
    group_instance_plus_portal_unlocked("group-instance-plus-portal-unlocked"),

    @SerialName(value = "group-instance-public-create")
    group_instance_public_create("group-instance-public-create"),

    @SerialName(value = "group-instance-queue-priority")
    group_instance_queue_priority("group-instance-queue-priority"),

    @SerialName(value = "group-instance-restricted-create")
    group_instance_restricted_create("group-instance-restricted-create"),

    @SerialName(value = "group-invites-manage")
    group_invites_manage("group-invites-manage"),

    @SerialName(value = "group-members-manage")
    group_members_manage("group-members-manage"),

    @SerialName(value = "group-members-remove")
    group_members_remove("group-members-remove"),

    @SerialName(value = "group-members-viewall")
    group_members_viewall("group-members-viewall"),

    @SerialName(value = "group-roles-assign")
    group_roles_assign("group-roles-assign"),

    @SerialName(value = "group-roles-manage")
    group_roles_manage("group-roles-manage");

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is GroupPermissions) "$data" else null

        /**
         * Returns a valid [GroupPermissions] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): GroupPermissions? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

