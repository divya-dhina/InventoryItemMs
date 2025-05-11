# Stage 1: Build with Maven + JDK 21
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /build

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

# Stage 2: Run on slim JDK 21
FROM openjdk:21-jdk-slim
WORKDIR /app

# Copy the fat jar and DB file (if you want to preserve existing DB)
COPY --from=build /build/target/inventoryitem-ms-0.0.1-SNAPSHOT.jar app.jar

# Optional: Copy an existing SQLite DB if needed
# COPY inventoryitem-ms.db ./inventoryitem-ms.db

EXPOSE 8096

ENTRYPOINT ["java","-jar","app.jar"]
