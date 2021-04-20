FROM amazoncorretto:11-alpine-jdk
MAINTAINER baeldung.com

# copy the packaged jar file into our docker image
COPY accounts-monolith/target/accounts-monolith-0.0.1-SNAPSHOT.jar /demo.jar

# set the startup command to execute the jar
CMD ["java", "-jar", "/demo.jar"]