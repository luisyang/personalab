//: c09:StringSorting.java
// Sorting an array of Strings.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import com.bruceeckel.util.*;
import java.util.*;

public class StringSorting {
  static Test monitor = new Test();
  public static void main(String[] args) {
    String[] sa = new String[30];
    Arrays2.fill(sa,
      new Arrays2.RandStringGenerator(5));
    Arrays2.print("Before sorting: ", sa);
    Arrays.sort(sa);
    Arrays2.print("After sorting: ", sa);
    monitor.expect(new Object[] {
  "%%Before sorting:  \\(([a-zA-Z]{5}, ){29}[a-zA-Z]{5}\\)",
  "%%After sorting:  \\(([a-zA-Z]{5}, ){29}[a-zA-Z]{5}\\)"
    });
  }
} ///:~