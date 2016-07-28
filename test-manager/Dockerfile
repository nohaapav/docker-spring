FROM tomcat:8-jre8

MAINTAINER Pavol Noha <pavol.noha@topmonks.com>

EXPOSE 8080

RUN rm -rf /usr/local/tomcat/webapps/*
COPY target/test-manager.war /usr/local/tomcat/webapps/ROOT.war
CMD ["/usr/local/tomcat/bin/catalina.sh", "run"]