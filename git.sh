#!/bin/bash

fechaActual=$(date +"%d-%m-%Y %H:%M:%S")

GITHUB_USER="idrojone22"
GITHUB_TOKEN=$(cat /home/idrojone/Escritorio/tokens/.token)

# Codifiquem l'encapçalament amb el format base64
auth_header=$(echo -n "$GITHUB_USER:$GITHUB_TOKEN" | base64)

git -c http.extraHeader="Authorization: Basic $auth_header" pull

git add .

git commit -m "Commit automàtic - $fechaActual"

git -c http.extraHeader="Authorization: Basic $auth_header" push