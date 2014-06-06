//: c09:WorksAnyway.java
// In special cases, things just 
// seem to work correctly.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import java.util.*;

class MouseTrap {
  static void caughtYa(Object m) {
    Mouse mouse = (Mouse)m; // Cast from Object
    System.out.println("Mouse: " + 
      mouse.getNumber());
  }
}

public class WorksAnyway {
  static Test monitor = new Test();
  public static void main(String[] args) {
    ArrayList mice = new ArrayList();
    for(int i = 0; i < 3; i++)
      mice.add(new Mouse(i));
    for(int i = 0; i < mice.size(); i++) {
      // No cast necessary, automatic 
      // call to Object.toString():
      System.out.println(
        "Free mouse: " + mice.get(i));
      MouseTrap.caughtYa(mice.get(i));
    }
    monitor.expect(new String[] {
      "Free mouse: This is Mouse #0",
      "Mouse: 0",
      "Free mouse: This is Mouse #1",
      "Mouse: 1",
      "Free mouse: This is Mouse #2",
      "Mouse: 2"
    });
  }
} ///:~