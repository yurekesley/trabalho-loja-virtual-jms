FROM adoptopenjdk/openjdk11:alpine as build
WORKDIR /workspace/


COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY app-ear app-ear
COPY app-jms app-jms
COPY app-web app-web
# COPY src src

RUN ./mvnw install -DskipTests
# RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.war)

FROM michelav/wildfly-alpine

WORKDIR /opt/wildfly/standalone/deployments/app-web/

ARG DEPENDENCY=/workspace

COPY --from=build ${DEPENDENCY}/app-ear/target/app-ear-1.0-SNAPSHOT.ear .

WORKDIR /opt/wildfly/standalone/configuration

COPY standalone-full.xml standalone.xml

CMD ["/opt/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]
