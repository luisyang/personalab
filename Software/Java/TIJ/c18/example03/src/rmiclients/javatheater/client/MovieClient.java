// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package javatheater.client;

import javax.naming.*;
import javatheater.ejb.*;

public class MovieClient {
  public static void main(String[] args) {
    try {
      javax.naming.Context initial =
        new javax.naming.InitialContext();
      Object objRef = initial.lookup("javatheater/Movie");
      MovieHome movieHome =
        (MovieHome) javax.rmi.PortableRemoteObject.narrow(
          objRef,
          MovieHome.class);

      // Generate a primary key value
      int pkValue = (int) System.currentTimeMillis() % Integer.MAX_VALUE;

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
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
