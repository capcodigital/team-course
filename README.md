# digitalengineeringcourse
Introductory Digital Engineering Course

To start up the required mongo database, run the following:

docker-compose up -d if-db

To clean, build and run the application as a spring boot application, run:

./gradlew clean build bootRun

To build the application as a docker file, run the following:

gradle docker

To run the required dependencies using docker containers, run:

docker-compose up -d

To run the digitalengineeringcourse application itself, run:

docker run -d -p 8090:8090 --name digitalengineeringcourse manucapco/digitalengineeringcourse:latest

You should be able to access the following page: http://localhost:8090/swagger-ui.html
