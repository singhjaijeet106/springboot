FROM tomcat:10.1.18
ENV CATALINA_HOME /usr/local/tomcat
EXPOSE 8080

ADD target/app.war ${CATALINA_HOME}/webapps/app.war
RUN cd ${CATALINA_HOME}/bin


ENTRYPOINT [ "source","startup.sh" ]