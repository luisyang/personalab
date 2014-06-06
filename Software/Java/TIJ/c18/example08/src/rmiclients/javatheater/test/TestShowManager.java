// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package javatheater.test;

import javatheater.ejb.*;
import javax.naming.*;
import javax.rmi.PortableRemoteObject;

import junit.framework.*;

public class TestShowManager extends TestCase {
  ShowManagerHome showManagerHome;

  public TestShowManager(String name) {
    super(name);
  }

  public void setUp() {
    try {
      Context initial = new InitialContext();

      showManagerHome =
        (ShowManagerHome) PortableRemoteObject.narrow(
          initial.lookup("javatheater/ShowManager"),
          ShowManagerHome.class
        );
    }
    catch (Exception e) {
      fail("Error getting home interfaces: " + e.toString());
    }
  }

  public void testCreateRemoveMovie() {
    final String MOVIE_TITLE = "A Bug's Life";

    try {
      ShowManager manager = showManagerHome.create();
      Integer newMoviePK = manager.createMovie(MOVIE_TITLE);
      manager.deleteMovie(newMoviePK);
    }
    catch (Exception e) {
      fail(e.toString());
    }
  }
}