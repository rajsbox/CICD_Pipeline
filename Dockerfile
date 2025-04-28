# Use a base image with JDK
FROM openjdk:17-jdk-slim

# Create app directory
WORKDIR /app

# Copy your JAR into the container
COPY target/WB-1.0.jar app.jar

# Expose the port your app uses
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
