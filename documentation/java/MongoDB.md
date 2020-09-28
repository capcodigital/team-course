# MongoDB

The purpose of this task is to add a database connection to the java application. For now, there is no need to use the connection, but you should confirm that the database connection is up and running and available for use. 

## Udemy

<https://capco.udemy.com/course/mongodb-the-complete-developers-guide/> - Introduction to MongoDB

## Task

-   Firstly, setup a local MongoDB and confirm that you can connect to it. You can either do a local installation or use a docker container running MongoDB. You can use a tool such as Studio 3T to practice inserting and deleting rows and running some basic operations on the database.
-   Secondly, create a connection to this database in your java application. Consider where the connection details to this database should be held (in code or a configuration file). Write a simple method which should be run when you boot up your Spring Boot application which confirms that the database is running and that you can connect to it.

## Output

>     docker run --name digital-engineering-mongo -d -p 127.0.0.1:27017:27017 mongo:3.6

![](attachments/418775081/423985186.png?height=250)

![](attachments/418775081/423919691.png?height=250)

-   Run \`docker ps\` to find your docker id then run \``` docker exec -it [DOCKER_ID] bash` `` then \``mongo`\` in order to enter the mongo repl. You can then create databases and collections.

-   If you are experiencing a bug where your application is connecting to the mongoldb, check below for a possible solution:
-   For an application running in your local machine (eclipse or any other IDEA):

          In your application.properties, make sure the host is localhost

      
> spring.data.mongodb.host=localhost

         In your application running in your container, the host must be the name of your database (mongodb), in this case is 'mongodb'

> spring.data.mongodb.host=mongodb

-   If the first solution did not solve the issue, try to link the containers, by using the following command:

   First stop application container, by running;

>  docker  stop container-name/id

   Then delete the application container, by running;

>  docker  rm -f container-name/id

   And finally, link both container by running it again with --link flag;

>  docker  run \[options\]  --link containerA-name/id:containerB-name/id

-   And if for some reason the application still unable to connect to the database. Check if they are running in the same network, if not connected them to the same network

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

## Extra Help - Docker commands

<https://spring.io/guides/gs/accessing-data-mongodb/>

<https://docs.docker.com/engine/reference/commandline/docker/#child-commands>

If you are new to MongoDB this is really helpful: <https://www.tutorialspoint.com/mongodb/index.htm>



