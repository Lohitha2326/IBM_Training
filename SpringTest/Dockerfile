FROM openjdk:17
EXPOSE 8081
ADD target/test-app.jar test-app.jar
ENTRYPOINT [ "java","-jar","test-app.jar" ]