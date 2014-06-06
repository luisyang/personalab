# From Thinking in Java, 2nd Edition
# At http://www.BruceEckel.com
# (c) Bruce Eckel 2000
# Copyright notice in Copyright.txt
# Automatically-generated MAKEFILE 
# For examples in directory .\c15\servlets
# using the JDK 1.2 compiler
# Invoke with: make
# NOTE: this assumes you've installed
# the Tomcat Servlet/JSP container, downloadable
# from http://jakarta.apache.org

ifndef TOMCAT_HOME
$(error You must install Tomcat from \
 jakarta.apache.org and set the TOMCAT_HOME \
 environment variable) 
endif

SERVLETDIR = $(TOMCAT_HOME)/webapps/examples/WEB-INF/classes
JVC = javac
JVCFLAGS = -d $(SERVLETDIR)
.SUFFIXES : .class .java
$(SERVLETDIR)/%.class: %.java
	$(JVC) $(JVCFLAGS) $<

all:  \
	$(SERVLETDIR)/E09_PersistentServlet.class \
	$(SERVLETDIR)/E10_Cookies.class \
	$(SERVLETDIR)/E11_Sessions.class \
	$(SERVLETDIR)/E12_Expiration.class

$(SERVLETDIR)/E09_PersistentServlet.class: E09_PersistentServlet.java
$(SERVLETDIR)/E10_Cookies.class: E10_Cookies.java
$(SERVLETDIR)/E11_Sessions.class: E11_Sessions.java
$(SERVLETDIR)/E12_Expiration.class: E12_Expiration.java

clean:
	del $(SERVLETDIR)/E09_PersistentServlet.class
	del $(SERVLETDIR)/E10_Cookies.class
	del $(SERVLETDIR)/E11_Sessions.class
	del $(SERVLETDIR)/E12_Expiration.class
