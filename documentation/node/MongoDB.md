# MongoDB

The purpose of this task is to add a database connection to the Node.js application. For now, there is no need to use the connection, but you should confirm that the database connection is up and running and available for use.

## Udemy

[Introduction to MongoDB](https://capco.udemy.com/course/mongodb-the-complete-developers-guide)

## Task

* Firstly, setup a local MongoDB and confirm that you can connect to it. You can either do a local installation or use a docker container running MongoDB. You can use a tool such as Studio 3T to practice inserting and deleting rows and running some basic operations on the database.
* Secondly, create a connection to this database in your Node.js application. Consider where the connection details to this database should be held (in code or a configuration file). Write a simple method which should be run when you boot up your Spring Boot application which confirms that the database is running and that you can connect to it.

## Output

```shell
docker run --name digital-engineering-mongo -d -p 127.0.0.1:27017:27017 mongo:3.6
```

![viewer](attachments/418775081/423985186.png?height=250)

![output](attachments/418775081/423919691.png?height=250)

* Run `docker ps` to find your docker id then run `docker exec -it [DOCKER_ID] bash` then `mongo` in order to enter the mongo repl. You can then create databases and collections.

If the first solution did not solve the issue, try to link the containers, by using the following commands

```shell
# stop container
docker stop container-name/id

# delete container
docker rm -f container-name/id

# link containers using the --link flag
docker  run \[options\]  --link containerA-name/id:containerB-name/id
```

And if for some reason the application still unable to connect to the database. Check if they are running in the same network, if not connected them to the same network

```shell
# list exiting networks
docker network ls

# inspect networks configuration and all containers running
# look for the one where your kafka is running
docker network inspect network-name

# add a container to a specific network
docker network connect container id/name

# create a new network
docker network create network-name
```

## Extra Help - Docker commands

* If you are new to MongoDB there is a really helpful tutorial [here](https://www.tutorialspoint.com/mongodb/index.htm).

* Visit this [link](https://mongoosejs.com>) for an easy package to get started with querying MongoDB data through Node.js.

* For more details on Docker commands you can review the offical docs [here](https://docs.docker.com/engine/reference/commandline/docker/#child-commands).
