//: c09:CompType.java
// Implementing Comparable in a class.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import com.bruceeckel.util.*;
import java.util.*;

public class CompType implements Comparable {
  static Test monitor = new Test();
  int i;
  int j;
  public CompType(int n1, int n2) {
    i = n1;
    j = n2;
  }
  public String toString() {
    return "[i = " + i + ", j = " + j + "]";
  }
  public int compareTo(Object rv) {
    int rvi = ((CompType)rv).i;
    return (i < rvi ? -1 : (i == rvi ? 0 : 1));
  }
  private static Random r = new Random();
  private static int randInt() {
    return Math.abs(r.nextInt()) % 100;
  }
  public static Generator generator() {
    return new Generator() {
      public Object next() {
        return new CompType(randInt(),randInt());
      }
    };
  }
  public static void main(String[] args) {
    CompType[] a = new CompType[10];
    Arrays2.fill(a, generator());
    Arrays2.print("before sorting, a = ", a);
    Arrays.sort(a);
    Arrays2.print("after sorting, a = ", a);
    monitor.expect(new Object[] {
      "%%before sorting, a =  \\((\\[i = \\d{1,2}, j = " + 
      "\\d{1,2}\\](, ){0,1}){10}\\)",
      "%%after sorting, a =  \\((\\[i = \\d{1,2}, j = " + 
      "\\d{1,2}\\](, ){0,1}){10}\\)"});
  }
} ///:~
