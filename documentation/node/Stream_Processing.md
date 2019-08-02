# Stream Processing

 The purpose of this task is to setup a Kafka/Zookeeper docker installation and to write events from our java application to a new topic.

## Task

You can follow a tutorial here: <http://www.baeldung.com/spring-kafka>

-   Create and start zookeeper, kafka, a schema registry, kafka-rest, kafka topics ui and more by downloading the following file: docker-compose.yml and run from the folder containing the .yml file:

>     docker-compose up -d

-   Then create a new topic called "test". You may need to change the network depending on which network you docker containers are deployed to:

>     docker run --rm --network deploy_default ches/kafka kafka-topics.sh --create --topic test --replication-factor 1 --partitions 1 --zookeeper zoo1:2181
>
> Created topic "test".

-   Check that the topic exists by browsing to the Kapka Topics UI. It may need a minute to load, so may show a connection error to begin with.

![](attachments/431194115/437649409.png?height=250)

-   Add "kafka1" mapping to localhost to your /etc/hosts file e.g.

> 127.0.0.1    kafka1

-   Modify your Node.js code to write to this new topic "test" by following the <http://www.baeldung.com/spring-kafka> example. You only require the Producer Config and Sending messages section (4.1 and 4.2).

-   Write to the topic e.g. on POSTing a new USER
-   Check that the message is received on the topic

![](attachments/431194115/437846017.png?height=250)

-   Run a test command line consumer by running the following command:

>     docker run --rm --network digital-engineering-course_default ches/kafka kafka-console-consumer.sh --topic test --from-beginning --bootstrap-server kafka1:9092

-   If you are experiencing a bug where your application is creating a topic but not publishing/writing any message, check below for a possible solution:

<!-- -->

-   For an application running in your local machine:

          In your Kafka producer, make sure the address is localhost + port in this case the port is 9092

      
>   var bootstrapAddress = "localhost:9092";

         In your application running in your container your address need to be kafka1, the same name mapped to localhost in our host file

>   var bootstrapAddress = "kafka1:9092";

-   Make sure that all your containers (application, database, kafka, etc...) are running under the same network

> -   List exiting networks
>
>   docker network ls
>
> -   Inspect networks configuration and all containers running on it, look for the one where your kafka is running
>
>    docker network inspect network-name
>
> -   Add a container to a specific network
>
>   docker network connect container id/name
>
> -   To create a new network
>
>    docker network create network-name


