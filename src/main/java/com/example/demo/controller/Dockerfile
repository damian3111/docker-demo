FROM eclipse-temurin
ARG JAR_FILE= /build/libs/demo-0.0.1-SNAPSHOT.jar
COPY %{JAR_FILE} app.jar
EXPOSE 8084
ENTRYPOINT ["java ", "-jar", "/app.jar"]