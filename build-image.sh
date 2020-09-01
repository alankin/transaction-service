#!/bin/bash
echo ============================================================
echo Generate JAR
echo ============================================================
mvn clean package -DskipTests
echo ============================================================
echo BUILD and PUSH Project to Docker
echo ============================================================
docker build -t alankin/app-transaction:1.0.0 .
docker push alankin/app-transaction:1.0.0
echo ============================================================
echo End Process
echo ============================================================