//: c09:Iterators2.java
// Revisiting Iterators.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import java.util.*;

class PrintData {
  static void print(Iterator e) {
    while(e.hasNext())
      System.out.println(e.next());
  }
}

public class Iterators2 {
  static Test monitor = new Test();
  public static void main(String[] args) {
    ArrayList v = new ArrayList();
    for(int i = 0; i < 5; i++)
      v.add(new Mouse(i));
    HashMap m = new HashMap();
    for(int i = 0; i < 5; i++)
      m.put(new Integer(i), new Hamster(i));
    System.out.println("ArrayList");
    PrintData.print(v.iterator());
    System.out.println("HashMap");
    PrintData.print(m.entrySet().iterator());
    monitor.expect(new String[] {
      "ArrayList",
      "This is Mouse #0",
      "This is Mouse #1",
      "This is Mouse #2",
      "This is Mouse #3",
      "This is Mouse #4",
      "HashMap",
      "4=This is Hamster #4",
      "3=This is Hamster #3",
      "2=This is Hamster #2",
      "1=This is Hamster #1",
      "0=This is Hamster #0"
    });
  }
} ///:~