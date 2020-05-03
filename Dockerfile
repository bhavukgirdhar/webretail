FROM java:8
ADD /target/webretail-0.0.1-SNAPSHOT.jar webretail-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT [“java”, “-jar”, “/webretail-0.0.1-SNAPSHOT.jar”]