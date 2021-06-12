# Docker

This task involves taking the application which was created in the [Spring Boot REST](Spring_Boot_REST) task and moving it into a Docker container.

## Udemy

[Learn Docker](https://capco.udemy.com/course/learn-docker)

## Task

### Prerequisites

[Install Docker](https://docs.docker.com/installation/#installation)

### Steps

The task involves you setting up and running a newly created docker image and running your application using that docker image. You can follow the tutorial [here](https://nodejs.org/de/docs/guides/nodejs-docker-webapp) using `npm`.

* Create a `Dockerfile` for your application
* Build your container using something similar to `docker build -t MyUser/ImageName .`
* Run your container using something similar to `docker run -p 8080:8080 -t myDockerImage`
* Test that your application functions correctly when running in the docker container.
