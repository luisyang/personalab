// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package javatheater.ejb;

import javax.ejb.*;
import java.rmi.RemoteException;

/**
 * A movie, with id and title.
 *
 * <b><font color="red" size="+1">TODO: 
 * Additional description is required</font></b>
 * <p>
 * Note that there is no setId() method in the
 * interface, to prevent clients from arbitrarily
 * changing a movie's primary key.
 */
public interface Movie extends EJBObject {
  public Integer getId() throws RemoteException;
  public String getTitle() throws RemoteException;
  public void setTitle(String title)
    throws RemoteException;
}
