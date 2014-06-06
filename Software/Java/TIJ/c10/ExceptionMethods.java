//: c10:ExceptionMethods.java
// Demonstrating the Exception Methods.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;

public class ExceptionMethods {
  static Test monitor = new Test();
  public static void main(String[] args) {
    try {
      throw new Exception("Here's my Exception");
    } catch(Exception e) {
      System.err.println("Caught Exception");
      System.err.println(
        "e.getMessage(): " + e.getMessage());
      System.err.println(
        "e.getLocalizedMessage(): " +
         e.getLocalizedMessage());
      System.err.println("e.toString(): " + e);
      System.err.println("e.printStackTrace():");
      e.printStackTrace(System.err);
    }
    monitor.expect(new String[] {
      "Caught Exception",
      "e.getMessage(): Here's my Exception",
      "e.getLocalizedMessage(): Here's my Exception",
      "e.toString(): java.lang.Exception: Here's my " +
        "Exception",
      "e.printStackTrace():",
      "java.lang.Exception: Here's my Exception",
      "\tat ExceptionMethods.main(Unknown Source)"
    });
  }
} ///:~