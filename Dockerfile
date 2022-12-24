FROM quay.io/wildfly/wildfly:26.1.2.Final-jdk11
ADD ripandoBaseConhecimento.war /opt/jboss/wildfly/standalone/deployments/
