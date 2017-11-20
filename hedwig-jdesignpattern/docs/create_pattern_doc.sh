#!/usr/bin/env bash
INDEX=$1
PATTERN_NAME=$2
PATTERN_NAME_CN=$3
TYPE=$4

sed "s#pattern_name#${PATTERN_NAME}#g" pattern_doc_template.adoc\
| sed "s#INDEX#${INDEX}#g" \
| sed "s#patternname_cn#${PATTERN_NAME_CN}#g" > $INDEX-${PATTERN_NAME}.adoc

mv $INDEX-$PATTERN_NAME.adoc $4