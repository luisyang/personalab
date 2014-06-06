//: c15:ejb:PerfectTimeBean.java
// Simple Stateless Session Bean 
// that returns current system time.
// {Depends: j2ee.jar}
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import java.rmi.*;
import javax.ejb.*;

public class PerfectTimeBean 
  implements SessionBean {
  private SessionContext sessionContext;
  //return current time
  public long getPerfectTime() { 
     return System.currentTimeMillis();
  }
  // EJB methods
  public void ejbCreate() 
  throws CreateException {}
  public void ejbRemove() {}
  public void ejbActivate() {}
  public void ejbPassivate() {}
  public void 
  setSessionContext(SessionContext ctx) {
    sessionContext = ctx;
  }
}///:~