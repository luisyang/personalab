// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package javatheater.ejb.implementation;

import javatheater.ejb.*;

import javax.ejb.*;
import javax.naming.*;
import java.rmi.RemoteException;

/**
 * @ejb:bean
 *  type = "Stateless"
 *  name = "ShowManager"
 *  jndi-name = "javatheater/ShowManager"
 *  reentrant = "false"
 *
 * @ejb:home
 *  remote-class="javatheater.ejb.ShowManagerHome"
 *
 * @ejb:interface
 *  remote-class="javatheater.ejb.ShowManager"
 */
public abstract class ShowManagerBean
  implements SessionBean
{
  AutoCounterHome autoCounterHome = null;
  MovieHome movieHome = null;
  String movieCounterName = null;

  /**
   * @ejb:create-method
   */
  public void ejbCreate() throws CreateException {
    try {
      Context initial = new InitialContext();

      // Get the home interfaces for the EJB we'll use later
      autoCounterHome = (AutoCounterHome) initial.lookup("javatheater/AutoCounter");
      movieHome = (MovieHome) initial.lookup("javatheater/Movie");

      movieCounterName = movieHome.getCounterName();
    }
    catch (NamingException e) {
      throw new EJBException(e);
    }
    catch (RemoteException e) {
      throw new EJBException("Error accessing the Movie home interface", e);
    }
  }

  /**
   * Creates a new movie and returns the new movie's
   * primary key value.
   *
   * @ejb:interface-method
   */
  public Integer createMovie(String movieName)
    throws CreateException
  {
    try {
      Integer pk = new Integer(getCounter(movieCounterName).getNext());
      movieHome.create(pk, movieName);
      return pk;
    }
    catch (RemoteException e) {
      throw new EJBException(e);
    }
  }

  /**
   * Deletes a movie given its primary key
   *
   * @ejb:interface-method
   */
  public void deleteMovie(Integer moviePk)
    throws FinderException, RemoveException
  {
    try {
      Movie movie = movieHome.findByPrimaryKey(moviePk);
      movie.remove();
    }
    catch (RemoteException e) {
      throw new EJBException(e);
    }
  }

  /**
   * Utility method to get the primary key generator for the Movie bean
   */
  AutoCounter getCounter(String counterName) throws RemoteException, CreateException {
    AutoCounter counter = null;

    try {
      counter = autoCounterHome.findByPrimaryKey(counterName);
    }
    catch (FinderException e) {}

    if (counter == null)
      counter = autoCounterHome.create(counterName);

    return counter;
  }
}