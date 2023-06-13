
URL=$1
USER=$2
PASS=$3

# required params
# testCaseTrackerId     - The tracker id of the test cases
# testRunTrackerId      - The tracker id where the test runs going to be populated
TEST_CASE_TRACKER_ID=$4
TEST_RUN_TRACKER_ID=$5
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
