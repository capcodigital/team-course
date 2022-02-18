FROM openjdk:16-ea-29-oraclelinux8
VOLUME /tmp
EXPOSE 8090

ARG JAR_FILE
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]




