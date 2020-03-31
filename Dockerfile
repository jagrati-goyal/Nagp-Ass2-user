FROM openjdk:8
VOLUME /tmp
ADD target/user-0.0.1-SNAPSHOT.jar user.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "user.jar"]