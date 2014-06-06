// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package javatheater.ejb.implementation;

import javatheater.ejb.*;
import javatheater.dataobject.MovieItem;
import javax.ejb.*;
import javax.naming.*;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ejb:bean
 *  type = "Stateless"
 *  name = "ShowListing"
 *  jndi-name = "javatheater/ShowListing"
 *  reentrant = "false"
 *
 * @ejb:home
 *  remote-class="javatheater.ejb.ShowListingHome"
 *
 * @ejb:interface
 *  remote-class="javatheater.ejb.ShowListing"
 */
public abstract class ShowListingBean
  implements SessionBean
{
  MovieHome movieHome = null;

  /**
  * @ejb:create-method
  */
  public void ejbCreate() throws CreateException {
    try {
      movieHome = (MovieHome)
        new InitialContext().lookup("javatheater/Movie");
    }
    catch (NamingException e) {
      throw new EJBException(e);
    }
  }

  /**
   * @ejb:interface-method
   */
  public MovieItem getMovie(Integer moviePK) {
    try {
      Movie movie = movieHome.findByPrimaryKey(moviePK);
      return new MovieItem(movie.getId(), movie.getTitle());
    }
    catch (FinderException e) {
      return null;
    }
  }

  /**
   * @ejb:interface-method
   */
  public MovieItem [] getMovie(String title) {
    try {
      Collection foundMovies = movieHome.findByTitle(title);
      MovieItem [] items = new MovieItem[foundMovies.size()];

      int index = 0;
      Iterator movies = foundMovies.iterator();
      while (movies.hasNext()) {
        Movie movie = (Movie) movies.next();
        items[index++] = new MovieItem(movie.getId(), movie.getTitle());
      }

      return items;
    }
    catch (FinderException e) {
      throw new EJBException(e);
    }
  }

  /**
   * @ejb:interface-method
   */
  public MovieItem [] getMovies() {
    try {
      Collection foundMovies = movieHome.findAll();
      MovieItem [] items = new MovieItem[foundMovies.size()];

      int index = 0;
      Iterator movies = foundMovies.iterator();
      while (movies.hasNext()) {
        Movie movie = (Movie) movies.next();
        items[index++] = new MovieItem(movie.getId(), movie.getTitle());
      }

      return items;
    }
    catch (FinderException e) {
      throw new EJBException(e);
    }
  }
}