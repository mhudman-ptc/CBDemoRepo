#!/usr/bin/env bash

URL="https://pp-2402191821hh.portal.ptc.io:9443/cb/rest/xunitresults"
USER="pat"
PASS="ptc"

# required params
# testCaseTrackerId     - The tracker id of the test cases
# testRunTrackerId      - The tracker id where the test runs going to be populated
TEST_CASE_TRACKER_ID="9094"
TEST_RUN_TRACKER_ID="9116"
FILE=$6

# optional params
# testConfigurationId   - Test configuration
# testCaseId            - The parent test case id
# releaseId             - Release id for the tests
# buildIdentifier       - Build id
# defaultPackagePrefix  - Package prefix
TEST_CONFIG_ID=""
PARENT_TEST_CASE_ID=""
RELEASE_ID=""
BUILD_ID=""
PACKAGE_PREFIX=""

CFG="{\"testConfigurationId\":\"$TEST_CONFIG_ID\",\"testCaseTrackerId\":\"$TEST_CASE_TRACKER_ID\",\"testCaseId\":\"$PARENT_TEST_CASE_ID\",\"releaseId\":\"$RELEASE_ID\",\"testRunTrackerId\":\"$TEST_RUN_TRACKER_ID\",\"buildIdentifier\":\"$BUILD_ID\",\"defaultPackagePrefix\":\"$PACKAGE_PREFIX\"}"

echo -e "\nConfig = $CFG"

curl -v --location --request POST $URL -u "$USER:$PASS" \
    --form "configuration=$CFG"\
    --form "file=@$FILE"

# 
#   Optionally, we can upload the target file to a Windchill Instance
#
WINDCHILL_INSTANCE="PP-2301181437T9"
SOFTWARE_PART_NUMBER="0000387"
TARGET_FILEPATH=$(realpath "$(pwd)/target")
TARGET_FILENAME="SamplePackage.jar"

if [[ -z ${WINDCHILL_INSTANCE+x} ]]; then
    echo "No WC instance provided, skipping upload to WC"
else
    curl -v \
        -H "X-XSRF-TOKEN: TWX-XSRF-TOKEN-VALUE" \
        -H "AppKey: e1bee721-7592-43a6-9ca2-b3f4b1ac8fe1" \
        -F "upload-repository=TS.DocumentPortal.FileRepository" \
        -F "upload-submit=Upload" \
        -F "file=@${TARGET_FILEPATH}/${TARGERT_FILENAME};type=application/octet-stream" \
        "https://pp-${WINDCHILL_INSTANCE}.portal.ptc.io:9443/Thingworx/FileRepositoryUploader"

    curl -v \
        -X POST \
        -H "X-XSRF-TOKEN: TWX-XSRF-TOKEN-VALUE" \
        -H "AppKey: e1bee721-7592-43a6-9ca2-b3f4b1ac8fe1" \
        -H "Accept: application/json" \
        -H "Content-Type: application/json" \
        -d "{\"SoftwarePartNumber\": \"${SOFTWARE_PART_NUMBER}\", \"ContentFileName\": \"${TARGET_FILENAME}\"}" \
        "https://pp-${WINDCHILL_INSTANCE}.portal.ptc.io:9443/Thingworx/Things/TS.DocumentPortalHelper/Services/ProcessJenkinsContent"
fi
