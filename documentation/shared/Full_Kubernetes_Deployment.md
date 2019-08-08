# Full Kubernetes Deployment

The final task is to get all of the code up and running on the Kubernetes cluster. The cluster should run the Node.js application, MongoDB, Kafka and ELK stack. 

## Task

The final task is to get all of the code you have worked on up and running on the Google Cloud Platform on a Kubernetes cluster. If you can start these services on a local machine, using a docker-compose.yml file, then it is a simple process to convert to Kubernetes .yaml files and run on the cluster. 

When complete, you should expose the following services as load balancers:

-   Node.js App (port 8080)
-   Kafka-topics-ui (port 8000)
-   ELK (ports 5601, 9200 and 5044)

![](attachments/437616661/437747724.png?height=250)

If successful, you will be able to call the POST /users endpoint and the user will be created and new entry will be visible on your exposed Kafka-topics-ui url:

![](attachments/437616661/437682236.png?height=250)

-   Test topic on the exposed Kafka-topics-ui endpoint:

![](attachments/437616661/437813276.png?height=250)

-   The easiest way to do this is to use a docker-compose.yml file and convert it to a kubernetes .yaml files using the [kompose](http://kompose.io/) tool. 
-   Take the "docker-compose" file you used in the previous [Stream Processing](Stream_Processing) task and add sections for your "mongodb", "elk" and "application" containers. Note that the application image will require changed to match your own dockerhub image.

>       # MongoDB
>       if-db:
>         container_name: if-db
>         image: mongo:3.6
>         restart: always
>         ports:
>           - 27017:27017
>
>       # ELK stack
>       elk:
>         container_name: elk
>         image: sebp/elk
>         restart: always
>         ports:
>           - 5601:5601
>           - 9200:9200
>           - 5044:5044
>
>       # digital engineering course
>       if-app:
>         container_name: if-app
>         image: manucapco/digitalengineeringcourse:latest
>         restart: always
>         ports:
>           - 8090:8090
>         depends_on:
>           - if-db
>           - elk

-   Check that you can run the application locally using the following command:

>     docker-compose up -d

-   Convert to kubernetes .yaml files using the following command:

>     kompose convert

-   You can convert docker compose .yaml file to a single kubernetes file .yml using the following command:

>     kompose convert -o kub.yml

-   Assuming that you have a working kubectl connection (from the Kafka task), create the workloads and services using the following command from the location of the .yaml files.

>     kubectl create -f .

-   To delete workloads and services

>     kubectl delete -f .

-   Check that the workloads and services are created successfully in the Google Cloud Platform. Note that none of the services will be exposed and accessible on your local machine

-   Convert the application, kafka-topics-ui and elk services to be exposed as load balancers. Simply add the 'type: "LoadBalancer"' after the port definition in the service .yaml file:

![](attachments/437616661/437747729.png?height=250)

-   To delete the existing workloads and services, run the following commands to get and delete the services:

>     kubectl get services;
>
>     kubectl get deploy;
>
>     # using the output of these calls, create the delete statements
>
>     kubectl delete service elk;
>
>     kubectl delete deploy elk;
>     ...
>     # ADD DELETES FOR OTHER DEPLOYMENTS AND SERVICES

-   You may want to create a destroy.sh script to remove all the services and workloads automatically:

![](attachments/437616661/437813287.png?height=250)

-   Finally, recreate your Kubernetes services and workloads with the App, ELK and Kafka-topics-ui endpoints exposed and test them using Postman.

![](attachments/437616661/437813292.png?height=250)

-   You will also be able to view your endpoint api documentation using the swagger-ui.html page

![](attachments/437616661/437911579.png?height=250)


