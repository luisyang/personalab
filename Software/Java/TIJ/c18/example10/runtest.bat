@echo off
SET JAVA_EXE="%JAVA_HOME%\bin\java.exe"
SET JBOSS_CLIENT="%JBOSS_HOME%"\client
SET CLIENT_CLASSPATH=dist\javatheater-client.jar;build;src\rmiclients\;%JBOSS_CLIENT%\jboss-j2ee.jar;%JBOSS_CLIENT%\jboss-client.jar;%JBOSS_CLIENT%\jboss-common-client.jar;%JBOSS_CLIENT%\log4j.jar;%JBOSS_CLIENT%\jbosssx-client.jar;%JBOSS_CLIENT%\jnp-client.jar

start javaw -classpath %CLIENT_CLASSPATH%;%JUNIT_HOME%\junit.jar;%CLASSPATH% junit.swingui.TestRunner %1
