FROM amazoncorretto:21
WORKDIR /app
COPY simple-docker-app/target/simple-docker-app-0.0.1-SNAPSHOT.jar docker-app.jar
ENTRYPOINT ["java", "-jar", "docker-app.jar"]