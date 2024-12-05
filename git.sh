#!/bin/bash

fechaActual=$(date +"%d-%m-%Y %H:%M:%S")

GITHUB_USER="idrojone22"
GITHUB_TOKEN=$(grep "GITHUB_TOKEN=" /home/idrojone/Dev/.env | cut -d '=' -f2)

if [[ -z "$GITHUB_TOKEN" ]]; then
    echo "Error: El GITHUB_TOKEN no està configurat o és buit."
    exit 1
fi

auth_header=$(echo -n "$GITHUB_USER:$GITHUB_TOKEN" | base64)

git -c http.extraHeader="Authorization: Basic $auth_header" pull

git add .

git commit -m "Commit automàtic - $fechaActual"

git -c http.extraHeader="Authorization: Basic $auth_header" push
