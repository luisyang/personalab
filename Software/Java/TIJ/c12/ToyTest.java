//: c12:ToyTest.java
// Testing class Class.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;

interface HasBatteries {}
interface Waterproof {}
interface ShootsThings {}
class Toy {
  // Comment out the following default
  // constructor to see 
  // NoSuchMethodError from (*1*)
  Toy() {} 
  Toy(int i) {} 
}

class FancyToy extends Toy 
    implements HasBatteries, 
      Waterproof, ShootsThings {
  FancyToy() { super(1); }
}

public class ToyTest {
  static Test monitor = new Test();
  public static void main(String[] args) 
  throws Exception {
    Class c = null;
    try {
      c = Class.forName("FancyToy");
    } catch(ClassNotFoundException e) {
      System.err.println("Can't find FancyToy");
      throw e;
    }
    printInfo(c);
    Class[] faces = c.getInterfaces();
    for(int i = 0; i < faces.length; i++)
      printInfo(faces[i]);
    Class cy = c.getSuperclass();
    Object o = null;
    try {
      // Requires default constructor:
      o = cy.newInstance(); // (*1*)
    } catch(InstantiationException e) {
      System.err.println("Cannot instantiate");
      throw e;
    } catch(IllegalAccessException e) {
      System.err.println("Cannot access");
      throw e;
    }
    printInfo(o.getClass());
    monitor.expect(new String[] {
      "Class name: FancyToy is interface? [false]",
      "Class name: HasBatteries is interface? [true]",
      "Class name: Waterproof is interface? [true]",
      "Class name: ShootsThings is interface? [true]",
      "Class name: Toy is interface? [false]"
    });
  }
  static void printInfo(Class cc) {
    System.out.println(
      "Class name: " + cc.getName() +
      " is interface? [" +
      cc.isInterface() + "]");
  }
} ///:~