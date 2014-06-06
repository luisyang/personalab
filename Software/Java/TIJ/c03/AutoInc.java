//: c03:AutoInc.java
// Demonstrates the ++ and -- operators.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;

public class AutoInc {
  static Test monitor = new Test();
  public static void main(String[] args) {
    int i = 1;
    prt("i : " + i);
    prt("++i : " + ++i); // Pre-increment
    prt("i++ : " + i++); // Post-increment
    prt("i : " + i);
    prt("--i : " + --i); // Pre-decrement
    prt("i-- : " + i--); // Post-decrement
    prt("i : " + i);
    monitor.expect(new String[] {
      "i : 1",
      "++i : 2",
      "i++ : 2",
      "i : 3",
      "--i : 2",
      "i-- : 2",
      "i : 1"
    });
  }
  static void prt(String s) {
    System.out.println(s);
  }
} ///:~