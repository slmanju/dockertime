FROM openjdk:8-jdk-alpine

VOLUME /tmp

COPY target/reactive-web-mongo-0.0.1-SNAPSHOT.jar reactive-web-mongo-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=docker", "/reactive-web-mongo-0.0.1-SNAPSHOT.jar"]