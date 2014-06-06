//: c09:Reverse.java
// The Collecions.reverseOrder() Comparator
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import com.bruceeckel.util.*;
import java.util.*;

public class Reverse {
  static Test monitor = new Test();
  public static void main(String[] args) {
    CompType[] a = new CompType[10];
    Arrays2.fill(a, CompType.generator());
    Arrays2.print("before sorting, a = ", a);
    Arrays.sort(a, Collections.reverseOrder());
    Arrays2.print("after sorting, a = ", a);
    monitor.expect(new Object[] {
      "%%before sorting, a =  \\((\\[i = \\d{1,2}, j = " + 
      "\\d{1,2}\\](, ){0,1}){10}\\)",
      "%%after sorting, a =  \\((\\[i = \\d{1,2}, j = " + 
      "\\d{1,2}\\](, ){0,1}){10}\\)"});
  }
} ///:~
