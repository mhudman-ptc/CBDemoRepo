#!/usr/bin/env bash

TASKID=$1
URL=$2
USER=$3
PASS=$4
TC_TKR_ID=$5
TC_TR_ID=$6

SRC=$(pwd)
TGT="${SRC}/target/upload"
ZFILE="${TGT}/upload.zip"

${SRC}/demo.sh ${TASKID} && \
mvn clean package && \
mkdir -p ${TGT} && \
cp ${SRC}/target/surefire-reports/*.xml ${TGT} && \
pushd ${TGT} && \
zip ${ZFILE} *.xml && \
popd && \
${SRC}/upload.sh ${URL} ${USER} ${PASS} ${TC_TKR_ID} ${TC_TR_ID} ${ZFILE}
