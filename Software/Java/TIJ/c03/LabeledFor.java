//: c03:LabeledFor.java
// Java's "labeled for" loop.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;

public class LabeledFor {
  static Test monitor = new Test();
  public static void main(String[] args) {
    int i = 0;
    outer: // Can't have statements here
    for(; true ;) { // infinite loop
      inner: // Can't have statements here
      for(; i < 10; i++) {
        prt("i = " + i);
        if(i == 2) {
          prt("continue");
          continue;
        }
        if(i == 3) {
          prt("break");
          i++; // Otherwise i never
               // gets incremented.
          break;
        }
        if(i == 7) {
          prt("continue outer");
          i++; // Otherwise i never
               // gets incremented.
          continue outer;
        }
        if(i == 8) {
          prt("break outer");
          break outer;
        }
        for(int k = 0; k < 5; k++) {
          if(k == 3) {
            prt("continue inner");
            continue inner;
          }
        }
      }
    }
    // Can't break or continue
    // to labels here
    monitor.expect(new String[] {
      "i = 0",
      "continue inner",
      "i = 1",
      "continue inner",
      "i = 2",
      "continue",
      "i = 3",
      "break",
      "i = 4",
      "continue inner",
      "i = 5",
      "continue inner",
      "i = 6",
      "continue inner",
      "i = 7",
      "continue outer",
      "i = 8",
      "break outer"
    });
  }
  static void prt(String s) {
    System.out.println(s);
  }
} ///:~