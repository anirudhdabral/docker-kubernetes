FROM openjdk:17-alpine
VOLUME /tmp
ADD target/devops-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]