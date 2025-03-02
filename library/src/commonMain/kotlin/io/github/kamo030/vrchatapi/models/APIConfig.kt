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

import io.github.kamo030.vrchatapi.models.APIConfigAccessLogsUrls
import io.github.kamo030.vrchatapi.models.APIConfigAnnouncement
import io.github.kamo030.vrchatapi.models.APIConfigAvatarPerfLimiter
import io.github.kamo030.vrchatapi.models.APIConfigConstants
import io.github.kamo030.vrchatapi.models.APIConfigDownloadURLList
import io.github.kamo030.vrchatapi.models.APIConfigEvents
import io.github.kamo030.vrchatapi.models.APIConfigMinSupportedClientBuildNumber
import io.github.kamo030.vrchatapi.models.APIConfigOfflineAnalysis
import io.github.kamo030.vrchatapi.models.APIConfigReportCategories
import io.github.kamo030.vrchatapi.models.APIConfigReportOptions
import io.github.kamo030.vrchatapi.models.APIConfigReportReasons
import io.github.kamo030.vrchatapi.models.DeploymentGroup
import io.github.kamo030.vrchatapi.models.DynamicContentRow

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param voiceEnableDegradation Unknown, probably voice optimization testing
 * @param voiceEnableReceiverLimiting Unknown, probably voice optimization testing
 * @param accessLogsUrls 
 * @param address VRChat's office address
 * @param ageVerificationInviteVisible 
 * @param ageVerificationP 
 * @param ageVerificationStatusVisible 
 * @param analysisMaxRetries Max retries for avatar analysis requests
 * @param analysisRetryInterval Interval between retries for avatar analysis requests
 * @param announcements Public Announcements
 * @param analyticsSegmentNewUIPctOfUsers Unknown
 * @param analyticsSegmentNewUISalt Unknown
 * @param appName Game name
 * @param availableLanguageCodes List of supported Languages
 * @param availableLanguages List of supported Languages
 * @param avatarPerfLimiter 
 * @param buildVersionTag Build tag of the API server
 * @param chatboxLogBufferSeconds Unknown
 * @param clientApiKey apiKey to be used for all other requests
 * @param clientBPSCeiling Unknown
 * @param clientDisconnectTimeout Unknown
 * @param clientNetDispatchThreadMobile Unknown
 * @param clientReservedPlayerBPS Unknown
 * @param clientSentCountAllowance Unknown
 * @param constants 
 * @param contactEmail VRChat's contact email
 * @param copyrightEmail VRChat's copyright-issues-related email
 * @param currentTOSVersion Current version number of the Terms of Service
 * @param defaultAvatar 
 * @param defaultStickerSet 
 * @param deploymentGroup 
 * @param devSdkUrl Link to download the development SDK, use downloadUrls instead
 * @param devSdkVersion Version of the development SDK
 * @param disCountdown Unknown, \"dis\" maybe for disconnect?
 * @param disableAvatarCopying Toggles if copying avatars should be disabled
 * @param disableAvatarGating Toggles if avatar gating should be disabled. Avatar gating restricts uploading of avatars to people with the `system_avatar_access` Tag or `admin_avatar_access` Tag
 * @param disableCommunityLabs Toggles if the Community Labs should be disabled
 * @param disableCommunityLabsPromotion Toggles if promotion out of Community Labs should be disabled
 * @param disableEmail Unknown
 * @param disableEventStream Toggles if Analytics should be disabled.
 * @param disableFeedbackGating Toggles if feedback gating should be disabled. Feedback gating restricts submission of feedback (reporting a World or User) to people with the `system_feedback_access` Tag.
 * @param disableFrontendBuilds Unknown, probably toggles compilation of frontend web builds? So internal flag?
 * @param disableGiftDrops Toggles if gift drops should be disabled
 * @param disableHello Unknown
 * @param disableOculusSubs Toggles if signing up for Subscriptions in Oculus is disabled or not.
 * @param disableRegistration Toggles if new user account registration should be disabled.
 * @param disableSteamNetworking Toggles if Steam Networking should be disabled. VRChat these days uses Photon Unity Networking (PUN) instead.
 * @param disableTwoFactorAuth Toggles if 2FA should be disabled.
 * @param disableUdon Toggles if Udon should be universally disabled in-game.
 * @param disableUpgradeAccount Toggles if account upgrading \"linking with Steam/Oculus\" should be disabled.
 * @param downloadLinkWindows Download link for game on the Oculus Rift website.
 * @param downloadUrls 
 * @param dynamicWorldRows Array of DynamicWorldRow objects, used by the game to display the list of world rows
 * @param events 
 * @param forceUseLatestWorld Unknown
 * @param giftDisplayType Display type of gifts
 * @param googleApiClientId Unknown
 * @param homeWorldId WorldID be \"offline\" on User profiles if you are not friends with that user.
 * @param homepageRedirectTarget Redirect target if you try to open the base API domain in your browser
 * @param hubWorldId WorldID be \"offline\" on User profiles if you are not friends with that user.
 * @param imageHostUrlList A list of explicitly allowed origins that worlds can request images from via the Udon's [VRCImageDownloader#DownloadImage](https://creators.vrchat.com/worlds/udon/image-loading/#downloadimage).
 * @param jobsEmail VRChat's job application email
 * @param minSupportedClientBuildNumber 
 * @param minimumUnityVersionForUploads Minimum Unity version required for uploading assets
 * @param moderationEmail VRChat's moderation related email
 * @param notAllowedToSelectAvatarInPrivateWorldMessage Used in-game to notify a user they aren't allowed to select avatars in private worlds
 * @param offlineAnalysis 
 * @param photonNameserverOverrides Unknown
 * @param photonPublicKeys Unknown
 * @param reportCategories 
 * @param reportFormUrl URL to the report form
 * @param reportOptions 
 * @param reportReasons 
 * @param requireAgeVerificationBetaTag 
 * @param sdkDeveloperFaqUrl Link to the developer FAQ
 * @param sdkDiscordUrl Link to the official VRChat Discord
 * @param sdkNotAllowedToPublishMessage Used in the SDK to notify a user they aren't allowed to upload avatars/worlds yet
 * @param sdkUnityVersion Unity version supported by the SDK
 * @param serverName Server name of the API server currently responding
 * @param stringHostUrlList A list of explicitly allowed origins that worlds can request strings from via the Udon's [VRCStringDownloader.LoadUrl](https://creators.vrchat.com/worlds/udon/string-loading/#ivrcstringdownload).
 * @param supportEmail VRChat's support email
 * @param supportFormUrl VRChat's support form
 * @param timekeeping Unknown
 * @param timeOutWorldId WorldID be \"offline\" on User profiles if you are not friends with that user.
 * @param tutorialWorldId WorldID be \"offline\" on User profiles if you are not friends with that user.
 * @param updateRateMsMaximum Unknown
 * @param updateRateMsMinimum Unknown
 * @param updateRateMsNormal Unknown
 * @param updateRateMsUdonManual Unknown
 * @param uploadAnalysisPercent Unknown
 * @param urlList List of allowed URLs that bypass the \"Allow untrusted URL's\" setting in-game
 * @param useReliableUdpForVoice Unknown
 * @param viveWindowsUrl Download link for game on the Steam website.
 * @param whiteListedAssetUrls List of allowed URLs that are allowed to host avatar assets
 * @param playerUrlResolverVersion Currently used youtube-dl.exe version
 * @param playerUrlResolverSha1 Currently used youtube-dl.exe hash in SHA1-delimited format
 * @param websocketMaxFriendsRefreshDelay Unknown
 * @param websocketQuickReconnectTime Unknown
 * @param websocketReconnectMaxDelay Unknown
 * @param clientNetDispatchThread Unknown
 * @param clientNetInThread Unknown
 * @param clientNetInThread2 Unknown
 * @param clientNetInThreadMobile Unknown
 * @param clientNetInThreadMobile2 Unknown
 * @param clientNetOutThread Unknown
 * @param clientNetOutThread2 Unknown
 * @param clientNetOutThreadMobile Unknown
 * @param clientNetOutThreadMobile2 Unknown
 * @param clientQR Unknown
 * @param currentPrivacyVersion Current version number of the Privacy Agreement
 * @param devLanguageCodes Unknown
 * @param disableAVProInProton Unknown
 * @param disableCaptcha Unknown
 * @param economyPauseEnd Unknown
 * @param economyPauseStart Unknown
 * @param economyState Unknown
 */
