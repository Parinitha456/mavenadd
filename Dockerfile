FROM openjdk:11

ADD target/mavenadd.jar mavenadd.jar

ENTRYPOINT ["java", "-jar","mavenadd.jar"]

EXPOSE 8090
