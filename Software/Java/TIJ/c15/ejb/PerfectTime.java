//: c15:ejb:PerfectTime.java
//# You must install the J2EE Java Enterprise 
//# Edition from java.sun.com and add j2ee.jar
//# to your CLASSPATH in order to compile
//# this file. See details at java.sun.com.
// Remote Interface of PerfectTimeBean
// {Depends: j2ee.jar}
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import java.rmi.*;
import javax.ejb.*;

public interface PerfectTime extends EJBObject {
  public long getPerfectTime() 
    throws RemoteException;
} ///:~