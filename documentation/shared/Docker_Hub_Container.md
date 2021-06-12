# Docker Hub Container

The purpose of this task is to create a docker container with your code available on the docker hub. This can then be automatically downloaded by a cloud platform and made available on the web.

![diagram](../attachments/429031435/523141124.png?height=400)

## Links

* [resources/db.properties](https://github.com/capcodigital/team-course/blob/master/src/main/resources/db.properties)
* [database/DatabaseConnection.java](https://github.com/capcodigital/team-course/blob/master/src/main/java/com/capco/digital/engineering/database/DatabaseConnection.java)

## Create a Repo on Docker Hub

![repo](../attachments/429031435/429129752.png?height=250)

* Go to [Docker Hub](http://hub.docker.com) and create a new personal account
* Create a new **public** repository with "Create Repository" named e.g. `username-capco/digitalengineeringcourse`

![dockerhub](../attachments/429031435/428965910.png?height=250)

* Choose "Create Automated Build" and grant access to your github account. Choose the option again and choose the github repo where your code is stored and kick off a build of the docker container.
* Download the docker container to your local machine. As the repository is private, you will need to login to docker first and replace the name of the repository with your own:

```shell
docker login
docker run -p 8090:8090 [username]/[reponame]:latest
```
