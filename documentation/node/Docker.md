# Docker

This task involves taking the application which was created in the [Spring Boot REST](Spring_Boot_REST) task and moving it into a Docker container.

## PluralSight

<https://app.pluralsight.com/library/courses/docker-getting-started/table-of-contents>

## Task

Prerequisites:

<https://docs.docker.com/installation/#installation>

The task involves you setting up and running a newly created docker image and running your application using that docker image. You can follow the tutorial here using Npm: <https://nodejs.org/de/docs/guides/nodejs-docker-webapp/>. 


-   Create a Dockerfile for your application

-   Build your container using something similar to the below (given you are in the same folder as your Dockerfile).

>     docker build -t MyUser/ImageName .

-   Run your container using something similar to the below.

>     docker run -p 8080:8080 -t myDockerImage


-   Test that your application functions correctly when running in the docker container.
