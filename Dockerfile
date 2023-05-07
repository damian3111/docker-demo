FROM eclipse-temurin
WORKDIR /customFolder1
VOLUME /customFolder1/CustomFolder
COPY build/libs/demo-0.0.1-SNAPSHOT.jar customFolder1/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "customFolder1/app.jar"]