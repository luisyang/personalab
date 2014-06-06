// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package javatheater.ejb;

import javax.ejb.*;
import java.util.*;
import java.rmi.RemoteException;

public interface MovieHome extends EJBHome {
  public Movie create(Integer id, String title)
    throws RemoteException, CreateException;

  public Movie findByPrimaryKey(Integer id)
    throws RemoteException, FinderException;

  public Collection findAll()
    throws RemoteException, FinderException;
}
