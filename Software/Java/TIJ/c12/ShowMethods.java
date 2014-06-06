//: c12:ShowMethods.java
// Using reflection to show all the methods of 
// a class, even if the methods are defined in 
// the base class.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import java.lang.reflect.*;

public class ShowMethods {
  static Test monitor = new Test();
  static final String usage =
    "usage: \n" +
    "ShowMethods qualified.class.name\n" +
    "To show all methods in class or: \n" +
    "ShowMethods qualified.class.name word\n" +
    "To search for methods involving 'word'";
  public static void main(String[] args) {
    if(args.length < 1) {
      System.out.println(usage);
      System.exit(0);
    }
    int lines = 0;
    try {
      Class c = Class.forName(args[0]);
      Method[] m = c.getMethods();
      Constructor[] ctor = c.getConstructors();
      if(args.length == 1) {
        for (int i = 0; i < m.length; i++)
          System.out.println(m[i]);
        for (int i = 0; i < ctor.length; i++)
          System.out.println(ctor[i]);
        lines = m.length + ctor.length;
      } else {
        for (int i = 0; i < m.length; i++)
          if(m[i].toString()
              .indexOf(args[1])!= -1) {
            System.out.println(m[i]);
            lines++;
          }
        for (int i = 0; i < ctor.length; i++)
          if(ctor[i].toString()
              .indexOf(args[1])!= -1) {
            System.out.println(ctor[i]);
            lines++;
          }
      }
    } catch(ClassNotFoundException e) {
      System.err.println("No such class: " + e);
    }
    monitor.expect(new Object[] {
      new TestExpression("%%public .+\\(.*\\).*", lines)
    });
  }  
} ///:~
