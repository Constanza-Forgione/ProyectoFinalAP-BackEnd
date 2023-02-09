FROM amazoncorretto:8-alpine-jdk
COPY target/CF-0.0.1-SNAPSHOT.jar CF.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/CF.jar"]
