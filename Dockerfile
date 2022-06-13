FROM openjdk:8
ADD target/DemoApp-0.0.1-SNAPSHOT.jar DemoApp.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","DemoApp.jar"]