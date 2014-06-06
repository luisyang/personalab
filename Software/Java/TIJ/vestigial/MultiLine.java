//: com:bruceeckel:simpletest:MultiLine.java
// Describes duplicate regular expression lines.
// Should be combined with class TestExpression.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package vestigial;

public class MultiLine {
  private Object lines;
  private int numOfLines;
  public MultiLine(Object obj, int i) {
    lines = obj;
    numOfLines = i;
  }
  public Object getLines() {
    return lines;
  }
  public int getNumOfLines() {
    return numOfLines;
  }
} ///:~
