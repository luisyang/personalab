//: c10:FullConstructors.java
// Inheriting your own exceptions.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;

class MyException extends Exception {
  public MyException() {}
  public MyException(String msg) {
    super(msg);
  }
}

public class FullConstructors {
  static Test monitor = new Test();
  public static void f() throws MyException {
    System.out.println(
      "Throwing MyException from f()");
    throw new MyException();
  }
  public static void g() throws MyException {
    System.out.println(
      "Throwing MyException from g()");
    throw new MyException("Originated in g()");
  }
  public static void main(String[] args) {
    try {
      f();
    } catch(MyException e) {
      e.printStackTrace(System.err);
    }
    try {
      g();
    } catch(MyException e) {
      e.printStackTrace(System.err);
    }
    monitor.expect(new String[] {
      "Throwing MyException from f()",
      "MyException",
      "\tat FullConstructors.f(Unknown Source)",
      "\tat FullConstructors.main(Unknown Source)",
      "Throwing MyException from g()",
      "MyException: Originated in g()",
      "\tat FullConstructors.g(Unknown Source)",
      "\tat FullConstructors.main(Unknown Source)"
    });
  }
} ///:~