@Serializable
data class APIConfig (

    /* Unknown, probably voice optimization testing */
    @SerialName(value = "VoiceEnableDegradation") @Required val voiceEnableDegradation: kotlin.Boolean = false,

    /* Unknown, probably voice optimization testing */
    @SerialName(value = "VoiceEnableReceiverLimiting") @Required val voiceEnableReceiverLimiting: kotlin.Boolean = true,

    @SerialName(value = "accessLogsUrls") @Required val accessLogsUrls: APIConfigAccessLogsUrls,

    /* VRChat's office address */
    @SerialName(value = "address") @Required val address: kotlin.String,

    @SerialName(value = "ageVerificationInviteVisible") @Required val ageVerificationInviteVisible: kotlin.Boolean,

    @SerialName(value = "ageVerificationP") @Required val ageVerificationP: kotlin.Boolean,

    @SerialName(value = "ageVerificationStatusVisible") @Required val ageVerificationStatusVisible: kotlin.Boolean,

    /* Max retries for avatar analysis requests */
    @SerialName(value = "analysisMaxRetries") @Required val analysisMaxRetries: kotlin.Int,

    /* Interval between retries for avatar analysis requests */
    @SerialName(value = "analysisRetryInterval") @Required val analysisRetryInterval: kotlin.Int,

    /* Public Announcements */
    @SerialName(value = "announcements") @Required val announcements: kotlin.collections.Set<APIConfigAnnouncement>,

    /* Unknown */
    @SerialName(value = "analyticsSegment_NewUI_PctOfUsers") @Required val analyticsSegmentNewUIPctOfUsers: kotlin.Int,

    /* Unknown */
    @SerialName(value = "analyticsSegment_NewUI_Salt") @Required val analyticsSegmentNewUISalt: kotlin.String,

    /* Game name */
    @Deprecated(message = "This property is deprecated.")
    @SerialName(value = "appName") @Required val appName: kotlin.String = "VrChat",

    /* List of supported Languages */
    @SerialName(value = "availableLanguageCodes") @Required val availableLanguageCodes: kotlin.collections.List<kotlin.String>,

    /* List of supported Languages */
    @SerialName(value = "availableLanguages") @Required val availableLanguages: kotlin.collections.List<kotlin.String>,

    @SerialName(value = "avatarPerfLimiter") @Required val avatarPerfLimiter: APIConfigAvatarPerfLimiter,

    /* Build tag of the API server */
    @SerialName(value = "buildVersionTag") @Required val buildVersionTag: kotlin.String,

    /* Unknown */
    @SerialName(value = "chatboxLogBufferSeconds") @Required val chatboxLogBufferSeconds: kotlin.Int = 40,

    /* apiKey to be used for all other requests */
    @SerialName(value = "clientApiKey") @Required val clientApiKey: kotlin.String,

    /* Unknown */
    @SerialName(value = "clientBPSCeiling") @Required val clientBPSCeiling: kotlin.Int = 18432,

    /* Unknown */
    @SerialName(value = "clientDisconnectTimeout") @Required val clientDisconnectTimeout: kotlin.Int = 30000,

    /* Unknown */
    @SerialName(value = "clientNetDispatchThreadMobile") @Required val clientNetDispatchThreadMobile: kotlin.Boolean = true,

    /* Unknown */
    @SerialName(value = "clientReservedPlayerBPS") @Required val clientReservedPlayerBPS: kotlin.Int = 7168,

    /* Unknown */
    @SerialName(value = "clientSentCountAllowance") @Required val clientSentCountAllowance: kotlin.Int = 15,

    @SerialName(value = "constants") @Required val constants: APIConfigConstants,

    /* VRChat's contact email */
    @SerialName(value = "contactEmail") @Required val contactEmail: kotlin.String,

    /* VRChat's copyright-issues-related email */
    @SerialName(value = "copyrightEmail") @Required val copyrightEmail: kotlin.String,

    /* Current version number of the Terms of Service */
    @SerialName(value = "currentTOSVersion") @Required val currentTOSVersion: kotlin.Int,

    @SerialName(value = "defaultAvatar") @Required val defaultAvatar: kotlin.String,

    @SerialName(value = "defaultStickerSet") @Required val defaultStickerSet: kotlin.String,

    @SerialName(value = "deploymentGroup") @Required val deploymentGroup: DeploymentGroup = DeploymentGroup.Blue,

    /* Link to download the development SDK, use downloadUrls instead */
    @Deprecated(message = "This property is deprecated.")
    @SerialName(value = "devSdkUrl") @Required val devSdkUrl: kotlin.String,

    /* Version of the development SDK */
    @Deprecated(message = "This property is deprecated.")
    @SerialName(value = "devSdkVersion") @Required val devSdkVersion: kotlin.String,

    /* Unknown, \"dis\" maybe for disconnect? */
    @SerialName(value = "dis-countdown") @Required val disCountdown: kotlinx.datetime.Instant,

    /* Toggles if copying avatars should be disabled */
    @SerialName(value = "disableAvatarCopying") @Required val disableAvatarCopying: kotlin.Boolean = false,

    /* Toggles if avatar gating should be disabled. Avatar gating restricts uploading of avatars to people with the `system_avatar_access` Tag or `admin_avatar_access` Tag */
    @SerialName(value = "disableAvatarGating") @Required val disableAvatarGating: kotlin.Boolean = false,

    /* Toggles if the Community Labs should be disabled */
    @SerialName(value = "disableCommunityLabs") @Required val disableCommunityLabs: kotlin.Boolean = false,

    /* Toggles if promotion out of Community Labs should be disabled */
    @SerialName(value = "disableCommunityLabsPromotion") @Required val disableCommunityLabsPromotion: kotlin.Boolean = false,

    /* Unknown */
    @SerialName(value = "disableEmail") @Required val disableEmail: kotlin.Boolean = false,

    /* Toggles if Analytics should be disabled. */
    @SerialName(value = "disableEventStream") @Required val disableEventStream: kotlin.Boolean = false,

    /* Toggles if feedback gating should be disabled. Feedback gating restricts submission of feedback (reporting a World or User) to people with the `system_feedback_access` Tag. */
    @SerialName(value = "disableFeedbackGating") @Required val disableFeedbackGating: kotlin.Boolean = false,

    /* Unknown, probably toggles compilation of frontend web builds? So internal flag? */
    @SerialName(value = "disableFrontendBuilds") @Required val disableFrontendBuilds: kotlin.Boolean = false,

    /* Toggles if gift drops should be disabled */
    @SerialName(value = "disableGiftDrops") @Required val disableGiftDrops: kotlin.Boolean = false,

    /* Unknown */
    @SerialName(value = "disableHello") @Required val disableHello: kotlin.Boolean = false,

    /* Toggles if signing up for Subscriptions in Oculus is disabled or not. */
    @SerialName(value = "disableOculusSubs") @Required val disableOculusSubs: kotlin.Boolean = false,

    /* Toggles if new user account registration should be disabled. */
    @SerialName(value = "disableRegistration") @Required val disableRegistration: kotlin.Boolean = false,

    /* Toggles if Steam Networking should be disabled. VRChat these days uses Photon Unity Networking (PUN) instead. */
    @SerialName(value = "disableSteamNetworking") @Required val disableSteamNetworking: kotlin.Boolean = true,

    /* Toggles if 2FA should be disabled. */
    @Deprecated(message = "This property is deprecated.")
    @SerialName(value = "disableTwoFactorAuth") @Required val disableTwoFactorAuth: kotlin.Boolean = false,

    /* Toggles if Udon should be universally disabled in-game. */
    @SerialName(value = "disableUdon") @Required val disableUdon: kotlin.Boolean = false,

    /* Toggles if account upgrading \"linking with Steam/Oculus\" should be disabled. */
    @SerialName(value = "disableUpgradeAccount") @Required val disableUpgradeAccount: kotlin.Boolean = false,

    /* Download link for game on the Oculus Rift website. */
    @SerialName(value = "downloadLinkWindows") @Required val downloadLinkWindows: kotlin.String,

    @SerialName(value = "downloadUrls") @Required val downloadUrls: APIConfigDownloadURLList,

    /* Array of DynamicWorldRow objects, used by the game to display the list of world rows */
    @SerialName(value = "dynamicWorldRows") @Required val dynamicWorldRows: kotlin.collections.Set<DynamicContentRow>,

    @SerialName(value = "events") @Required val events: APIConfigEvents,

    /* Unknown */
    @SerialName(value = "forceUseLatestWorld") @Required val forceUseLatestWorld: kotlin.Boolean = true,

    /* Display type of gifts */
    @SerialName(value = "giftDisplayType") @Required val giftDisplayType: kotlin.String,

    /* Unknown */
    @SerialName(value = "googleApiClientId") @Required val googleApiClientId: kotlin.String = "827942544393-r2ouvckvouldn9dg9uruseje575e878f.apps.googleusercontent.com",

    /* WorldID be \"offline\" on User profiles if you are not friends with that user. */
    @SerialName(value = "homeWorldId") @Required val homeWorldId: kotlin.String,

    /* Redirect target if you try to open the base API domain in your browser */
    @SerialName(value = "homepageRedirectTarget") @Required val homepageRedirectTarget: kotlin.String = "https://hello.vrchat.com",

    /* WorldID be \"offline\" on User profiles if you are not friends with that user. */
    @SerialName(value = "hubWorldId") @Required val hubWorldId: kotlin.String,

    /* A list of explicitly allowed origins that worlds can request images from via the Udon's [VRCImageDownloader#DownloadImage](https://creators.vrchat.com/worlds/udon/image-loading/#downloadimage). */
    @SerialName(value = "imageHostUrlList") @Required val imageHostUrlList: kotlin.collections.List<kotlin.String>,

    /* VRChat's job application email */
    @SerialName(value = "jobsEmail") @Required val jobsEmail: kotlin.String,

    @SerialName(value = "minSupportedClientBuildNumber") @Required val minSupportedClientBuildNumber: APIConfigMinSupportedClientBuildNumber,

    /* Minimum Unity version required for uploading assets */
    @SerialName(value = "minimumUnityVersionForUploads") @Required val minimumUnityVersionForUploads: kotlin.String = "2019.0.0f1",

    /* VRChat's moderation related email */
    @SerialName(value = "moderationEmail") @Required val moderationEmail: kotlin.String,

    /* Used in-game to notify a user they aren't allowed to select avatars in private worlds */
    @SerialName(value = "notAllowedToSelectAvatarInPrivateWorldMessage") @Required val notAllowedToSelectAvatarInPrivateWorldMessage: kotlin.String,

    @SerialName(value = "offlineAnalysis") @Required val offlineAnalysis: APIConfigOfflineAnalysis,

    /* Unknown */
    @SerialName(value = "photonNameserverOverrides") @Required val photonNameserverOverrides: kotlin.collections.List<kotlin.String>,

    /* Unknown */
    @SerialName(value = "photonPublicKeys") @Required val photonPublicKeys: kotlin.collections.List<kotlin.String>,

    @SerialName(value = "reportCategories") @Required val reportCategories: APIConfigReportCategories,

    /* URL to the report form */
    @SerialName(value = "reportFormUrl") @Required val reportFormUrl: kotlin.String = "https://help.vrchat.com/hc/en-us/requests/new?ticket_form_id=1500000182242&tf_360056455174=user_report&tf_360057451993={userId}&tf_1500001445142={reportedId}&tf_subject={reason} {category} By {contentType} {reportedName}&tf_description={description}",

    @SerialName(value = "reportOptions") @Required val reportOptions: APIConfigReportOptions,

    @SerialName(value = "reportReasons") @Required val reportReasons: APIConfigReportReasons,

    @SerialName(value = "requireAgeVerificationBetaTag") @Required val requireAgeVerificationBetaTag: kotlin.Boolean,

    /* Link to the developer FAQ */
    @SerialName(value = "sdkDeveloperFaqUrl") @Required val sdkDeveloperFaqUrl: kotlin.String,

    /* Link to the official VRChat Discord */
    @SerialName(value = "sdkDiscordUrl") @Required val sdkDiscordUrl: kotlin.String,

    /* Used in the SDK to notify a user they aren't allowed to upload avatars/worlds yet */
    @SerialName(value = "sdkNotAllowedToPublishMessage") @Required val sdkNotAllowedToPublishMessage: kotlin.String,

    /* Unity version supported by the SDK */
    @SerialName(value = "sdkUnityVersion") @Required val sdkUnityVersion: kotlin.String,

    /* Server name of the API server currently responding */
    @SerialName(value = "serverName") @Required val serverName: kotlin.String,

    /* A list of explicitly allowed origins that worlds can request strings from via the Udon's [VRCStringDownloader.LoadUrl](https://creators.vrchat.com/worlds/udon/string-loading/#ivrcstringdownload). */
    @SerialName(value = "stringHostUrlList") @Required val stringHostUrlList: kotlin.collections.List<kotlin.String>,

    /* VRChat's support email */
    @SerialName(value = "supportEmail") @Required val supportEmail: kotlin.String,

    /* VRChat's support form */
    @SerialName(value = "supportFormUrl") @Required val supportFormUrl: kotlin.String,

    /* Unknown */
    @SerialName(value = "timekeeping") @Required val timekeeping: kotlin.Boolean = true,

    /* WorldID be \"offline\" on User profiles if you are not friends with that user. */
    @SerialName(value = "timeOutWorldId") @Required val timeOutWorldId: kotlin.String,

    /* WorldID be \"offline\" on User profiles if you are not friends with that user. */
    @SerialName(value = "tutorialWorldId") @Required val tutorialWorldId: kotlin.String,

    /* Unknown */
    @SerialName(value = "updateRateMsMaximum") @Required val updateRateMsMaximum: kotlin.Int,

    /* Unknown */
    @SerialName(value = "updateRateMsMinimum") @Required val updateRateMsMinimum: kotlin.Int,

    /* Unknown */
    @SerialName(value = "updateRateMsNormal") @Required val updateRateMsNormal: kotlin.Int,

    /* Unknown */
    @SerialName(value = "updateRateMsUdonManual") @Required val updateRateMsUdonManual: kotlin.Int,

    /* Unknown */
    @SerialName(value = "uploadAnalysisPercent") @Required val uploadAnalysisPercent: kotlin.Int,

    /* List of allowed URLs that bypass the \"Allow untrusted URL's\" setting in-game */
    @SerialName(value = "urlList") @Required val urlList: kotlin.collections.List<kotlin.String>,

    /* Unknown */
    @SerialName(value = "useReliableUdpForVoice") @Required val useReliableUdpForVoice: kotlin.Boolean = false,

    /* Download link for game on the Steam website. */
    @SerialName(value = "viveWindowsUrl") @Required val viveWindowsUrl: kotlin.String,

    /* List of allowed URLs that are allowed to host avatar assets */
    @SerialName(value = "whiteListedAssetUrls") @Required val whiteListedAssetUrls: kotlin.collections.List<kotlin.String>,

    /* Currently used youtube-dl.exe version */
    @SerialName(value = "player-url-resolver-version") @Required val playerUrlResolverVersion: kotlin.String,

    /* Currently used youtube-dl.exe hash in SHA1-delimited format */
    @SerialName(value = "player-url-resolver-sha1") @Required val playerUrlResolverSha1: kotlin.String,

    /* Unknown */
    @SerialName(value = "websocketMaxFriendsRefreshDelay") @Required val websocketMaxFriendsRefreshDelay: kotlin.Int = 900,

    /* Unknown */
    @SerialName(value = "websocketQuickReconnectTime") @Required val websocketQuickReconnectTime: kotlin.Int = 2,

    /* Unknown */
    @SerialName(value = "websocketReconnectMaxDelay") @Required val websocketReconnectMaxDelay: kotlin.Int = 2,

    /* Unknown */
    @SerialName(value = "clientNetDispatchThread") val clientNetDispatchThread: kotlin.Boolean? = false,

    /* Unknown */
    @SerialName(value = "clientNetInThread") val clientNetInThread: kotlin.Boolean? = false,

    /* Unknown */
    @SerialName(value = "clientNetInThread2") val clientNetInThread2: kotlin.Boolean? = false,

    /* Unknown */
    @SerialName(value = "clientNetInThreadMobile") val clientNetInThreadMobile: kotlin.Boolean? = false,

    /* Unknown */
    @SerialName(value = "clientNetInThreadMobile2") val clientNetInThreadMobile2: kotlin.Boolean? = false,

    /* Unknown */
    @SerialName(value = "clientNetOutThread") val clientNetOutThread: kotlin.Boolean? = false,

    /* Unknown */
    @SerialName(value = "clientNetOutThread2") val clientNetOutThread2: kotlin.Boolean? = false,

    /* Unknown */
    @SerialName(value = "clientNetOutThreadMobile") val clientNetOutThreadMobile: kotlin.Boolean? = false,

    /* Unknown */
    @SerialName(value = "clientNetOutThreadMobile2") val clientNetOutThreadMobile2: kotlin.Boolean? = false,

    /* Unknown */
    @SerialName(value = "clientQR") val clientQR: kotlin.Int? = 1,

    /* Current version number of the Privacy Agreement */
    @SerialName(value = "currentPrivacyVersion") val currentPrivacyVersion: kotlin.Int? = 1,

    /* Unknown */
    @SerialName(value = "devLanguageCodes") val devLanguageCodes: kotlin.collections.List<kotlin.String>? = null,

    /* Unknown */
    @SerialName(value = "disableAVProInProton") val disableAVProInProton: kotlin.Boolean? = false,

    /* Unknown */
    @SerialName(value = "disableCaptcha") val disableCaptcha: kotlin.Boolean? = true,

    /* Unknown */
    @SerialName(value = "economyPauseEnd") val economyPauseEnd: kotlin.String? = null,

    /* Unknown */
    @SerialName(value = "economyPauseStart") val economyPauseStart: kotlin.String? = null,

    /* Unknown */
    @SerialName(value = "economyState") val economyState: kotlin.Int? = 1

)

