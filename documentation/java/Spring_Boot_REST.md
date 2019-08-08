# Spring Boot REST

The purpose of this task is to create a simple Java Spring Boot application with a single RESTful endpoint "GET /helloWorld". The task is designed to get you familiar with the Capco Digital Engineering coding standards and practices and end up with a working development environment. 

You should refer to the following Capco standards page to complete the task: [Java Standards](https://google.github.io/styleguide/javaguide.html)

## PluralSight

<https://app.pluralsight.com/library/courses/spring-fundamentals/table-of-contents> - Optional beginner's course on Spring

## Task

Prerequisites:

-   [JDK 1.8](index) or later and don't forget to 'Set JAVA\_HOME variable' -  <http://www.baeldung.com/java-home-on-windows-7-8-10-mac-os-x-linux>

-   [Gradle 4+](http://www.gradle.org/downloads) or [Maven](http://www.baeldung.com/install-maven-on-windows-linux-mac)

    -   Trouble installing Maven on MacOS - [Install Maven on Mac OS X manually](https://crunchify.com/how-to-install-maven-on-mac-os-x-manually-fix-unsupportedclassversionerror-orgapachemavenclimavencli/)
    -   Guide to the [Maven](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html) build cycle

-   [Postman](https://www.getpostman.com/)
-   IDE

    -   [Spring Tool Suite (STS)](https://spring.io/guides/gs/sts)

    -   [IntelliJ IDEA](https://spring.io/guides/gs/intellij-idea/)

If you have experience of Spring and REST then you can attempt the task yourself, otherwise follow the <https://spring.io/guides/gs/rest-service/> tutorial. The task should be completed using the Gradle build tool, as we plan to use this tool rather than Maven where possible.

At the end of the task, you should be able to call a local <http://localhost:8080>[/helloWorld](http://localhost:8080/helloWorld) method and obtain the following JSON response: 

>     {
>        "message": "Hello World!"
>     }

Test your new endpoint by using the [Postman](https://www.getpostman.com/) tool, creating a new GET request and examining the body and headers of the response.

![](attachments/418971655/423919638.png?height=250)

## Notes:

### Troubleshooting 1:

For users with > Mac High Sierra:

When following the instructions to install Maven, modify your .bashsrc to the following:

`export PATH=$PATH:/opt/apache-maven/bin`

Instead of the instructed:

`export }}{{PATH=$PATH:/opt/apache-maven/bin`

### Troubleshooting 2:

If you get this error: 
`implicit super constructor object() is undefined. must explicitly invoke another constructor it means that your IDE is not recognising JRE. You need it configure your JRE build path ` 

Follow this link to do so: <https://stackoverflow.com/questions/17240708/implicit-super-constructor-object-is-undefined-must-explicitly-invoke-another>



