// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package javatheater.test;

import javatheater.ejb.*;
import javax.naming.*;
import javax.rmi.PortableRemoteObject;
import javax.ejb.*;
import java.rmi.RemoteException;

import junit.framework.*;

public class TestMovie extends TestCase {
  public static final String COUNTER_NAME = "MoviePK";

  MovieHome movieHome;
  AutoCounterHome autoCounterHome;

  public TestMovie(String name) {
    super(name);
  }

  public void setUp() {
    try {
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
    catch (Exception e) {
      fail("Error getting home interfaces: " + e.toString());
    }
  }

  AutoCounter getCounter() throws RemoteException, CreateException {
    AutoCounter counter = null;

    try {
      counter = autoCounterHome.findByPrimaryKey(COUNTER_NAME);
    }
    catch (FinderException e) {}

    if (counter == null)
      counter = autoCounterHome.create(COUNTER_NAME);

    return counter;
  }

  public void testCreateRemove() {
    try {
      int pkValue = getCounter().getNext();

      Movie movie = movieHome.create(
        new Integer(pkValue),
        "The Return of the JNDI"
      );

      movie.remove();
    }
    catch (Exception e) {
      fail(e.toString());
    }
  }

  public void testFinder() {
    try {
      int pkValue = getCounter().getNext();

      Movie movie = movieHome.create(new Integer(pkValue), "The Object Of My Affection");
      movie = movieHome.findByPrimaryKey(new Integer(pkValue));
      assertEquals(movie.getTitle(), "The Object Of My Affection");
      movie.remove();
    }
    catch (Exception e) {
      fail(e.toString());
    }
  }
}