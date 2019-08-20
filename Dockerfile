FROM java:8-jdk-alpine
COPY ./target/shipping-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch shipping-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-jar","shipping-0.0.1-SNAPSHOT.jar"]