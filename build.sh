#!/usr/bin/env bash

mvn clean package
mv target/test4.jar docker/java/

docker-compose build
docker-compose up --abort-on-container-exit