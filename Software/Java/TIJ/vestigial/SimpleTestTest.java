//: X1:SimpleTestTest.java
// A set of unit tests for the testing
// framework class SimpleTest
// {Depends: junit.jar}
// {Broken} (Removed from build, will be removed from CVS )
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import java.io.StringWriter;
import com.bruceeckel.simpletest.*;
import java.util.*;
import junit.framework.*;

public class SimpleTestTest extends TestCase {
  class StringList extends ArrayList {
    public void append(String s) {
      String str = (String)remove(size() - 1);
      add(str.concat(s));
    }
  }
  private com.bruceeckel.simpletest.Test monitor;
  static final char[] s = new char[] {
    'c', 'h', 'a', 'r', 'a', 'r', 'r', 'a', 'y'
  };
  static final Object o = new Date();

  public SimpleTestTest(String name) {
    super(name);
  }
  protected void setUp() {
    monitor = new com.bruceeckel.simpletest.Test();
  }
  protected void tearDown() {
    monitor.cleanup();
  }
  private StringList generateTestOutput() {
    StringList output = new StringList();
    // Test print() methods
    System.out.print(true);
    output.add("true");    
    System.out.print('m');
    output.append(String.valueOf('m'));
    System.out.print(200);
    output.append(String.valueOf(200));
    System.out.print(123456789012345L);
    output.append(String.valueOf(123456789012345L));
    System.out.print(1.234f);
    output.append(String.valueOf(1.234f));
    System.out.print(1.234567e-50d);
    output.append(String.valueOf(1.234567e-50d));
    System.out.print(s);
    output.append(String.valueOf(s));
    System.out.print("string");
    output.append("string");
    System.out.print(o);
    output.append(String.valueOf(o));
    // Test println() methods
    System.out.println(true);
    output.append("true");
    System.out.println('m');
    output.add(String.valueOf('m'));
    System.out.println(200);
    output.add(String.valueOf(200));
    System.out.println(123456789012345L);
    output.add(String.valueOf(123456789012345L));
    System.out.println(1.234f);
    output.add(String.valueOf(1.234f));
    System.out.println(1.234567e-50d);
    output.add(String.valueOf(1.234567e-50d));
    System.out.println(s);
    output.add(String.valueOf(s));
    System.out.println("string");
    output.add("string");
    System.out.println(o);
    output.add(String.valueOf(o));
    return output;
  }
  public void testWriteOutput() {
    StringList output = generateTestOutput();
    // Dump output to StringWriter
    StringWriter sw = new StringWriter();
    monitor.writeOutput(sw);
    // Transfer content of
    // String[] output into StringWriter
    StringWriter expOutput = new StringWriter();
    Iterator it = output.iterator();
    while (it.hasNext())
      expOutput.write((String)it.next() + 
        System.getProperty("line.separator"));
    // Test if StringWriters match
    assertEquals(sw.toString(), expOutput.toString());
  }
  public void testExpectIgnoreOrder() {
    StringList output = generateTestOutput();
    // Change the order of output lines
    int i1 = (int)(Math.random() * output.size());
    int i2 = 0;
    while((i2 = (int)(Math.random()*output.size())) == i1);
    output.add(i1, output.remove(i2));
    try {
      monitor.expect(output.toArray());
      fail("Should raise a RuntimeException");
    } 
    catch (RuntimeException e) { }
    // Test if all of the output lines appear
    // in the expected output, regardless of order
    monitor.expect(
      (String[])output.toArray(new String[] { }),
      com.bruceeckel.simpletest.Test.IGNORE_ORDER);
  }
  public void testRegExpMultiLineObjects() {
    StringList output = generateTestOutput();
    // Add some TestExpression and MultiLine objects    
    System.out.println(o);
    output.add(new RegularExpression(".+"));
    for (int i = 0; i < 10; i++)
      System.out.println(o);
//    output.add(new MultiLine(String.valueOf(o), 5));
//    output.add(new MultiLine(
//      new TestExpression(".+"), 5));
    monitor.expect(output.toArray());
  }
  public void testExpect() {
    StringList output = generateTestOutput();
    // Stop one line short of expected output
    for (int i = 0; i < 9; i++)
      System.out.println(o);
//    output.add(new MultiLine(String.valueOf(o), 5));
//    output.add(new MultiLine(
//      new TestExpression(".+"), 5));
    try {
      monitor.expect(output.toArray());
      fail("Should raise a RuntimeException");
    }
    catch (RuntimeException e) { }
    // Finish printing expected output
    System.out.println(o);
    monitor.expect(output.toArray());
  }
  public void testAtLeast() {
    StringList output = generateTestOutput();
    // Stop one extra line
    for (int i = 0; i < 11; i++)
      System.out.println(o);
//    output.add(new MultiLine(String.valueOf(o), 5));
//    output.add(new MultiLine(
//      new TestExpression(".+"), 5));
    try {
      monitor.expect(output.toArray());
      fail("Should raise a RuntimeException");
    }
    catch (RuntimeException e) { }
    // Test if the captured output 
    // contains all the specified lines
    monitor.expect(output.toArray(),
      com.bruceeckel.simpletest.Test.AT_LEAST);
  }
  public static void main(String[] args) {
    junit.textui.TestRunner.run(SimpleTestTest.class);
  }
} ///:~
