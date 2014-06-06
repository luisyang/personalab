//: c03:LabeledWhile.java
// Java's "labeled while" loop.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;

public class LabeledWhile {
  static Test monitor = new Test();
  public static void main(String[] args) {
    int i = 0;
    outer:
    while(true) {
      prt("Outer while loop");
      while(true) {
        i++;
        prt("i = " + i);
        if(i == 1) {
          prt("continue");
          continue;
        }
        if(i == 3) {
          prt("continue outer");
          continue outer;
        }
        if(i == 5) {
          prt("break");
          break;
        }
        if(i == 7) {
          prt("break outer");
          break outer;
        }
      }
    }
    monitor.expect(new String[] {
      "Outer while loop",
      "i = 1",
      "continue",
      "i = 2",
      "i = 3",
      "continue outer",
      "Outer while loop",
      "i = 4",
      "i = 5",
      "break",
      "Outer while loop",
      "i = 6",
      "i = 7",
      "break outer"
    });
  }
  static void prt(String s) {
    System.out.println(s);
  }
} ///:~