# API Documentation

This task is designed to automatically generate the API documentation for the application we created in [Spring Boot REST](Spring_Boot_REST). To do that, you will use [Swagger](https://swagger.io/). This tool allows the automatic generation of your API documentation, which can be distributed to customers and also allows you to test your endpoints.

## Task

You can follow a tutorial here: <http://www.baeldung.com/swagger-2-documentation-for-spring-rest-api>. Please only follow steps 1-5, OAuth Security is not a required implementation. The task is to add swagger to your Java application. When complete, you should be able to browse to the [http://localhost:8090/swagger-ui.html](http://localhost/swagger-ui.html)page and view the api documentation for your "GET /helloWorld" endpoint.

* You will need to add the "springfox-swagger2" and "springfox-swagger-ui" dependencies to your project and setup a configuration of which endpoints to document.
* You should also create or modify an "application.properties" file to setup your application to run on a specified port (not 8080).

![tree](attachments/418676767/424149031.png?height=250)

![config](attachments/418676767/423952413.png)

* Successful running of the Swagger documentation:

![swagger](attachments/418676767/418873395.png?height=250)
