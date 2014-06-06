// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package javatheater.ejb.implementation;

import javax.ejb.*;

/**
 * @ejb:bean
 *  name="AutoCounter"
 *  local-jndi-name="javatheater/AutoCounter"
 *  view-type="local"
 *  type="CMP"
 *  primkey-field="name"
 *  reentrant="False"
 *
 * @ejb:pk class="java.lang.String"
 *
 * @ejb:home
 *  local-class="javatheater.ejb.AutoCounterHome"
 *
 * @ejb:interface
 *  local-class="javatheater.ejb.AutoCounter"
 *
 * @ejb:finder signature="java.util.Collection findAll()"
 */
public abstract class AutoCounterBean implements EntityBean {

  /**
   * Validates the primary key and initializes the bean properties.
   * @ejb:create-method
   */
  public String ejbCreate(String name)
    throws CreateException
  {
    if (name == null)
      throw new CreateException(
       "Counter name can not be null");
    if (name.length() == 0)
      throw new CreateException(
        "Counter name can not be an empty string");

    setName(name);
    setValue(0);

    return null;
  }

  public void ejbPostCreate(String name) {}
  public void ejbLoad() {}
  public void ejbStore() {}
  public void ejbActivate() {}
  public void ejbPassivate() {}
  public void setEntityContext(EntityContext ctx) {}
  public void unsetEntityContext() {}

  /**
   * @ejb:persistent-field
   * @ejb:interface-method
   */
  abstract public String getName();

  /**
   * @ejb:persistent-field
   */
  abstract public void setName(String name);

  /**
   * @ejb:persistent-field
   */
  abstract public int getValue();

  /**
   * @ejb:persistent-field
   */
  abstract public void setValue(int value);

  /**
   * Returns the next value in the sequence. Note
   * that this method starts its own transaction
   * ("RequiresNew" attribute), so that the counter
   * is not locked for a long time if the method is
   * called in the context of a longer transaction.
   *
   * @ejb:interface-method
   */
  public int getNext() {
    int value = getValue();
    value += 1;
    setValue(value);
    return value;
  }
}
