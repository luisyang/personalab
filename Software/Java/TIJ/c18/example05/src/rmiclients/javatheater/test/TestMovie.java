// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package javatheater.test;

import javatheater.ejb.*;
import javax.naming.*;
import junit.framework.*;

public class TestMovie extends TestCase {
  MovieHome movieHome;

  public TestMovie(String name) {
    super(name);
  }

  public void setUp() {
    try {
      Object objRef = new InitialContext().lookup("javatheater/Movie");
      movieHome
        = (MovieHome) javax.rmi.PortableRemoteObject.narrow(
         objRef, MovieHome.class);
    }
    catch (Exception e) {
      fail("Error getting home interfaces: " + e.toString());
    }
  }

  public void testCreateRemove() {
    try {
      int pkValue = (int) System.currentTimeMillis() % Integer.MAX_VALUE;

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
      int pkValue = (int) System.currentTimeMillis() % Integer.MAX_VALUE;

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