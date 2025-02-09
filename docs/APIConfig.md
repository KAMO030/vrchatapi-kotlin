
# APIConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**voiceEnableDegradation** | **kotlin.Boolean** | Unknown, probably voice optimization testing | 
**voiceEnableReceiverLimiting** | **kotlin.Boolean** | Unknown, probably voice optimization testing | 
**accessLogsUrls** | [**APIConfigAccessLogsUrls**](APIConfigAccessLogsUrls.md) |  | 
**address** | **kotlin.String** | VRChat&#39;s office address | 
**ageVerificationInviteVisible** | **kotlin.Boolean** |  | 
**ageVerificationP** | **kotlin.Boolean** |  | 
**ageVerificationStatusVisible** | **kotlin.Boolean** |  | 
**analysisMaxRetries** | **kotlin.Int** | Max retries for avatar analysis requests | 
**analysisRetryInterval** | **kotlin.Int** | Interval between retries for avatar analysis requests | 
**announcements** | [**kotlin.collections.Set&lt;APIConfigAnnouncement&gt;**](APIConfigAnnouncement.md) | Public Announcements | 
**analyticsSegmentNewUIPctOfUsers** | **kotlin.Int** | Unknown | 
**analyticsSegmentNewUISalt** | **kotlin.String** | Unknown | 
**appName** | **kotlin.String** | Game name | 
**availableLanguageCodes** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of supported Languages | 
**availableLanguages** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of supported Languages | 
**avatarPerfLimiter** | [**APIConfigAvatarPerfLimiter**](APIConfigAvatarPerfLimiter.md) |  | 
**buildVersionTag** | **kotlin.String** | Build tag of the API server | 
**chatboxLogBufferSeconds** | **kotlin.Int** | Unknown | 
**clientApiKey** | **kotlin.String** | apiKey to be used for all other requests | 
**clientBPSCeiling** | **kotlin.Int** | Unknown | 
**clientDisconnectTimeout** | **kotlin.Int** | Unknown | 
**clientNetDispatchThreadMobile** | **kotlin.Boolean** | Unknown | 
**clientReservedPlayerBPS** | **kotlin.Int** | Unknown | 
**clientSentCountAllowance** | **kotlin.Int** | Unknown | 
**constants** | [**APIConfigConstants**](APIConfigConstants.md) |  | 
**contactEmail** | **kotlin.String** | VRChat&#39;s contact email | 
**copyrightEmail** | **kotlin.String** | VRChat&#39;s copyright-issues-related email | 
**currentTOSVersion** | **kotlin.Int** | Current version number of the Terms of Service | 
**defaultAvatar** | **kotlin.String** |  | 
**defaultStickerSet** | **kotlin.String** |  | 
**deploymentGroup** | [**DeploymentGroup**](DeploymentGroup.md) |  | 
**devSdkUrl** | **kotlin.String** | Link to download the development SDK, use downloadUrls instead | 
**devSdkVersion** | **kotlin.String** | Version of the development SDK | 
**disCountdown** | **kotlin.String** | Unknown, \&quot;dis\&quot; maybe for disconnect? | 
**disableAvatarCopying** | **kotlin.Boolean** | Toggles if copying avatars should be disabled | 
**disableAvatarGating** | **kotlin.Boolean** | Toggles if avatar gating should be disabled. Avatar gating restricts uploading of avatars to people with the &#x60;system_avatar_access&#x60; Tag or &#x60;admin_avatar_access&#x60; Tag | 
**disableCommunityLabs** | **kotlin.Boolean** | Toggles if the Community Labs should be disabled | 
**disableCommunityLabsPromotion** | **kotlin.Boolean** | Toggles if promotion out of Community Labs should be disabled | 
**disableEmail** | **kotlin.Boolean** | Unknown | 
**disableEventStream** | **kotlin.Boolean** | Toggles if Analytics should be disabled. | 
**disableFeedbackGating** | **kotlin.Boolean** | Toggles if feedback gating should be disabled. Feedback gating restricts submission of feedback (reporting a World or User) to people with the &#x60;system_feedback_access&#x60; Tag. | 
**disableFrontendBuilds** | **kotlin.Boolean** | Unknown, probably toggles compilation of frontend web builds? So internal flag? | 
**disableGiftDrops** | **kotlin.Boolean** | Toggles if gift drops should be disabled | 
**disableHello** | **kotlin.Boolean** | Unknown | 
**disableOculusSubs** | **kotlin.Boolean** | Toggles if signing up for Subscriptions in Oculus is disabled or not. | 
**disableRegistration** | **kotlin.Boolean** | Toggles if new user account registration should be disabled. | 
**disableSteamNetworking** | **kotlin.Boolean** | Toggles if Steam Networking should be disabled. VRChat these days uses Photon Unity Networking (PUN) instead. | 
**disableTwoFactorAuth** | **kotlin.Boolean** | Toggles if 2FA should be disabled. | 
**disableUdon** | **kotlin.Boolean** | Toggles if Udon should be universally disabled in-game. | 
**disableUpgradeAccount** | **kotlin.Boolean** | Toggles if account upgrading \&quot;linking with Steam/Oculus\&quot; should be disabled. | 
**downloadLinkWindows** | **kotlin.String** | Download link for game on the Oculus Rift website. | 
**downloadUrls** | [**APIConfigDownloadURLList**](APIConfigDownloadURLList.md) |  | 
**dynamicWorldRows** | [**kotlin.collections.Set&lt;DynamicContentRow&gt;**](DynamicContentRow.md) | Array of DynamicWorldRow objects, used by the game to display the list of world rows | 
**events** | [**APIConfigEvents**](APIConfigEvents.md) |  | 
**forceUseLatestWorld** | **kotlin.Boolean** | Unknown | 
**giftDisplayType** | **kotlin.String** | Display type of gifts | 
**googleApiClientId** | **kotlin.String** | Unknown | 
**homeWorldId** | **kotlin.String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. | 
**homepageRedirectTarget** | **kotlin.String** | Redirect target if you try to open the base API domain in your browser | 
**hubWorldId** | **kotlin.String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. | 
**imageHostUrlList** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of explicitly allowed origins that worlds can request images from via the Udon&#39;s [VRCImageDownloader#DownloadImage](https://creators.vrchat.com/worlds/udon/image-loading/#downloadimage). | 
**jobsEmail** | **kotlin.String** | VRChat&#39;s job application email | 
**minSupportedClientBuildNumber** | [**APIConfigMinSupportedClientBuildNumber**](APIConfigMinSupportedClientBuildNumber.md) |  | 
**minimumUnityVersionForUploads** | **kotlin.String** | Minimum Unity version required for uploading assets | 
**moderationEmail** | **kotlin.String** | VRChat&#39;s moderation related email | 
**notAllowedToSelectAvatarInPrivateWorldMessage** | **kotlin.String** | Used in-game to notify a user they aren&#39;t allowed to select avatars in private worlds | 
**offlineAnalysis** | [**APIConfigOfflineAnalysis**](APIConfigOfflineAnalysis.md) |  | 
**photonNameserverOverrides** | **kotlin.collections.List&lt;kotlin.String&gt;** | Unknown | 
**photonPublicKeys** | **kotlin.collections.List&lt;kotlin.String&gt;** | Unknown | 
**reportCategories** | [**APIConfigReportCategories**](APIConfigReportCategories.md) |  | 
**reportFormUrl** | **kotlin.String** | URL to the report form | 
**reportOptions** | [**APIConfigReportOptions**](APIConfigReportOptions.md) |  | 
**reportReasons** | [**APIConfigReportReasons**](APIConfigReportReasons.md) |  | 
**requireAgeVerificationBetaTag** | **kotlin.Boolean** |  | 
**sdkDeveloperFaqUrl** | **kotlin.String** | Link to the developer FAQ | 
**sdkDiscordUrl** | **kotlin.String** | Link to the official VRChat Discord | 
**sdkNotAllowedToPublishMessage** | **kotlin.String** | Used in the SDK to notify a user they aren&#39;t allowed to upload avatars/worlds yet | 
**sdkUnityVersion** | **kotlin.String** | Unity version supported by the SDK | 
**serverName** | **kotlin.String** | Server name of the API server currently responding | 
**stringHostUrlList** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of explicitly allowed origins that worlds can request strings from via the Udon&#39;s [VRCStringDownloader.LoadUrl](https://creators.vrchat.com/worlds/udon/string-loading/#ivrcstringdownload). | 
**supportEmail** | **kotlin.String** | VRChat&#39;s support email | 
**supportFormUrl** | **kotlin.String** | VRChat&#39;s support form | 
**timekeeping** | **kotlin.Boolean** | Unknown | 
**timeOutWorldId** | **kotlin.String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. | 
**tutorialWorldId** | **kotlin.String** | WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user. | 
**updateRateMsMaximum** | **kotlin.Int** | Unknown | 
**updateRateMsMinimum** | **kotlin.Int** | Unknown | 
**updateRateMsNormal** | **kotlin.Int** | Unknown | 
**updateRateMsUdonManual** | **kotlin.Int** | Unknown | 
**uploadAnalysisPercent** | **kotlin.Int** | Unknown | 
**urlList** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of allowed URLs that bypass the \&quot;Allow untrusted URL&#39;s\&quot; setting in-game | 
**useReliableUdpForVoice** | **kotlin.Boolean** | Unknown | 
**viveWindowsUrl** | **kotlin.String** | Download link for game on the Steam website. | 
**whiteListedAssetUrls** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of allowed URLs that are allowed to host avatar assets | 
**playerUrlResolverVersion** | **kotlin.String** | Currently used youtube-dl.exe version | 
**playerUrlResolverSha1** | **kotlin.String** | Currently used youtube-dl.exe hash in SHA1-delimited format | 
**websocketMaxFriendsRefreshDelay** | **kotlin.Int** | Unknown | 
**websocketQuickReconnectTime** | **kotlin.Int** | Unknown | 
**websocketReconnectMaxDelay** | **kotlin.Int** | Unknown | 
**clientNetDispatchThread** | **kotlin.Boolean** | Unknown |  [optional]
**clientNetInThread** | **kotlin.Boolean** | Unknown |  [optional]
**clientNetInThread2** | **kotlin.Boolean** | Unknown |  [optional]
**clientNetInThreadMobile** | **kotlin.Boolean** | Unknown |  [optional]
**clientNetInThreadMobile2** | **kotlin.Boolean** | Unknown |  [optional]
**clientNetOutThread** | **kotlin.Boolean** | Unknown |  [optional]
**clientNetOutThread2** | **kotlin.Boolean** | Unknown |  [optional]
**clientNetOutThreadMobile** | **kotlin.Boolean** | Unknown |  [optional]
**clientNetOutThreadMobile2** | **kotlin.Boolean** | Unknown |  [optional]
**clientQR** | **kotlin.Int** | Unknown |  [optional]
**currentPrivacyVersion** | **kotlin.Int** | Current version number of the Privacy Agreement |  [optional]
**devLanguageCodes** | **kotlin.collections.List&lt;kotlin.String&gt;** | Unknown |  [optional]
**disableAVProInProton** | **kotlin.Boolean** | Unknown |  [optional]
**disableCaptcha** | **kotlin.Boolean** | Unknown |  [optional]
**economyPauseEnd** | **kotlin.String** | Unknown |  [optional]
**economyPauseStart** | **kotlin.String** | Unknown |  [optional]
**economyState** | **kotlin.Int** | Unknown |  [optional]



