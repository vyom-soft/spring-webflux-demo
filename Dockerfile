FROM openjdk:8-jdk-alpine
#ENV APP_PATH=/home/dev/IdeaProjects/spring-webflux-demo
#WORKDIR $APP_PATH
#WORKDIR /workspace

#RUN echo "$PWD"


ADD target/spring-webflux-demo*.jar spring-webflux-demo.jar
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "spring-webflux-demo.jar"]

EXPOSE 7720




