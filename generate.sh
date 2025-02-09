#!/bin/bash

npm install @openapitools/openapi-generator-cli

rm docs -rf
rm src/commonMain/kotlin/io/github/vrchatapi/*.kt
rm src/commonMain/kotlin/io/github/vrchatapi/api -rf
rm src/commonMain/kotlin/io/github/vrchatapi/auth -rf
rm src/commonMain/kotlin/io/github/vrchatapi/model -rf

./node_modules/\@openapitools/openapi-generator-cli/main.js generate \
-g kotlin \
--additional-properties=groupId=io.github.vrchatapi,packageName=io.github.vrchatapi,library=multiplatform,artifactId=vrchatapi,licenseName=MIT,licenseUrl=https://github.com/vrchatapi/vrchatapi-kotlin/blob/main/LICENSE,developerEmail=me@ruby.js.org,developerName=VRChatAPI,developerOrganization=vrchatapi,developerOrganizationUrl=https://github.com/VRChatAPI,hideGenerationTimestamp=true,sourceFolder=src/commonMain/kotlin \
--git-user-id=vrchatapi \
--git-repo-id=vrchatapi-kotlin \
-o . \
-i https://raw.githubusercontent.com/vrchatapi/specification/gh-pages/openapi.yaml \
--http-user-agent="vrchatapi-kotlin"

# Remove unneccesary copy of spec
rm api/ -rf

# Remove messily pasted markdown at top of every file
find src -type f -exec sed -i '/VRChat API Banner/d' {} \;

# Add global cookie storage
sed -i '/addNetworkInterceptor/a \
        builder.cookieJar(io.github.vrchatapi.util.SimpleOkHttpCookieJar())' src/commonMain/kotlin/io/github/vrchatapi/ApiClient.kt