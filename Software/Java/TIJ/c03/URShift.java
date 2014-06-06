//: c03:URShift.java
// Test of unsigned right shift.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;

public class URShift {
  static Test monitor = new Test();
  public static void main(String[] args) {
    int i = -1;
    i >>>= 10;
    System.out.println(i);
    long l = -1;
    l >>>= 10;
    System.out.println(l);
    short s = -1;
    s >>>= 10;
    System.out.println(s);
    byte b = -1;
    b >>>= 10;
    System.out.println(b);
    b = -1;
    System.out.println(b>>>10);
    monitor.expect(new String[] {
      "4194303",
      "18014398509481983",
      "-1",
      "-1",
      "4194303"
    });
  }
} ///:~