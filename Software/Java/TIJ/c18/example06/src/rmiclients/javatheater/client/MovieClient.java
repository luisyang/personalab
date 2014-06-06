// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package javatheater.client;

import javax.naming.*;
import javax.rmi.PortableRemoteObject;
import javax.ejb.FinderException;
import javax.ejb.CreateException;

import javatheater.ejb.*;

import java.rmi.RemoteException;

public class MovieClient {
  public static final String COUNTER_NAME = "MoviePK";

  static AutoCounterHome autoCounterHome = null;
  static MovieHome movieHome = null;

  static void initHomes() throws NamingException {
    Context initial = new InitialContext();

    movieHome =
      (MovieHome) PortableRemoteObject.narrow(
        initial.lookup("javatheater/Movie"),
        MovieHome.class
      );

    autoCounterHome =
      (AutoCounterHome) PortableRemoteObject.narrow(
        initial.lookup("javatheater/AutoCounter"),
        AutoCounterHome.class
      );
  }

  static AutoCounter getCounter() throws RemoteException, CreateException {
    AutoCounter counter = null;

    try {
      counter = autoCounterHome.findByPrimaryKey(COUNTER_NAME);
    }
    catch (FinderException e) {}

    if (counter == null)
      counter = autoCounterHome.create(COUNTER_NAME);

    return counter;
  }

  public static void main(String[] args) {
    try {
      initHomes();

      // Generate a primary key value
      int pkValue = getCounter().getNext();

      // Create a new Movie entity
      Movie movie =
        movieHome.create(new Integer(pkValue), "Return of the JNDI");

      // As a test, locate the newly created entity
      movie = movieHome.findByPrimaryKey(new Integer(pkValue));

      // Access the bean properties
      System.out.println(movie.getId());
      System.out.println(movie.getTitle());

      // Remove the entity
      movie.remove();
    }
    catch (Exception e) {
      e.printStackTrace();
      System.exit(1);
    }
  }
}
