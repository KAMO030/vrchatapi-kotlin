#!/bin/bash

npm install @openapitools/openapi-generator-cli

rm docs -rf
rm src/commonMain/kotlin/io/github/vrchatapi/*.kt
rm src/commonMain/kotlin/io/github/vrchatapi/api -rf
rm src/commonMain/kotlin/io/github/vrchatapi/auth -rf
rm src/commonMain/kotlin/io/github/vrchatapi/model -rf

./node_modules/\@openapitools/openapi-generator-cli/main.js generate \
-g kotlin \
--additional-properties=groupId=io.github.kamo030.vrchatapi,packageName=io.github.kamo030.vrchatapi,library=multiplatform,artifactId=vrchatapi,licenseName=MIT,licenseUrl=https://github.com/kamo030/vrchatapi-kotlin/blob/main/LICENSE,developerEmail=kamosama.dev@gmail.com,developerName=KAMOsama,hideGenerationTimestamp=true,sourceFolder=src/commonMain/kotlin \
--git-user-id=kamo030 \
--git-repo-id=vrchatapi-kotlin \
-o . \
-i https://raw.githubusercontent.com/vrchatapi/specification/gh-pages/openapi.yaml \
--http-user-agent="vrchatapi-kotlin"

# Remove unneccesary copy of spec
rm api/ -rf

# Remove messily pasted markdown at top of every file
find src -type f -exec sed -i '/VRChat API Banner/d' {} \;

# Add global cookie storage
# sed -i '/addNetworkInterceptor/a \
#         builder.cookieJar(io.github.kamo030.vrchatapi.util.SimpleOkHttpCookieJar())' src/commonMain/kotlin/io/github/vrchatapi/ApiClient.kt