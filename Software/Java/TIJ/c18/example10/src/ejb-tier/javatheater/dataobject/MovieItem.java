// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package javatheater.dataobject;

import java.io.Serializable;

/**
 * A MovieItem is a data obejct used to transfer information
 * between the client tier and the ejb tier.
 */
public class MovieItem implements Serializable {
  public Integer pk;
  public String title;

  public MovieItem(Integer pk, String title) {
    this.pk = pk;
    this.title = title;
  }

  public String toString() {
    return "[" + pk.toString() + "] " + title;
  }
}
