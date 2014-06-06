//: c04:ArrayClassObj.java
// Creating an array of nonprimitive objects.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import java.util.*;

public class ArrayClassObj {
  static Test monitor = new Test();
  static Random rand = new Random();
  static int pRand(int mod) {
    return Math.abs(rand.nextInt()) % mod + 1;
  }
  public static void main(String[] args) {
    Integer[] a = new Integer[pRand(20)];
    System.out.println(
      "length of a = " + a.length);
    for(int i = 0; i < a.length; i++) {
      a[i] = new Integer(pRand(500));
      System.out.println(
        "a[" + i + "] = " + a[i]);
    }
    monitor.expect(new Object[] {
      "%%length of a = \\d{1,2}",
      new TestExpression("%%a\\[\\d{1,2}\\] = \\d{1,3}",
        a.length)
    });
  }
} ///:~
