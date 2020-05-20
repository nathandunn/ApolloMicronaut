FROM openjdk:14-alpine
COPY build/libs/Apollo-*-all.jar Apollo.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "Apollo.jar"]