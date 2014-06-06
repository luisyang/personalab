// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package javatheater.ejb.implementation;

import javax.ejb.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Collection;

/**
 * This is the <code>Movie</code> entity bean implementation.
 *
 * <p>A <code>Movie</code> is a movie that's currently playing, like "Return of the JNDI".
 *
 * <p>A Movie has an id (which is also its primary key) and a title.
 *
 * @see javatheater.ejb.MovieHome
 *
 * @ejb:bean
 *  name="Movie"
 *  local-jndi-name="javatheater/Movie"
 *  view-type="local"
 *  type="CMP"
 *  primkey-field="id"
 *  reentrant="False"
 *
 * @ejb:pk class="java.lang.Integer"
 *
 * @ejb:home
 *  local-class="javatheater.ejb.MovieHome"
 *
 * @ejb:interface
 *  local-class="javatheater.ejb.Movie"
 *
 * @ejb:finder signature="java.util.Collection findByTitle(java.lang.String title)"
 * @ejb:finder signature="java.util.Collection findAll()"
 *
 * @ejb:env-entry
 *  name="CounterName"
 *  value="MoviePKCounter"
 *  type="java.lang.String"
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
   * Home method returning the name of the counter (a String)
   * to generate unique movie primary key values. The actual
   * name is defined as an environment entry of the Movie bean.
   *
   * @ejb:home-method
   */
  public String ejbHomeGetCounterName() {
    try {
      Context initial = new InitialContext();
      return (String) initial.lookup("java:comp/env/CounterName");
    }
    catch(NamingException e) {
      throw new EJBException(e);
    }
  }

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

  /**
   * Gets the shows that feature this movie.
   *
   * @ejb:interface-method
   *
   * @ejb:relation
   *   name="Show-Movie"
   *   role-name="Movie-has-many-Shows"
   */
  public abstract Collection getShows();

  /**
   * Sets the shows that feature this movie.
   *
   * @ejb:interface-method
   */
  public abstract void setShows(Collection shows);
}
