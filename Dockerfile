FROM gradle:jdk15 AS build
WORKDIR /home/gradle
COPY . .
RUN gradle build

FROM openjdk:15.0.1-oraclelinux7
WORKDIR /home
COPY --from=build /home/gradle/build/libs/extrip-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "/home/extrip-0.0.1-SNAPSHOT.jar"]