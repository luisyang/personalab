//: c09:Set1.java
// Things you can do with Sets.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import java.util.*;
import com.bruceeckel.util.*;

public class Set1 {
  static Test monitor = new Test();
  static Collections2.StringGenerator gen =
    Collections2.countries;
  public static void testVisual(Set a) {
    Collections2.fill(a, gen.reset(), 10);
    Collections2.fill(a, gen.reset(), 10);
    Collections2.fill(a, gen.reset(), 10);
    System.out.println(a); // No duplicates!
    // Add another set to this one:
    a.addAll(a);
    a.add("one");
    a.add("one");
    a.add("one");
    System.out.println(a);
    // Look something up:
    System.out.println("a.contains(\"one\"): " +
      a.contains("one"));
  }
  public static void main(String[] args) {
    System.out.println("HashSet");
    testVisual(new HashSet());
    System.out.println("TreeSet");
    testVisual(new TreeSet());
    monitor.expect(new String[] {
      "HashSet",
      "[BURUNDI, ANGOLA, BOTSWANA, CHAD, CAPE VERDE, " +
        "BURKINA FASO, CENTRAL AFRICAN REPUBLIC, " +
        "CAMEROON, ALGERIA, BENIN]",
      "[BURUNDI, ANGOLA, BOTSWANA, CHAD, CAPE VERDE, " +
        "BURKINA FASO, one, CENTRAL AFRICAN REPUBLIC, " +
        "CAMEROON, ALGERIA, BENIN]",
      "a.contains(\"one\"): true",
      "TreeSet",
      "[ALGERIA, ANGOLA, BENIN, BOTSWANA, BURKINA FASO, " +
        "BURUNDI, CAMEROON, CAPE VERDE, CENTRAL AFRICAN " +
        "REPUBLIC, CHAD]",
      "[ALGERIA, ANGOLA, BENIN, BOTSWANA, BURKINA FASO, " +
        "BURUNDI, CAMEROON, CAPE VERDE, CENTRAL AFRICAN " +
        "REPUBLIC, CHAD, one]",
      "a.contains(\"one\"): true"
    });
  }
} ///:~