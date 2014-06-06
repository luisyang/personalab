//: c06:Beetle.java
// The full process of initialization.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;

class Insect {
  static Test monitor = new Test();
  int i = 9;
  int j;
  Insect() {
    prt("i = " + i + ", j = " + j);
    j = 39;
  }
  static int x1 = 
    prt("static Insect.x1 initialized");
  static int prt(String s) {
    System.out.println(s);
    return 47;
  }
}

public class Beetle extends Insect {
  int k = prt("Beetle.k initialized");
  Beetle() {
    prt("k = " + k);
    prt("j = " + j);
  }
  static int x2 =
    prt("static Beetle.x2 initialized");
  public static void main(String[] args) {
    prt("Beetle constructor");
    Beetle b = new Beetle();
    monitor.expect(new String[] {
      "static Insect.x1 initialized",
      "static Beetle.x2 initialized",
      "Beetle constructor",
      "i = 9, j = 0",
      "Beetle.k initialized",
      "k = 47",
      "j = 39"
      });
  }
} ///:~
