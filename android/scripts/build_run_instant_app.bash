#!/bin/bash

set -e

adb uninstall com.articleapp || true

sh scripts/cleanup.bash
./gradlew clean

./gradlew appInstant:bundleRelease

bundletool build-apks --bundle=appInstant/build/outputs/bundle/release/appInstant-release.aab  --output=local_app.apks --connected-device --ks=debug.keystore --ks-pass=pass:12345678 --ks-key-alias=key0 --key-pass=pass:12345678

bundletool install-apks --apks local_app.apks

adb shell am start -n com.articleapp/com.articleapp.MainActivity
