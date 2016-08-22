FROM java:8

WORKDIR /data

COPY DockerJava.jar DockerJava.jar
CMD ["/usr/lib/jvm/java-8-openjdk-amd64/bin/java", "-jar", "DockerJava.jar"]

