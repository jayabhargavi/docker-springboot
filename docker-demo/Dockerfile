FROM java:8-jdk-alpine

COPY ./target/docker-demo-1.0.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch docker-demo-1.0.jar'

EXPOSE 80 8080

ENTRYPOINT ["java","-jar","docker-demo-1.0.jar"] 