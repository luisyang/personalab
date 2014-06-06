//: c15:rmi:DisplayPerfectTime.java
// Uses remote object PerfectTime.
// {Broken}
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package c15.rmi;
import java.rmi.*;
import java.rmi.registry.*;

public class DisplayPerfectTime {
  public static void main(String[] args) 
  throws Exception {
    System.setSecurityManager(
      new RMISecurityManager());
    PerfectTimeI t = 
      (PerfectTimeI)Naming.lookup(
        "//peppy:2005/PerfectTime");
    for(int i = 0; i < 10; i++)
      System.out.println("Perfect time = " +
        t.getPerfectTime());
  }
} ///:~