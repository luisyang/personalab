//: c09:Statistics.java
// Simple demonstration of HashMap.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import java.util.*;

class Counter {
  int i = 1;
  public String toString() {
    return Integer.toString(i);
  }
}

public class Statistics {
  static Test monitor = new Test();
  public static void main(String[] args) {
    HashMap hm = new HashMap();
    for(int i = 0; i < 10000; i++) {
      // Produce a number between 0 and 20:
      Integer r =
        new Integer((int)(Math.random() * 20));
      if(hm.containsKey(r))
        ((Counter)hm.get(r)).i++;
      else
        hm.put(r, new Counter());
    }
    System.out.println(hm);
    monitor.expect(new Object[] {
      "%%\\{19=\\d+, 18=\\d+, " +
        "17=\\d+, 16=\\d+, 15=\\d+, 14=\\d+, 13=\\d+, " +
        "12=\\d+, 11=\\d+, 10=\\d+, 9=\\d+, 8=\\d+, " +
        "7=\\d+, 6=\\d+, 5=\\d+, 4=\\d+, 3=\\d+, " +
        "2=\\d+, 1=\\d+, 0=\\d+\\}"
    });
  }
} ///:~