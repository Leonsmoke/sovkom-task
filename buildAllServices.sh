#!/bin/sh
echo "Building projects..."
set echo off
cd server-discovery
sh buildScript.sh > /dev/null
cd ..
cd email-service
sh buildScript.sh > /dev/null
cd ..
cd push-service
sh buildScript.sh > /dev/null
cd ..
cd sms-service
sh buildScript.sh > /dev/null
cd ..
cd api-gateway
sh buildScript.sh > /dev/null
cd ..
set echo on
docker-compose build
docker-compose up