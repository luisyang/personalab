// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package javatheater.ejb.implementation;

import javax.ejb.*;
import java.util.Collection;

/**
 * This is the <code>Movie</code> entity bean implementation.
 *
 * <p>A <code>Movie</code> is a movie that's currently playing, like "The Return of the JNDI".
 *
 * <p>A Movie has an id (which is also its primary key) and a title.
 *
 * @see javatheater.ejb.MovieHome
 *
 * @ejb:bean
 *  name="Movie"
 *  jndi-name="javatheater/Movie"
 *  type="CMP"
 *  primkey-field="id"
 *  reentrant="False"
 *
 * @ejb:pk class="java.lang.Integer"
 *
 * @ejb:home remote-class="javatheater.ejb.MovieHome"
 * @ejb:interface remote-class="javatheater.ejb.Movie"
 *
 * @ejb:finder signature="java.util.Collection findByTitle(java.lang.String title)"
 * @ejb:finder signature="java.util.Collection findAll()"
 */
public abstract class MovieBean implements EntityBean {
  /**
   * Validates the primary key and initializes the bean properties.
   *
   * @ejb:create-method
   */
  public Integer ejbCreate(Integer id, String title)
      throws CreateException
  {
    if (id == null)
        throw new CreateException("Primary key cannot be null");
    if (id.intValue() == 0)
        throw new CreateException("Primary key cannot be zero");

    setId(id);
    setTitle(title);

    return null;
  }

  /**
   * Do nothing
   */
  public void ejbPostCreate(Integer id, String title) {
  }

  public void ejbLoad() {}
  public void ejbStore() {}
  public void ejbActivate() {}
  public void ejbPassivate() {}
  public void setEntityContext(EntityContext ctx) {}
  public void unsetEntityContext() {}

  /**
   * Returns the Movie id, which is also the Movie primary key.
   *
   * @ejb:pk-field
   * @ejb:persistent-field
   * @ejb:interface-method
   */
  abstract public Integer getId();

  /**
   * This method will not be part of the remote interface,
   * but ejbdoclet will still generate its implementation.
   * It's called from ejbCreate().
   */
  abstract public void setId(Integer id);

  /**
   * Returns the Movie title.
   *
   * @ejb:persistent-field
   * @ejb:interface-method
   */
  abstract public String getTitle();

  /**
   * Sets the Movie title.
   *
   * @ejb:persistent-field
   * @ejb:interface-method
   */
  abstract public void setTitle(String title);
}
