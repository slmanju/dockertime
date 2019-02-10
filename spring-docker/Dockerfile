FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/spring-docker-0.0.1-SNAPSHOT.jar spring-docker-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/spring-docker-0.0.1-SNAPSHOT.jar"]
