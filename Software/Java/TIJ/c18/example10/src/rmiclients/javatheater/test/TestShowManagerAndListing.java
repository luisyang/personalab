// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package javatheater.test;

import javatheater.ejb.*;
import javatheater.dataobject.MovieItem;

import javax.naming.*;
import javax.rmi.PortableRemoteObject;

import junit.framework.*;

public class TestShowManagerAndListing extends TestCase {
  ShowManagerHome showManagerHome;
  ShowListingHome showListingHome;

  public TestShowManagerAndListing(String name) {
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

      showListingHome =
        (ShowListingHome ) PortableRemoteObject.narrow(
          initial.lookup("javatheater/ShowListing"),
          ShowListingHome.class
        );
    }
    catch (Exception e) {
      fail("Error getting home interfaces: " + e.toString());
    }
  }

  public void testCreateRemoveMovie() {
    final String TITLE_1 = "A Bug's Life";
    final String TITLE_2 = "Fatal Exception";

    try {
      ShowManager manager = showManagerHome.create();
      ShowListing listing = showListingHome.create();

      Integer moviePK1 = manager.createMovie(TITLE_1);
      Integer moviePK2 = manager.createMovie(TITLE_2);

      MovieItem [] movies = listing.getMovies();
      assertTrue(
        "Invalid number of movies found " +
        "(make sure DB is clean before running tests)",
        (movies.length == 2)
      );

      assertEquals(TITLE_1, listing.getMovie(moviePK1).title);
      assertEquals(TITLE_2, listing.getMovie(moviePK2).title);

      for (int i = 0; i < movies.length; i++) {
        MovieItem movieItem = movies[i];
        manager.deleteMovie(movieItem.pk);
      }

      manager.remove();
    }
    catch (Exception e) {
      fail(e.toString());
    }
  }
}