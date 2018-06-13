#!/bin/bash

cd $(dirname "$0")

kubectl delete service elk;
kubectl delete service if-app;
kubectl delete service kafka-connect;
kubectl delete service kafka-connect-ui;
kubectl delete service kafka-rest-proxy;
kubectl delete service kafka-schema-registry;
kubectl delete service kafka-topics-ui;
kubectl delete service kafka1;
kubectl delete service kubernetes;
kubectl delete service schema-registry-ui;
kubectl delete service zoo1;
kubectl delete service zoonavigator-web;
kubectl delete service if-db;
kubectl delete service zoonavigator-api;

kubectl delete deploy elk;
kubectl delete deploy kafka-connect;
kubectl delete deploy kafka-connect-ui;
kubectl delete deploy kafka-rest-proxy;
kubectl delete deploy kafka-schema-registry;
kubectl delete deploy kafka-topics-ui;
kubectl delete deploy kafka1;
kubectl delete deploy schema-registry-ui;
kubectl delete deploy zoo1;
kubectl delete deploy zoonavigator-api;
kubectl delete deploy zoonavigator-web;
kubectl delete deploy if-app;
kubectl delete deploy if-db;
