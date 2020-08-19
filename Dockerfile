# Dockerfile meant for local build (not via Jenkins)
ARG REVISION=latest
FROM openjdk:8-jdk-alpine
ENV LANG C.UTF-8

#ADD docker_bootstrap.yml bootstrap.yml
ADD target/spring-webflux*.jar spring-webflux-demo.jar
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "spring-webflux-demo.jar"]
ENV LANG C.UTF-8

EXPOSE 7710
