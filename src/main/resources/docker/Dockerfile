FROM maven:3.9.5-amazoncorretto-17 as BUILD

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

FROM amazoncorretto:17-alpine-jdk

WORKDIR /app

COPY --from=BUILD /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
