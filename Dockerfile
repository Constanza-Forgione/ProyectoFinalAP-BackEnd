FROM amazoncorretto:8-alpine-jdk
MAINTAINER CF
COPY target/CF-0.0.1-SNAPSHOT.jar CF-app.jar
ENTRYPOINT ["java","-jar","/CF-app.jar"]
