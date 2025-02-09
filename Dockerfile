FROM openjdk:17
WORKDIR course
COPY target/course-0.0.1-SNAPSHOT.jar course.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "course.jar" ]