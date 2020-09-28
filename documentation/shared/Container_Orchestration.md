# Container Orchestration

Container Orchestration refers to the automated arrangement, coordination, and management of software containers. In this task, you will deploy the applications docker container on to a Kubernetes (K8s) cluster. 

## Udemy

<https://capco.udemy.com/course/learn-kubernetes/>

## Task

Prerequisites:

-   Google Cloud Platform (GCP) account e.g. the free trial (don't use capco email to sign up for the free trial, create/use a google account)
-   Kubectl installed 
-   Available docker image of the java application

The aim of this task is to deploy the java application to a Kubernetes cluster. An example tutorial can be followed here: <https://cloud.google.com/kubernetes-engine/docs/tutorials/hello-app>. You should be able to create a new Workload containing your application and one containing the generic MongoDB container. You should then create two services. One service will expose the web application endpoint to the internet and one service will be an internal service which should expose the MongoDB to the web application only. Finally, you should be able to use Kubectl to replicate the web application pod and therefore scale up the web application as required.

-   You should create a new google project (the name is displayed in the dropdown at the top of the screen).
-   Next, create a new Kubernetes Cluster from the "Kubernetes Engine" option in the Google Cloud Platform.

![](attachments/418644157/428965986.png?height=250){height="250"}

-   Change the **name, zone (europe-west-2b)** and **cluster version (latest)** and create the cluster.
-   In the IAM & admin options, create a new Service Account. It should have permissions as a Kubernetes Engine Admin. 
-   Choose the "Furnish a new private key" option and copy that to a "client-secret.json" file.

![](attachments/418644157/428834941.png?height=250){height="250"}

-   Download and install the "gcloud" and "kubectl" clients. You may be able to do this by running the following:

>     curl https://sdk.cloud.google.com | bash;
>
>     curl -LO https://storage.googleapis.com/kubernetes-release/release/$(curl -s https://storage.googleapis.com/kubernetes-release/release/stable.txt)/bin/linux/amd64/kubectl
>
>     chmod +x ./kubectl
>
>     sudo mv ./kubectl /usr/local/bin/kubectl

-   Alternatively, you can install "kubectl" client using Homebrew on Mac

>     brew install kubernetes-cli

-   Use the `gcloud init` command to perform several common SDK setup tasks. These include authorising the SDK tools to access Google Cloud Platform using your user account credentials and setting up the default SDK configuration.

>     gcloud init

-   Once installed, check that you can login to google cloud:

>     gcloud auth activate-service-account --key-file client-secret.json
>
>     gcloud config set project YOUR-GOOGLE-PROJECT-NAME
>
>     gcloud config set container/use_client_certificate False
>
>     gcloud container clusters get-credentials YOUR-CLUSTER-NAME  --zone=europe-west2-b

-   Check that the kubectl client is installed:

>     kubectl version

-   Take the attached example [kubectl.yml](attachments/418644157/437846035.xml) file and modify it to contain your docker image and tag. Run the following command:

>     kubectl create -f kubectl.yml

-   To delete all created kubernetes .yml file. Run the following command:

>     kubectl delete -f kubectl.yml

-   This will spin up 2 pods (the app and mongo) and expose the mongo database as an internal service and the app as an exposed web service. Try the endpoint with a /helloWorld, POST /users and GET /users suffix.

![](attachments/418644157/429064281.png?height=250)

![](attachments/418644157/428965994.png?height=250)

## Extra Help - How kubernetes works

<https://www.infoworld.com/article/3268073/containers/what-is-kubernetes-container-orchestration-explained.html>

[![What is Kubernetes?](https://img.youtube.com/vi/R-3dfURb2hA/0.jpg)](https://www.youtube.com/watch?v=R-3dfURb2hA)



