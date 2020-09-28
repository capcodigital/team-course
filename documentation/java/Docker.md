# Docker

This task involves taking the application which was created in the [Spring Boot REST](Spring_Boot_REST) task and moving it into a Docker container.

## Udemy

<https://capco.udemy.com/course/learn-docker/>

## Task

Prerequisites:

<https://docs.docker.com/installation/#installation>

The task involves you setting up and running a newly created docker image and running your application using that docker image. You can follow the tutorial here using Maven: <https://spring.io/guides/gs/spring-boot-docker/>. 

-   You should be able to create the docker image using a command similar to:

>     ./gradlew build docker

-   With maven, first generate the application Jar file

>     ./mvnw package

-   Create a docker image of your application

>     ./mvnw install dockerfile:build

-   and to run the application using a command similar to:

>     ./docker run -p 8080:8080 -t myDockerImage

-   Test that your application functions correctly when running in the docker container.

![](attachments/418742301/423886869.png?height=250)

## Notes:

#### Clean build:

To clean, build and run the application as a spring boot application, run: ./gradle clean build bootRun.

This command results in a Mockito Test failure if you have Java 11 installed. You would require a Java 8 to be installed instead.

## Extra Help - How docker works

[Docker Documentation](https://docs.docker.com/)

[![How Docker works.](https://img.youtube.com/vi/IEGPzmxyIpo/0.jpg)](https://www.youtube.com/watch?v=IEGPzmxyIpo)





