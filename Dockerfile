FROM openjdk:8
ADD target/springproject-0.0.1-snapshot.jar       springproject-0.0.1-snapshot.jar

ENTRYPOINT ["java","-jar","springproject-0.0.1-snapshot.jar"]