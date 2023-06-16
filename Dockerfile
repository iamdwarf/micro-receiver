FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ./target/micro-receiver-0.0.1-SNAPSHOT.jar receiver.jar
ENTRYPOINT ["java", "-jar", "/receiver.jar"]