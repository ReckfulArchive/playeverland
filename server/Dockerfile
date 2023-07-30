FROM eclipse-temurin:19-jdk-alpine

COPY build/libs/playeverland-server-1.0-SNAPSHOT.jar /app/server.jar
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /app/server.jar"]
