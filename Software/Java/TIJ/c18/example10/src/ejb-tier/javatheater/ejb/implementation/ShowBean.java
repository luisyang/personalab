// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package javatheater.ejb.implementation;

import javatheater.ejb.*;

import javax.ejb.*;

/**
 * This is the <code>Show</code> entity bean implementation.
 *
 * <p>A Show has an id (which is also its primary key),
 * a movie, a showtime and the number of available seats.
 *
 * @see javatheater.ejb.ShowHome
 * @see javatheater.ejb.Show
 *
 * @ejb:bean
 *  name="Show"
 *  local-jndi-name="javatheater/Show"
 *  view-type="local"
 *  type="CMP"
 *  primkey-field="id"
 *  reentrant="False"
 *
 * @ejb:pk class="java.lang.Integer"
 *
 * @ejb:home
 *   local-class="javatheater.ejb.ShowHome"
 *
 * @ejb:interface
 *   local-class="javatheater.ejb.Show"
 *
 * @ejb:finder signature="Collection findByMovie(java.lang.Integer moviePK)"
 * @ejb:finder signature="java.util.Collection findAll()"
 */
public abstract class ShowBean implements EntityBean {
 /**
  * Validates the primary key and initializes the bean properties.
  *
  * @ejb:create-method
  */
  public Integer ejbCreate(
    Integer id, Movie movie,
    String showTime, int availableSeats
  )
    throws CreateException
  {
    if (id == null)
      throw new CreateException("Id can not be null");

    if (id.intValue() == 0)
      throw new CreateException("Id can not be zero");

    if (movie == null)
      throw new CreateException("A movie must be provided");

    setId(id);
    setShowTime(showTime);
    setAvailableSeats(availableSeats);

    return null;
  }

  public void ejbPostCreate(
    Integer id, Movie movie,
    String showTime, int availableSeats
  )
  {
    // todo: does this really have to be in postCreate()?
    setMovie(movie);
  }

  public void ejbLoad() {}
  public void ejbStore() {}
  public void ejbActivate() {}
  public void ejbPassivate() {}
  public void setEntityContext(EntityContext ctx) {}
  public void unsetEntityContext() {}

  /**
  * Returns the Show id, which is also the Show's primary key.
  *
  * @ejb:pk-field
  * @ejb:persistent-field
  * @ejb:interface-method
  */
  abstract public Integer getId();

  /**
   * @ejb:persistent-field
   */
  abstract public void setId(Integer id);

  /**
   * Sets the movie for this show.
   *
   * Note that this is no longer a CMP field,
   * but a Container Managed Releationship (CMR) field
   * (see generated deployment descriptor).
   *
   * @ejb:interface-method
   *
   * @ejb:relation
   *   name="Show-Movie"
   *   role-name="Show-has-a-Movie"
   */
   abstract public void setMovie(Movie movie);

  /**
   * Gets the movie for this show.
   *
   * Now a CMR field.
   *
   * @see #setMovie(Movie)
   *
   * @ejb:interface-method
   */
   abstract public Movie getMovie();

  /**
   * Returns the Show time.
   *
   * @ejb:persistent-field
   * @ejb:interface-method
   */
  abstract public String getShowTime();

  /**
   * Sets the Show time.
   *
   * @ejb:persistent-field
   * @ejb:interface-method
   */
  abstract public void setShowTime(String showTime);

  /**
   * Returns the Show's available seats.
   *
   * @ejb:persistent-field
   * @ejb:interface-method
   */
  abstract public int getAvailableSeats();

  /**
   * Sets the Show's available seats.
   *
   * @ejb:persistent-field
   * @ejb:interface-method
   */
  abstract public void setAvailableSeats(int availableSeats);
}