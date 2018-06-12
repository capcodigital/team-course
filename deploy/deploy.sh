#!/bin/bash

cd $(dirname "$0")

# Here we use the decrypted service account credentials to authenticate the command line tool
gcloud auth activate-service-account --key-file client-secret.json

# set project specific settings
gcloud config set project manu-terraform-admin
gcloud config set container/use_client_certificate False
gcloud container clusters get-credentials idea-funnel-cluster-1  --zone=europe-west2-a

# Check that kubectl can connect
kubectl version

# create the deployments and services (load balancers)
kubectl create -f gcp 
