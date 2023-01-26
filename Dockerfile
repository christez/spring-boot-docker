FROM openjdk:11
EXPOSE 8080
ADD target/spring-boot-docker.jar spring-boot-docker.jar
ENTRYPOINT ["java", "-jar",  "-Xms128M",  "-Xmx1024M", "-XX:+UseG1GC", "/spring-boot-docker.jar"]