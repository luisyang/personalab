//: appendixa:LocalCopy.java
// Creating local copies with clone().
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import java.util.*;

class MyObject implements Cloneable {
  int i;
  MyObject(int ii) { i = ii; }
  public Object clone() {
    Object o = null;
    try {
      o = super.clone();
    } catch(CloneNotSupportedException e) {
      System.err.println("MyObject can't clone");
    }
    return o;
  }
  public String toString() {
    return Integer.toString(i);
  }
}

public class LocalCopy {
  static Test monitor = new Test();
  static MyObject g(MyObject v) {
    // Passing a reference, 
    // modifies outside object:
    v.i++;
    return v;
  }
  static MyObject f(MyObject v) {
    v = (MyObject)v.clone(); // Local copy
    v.i++;
    return v;
  }
  public static void main(String[] args) {
    MyObject a = new MyObject(11);
    MyObject b = g(a);
    // Testing reference equivalence,
    // not object equivalence:
    if(a == b) 
      System.out.println("a == b");
    else 
      System.out.println("a != b");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    MyObject c = new MyObject(47);
    MyObject d = f(c);
    if(c == d) 
      System.out.println("c == d");
    else 
      System.out.println("c != d");
    System.out.println("c = " + c);
    System.out.println("d = " + d);
    monitor.expect(new String[] {
      "a == b",
      "a = 12",
      "b = 12",
      "c != d",
      "c = 47",
      "d = 48"
    });
  }
} ///:~