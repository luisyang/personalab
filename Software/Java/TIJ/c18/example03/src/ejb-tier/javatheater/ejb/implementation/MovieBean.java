// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package javatheater.ejb.implementation;

import javax.ejb.CreateException;
import javax.ejb.EntityBean;
import javax.ejb.EntityContext;

public abstract class MovieBean implements EntityBean {
    // EJB/Container contracts
    public Integer ejbCreate(Integer id, String title)
            throws CreateException {

        if (id == null)
            throw new CreateException("Primary key cannot be null");
        if (id.intValue() == 0)
            throw new CreateException("Primary key cannot be zero");

        setId(id);
        setTitle(title);

        return null;
    }

    public void ejbPostCreate(Integer id, String title) {
    }

    public void ejbLoad() {
    }

    public void ejbStore() {
    }

    public void ejbRemove() {
    }

    public void ejbActivate() {
    }

    public void ejbPassivate() {
    }

    public void setEntityContext(EntityContext ctx) {
    }

    public void unsetEntityContext() {
    }

    // Accessors/Mutators for persistent fields.

    // Note that the setId() method is not part of the
    // home interface, so that client applications cannot
    // arbitrarily modify the primary key
    public abstract Integer getId();

    public abstract void setId(Integer id);

    public abstract String getTitle();

    public abstract void setTitle(String title);
}
