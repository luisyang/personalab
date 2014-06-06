//: c15:rmi:PerfectTime.java
// The implementation of 
// the PerfectTime remote object.
// {Broken}
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package c15.rmi;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.net.*;

public class PerfectTime 
extends UnicastRemoteObject
implements PerfectTimeI {
  // Implementation of the interface:
  public long getPerfectTime() 
      throws RemoteException {
    return System.currentTimeMillis();
  }
  // Must implement constructor 
  // to throw RemoteException:
  public PerfectTime() throws RemoteException {
    // super(); // Called automatically
  }
  // Registration for RMI serving. Throw 
  // exceptions out to the console.
  public static void main(String[] args) 
  throws Exception {
    System.setSecurityManager(
    new RMISecurityManager());
    PerfectTime pt = new PerfectTime();
    Naming.bind(
      "//peppy:2005/PerfectTime", pt);
    System.out.println("Ready to do time");
  }
} ///:~