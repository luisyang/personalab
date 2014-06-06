//: c15:rmi:PerfectTimeI.java
// The PerfectTime remote interface.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package c15.rmi;
import java.rmi.*;

public interface PerfectTimeI extends Remote {
  long getPerfectTime() throws RemoteException;
} ///:~