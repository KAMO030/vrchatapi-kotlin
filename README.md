# io.github.vrchatapi - Kotlin client library for VRChat API Documentation

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.vrchat.cloud/api/1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationApi* | [**checkUserExists**](docs/AuthenticationApi.md#checkuserexists) | **GET** /auth/exists | Check User Exists
*AuthenticationApi* | [**deleteUser**](docs/AuthenticationApi.md#deleteuser) | **PUT** /users/{userId}/delete | Delete User
*AuthenticationApi* | [**getCurrentUser**](docs/AuthenticationApi.md#getcurrentuser) | **GET** /auth/user | Login and/or Get Current User Info
*AuthenticationApi* | [**logout**](docs/AuthenticationApi.md#logout) | **PUT** /logout | Logout
*AuthenticationApi* | [**verify2FA**](docs/AuthenticationApi.md#verify2fa) | **POST** /auth/twofactorauth/totp/verify | Verify 2FA code
*AuthenticationApi* | [**verify2FAEmailCode**](docs/AuthenticationApi.md#verify2faemailcode) | **POST** /auth/twofactorauth/emailotp/verify | Verify 2FA email code
*AuthenticationApi* | [**verifyAuthToken**](docs/AuthenticationApi.md#verifyauthtoken) | **GET** /auth | Verify Auth Token
*AuthenticationApi* | [**verifyRecoveryCode**](docs/AuthenticationApi.md#verifyrecoverycode) | **POST** /auth/twofactorauth/otp/verify | Verify 2FA code with Recovery code
*AvatarsApi* | [**createAvatar**](docs/AvatarsApi.md#createavatar) | **POST** /avatars | Create Avatar
*AvatarsApi* | [**deleteAvatar**](docs/AvatarsApi.md#deleteavatar) | **DELETE** /avatars/{avatarId} | Delete Avatar
*AvatarsApi* | [**getAvatar**](docs/AvatarsApi.md#getavatar) | **GET** /avatars/{avatarId} | Get Avatar
*AvatarsApi* | [**getFavoritedAvatars**](docs/AvatarsApi.md#getfavoritedavatars) | **GET** /avatars/favorites | List Favorited Avatars
*AvatarsApi* | [**getOwnAvatar**](docs/AvatarsApi.md#getownavatar) | **GET** /users/{userId}/avatar | Get Own Avatar
*AvatarsApi* | [**searchAvatars**](docs/AvatarsApi.md#searchavatars) | **GET** /avatars | Search Avatars
*AvatarsApi* | [**selectAvatar**](docs/AvatarsApi.md#selectavatar) | **PUT** /avatars/{avatarId}/select | Select Avatar
*AvatarsApi* | [**selectFallbackAvatar**](docs/AvatarsApi.md#selectfallbackavatar) | **PUT** /avatars/{avatarId}/selectFallback | Select Fallback Avatar
*AvatarsApi* | [**updateAvatar**](docs/AvatarsApi.md#updateavatar) | **PUT** /avatars/{avatarId} | Update Avatar
*EconomyApi* | [**getBalance**](docs/EconomyApi.md#getbalance) | **GET** /user/{userId}/balance | Get Balance
*EconomyApi* | [**getCurrentSubscriptions**](docs/EconomyApi.md#getcurrentsubscriptions) | **GET** /auth/user/subscription | Get Current Subscriptions
*EconomyApi* | [**getLicenseGroup**](docs/EconomyApi.md#getlicensegroup) | **GET** /licenseGroups/{licenseGroupId} | Get License Group
*EconomyApi* | [**getProductListing**](docs/EconomyApi.md#getproductlisting) | **GET** /listing/{productId} | Get Product Listing
*EconomyApi* | [**getProductListings**](docs/EconomyApi.md#getproductlistings) | **GET** /user/{userId}/listings | Get User Product Listings
*EconomyApi* | [**getSteamTransaction**](docs/EconomyApi.md#getsteamtransaction) | **GET** /Steam/transactions/{transactionId} | Get Steam Transaction
*EconomyApi* | [**getSteamTransactions**](docs/EconomyApi.md#getsteamtransactions) | **GET** /Steam/transactions | List Steam Transactions
*EconomyApi* | [**getSubscriptions**](docs/EconomyApi.md#getsubscriptions) | **GET** /subscriptions | List Subscriptions
*EconomyApi* | [**getTiliaStatus**](docs/EconomyApi.md#gettiliastatus) | **GET** /tilia/status | Get Tilia Status
*EconomyApi* | [**getTiliaTos**](docs/EconomyApi.md#gettiliatos) | **GET** /user/{userId}/tilia/tos | Get Tilia TOS Agreement Status
*EconomyApi* | [**getTokenBundles**](docs/EconomyApi.md#gettokenbundles) | **GET** /tokenBundles | List Token Bundles
*FavoritesApi* | [**addFavorite**](docs/FavoritesApi.md#addfavorite) | **POST** /favorites | Add Favorite
*FavoritesApi* | [**clearFavoriteGroup**](docs/FavoritesApi.md#clearfavoritegroup) | **DELETE** /favorite/group/{favoriteGroupType}/{favoriteGroupName}/{userId} | Clear Favorite Group
*FavoritesApi* | [**getFavorite**](docs/FavoritesApi.md#getfavorite) | **GET** /favorites/{favoriteId} | Show Favorite
*FavoritesApi* | [**getFavoriteGroup**](docs/FavoritesApi.md#getfavoritegroup) | **GET** /favorite/group/{favoriteGroupType}/{favoriteGroupName}/{userId} | Show Favorite Group
*FavoritesApi* | [**getFavoriteGroups**](docs/FavoritesApi.md#getfavoritegroups) | **GET** /favorite/groups | List Favorite Groups
*FavoritesApi* | [**getFavoriteLimits**](docs/FavoritesApi.md#getfavoritelimits) | **GET** /auth/user/favoritelimits | Get Favorite Limits
*FavoritesApi* | [**getFavorites**](docs/FavoritesApi.md#getfavorites) | **GET** /favorites | List Favorites
*FavoritesApi* | [**removeFavorite**](docs/FavoritesApi.md#removefavorite) | **DELETE** /favorites/{favoriteId} | Remove Favorite
*FavoritesApi* | [**updateFavoriteGroup**](docs/FavoritesApi.md#updatefavoritegroup) | **PUT** /favorite/group/{favoriteGroupType}/{favoriteGroupName}/{userId} | Update Favorite Group
*FilesApi* | [**createFile**](docs/FilesApi.md#createfile) | **POST** /file | Create File
*FilesApi* | [**createFileVersion**](docs/FilesApi.md#createfileversion) | **POST** /file/{fileId} | Create File Version
*FilesApi* | [**deleteFile**](docs/FilesApi.md#deletefile) | **DELETE** /file/{fileId} | Delete File
*FilesApi* | [**deleteFileVersion**](docs/FilesApi.md#deletefileversion) | **DELETE** /file/{fileId}/{versionId} | Delete File Version
*FilesApi* | [**downloadFileVersion**](docs/FilesApi.md#downloadfileversion) | **GET** /file/{fileId}/{versionId} | Download File Version
*FilesApi* | [**finishFileDataUpload**](docs/FilesApi.md#finishfiledataupload) | **PUT** /file/{fileId}/{versionId}/{fileType}/finish | Finish FileData Upload
*FilesApi* | [**getFile**](docs/FilesApi.md#getfile) | **GET** /file/{fileId} | Show File
*FilesApi* | [**getFileAnalysis**](docs/FilesApi.md#getfileanalysis) | **GET** /analysis/{fileId}/{versionId} | Get File Version Analysis
*FilesApi* | [**getFileAnalysisSecurity**](docs/FilesApi.md#getfileanalysissecurity) | **GET** /analysis/{fileId}/{versionId}/security | Get File Version Analysis Security
*FilesApi* | [**getFileAnalysisStandard**](docs/FilesApi.md#getfileanalysisstandard) | **GET** /analysis/{fileId}/{versionId}/standard | Get File Version Analysis Standard
*FilesApi* | [**getFileDataUploadStatus**](docs/FilesApi.md#getfiledatauploadstatus) | **GET** /file/{fileId}/{versionId}/{fileType}/status | Check FileData Upload Status
*FilesApi* | [**getFiles**](docs/FilesApi.md#getfiles) | **GET** /files | List Files
*FilesApi* | [**startFileDataUpload**](docs/FilesApi.md#startfiledataupload) | **PUT** /file/{fileId}/{versionId}/{fileType}/start | Start FileData Upload
*FriendsApi* | [**deleteFriendRequest**](docs/FriendsApi.md#deletefriendrequest) | **DELETE** /user/{userId}/friendRequest | Delete Friend Request
*FriendsApi* | [**friend**](docs/FriendsApi.md#friend) | **POST** /user/{userId}/friendRequest | Send Friend Request
*FriendsApi* | [**getFriendStatus**](docs/FriendsApi.md#getfriendstatus) | **GET** /user/{userId}/friendStatus | Check Friend Status
*FriendsApi* | [**getFriends**](docs/FriendsApi.md#getfriends) | **GET** /auth/user/friends | List Friends
*FriendsApi* | [**unfriend**](docs/FriendsApi.md#unfriend) | **DELETE** /auth/user/friends/{userId} | Unfriend
*GroupsApi* | [**addGroupGalleryImage**](docs/GroupsApi.md#addgroupgalleryimage) | **POST** /groups/{groupId}/galleries/{groupGalleryId}/images | Add Group Gallery Image
*GroupsApi* | [**addGroupMemberRole**](docs/GroupsApi.md#addgroupmemberrole) | **PUT** /groups/{groupId}/members/{userId}/roles/{groupRoleId} | Add Role to GroupMember
*GroupsApi* | [**addGroupPost**](docs/GroupsApi.md#addgrouppost) | **POST** /groups/{groupId}/posts | Create a post in a Group
*GroupsApi* | [**banGroupMember**](docs/GroupsApi.md#bangroupmember) | **POST** /groups/{groupId}/bans | Ban Group Member
*GroupsApi* | [**cancelGroupRequest**](docs/GroupsApi.md#cancelgrouprequest) | **DELETE** /groups/{groupId}/requests | Cancel Group Join Request
*GroupsApi* | [**createGroup**](docs/GroupsApi.md#creategroup) | **POST** /groups | Create Group
*GroupsApi* | [**createGroupAnnouncement**](docs/GroupsApi.md#creategroupannouncement) | **POST** /groups/{groupId}/announcement | Create Group Announcement
*GroupsApi* | [**createGroupGallery**](docs/GroupsApi.md#creategroupgallery) | **POST** /groups/{groupId}/galleries | Create Group Gallery
*GroupsApi* | [**createGroupInvite**](docs/GroupsApi.md#creategroupinvite) | **POST** /groups/{groupId}/invites | Invite User to Group
*GroupsApi* | [**createGroupRole**](docs/GroupsApi.md#creategrouprole) | **POST** /groups/{groupId}/roles | Create GroupRole
*GroupsApi* | [**deleteGroup**](docs/GroupsApi.md#deletegroup) | **DELETE** /groups/{groupId} | Delete Group
*GroupsApi* | [**deleteGroupAnnouncement**](docs/GroupsApi.md#deletegroupannouncement) | **DELETE** /groups/{groupId}/announcement | Delete Group Announcement
*GroupsApi* | [**deleteGroupGallery**](docs/GroupsApi.md#deletegroupgallery) | **DELETE** /groups/{groupId}/galleries/{groupGalleryId} | Delete Group Gallery
*GroupsApi* | [**deleteGroupGalleryImage**](docs/GroupsApi.md#deletegroupgalleryimage) | **DELETE** /groups/{groupId}/galleries/{groupGalleryId}/images/{groupGalleryImageId} | Delete Group Gallery Image
*GroupsApi* | [**deleteGroupInvite**](docs/GroupsApi.md#deletegroupinvite) | **DELETE** /groups/{groupId}/invites/{userId} | Delete User Invite
*GroupsApi* | [**deleteGroupPost**](docs/GroupsApi.md#deletegrouppost) | **DELETE** /groups/{groupId}/posts/{notificationId} | Delete a Group post
*GroupsApi* | [**deleteGroupRole**](docs/GroupsApi.md#deletegrouprole) | **DELETE** /groups/{groupId}/roles/{groupRoleId} | Delete Group Role
*GroupsApi* | [**getGroup**](docs/GroupsApi.md#getgroup) | **GET** /groups/{groupId} | Get Group by ID
*GroupsApi* | [**getGroupAnnouncements**](docs/GroupsApi.md#getgroupannouncements) | **GET** /groups/{groupId}/announcement | Get Group Announcement
*GroupsApi* | [**getGroupAuditLogs**](docs/GroupsApi.md#getgroupauditlogs) | **GET** /groups/{groupId}/auditLogs | Get Group Audit Logs
*GroupsApi* | [**getGroupBans**](docs/GroupsApi.md#getgroupbans) | **GET** /groups/{groupId}/bans | Get Group Bans
*GroupsApi* | [**getGroupGalleryImages**](docs/GroupsApi.md#getgroupgalleryimages) | **GET** /groups/{groupId}/galleries/{groupGalleryId} | Get Group Gallery Images
*GroupsApi* | [**getGroupInstances**](docs/GroupsApi.md#getgroupinstances) | **GET** /groups/{groupId}/instances | Get Group Instances
*GroupsApi* | [**getGroupInvites**](docs/GroupsApi.md#getgroupinvites) | **GET** /groups/{groupId}/invites | Get Group Invites Sent
*GroupsApi* | [**getGroupMember**](docs/GroupsApi.md#getgroupmember) | **GET** /groups/{groupId}/members/{userId} | Get Group Member
*GroupsApi* | [**getGroupMembers**](docs/GroupsApi.md#getgroupmembers) | **GET** /groups/{groupId}/members | List Group Members
*GroupsApi* | [**getGroupPermissions**](docs/GroupsApi.md#getgrouppermissions) | **GET** /groups/{groupId}/permissions | List Group Permissions
*GroupsApi* | [**getGroupPost**](docs/GroupsApi.md#getgrouppost) | **GET** /groups/{groupId}/posts | Get posts from a Group
*GroupsApi* | [**getGroupRequests**](docs/GroupsApi.md#getgrouprequests) | **GET** /groups/{groupId}/requests | Get Group Join Requests
*GroupsApi* | [**getGroupRoles**](docs/GroupsApi.md#getgrouproles) | **GET** /groups/{groupId}/roles | Get Group Roles
*GroupsApi* | [**joinGroup**](docs/GroupsApi.md#joingroup) | **POST** /groups/{groupId}/join | Join Group
*GroupsApi* | [**kickGroupMember**](docs/GroupsApi.md#kickgroupmember) | **DELETE** /groups/{groupId}/members/{userId} | Kick Group Member
*GroupsApi* | [**leaveGroup**](docs/GroupsApi.md#leavegroup) | **POST** /groups/{groupId}/leave | Leave Group
*GroupsApi* | [**removeGroupMemberRole**](docs/GroupsApi.md#removegroupmemberrole) | **DELETE** /groups/{groupId}/members/{userId}/roles/{groupRoleId} | Remove Role from GroupMember
*GroupsApi* | [**respondGroupJoinRequest**](docs/GroupsApi.md#respondgroupjoinrequest) | **PUT** /groups/{groupId}/requests/{userId} | Respond Group Join request
*GroupsApi* | [**searchGroups**](docs/GroupsApi.md#searchgroups) | **GET** /groups | Search Group
*GroupsApi* | [**unbanGroupMember**](docs/GroupsApi.md#unbangroupmember) | **DELETE** /groups/{groupId}/bans/{userId} | Unban Group Member
*GroupsApi* | [**updateGroup**](docs/GroupsApi.md#updategroup) | **PUT** /groups/{groupId} | Update Group
*GroupsApi* | [**updateGroupGallery**](docs/GroupsApi.md#updategroupgallery) | **PUT** /groups/{groupId}/galleries/{groupGalleryId} | Update Group Gallery
*GroupsApi* | [**updateGroupMember**](docs/GroupsApi.md#updategroupmember) | **PUT** /groups/{groupId}/members/{userId} | Update Group Member
*GroupsApi* | [**updateGroupPost**](docs/GroupsApi.md#updategrouppost) | **PUT** /groups/{groupId}/posts/{notificationId} | Edits a Group post
*GroupsApi* | [**updateGroupRole**](docs/GroupsApi.md#updategrouprole) | **PUT** /groups/{groupId}/roles/{groupRoleId} | Update Group Role
*InstancesApi* | [**closeInstance**](docs/InstancesApi.md#closeinstance) | **DELETE** /instances/{worldId}:{instanceId} | Close Instance
*InstancesApi* | [**createInstance**](docs/InstancesApi.md#createinstance) | **POST** /instances | Create Instance
*InstancesApi* | [**getInstance**](docs/InstancesApi.md#getinstance) | **GET** /instances/{worldId}:{instanceId} | Get Instance
*InstancesApi* | [**getInstanceByShortName**](docs/InstancesApi.md#getinstancebyshortname) | **GET** /instances/s/{shortName} | Get Instance By Short Name
*InstancesApi* | [**getShortName**](docs/InstancesApi.md#getshortname) | **GET** /instances/{worldId}:{instanceId}/shortName | Get Instance Short Name
*InviteApi* | [**getInviteMessage**](docs/InviteApi.md#getinvitemessage) | **GET** /message/{userId}/{messageType}/{slot} | Get Invite Message
*InviteApi* | [**getInviteMessages**](docs/InviteApi.md#getinvitemessages) | **GET** /message/{userId}/{messageType} | List Invite Messages
*InviteApi* | [**inviteMyselfTo**](docs/InviteApi.md#invitemyselfto) | **POST** /invite/myself/to/{worldId}:{instanceId} | Invite Myself To Instance
*InviteApi* | [**inviteUser**](docs/InviteApi.md#inviteuser) | **POST** /invite/{userId} | Invite User
*InviteApi* | [**requestInvite**](docs/InviteApi.md#requestinvite) | **POST** /requestInvite/{userId} | Request Invite
*InviteApi* | [**resetInviteMessage**](docs/InviteApi.md#resetinvitemessage) | **DELETE** /message/{userId}/{messageType}/{slot} | Reset Invite Message
*InviteApi* | [**respondInvite**](docs/InviteApi.md#respondinvite) | **POST** /invite/{notificationId}/response | Respond Invite
*InviteApi* | [**updateInviteMessage**](docs/InviteApi.md#updateinvitemessage) | **PUT** /message/{userId}/{messageType}/{slot} | Update Invite Message
*JamsApi* | [**getJam**](docs/JamsApi.md#getjam) | **GET** /jams/{jamId} | Show jam information
*JamsApi* | [**getJamSubmissions**](docs/JamsApi.md#getjamsubmissions) | **GET** /jams/{jamId}/submissions | Show jam submissions
*JamsApi* | [**getJams**](docs/JamsApi.md#getjams) | **GET** /jams | Show jams list
*NotificationsApi* | [**acceptFriendRequest**](docs/NotificationsApi.md#acceptfriendrequest) | **PUT** /auth/user/notifications/{notificationId}/accept | Accept Friend Request
*NotificationsApi* | [**clearNotifications**](docs/NotificationsApi.md#clearnotifications) | **PUT** /auth/user/notifications/clear | Clear All Notifications
*NotificationsApi* | [**deleteNotification**](docs/NotificationsApi.md#deletenotification) | **PUT** /auth/user/notifications/{notificationId}/hide | Delete Notification
*NotificationsApi* | [**getNotification**](docs/NotificationsApi.md#getnotification) | **GET** /auth/user/notifications/{notificationId} | Show notification
*NotificationsApi* | [**getNotifications**](docs/NotificationsApi.md#getnotifications) | **GET** /auth/user/notifications | List Notifications
*NotificationsApi* | [**markNotificationAsRead**](docs/NotificationsApi.md#marknotificationasread) | **PUT** /auth/user/notifications/{notificationId}/see | Mark Notification As Read
*PermissionsApi* | [**getAssignedPermissions**](docs/PermissionsApi.md#getassignedpermissions) | **GET** /auth/permissions | Get Assigned Permissions
*PermissionsApi* | [**getPermission**](docs/PermissionsApi.md#getpermission) | **GET** /permissions/{permissionId} | Get Permission
*PlayermoderationApi* | [**clearAllPlayerModerations**](docs/PlayermoderationApi.md#clearallplayermoderations) | **DELETE** /auth/user/playermoderations | Clear All Player Moderations
*PlayermoderationApi* | [**getPlayerModerations**](docs/PlayermoderationApi.md#getplayermoderations) | **GET** /auth/user/playermoderations | Search Player Moderations
*PlayermoderationApi* | [**moderateUser**](docs/PlayermoderationApi.md#moderateuser) | **POST** /auth/user/playermoderations | Moderate User
*PlayermoderationApi* | [**unmoderateUser**](docs/PlayermoderationApi.md#unmoderateuser) | **PUT** /auth/user/unplayermoderate | Unmoderate User
*SystemApi* | [**getCSS**](docs/SystemApi.md#getcss) | **GET** /css/app.css | Download CSS
*SystemApi* | [**getConfig**](docs/SystemApi.md#getconfig) | **GET** /config | Fetch API Config
*SystemApi* | [**getCurrentOnlineUsers**](docs/SystemApi.md#getcurrentonlineusers) | **GET** /visits | Current Online Users
*SystemApi* | [**getHealth**](docs/SystemApi.md#gethealth) | **GET** /health | Check API Health
*SystemApi* | [**getInfoPush**](docs/SystemApi.md#getinfopush) | **GET** /infoPush | Show Information Notices
*SystemApi* | [**getJavaScript**](docs/SystemApi.md#getjavascript) | **GET** /js/app.js | Download JavaScript
*SystemApi* | [**getSystemTime**](docs/SystemApi.md#getsystemtime) | **GET** /time | Current System Time
*UsersApi* | [**getUser**](docs/UsersApi.md#getuser) | **GET** /users/{userId} | Get User by ID
*UsersApi* | [**getUserByName**](docs/UsersApi.md#getuserbyname) | **GET** /users/{username}/name | Get User by Username
*UsersApi* | [**getUserFeedback**](docs/UsersApi.md#getuserfeedback) | **GET** /users/{userId}/feedback | Get User Feedback
*UsersApi* | [**getUserGroupInstances**](docs/UsersApi.md#getusergroupinstances) | **GET** /users/{userId}/instances/groups | Get User Group Instances
*UsersApi* | [**getUserGroupRequests**](docs/UsersApi.md#getusergrouprequests) | **GET** /users/{userId}/groups/requested | Get User Group Requests
*UsersApi* | [**getUserGroups**](docs/UsersApi.md#getusergroups) | **GET** /users/{userId}/groups | Get User Groups
*UsersApi* | [**getUserNote**](docs/UsersApi.md#getusernote) | **GET** /userNotes/{userNoteId} | Get User Note
*UsersApi* | [**getUserNotes**](docs/UsersApi.md#getusernotes) | **GET** /userNotes | Get User Notes
*UsersApi* | [**getUserRepresentedGroup**](docs/UsersApi.md#getuserrepresentedgroup) | **GET** /users/{userId}/groups/represented | Get user's current represented group
*UsersApi* | [**searchUsers**](docs/UsersApi.md#searchusers) | **GET** /users | Search All Users
*UsersApi* | [**updateUser**](docs/UsersApi.md#updateuser) | **PUT** /users/{userId} | Update User Info
*UsersApi* | [**updateUserNote**](docs/UsersApi.md#updateusernote) | **POST** /userNotes | Update User Note
*WorldsApi* | [**createWorld**](docs/WorldsApi.md#createworld) | **POST** /worlds | Create World
*WorldsApi* | [**deleteWorld**](docs/WorldsApi.md#deleteworld) | **DELETE** /worlds/{worldId} | Delete World
*WorldsApi* | [**getActiveWorlds**](docs/WorldsApi.md#getactiveworlds) | **GET** /worlds/active | List Active Worlds
*WorldsApi* | [**getFavoritedWorlds**](docs/WorldsApi.md#getfavoritedworlds) | **GET** /worlds/favorites | List Favorited Worlds
*WorldsApi* | [**getRecentWorlds**](docs/WorldsApi.md#getrecentworlds) | **GET** /worlds/recent | List Recent Worlds
*WorldsApi* | [**getWorld**](docs/WorldsApi.md#getworld) | **GET** /worlds/{worldId} | Get World by ID
*WorldsApi* | [**getWorldInstance**](docs/WorldsApi.md#getworldinstance) | **GET** /worlds/{worldId}/{instanceId} | Get World Instance
*WorldsApi* | [**getWorldMetadata**](docs/WorldsApi.md#getworldmetadata) | **GET** /worlds/{worldId}/metadata | Get World Metadata
*WorldsApi* | [**getWorldPublishStatus**](docs/WorldsApi.md#getworldpublishstatus) | **GET** /worlds/{worldId}/publish | Get World Publish Status
*WorldsApi* | [**publishWorld**](docs/WorldsApi.md#publishworld) | **PUT** /worlds/{worldId}/publish | Publish World
*WorldsApi* | [**searchWorlds**](docs/WorldsApi.md#searchworlds) | **GET** /worlds | Search All Worlds
*WorldsApi* | [**unpublishWorld**](docs/WorldsApi.md#unpublishworld) | **DELETE** /worlds/{worldId}/publish | Unpublish World
*WorldsApi* | [**updateWorld**](docs/WorldsApi.md#updateworld) | **PUT** /worlds/{worldId} | Update World


<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.github.vrchatapi.models.APIConfig](docs/APIConfig.md)
 - [io.github.vrchatapi.models.APIConfigAccessLogsUrls](docs/APIConfigAccessLogsUrls.md)
 - [io.github.vrchatapi.models.APIConfigAnnouncement](docs/APIConfigAnnouncement.md)
 - [io.github.vrchatapi.models.APIConfigAvatarPerfLimiter](docs/APIConfigAvatarPerfLimiter.md)
 - [io.github.vrchatapi.models.APIConfigConstants](docs/APIConfigConstants.md)
 - [io.github.vrchatapi.models.APIConfigConstantsGROUPS](docs/APIConfigConstantsGROUPS.md)
 - [io.github.vrchatapi.models.APIConfigConstantsINSTANCE](docs/APIConfigConstantsINSTANCE.md)
 - [io.github.vrchatapi.models.APIConfigConstantsINSTANCEPOPULATIONBRACKETS](docs/APIConfigConstantsINSTANCEPOPULATIONBRACKETS.md)
 - [io.github.vrchatapi.models.APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED](docs/APIConfigConstantsINSTANCEPOPULATIONBRACKETSCROWDED.md)
 - [io.github.vrchatapi.models.APIConfigConstantsINSTANCEPOPULATIONBRACKETSFEW](docs/APIConfigConstantsINSTANCEPOPULATIONBRACKETSFEW.md)
 - [io.github.vrchatapi.models.APIConfigConstantsINSTANCEPOPULATIONBRACKETSMANY](docs/APIConfigConstantsINSTANCEPOPULATIONBRACKETSMANY.md)
 - [io.github.vrchatapi.models.APIConfigConstantsLANGUAGE](docs/APIConfigConstantsLANGUAGE.md)
 - [io.github.vrchatapi.models.APIConfigDownloadURLList](docs/APIConfigDownloadURLList.md)
 - [io.github.vrchatapi.models.APIConfigEvents](docs/APIConfigEvents.md)
 - [io.github.vrchatapi.models.APIConfigMinSupportedClientBuildNumber](docs/APIConfigMinSupportedClientBuildNumber.md)
 - [io.github.vrchatapi.models.APIConfigOfflineAnalysis](docs/APIConfigOfflineAnalysis.md)
 - [io.github.vrchatapi.models.APIConfigReportCategories](docs/APIConfigReportCategories.md)
 - [io.github.vrchatapi.models.APIConfigReportOptions](docs/APIConfigReportOptions.md)
 - [io.github.vrchatapi.models.APIConfigReportOptionsAvatar](docs/APIConfigReportOptionsAvatar.md)
 - [io.github.vrchatapi.models.APIConfigReportOptionsGroup](docs/APIConfigReportOptionsGroup.md)
 - [io.github.vrchatapi.models.APIConfigReportOptionsUser](docs/APIConfigReportOptionsUser.md)
 - [io.github.vrchatapi.models.APIConfigReportOptionsWorld](docs/APIConfigReportOptionsWorld.md)
 - [io.github.vrchatapi.models.APIConfigReportReasons](docs/APIConfigReportReasons.md)
 - [io.github.vrchatapi.models.APIHealth](docs/APIHealth.md)
 - [io.github.vrchatapi.models.AccountDeletionLog](docs/AccountDeletionLog.md)
 - [io.github.vrchatapi.models.AddFavoriteRequest](docs/AddFavoriteRequest.md)
 - [io.github.vrchatapi.models.AddGroupGalleryImageRequest](docs/AddGroupGalleryImageRequest.md)
 - [io.github.vrchatapi.models.AgeVerificationStatus](docs/AgeVerificationStatus.md)
 - [io.github.vrchatapi.models.Avatar](docs/Avatar.md)
 - [io.github.vrchatapi.models.AvatarStyles](docs/AvatarStyles.md)
 - [io.github.vrchatapi.models.AvatarUnityPackageUrlObject](docs/AvatarUnityPackageUrlObject.md)
 - [io.github.vrchatapi.models.Badge](docs/Badge.md)
 - [io.github.vrchatapi.models.Balance](docs/Balance.md)
 - [io.github.vrchatapi.models.BanGroupMemberRequest](docs/BanGroupMemberRequest.md)
 - [io.github.vrchatapi.models.CreateAvatarRequest](docs/CreateAvatarRequest.md)
 - [io.github.vrchatapi.models.CreateFileRequest](docs/CreateFileRequest.md)
 - [io.github.vrchatapi.models.CreateFileVersionRequest](docs/CreateFileVersionRequest.md)
 - [io.github.vrchatapi.models.CreateGroupAnnouncementRequest](docs/CreateGroupAnnouncementRequest.md)
 - [io.github.vrchatapi.models.CreateGroupGalleryRequest](docs/CreateGroupGalleryRequest.md)
 - [io.github.vrchatapi.models.CreateGroupInviteRequest](docs/CreateGroupInviteRequest.md)
 - [io.github.vrchatapi.models.CreateGroupPostRequest](docs/CreateGroupPostRequest.md)
 - [io.github.vrchatapi.models.CreateGroupRequest](docs/CreateGroupRequest.md)
 - [io.github.vrchatapi.models.CreateGroupRoleRequest](docs/CreateGroupRoleRequest.md)
 - [io.github.vrchatapi.models.CreateInstanceRequest](docs/CreateInstanceRequest.md)
 - [io.github.vrchatapi.models.CreateWorldRequest](docs/CreateWorldRequest.md)
 - [io.github.vrchatapi.models.CurrentUser](docs/CurrentUser.md)
 - [io.github.vrchatapi.models.CurrentUserPresence](docs/CurrentUserPresence.md)
 - [io.github.vrchatapi.models.DeploymentGroup](docs/DeploymentGroup.md)
 - [io.github.vrchatapi.models.DeveloperType](docs/DeveloperType.md)
 - [io.github.vrchatapi.models.DynamicContentRow](docs/DynamicContentRow.md)
 - [io.github.vrchatapi.models.Error](docs/Error.md)
 - [io.github.vrchatapi.models.Favorite](docs/Favorite.md)
 - [io.github.vrchatapi.models.FavoriteGroup](docs/FavoriteGroup.md)
 - [io.github.vrchatapi.models.FavoriteGroupLimits](docs/FavoriteGroupLimits.md)
 - [io.github.vrchatapi.models.FavoriteGroupVisibility](docs/FavoriteGroupVisibility.md)
 - [io.github.vrchatapi.models.FavoriteLimits](docs/FavoriteLimits.md)
 - [io.github.vrchatapi.models.FavoriteType](docs/FavoriteType.md)
 - [io.github.vrchatapi.models.FavoritedWorld](docs/FavoritedWorld.md)
 - [io.github.vrchatapi.models.Feedback](docs/Feedback.md)
 - [io.github.vrchatapi.models.FileAnalysis](docs/FileAnalysis.md)
 - [io.github.vrchatapi.models.FileAnalysisAvatarStats](docs/FileAnalysisAvatarStats.md)
 - [io.github.vrchatapi.models.FileData](docs/FileData.md)
 - [io.github.vrchatapi.models.FileStatus](docs/FileStatus.md)
 - [io.github.vrchatapi.models.FileUploadURL](docs/FileUploadURL.md)
 - [io.github.vrchatapi.models.FileVersion](docs/FileVersion.md)
 - [io.github.vrchatapi.models.FileVersionUploadStatus](docs/FileVersionUploadStatus.md)
 - [io.github.vrchatapi.models.FinishFileDataUploadRequest](docs/FinishFileDataUploadRequest.md)
 - [io.github.vrchatapi.models.FriendStatus](docs/FriendStatus.md)
 - [io.github.vrchatapi.models.Group](docs/Group.md)
 - [io.github.vrchatapi.models.GroupAccessType](docs/GroupAccessType.md)
 - [io.github.vrchatapi.models.GroupAnnouncement](docs/GroupAnnouncement.md)
 - [io.github.vrchatapi.models.GroupAuditLogEntry](docs/GroupAuditLogEntry.md)
 - [io.github.vrchatapi.models.GroupGallery](docs/GroupGallery.md)
 - [io.github.vrchatapi.models.GroupGalleryImage](docs/GroupGalleryImage.md)
 - [io.github.vrchatapi.models.GroupInstance](docs/GroupInstance.md)
 - [io.github.vrchatapi.models.GroupJoinRequestAction](docs/GroupJoinRequestAction.md)
 - [io.github.vrchatapi.models.GroupJoinState](docs/GroupJoinState.md)
 - [io.github.vrchatapi.models.GroupLimitedMember](docs/GroupLimitedMember.md)
 - [io.github.vrchatapi.models.GroupMember](docs/GroupMember.md)
 - [io.github.vrchatapi.models.GroupMemberLimitedUser](docs/GroupMemberLimitedUser.md)
 - [io.github.vrchatapi.models.GroupMemberStatus](docs/GroupMemberStatus.md)
 - [io.github.vrchatapi.models.GroupMyMember](docs/GroupMyMember.md)
 - [io.github.vrchatapi.models.GroupPermission](docs/GroupPermission.md)
 - [io.github.vrchatapi.models.GroupPermissions](docs/GroupPermissions.md)
 - [io.github.vrchatapi.models.GroupPost](docs/GroupPost.md)
 - [io.github.vrchatapi.models.GroupPostVisibility](docs/GroupPostVisibility.md)
 - [io.github.vrchatapi.models.GroupPrivacy](docs/GroupPrivacy.md)
 - [io.github.vrchatapi.models.GroupRole](docs/GroupRole.md)
 - [io.github.vrchatapi.models.GroupRoleTemplate](docs/GroupRoleTemplate.md)
 - [io.github.vrchatapi.models.GroupSearchSort](docs/GroupSearchSort.md)
 - [io.github.vrchatapi.models.GroupUserVisibility](docs/GroupUserVisibility.md)
 - [io.github.vrchatapi.models.InfoPush](docs/InfoPush.md)
 - [io.github.vrchatapi.models.InfoPushData](docs/InfoPushData.md)
 - [io.github.vrchatapi.models.InfoPushDataArticle](docs/InfoPushDataArticle.md)
 - [io.github.vrchatapi.models.InfoPushDataArticleContent](docs/InfoPushDataArticleContent.md)
 - [io.github.vrchatapi.models.InfoPushDataClickable](docs/InfoPushDataClickable.md)
 - [io.github.vrchatapi.models.InlineResponse200](docs/InlineResponse200.md)
 - [io.github.vrchatapi.models.Instance](docs/Instance.md)
 - [io.github.vrchatapi.models.InstancePlatforms](docs/InstancePlatforms.md)
 - [io.github.vrchatapi.models.InstanceRegion](docs/InstanceRegion.md)
 - [io.github.vrchatapi.models.InstanceShortNameResponse](docs/InstanceShortNameResponse.md)
 - [io.github.vrchatapi.models.InstanceType](docs/InstanceType.md)
 - [io.github.vrchatapi.models.InviteMessage](docs/InviteMessage.md)
 - [io.github.vrchatapi.models.InviteMessageType](docs/InviteMessageType.md)
 - [io.github.vrchatapi.models.InviteRequest](docs/InviteRequest.md)
 - [io.github.vrchatapi.models.InviteResponse](docs/InviteResponse.md)
 - [io.github.vrchatapi.models.Jam](docs/Jam.md)
 - [io.github.vrchatapi.models.JamStateChangeDates](docs/JamStateChangeDates.md)
 - [io.github.vrchatapi.models.License](docs/License.md)
 - [io.github.vrchatapi.models.LicenseAction](docs/LicenseAction.md)
 - [io.github.vrchatapi.models.LicenseGroup](docs/LicenseGroup.md)
 - [io.github.vrchatapi.models.LicenseType](docs/LicenseType.md)
 - [io.github.vrchatapi.models.LimitedGroup](docs/LimitedGroup.md)
 - [io.github.vrchatapi.models.LimitedUnityPackage](docs/LimitedUnityPackage.md)
 - [io.github.vrchatapi.models.LimitedUser](docs/LimitedUser.md)
 - [io.github.vrchatapi.models.LimitedUserGroups](docs/LimitedUserGroups.md)
 - [io.github.vrchatapi.models.LimitedWorld](docs/LimitedWorld.md)
 - [io.github.vrchatapi.models.MIMEType](docs/MIMEType.md)
 - [io.github.vrchatapi.models.ModerateUserRequest](docs/ModerateUserRequest.md)
 - [io.github.vrchatapi.models.Notification](docs/Notification.md)
 - [io.github.vrchatapi.models.NotificationDetailInvite](docs/NotificationDetailInvite.md)
 - [io.github.vrchatapi.models.NotificationDetailInviteResponse](docs/NotificationDetailInviteResponse.md)
 - [io.github.vrchatapi.models.NotificationDetailRequestInvite](docs/NotificationDetailRequestInvite.md)
 - [io.github.vrchatapi.models.NotificationDetailRequestInviteResponse](docs/NotificationDetailRequestInviteResponse.md)
 - [io.github.vrchatapi.models.NotificationDetailVoteToKick](docs/NotificationDetailVoteToKick.md)
 - [io.github.vrchatapi.models.NotificationType](docs/NotificationType.md)
 - [io.github.vrchatapi.models.OrderOption](docs/OrderOption.md)
 - [io.github.vrchatapi.models.PaginatedGroupAuditLogEntryList](docs/PaginatedGroupAuditLogEntryList.md)
 - [io.github.vrchatapi.models.PastDisplayName](docs/PastDisplayName.md)
 - [io.github.vrchatapi.models.PerformanceLimiterInfo](docs/PerformanceLimiterInfo.md)
 - [io.github.vrchatapi.models.PerformanceRatings](docs/PerformanceRatings.md)
 - [io.github.vrchatapi.models.Permission](docs/Permission.md)
 - [io.github.vrchatapi.models.PlatformBuildInfo](docs/PlatformBuildInfo.md)
 - [io.github.vrchatapi.models.PlayerModeration](docs/PlayerModeration.md)
 - [io.github.vrchatapi.models.PlayerModerationType](docs/PlayerModerationType.md)
 - [io.github.vrchatapi.models.Product](docs/Product.md)
 - [io.github.vrchatapi.models.ProductListing](docs/ProductListing.md)
 - [io.github.vrchatapi.models.ProductListingType](docs/ProductListingType.md)
 - [io.github.vrchatapi.models.ProductListingVariant](docs/ProductListingVariant.md)
 - [io.github.vrchatapi.models.ProductType](docs/ProductType.md)
 - [io.github.vrchatapi.models.Region](docs/Region.md)
 - [io.github.vrchatapi.models.ReleaseStatus](docs/ReleaseStatus.md)
 - [io.github.vrchatapi.models.ReportCategory](docs/ReportCategory.md)
 - [io.github.vrchatapi.models.ReportReason](docs/ReportReason.md)
 - [io.github.vrchatapi.models.RepresentedGroup](docs/RepresentedGroup.md)
 - [io.github.vrchatapi.models.RequestInviteRequest](docs/RequestInviteRequest.md)
 - [io.github.vrchatapi.models.RespondGroupJoinRequest](docs/RespondGroupJoinRequest.md)
 - [io.github.vrchatapi.models.Response](docs/Response.md)
 - [io.github.vrchatapi.models.SentNotification](docs/SentNotification.md)
 - [io.github.vrchatapi.models.SortOption](docs/SortOption.md)
 - [io.github.vrchatapi.models.Submission](docs/Submission.md)
 - [io.github.vrchatapi.models.Subscription](docs/Subscription.md)
 - [io.github.vrchatapi.models.SubscriptionPeriod](docs/SubscriptionPeriod.md)
 - [io.github.vrchatapi.models.Success](docs/Success.md)
 - [io.github.vrchatapi.models.TiliaStatus](docs/TiliaStatus.md)
 - [io.github.vrchatapi.models.TiliaTOS](docs/TiliaTOS.md)
 - [io.github.vrchatapi.models.TokenBundle](docs/TokenBundle.md)
 - [io.github.vrchatapi.models.Transaction](docs/Transaction.md)
 - [io.github.vrchatapi.models.TransactionAgreement](docs/TransactionAgreement.md)
 - [io.github.vrchatapi.models.TransactionStatus](docs/TransactionStatus.md)
 - [io.github.vrchatapi.models.TransactionSteamInfo](docs/TransactionSteamInfo.md)
 - [io.github.vrchatapi.models.TransactionSteamWalletInfo](docs/TransactionSteamWalletInfo.md)
 - [io.github.vrchatapi.models.TwoFactorAuthCode](docs/TwoFactorAuthCode.md)
 - [io.github.vrchatapi.models.TwoFactorEmailCode](docs/TwoFactorEmailCode.md)
 - [io.github.vrchatapi.models.UnityPackage](docs/UnityPackage.md)
 - [io.github.vrchatapi.models.UpdateAvatarRequest](docs/UpdateAvatarRequest.md)
 - [io.github.vrchatapi.models.UpdateFavoriteGroupRequest](docs/UpdateFavoriteGroupRequest.md)
 - [io.github.vrchatapi.models.UpdateGroupGalleryRequest](docs/UpdateGroupGalleryRequest.md)
 - [io.github.vrchatapi.models.UpdateGroupMemberRequest](docs/UpdateGroupMemberRequest.md)
 - [io.github.vrchatapi.models.UpdateGroupRequest](docs/UpdateGroupRequest.md)
 - [io.github.vrchatapi.models.UpdateGroupRoleRequest](docs/UpdateGroupRoleRequest.md)
 - [io.github.vrchatapi.models.UpdateInviteMessageRequest](docs/UpdateInviteMessageRequest.md)
 - [io.github.vrchatapi.models.UpdateUserNoteRequest](docs/UpdateUserNoteRequest.md)
 - [io.github.vrchatapi.models.UpdateUserRequest](docs/UpdateUserRequest.md)
 - [io.github.vrchatapi.models.UpdateWorldRequest](docs/UpdateWorldRequest.md)
 - [io.github.vrchatapi.models.User](docs/User.md)
 - [io.github.vrchatapi.models.UserExists](docs/UserExists.md)
 - [io.github.vrchatapi.models.UserNote](docs/UserNote.md)
 - [io.github.vrchatapi.models.UserNoteTargetUser](docs/UserNoteTargetUser.md)
 - [io.github.vrchatapi.models.UserState](docs/UserState.md)
 - [io.github.vrchatapi.models.UserStatus](docs/UserStatus.md)
 - [io.github.vrchatapi.models.UserSubscription](docs/UserSubscription.md)
 - [io.github.vrchatapi.models.Verify2FAEmailCodeResult](docs/Verify2FAEmailCodeResult.md)
 - [io.github.vrchatapi.models.Verify2FAResult](docs/Verify2FAResult.md)
 - [io.github.vrchatapi.models.VerifyAuthTokenResult](docs/VerifyAuthTokenResult.md)
 - [io.github.vrchatapi.models.World](docs/World.md)
 - [io.github.vrchatapi.models.WorldMetadata](docs/WorldMetadata.md)
 - [io.github.vrchatapi.models.WorldPublishStatus](docs/WorldPublishStatus.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="authCookie"></a>
### authCookie

- **Type**: API key
- **API key parameter name**: auth
- **Location**: 

<a name="authHeader"></a>
### authHeader

- **Type**: HTTP basic authentication

<a name="twoFactorAuthCookie"></a>
### twoFactorAuthCookie

- **Type**: API key
- **API key parameter name**: twoFactorAuth
- **Location**: 

