export TASK_ID=$1
export NOW=$(date)
export EDITFILE="README.md"
export BRANCHNAME="${TASK_ID}-dev-branch"

echo ${TASK_ID}
echo ${NOW}
echo ${EDITFILE}
git checkout -b ${BRANCHNAME}
git pull
echo -e "\n${NOW} - Added line to readme.md for ${TASK_ID}">> ${EDITFILE}
cat ${EDITFILE}
git add ./${EDITFILE}
git status
git commit -m "#${TASK_ID} - update for demonstration at ${NOW}"
git push --set-upstream origin ${BRANCHNAME}
