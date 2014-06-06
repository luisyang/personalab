//: appendixa:PassReferences.java
// Passing references around.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;

public class PassReferences {
  static Test monitor = new Test();
  static void f(PassReferences h) {
    System.out.println("h inside f(): " + h);
  }
  public static void main(String[] args) {
    PassReferences p = new PassReferences();
    System.out.println("p inside main(): " + p);
    f(p);
    monitor.expect(new Object[] {
      "%%(p inside main|h inside f)\\(\\): " + p,
      "%%(p inside main|h inside f)\\(\\): " + p
    });
  }
} ///:~
