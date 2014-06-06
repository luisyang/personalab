//: c09:CopyingArrays.java
// Using System.arraycopy()
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import com.bruceeckel.util.*;
import java.util.*;

public class CopyingArrays {
  static Test monitor = new Test();
  public static void main(String[] args) {
    int[] i = new int[25];
    int[] j = new int[25];
    Arrays.fill(i, 47);
    Arrays.fill(j, 99);
    Arrays2.print("i = ", i);
    Arrays2.print("j = ", j);
    System.arraycopy(i, 0, j, 0, i.length);
    Arrays2.print("j = ", j);
    int[] k = new int[10];
    Arrays.fill(k, 103);
    System.arraycopy(i, 0, k, 0, k.length);
    Arrays2.print("k = ", k);
    Arrays.fill(k, 103);
    System.arraycopy(k, 0, i, 0, k.length);
    Arrays2.print("i = ", i);
    // Objects:
    Integer[] u = new Integer[10];
    Integer[] v = new Integer[5];
    Arrays.fill(u, new Integer(47));
    Arrays.fill(v, new Integer(99));
    Arrays2.print("u = ", u);
    Arrays2.print("v = ", v);
    System.arraycopy(v, 0, 
      u, u.length/2, v.length);
    Arrays2.print("u = ", u);
    monitor.expect(new String[] {
      "i =  (47, 47, 47, 47, 47, 47, 47, 47, 47, 47, " +
        "47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, " +
        "47, 47, 47, 47)",
      "j =  (99, 99, 99, 99, 99, 99, 99, 99, 99, 99, " +
        "99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, " +
        "99, 99, 99, 99)",
      "j =  (47, 47, 47, 47, 47, 47, 47, 47, 47, 47, " +
        "47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, " +
        "47, 47, 47, 47)",
      "k =  (47, 47, 47, 47, 47, 47, 47, 47, 47, 47)",
      "i =  (103, 103, 103, 103, 103, 103, 103, 103, " +
        "103, 103, 47, 47, 47, 47, 47, 47, 47, 47, 47, " +
        "47, 47, 47, 47, 47, 47)",
      "u =  (47, 47, 47, 47, 47, 47, 47, 47, 47, 47)",
      "v =  (99, 99, 99, 99, 99)",
      "u =  (47, 47, 47, 47, 47, 99, 99, 99, 99, 99)"
    });
  }
} ///:~