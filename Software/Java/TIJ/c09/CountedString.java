//: c09:CountedString.java
// Creating a good hashCode().
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import java.util.*;

public class CountedString {
  static Test monitor = new Test();
  private String s;
  private int id = 0;
  private static ArrayList created = 
    new ArrayList();
  public CountedString(String str) {
    s = str;
    created.add(s);
    Iterator it = created.iterator();
    // Id is the total number of instances
    // of this string in use by CountedString:
    while(it.hasNext())
      if(it.next().equals(s))
        id++;
  }
  public String toString() {
    return "String: " + s + " id: " + id +
      " hashCode(): " + hashCode();
  }
  public int hashCode() { 
    return s.hashCode() * id;
  }
  public boolean equals(Object o) {
    return (o instanceof CountedString)
      && s.equals(((CountedString)o).s)
      && id == ((CountedString)o).id;
  }
  public static void main(String[] args) {
    HashMap m = new HashMap();
    CountedString[] cs = new CountedString[10];
    for(int i = 0; i < cs.length; i++) {
      cs[i] = new CountedString("hi");
      m.put(cs[i], new Integer(i));
    }
    System.out.println(m);
    for(int i = 0; i < cs.length; i++) {
      System.out.println("Looking up " + cs[i]);
      System.out.println(m.get(cs[i]));
    }
    monitor.expect(new Object[] {
      "%%\\{(("
        + "String: hi id: 10 hashCode\\(\\): 33290=9|"
        + "String: hi id: 9 hashCode\\(\\): 29961=8|"
        + "String: hi id: 8 hashCode\\(\\): 26632=7|"
        + "String: hi id: 7 hashCode\\(\\): 23303=6|"
        + "String: hi id: 6 hashCode\\(\\): 19974=5|"
        + "String: hi id: 5 hashCode\\(\\): 16645=4|"
        + "String: hi id: 4 hashCode\\(\\): 13316=3|"
        + "String: hi id: 3 hashCode\\(\\): 9987=2|"
        + "String: hi id: 2 hashCode\\(\\): 6658=1|"
        + "String: hi id: 1 hashCode\\(\\): 3329=0"
        + ")(, ){0,1}){10}\\}",
      "Looking up String: hi id: 1 hashCode(): 3329",
      "0",
      "Looking up String: hi id: 2 hashCode(): 6658",
      "1",
      "Looking up String: hi id: 3 hashCode(): 9987",
      "2",
      "Looking up String: hi id: 4 hashCode(): 13316",
      "3",
      "Looking up String: hi id: 5 hashCode(): 16645",
      "4",
      "Looking up String: hi id: 6 hashCode(): 19974",
      "5",
      "Looking up String: hi id: 7 hashCode(): 23303",
      "6",
      "Looking up String: hi id: 8 hashCode(): 26632",
      "7",
      "Looking up String: hi id: 9 hashCode(): 29961",
      "8",
      "Looking up String: hi id: 10 hashCode(): 33290",
      "9"
    });
  }
} ///:~
