#!/bin/bash

fechaActual=$(date +"%d-%m-%Y %H:%M:%S")

GITHUB_USER="Idrojone22"

GITHUB_TOKEN=$(cat /home/idrojone/Escritorio/tokens/.token)

git -c http.extraHeader="Autorization: Basic $(echo -n $GITHUB_USER:$GITHUB_TOKEN)" pull

git add .

git commit -m "Commit automátic - $fechaActual"

git -c http.extraHeader="Autorization: Basic $(echo -n $GITHUB_USER:$GITHUB_TOKEN)" push