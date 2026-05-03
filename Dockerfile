FROM eclipse-temurin:17-jdk
COPY target/rest-demo.jar rest-demo.jar
ENTRYPOINT ["java", "-jar","rest-demo.jar"]
