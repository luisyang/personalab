//: c12:ShowMethodsClean.java
// ShowMethods with the qualifiers stripped
// to make the results easier to read.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import java.lang.reflect.*;
import com.bruceeckel.util.*;

public class ShowMethodsClean {
  static Test monitor = new Test();
  static final String usage =
    "usage: \n" +
    "ShowMethodsClean qualified.class.name\n" +
    "To show all methods in class or: \n" +
    "ShowMethodsClean qualif.class.name word\n" +
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
      // Convert to an array of cleaned Strings:
      String[] n = 
        new String[m.length + ctor.length];
      for(int i = 0; i < m.length; i++) {
        String s = m[i].toString();
        n[i] = StripQualifiers.strip(s);
      }
      for(int i = 0; i < ctor.length; i++) {
        String s = ctor[i].toString();
        n[i + m.length] = 
          StripQualifiers.strip(s);
      }
      if(args.length == 1) {
        for (int i = 0; i < n.length; i++)
          System.out.println(n[i]);
        lines = n.length;
      }
      else 
        for (int i = 0; i < n.length; i++)
          if(n[i].indexOf(args[1])!= -1) {
            System.out.println(n[i]);
            lines++;
          }
    } catch(ClassNotFoundException e) {
      System.err.println("No such class: " + e);
    }
    monitor.expect(new Object[] {
      new TestExpression("%%public .+\\(.*\\).*", lines)
    });
  }
} ///:~
