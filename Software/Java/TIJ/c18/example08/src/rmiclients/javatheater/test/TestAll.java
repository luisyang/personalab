// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package javatheater.test;

import javatheater.ejb.*;
import junit.framework.*;

public class TestAll extends TestCase {
  public TestAll(String name) {
    super(name);
  }

  public static Test suite() {
      TestSuite suite = new TestSuite();

      suite.addTestSuite(TestShowManager.class);

      return suite;
  }
}