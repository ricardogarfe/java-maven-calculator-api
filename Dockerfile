FROM maven:3.8.4-jdk-11
MAINTAINER ricardogarfe

RUN adduser --gecos "First Last,RoomNumber,WorkPhone,HomePhone" --disabled-password jetty
USER jetty
WORKDIR /home/jetty

EXPOSE 8080
# Run subsequent commands as jetty user
USER jetty

ADD pom.xml /home/jetty
ADD src /home/jetty/src

RUN mvn package
# Run script
CMD mvn jetty:run
