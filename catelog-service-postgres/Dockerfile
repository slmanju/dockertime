FROM openjdk:8-jdk-alpine

VOLUME /tmp

COPY target/catelog-service-postgres-0.0.1-SNAPSHOT.jar catelog-service-postgres-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/catelog-service-postgres-0.0.1-SNAPSHOT.jar"]