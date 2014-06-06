//: c15:ejb:PerfectTimeHome.java
// Home Interface of PerfectTimeBean.
// {Depends: j2ee.jar}
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import java.rmi.*;
import javax.ejb.*;

public interface PerfectTimeHome extends EJBHome {
  public PerfectTime create() 
    throws CreateException, RemoteException;
} ///:~