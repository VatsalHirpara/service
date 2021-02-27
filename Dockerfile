FROM openjdk:11.0-jre

WORKDIR /tmp

COPY target/service-0.0.1-SNAPSHOT.jar /tmp/service-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/tmp/service-0.0.1-SNAPSHOT.jar"]

EXPOSE 8089