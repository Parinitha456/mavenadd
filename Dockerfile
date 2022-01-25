FROM tomcat:8.0.20-jre8
COPY target/Jenkinsadd-0.0.1-SNAPSHOT.jar /usr/local/tomcat/webapps/mavenadd.jar
