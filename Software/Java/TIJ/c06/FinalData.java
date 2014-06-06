//: c06:FinalData.java
// The effect of final on fields.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package c06;
import com.bruceeckel.simpletest.*;

class Value {  int i;
  public Value(int ii) { i = ii; }
}

public class FinalData {
  static Test monitor = new Test();
  // Can be compile-time constants
  final int i1 = 9;
  static final int VAL_TWO = 99;
  // Typical public constant:
  public static final int VAL_THREE = 39;
  // Cannot be compile-time constants:
  final int i4 = (int)(Math.random()*20);
  static final int i5 = (int)(Math.random()*20);
  
  Value v1 = new Value(11);
  final Value v2 = new Value(22);
  static final Value v3 = new Value(33);
  // Arrays:
  final int[] a = { 1, 2, 3, 4, 5, 6 };

  public void print(String id) {
    System.out.println(
      id + ": " + "i4 = " + i4 + 
      ", i5 = " + i5);
  }
  public static void main(String[] args) {
    FinalData fd1 = new FinalData();
    //! fd1.i1++; // Error: can't change value
    fd1.v2.i++; // Object isn't constant!
    fd1.v1 = new Value(9); // OK -- not final
    for(int i = 0; i < fd1.a.length; i++)
      fd1.a[i]++; // Object isn't constant!
    //! fd1.v2 = new Value(0); // Error: Can't 
    //! fd1.v3 = new Value(1); // change reference
    //! fd1.a = new int[3];

    fd1.print("fd1");
    System.out.println("Creating new FinalData");
    FinalData fd2 = new FinalData();
    fd1.print("fd1");
    fd2.print("fd2");
    monitor.expect(new Object[] {
      "%%fd1: i4 = \\d{1,2}, i5 = \\d{1,2}",
      "Creating new FinalData",
      "%%fd1: i4 = \\d{1,2}, i5 = \\d{1,2}",
      "%%fd2: i4 = \\d{1,2}, i5 = \\d{1,2}"
    });
  }
} ///:~
