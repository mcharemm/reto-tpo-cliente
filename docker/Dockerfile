FROM openjdk:8-jdk-alpine
ENV TZ=America/Lima
RUN apk add tzdata && \
    mkdir /app
WORKDIR /app
COPY target/*.jar /app
CMD ["sh", "-c", "java -jar /app/service-clientes-1.0-SNAPSHOT.jar"]