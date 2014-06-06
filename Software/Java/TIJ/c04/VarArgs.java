//: c04:VarArgs.java
// Using the array syntax to create
// variable argument lists.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;

class A { int i; }

public class VarArgs {
  static Test monitor = new Test();
  static void f(Object[] x) {
    for(int i = 0; i < x.length; i++)
      System.out.println(x[i]);
  }
  public static void main(String[] args) {
    f(new Object[] { 
        new Integer(47), new VarArgs(), 
        new Float(3.14), new Double(11.11) });
    f(new Object[] {"one", "two", "three" });
    f(new Object[] {new A(), new A(), new A()});
    monitor.expect(new Object[] {
      "47",
      "%%VarArgs@.+",
      "3.14",
      "11.11",
      "one",
      "two",
      "three",
      new TestExpression("%%A@.+", 3)
    });
  }
} ///:~
