FROM openjdk:8
COPY /target/webretail-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app/
EXPOSE 8080
CMD exec java -jar webretail-0.0.1-SNAPSHOT.jar