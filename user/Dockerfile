FROM maven:3.8.4-openjdk-17-slim AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/user*.jar /app/user.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "user.jar"] 