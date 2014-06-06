//: c09:ComparatorTest.java
// Implementing a Comparator for a class.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import com.bruceeckel.util.*;
import java.util.*;

class CompTypeComparator implements Comparator {
  public int compare(Object o1, Object o2) {
    int j1 = ((CompType)o1).j;
    int j2 = ((CompType)o2).j;
    return (j1 < j2 ? -1 : (j1 == j2 ? 0 : 1));
  }
}

public class ComparatorTest {
  static Test monitor = new Test();
  public static void main(String[] args) {
    CompType[] a = new CompType[10];
    Arrays2.fill(a, CompType.generator());
    Arrays2.print("before sorting, a = ", a);
    Arrays.sort(a, new CompTypeComparator());
    Arrays2.print("after sorting, a = ", a);
    monitor.expect(new Object[] {
      "%%before sorting, a =  \\((\\[i = \\d{1,2}, j = " + 
      "\\d{1,2}\\](, ){0,1}){10}\\)",
      "%%after sorting, a =  \\((\\[i = \\d{1,2}, j = " +
      "\\d{1,2}\\](, ){0,1}){10}\\)"});
  }
} ///:~
