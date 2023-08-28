#!/bin/sh
# Licensed to the Apache Software Foundation (ASF) under one or more
# contributor license agreements.  See the NOTICE file distributed with
# this work for additional information regarding copyright ownership.
# The ASF licenses this file to You under the Apache License, Version 2.0
# (the "License"); you may not use this file except in compliance with
# the License.  You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# -----------------------------------------------------------------------------
# Script to check tomcat up and running 
# -----------------------------------------------------------------------------

TOMCAT_PID=$(ps -ef | grep 'Bootstrap start' |  awk '/[t]omcat/{print $2}')
echo TOMCAT PROCESSID $TOMCAT_PID

cd ${CATALINA_HOME}/bin

if [ -z "$TOMCAT_PID" ]
then
    echo "TOMCAT NOT RUNNING"
    sh ${CATALINA_HOME}/bin/shutdown.sh
    sleep 5 
    sh ${CATALINA_HOME}/bin/startup.sh
else
   echo "TOMCAT RUNNING"
fi
