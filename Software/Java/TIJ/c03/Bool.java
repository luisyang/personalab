//: c03:Bool.java
// Relational and logical operators.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import java.util.*;

public class Bool {
  static Test monitor = new Test();
  public static void main(String[] args) {
    Random rand = new Random();
    int i = rand.nextInt() % 100;
    int j = rand.nextInt() % 100;
    prt("i = " + i);
    prt("j = " + j);
    prt("i > j is " + (i > j));
    prt("i < j is " + (i < j));
    prt("i >= j is " + (i >= j));
    prt("i <= j is " + (i <= j));
    prt("i == j is " + (i == j));
    prt("i != j is " + (i != j));

    // Treating an int as a boolean is
    // not legal Java
//! prt("i && j is " + (i && j));
//! prt("i || j is " + (i || j));
//! prt("!i is " + !i);

    prt("(i < 10) && (j < 10) is "
       + ((i < 10) && (j < 10)) );
    prt("(i < 10) || (j < 10) is "
       + ((i < 10) || (j < 10)) );
    monitor.expect(new Object[] {
      "%%i = (-){0,1}\\d{1,2}",
      "%%j = (-){0,1}\\d{1,2}",
      "%%i > j is (true|false)",
      "%%i < j is (true|false)",
      "%%i >= j is (true|false)",
      "%%i <= j is (true|false)",
      "%%i == j is (true|false)",
      "%%i != j is (true|false)",
      "%%\\(i < 10\\) && " +
        "\\(j < 10\\) is (true|false)",
      "%%\\(i < 10\\) \\|\\| " +
        "\\(j < 10\\) is (true|false)"
    });
  }
  static void prt(String s) {
    System.out.println(s);
  }
} ///:~
