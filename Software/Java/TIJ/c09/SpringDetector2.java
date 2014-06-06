//: c09:SpringDetector2.java
// A class that's used as a key in a HashMap 
// must override hashCode() and equals().
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import java.util.*;

class Groundhog2 {
  int ghNumber;
  Groundhog2(int n) { ghNumber = n; }
  public int hashCode() { return ghNumber; }
  public boolean equals(Object o) {
    return (o instanceof Groundhog2)
      && (ghNumber == ((Groundhog2)o).ghNumber);
  }
}

public class SpringDetector2 {
  static Test monitor = new Test();
  public static void main(String[] args) {
    HashMap hm = new HashMap();
    for(int i = 0; i < 10; i++)
      hm.put(new Groundhog2(i),new Prediction());
    System.out.println("hm = " + hm + "\n");
    System.out.println(
      "Looking up prediction for Groundhog #3:");
    Groundhog2 gh = new Groundhog2(3);
    if(hm.containsKey(gh))
      System.out.println((Prediction)hm.get(gh));
    monitor.expect(new Object[] {
      "%%hm = \\{(Groundhog2@.+=(Early Spring!|Six more " +
      "weeks of Winter!)(, ){0,1}){10}\\}",
      "",
      "Looking up prediction for Groundhog #3:",
      "%%Early Spring!|Six more weeks of Winter!"
    });
  }
} ///:~
