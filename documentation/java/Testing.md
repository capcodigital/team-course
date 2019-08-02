# Testing

Testing is vital to ensure the quality of our code but also to allow refactoring of our code without fear. The purpose of this task is to create unit and integration tests for the java application. 

Firstly, I **highly recommend reading** the following article which is an excellent summary of the different type of testing: <https://martinfowler.com/articles/practical-test-pyramid.html>

## Task

Prerequisites: 

-   Add TestNG plugin to your IDE

![](attachments/418807871/418873468.png)

You will use TestNG suite to write your tests. More information on TestNG is available: [Get Started](http://www.lenar.io/how-to-get-started-with-testng-and-spring-boot/), [TestNG](http://testng.org/doc/) and [Spring Integration Example](https://examples.javacodegeeks.com/enterprise-java/testng/testng-spring-integration-example/). 

The following test types should be created:

-   Unit tests - testing each of the public methods
-   Integration tests - testing each of the RESTful endpoints end-to-end (currently GET /helloWorld).

Your tests should be held within a separate folder:

![](attachments/418807871/418775105.png)

which will allow tools which monitor the code coverage of the tests to ignore the tests themselves. You should download the <https://www.sonarqube.org/> plugin to ensure that the tests you have written cover all of the code.

Helpful links:

[Spring mvc test framework guide](https://docs.spring.io/spring/docs/current/spring-framework-reference/testing.html#spring-mvc-test-framework)


