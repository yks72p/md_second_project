PATH_TO_APK="app/build/outputs/apk/release/app-release.apk"
PATH_TO_RELEASE_NOTES="config/release_notes.txt"

sudo npm install -g appcenter-cli

appcenter login --disable-telemetry --token ${TOKEN}

appcenter distribute release --disable-telemetry \
    -f $PATH_TO_APK \
    -g dudes \
    --app yks72p/TrafimauApp  \
    -R $PATH_TO_RELEASE_NOTES

