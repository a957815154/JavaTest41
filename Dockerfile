FROM registry.saas.hand-china.com/hap-cloud/base:latest

COPY ./target/test4.jar /test4.jar

CMD ["java", "-jar", "test4.jar"]