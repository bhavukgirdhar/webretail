FROM openjdk:8
COPY /target/webretail-0.0.1-SNAPSHOT.jar /
WORKDIR /
EXPOSE 8080
ENTRYPOINT [“java”, “-jar”, “webretail-0.0.1-SNAPSHOT.jar”]