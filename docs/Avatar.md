
# Avatar

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorId** | **kotlin.String** | A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed. | 
**authorName** | **kotlin.String** |  | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**description** | **kotlin.String** |  | 
**featured** | **kotlin.Boolean** |  | 
**id** | **kotlin.String** |  | 
**imageUrl** | **kotlin.String** |  | 
**name** | **kotlin.String** |  | 
**releaseStatus** | [**ReleaseStatus**](ReleaseStatus.md) |  | 
**styles** | [**AvatarStyles**](AvatarStyles.md) |  | 
**tags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**thumbnailImageUrl** | **kotlin.String** |  | 
**unityPackageUrl** | **kotlin.String** |  | 
**unityPackageUrlObject** | [**AvatarUnityPackageUrlObject**](AvatarUnityPackageUrlObject.md) |  | 
**unityPackages** | [**kotlin.collections.Set&lt;UnityPackage&gt;**](UnityPackage.md) |  | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**version** | **kotlin.Int** |  | 
**assetUrl** | **kotlin.String** | Not present from general serach &#x60;/avatars&#x60;, only on specific requests &#x60;/avatars/{avatarId}&#x60;. |  [optional]
**assetUrlObject** | [**kotlin.Any**](.md) | Not present from general serach &#x60;/avatars&#x60;, only on specific requests &#x60;/avatars/{avatarId}&#x60;. **Deprecation:** &#x60;Object&#x60; has unknown usage/fields, and is always empty. Use normal &#x60;Url&#x60; field instead. |  [optional]



