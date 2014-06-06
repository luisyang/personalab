//: appendixa:MutableInteger.java
// A changeable wrapper class.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import java.util.*;

class IntValue { 
  int n;
  IntValue(int x) { n = x; }
  public String toString() { 
    return Integer.toString(n);
  }
}

public class MutableInteger {
  static Test monitor = new Test();
  public static void main(String[] args) {
    ArrayList v = new ArrayList();
    for(int i = 0; i < 10; i++) 
      v.add(new IntValue(i));
    System.out.println(v);
    for(int i = 0; i < v.size(); i++)
      ((IntValue)v.get(i)).n++;
    System.out.println(v);
    monitor.expect(new String[] {
      "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]",
      "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]"
    });
  }
} ///:~