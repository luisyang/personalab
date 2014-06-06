//: c09:IceCream.java
// Returning arrays from methods.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package c09;
import com.bruceeckel.simpletest.*;

public class IceCream {
  static Test monitor = new Test();
  static String[] flav = {
    "Chocolate", "Strawberry",
    "Vanilla Fudge Swirl", "Mint Chip",
    "Mocha Almond Fudge", "Rum Raisin",
    "Praline Cream", "Mud Pie"
  };
  static String[] flavorSet(int n) {
    // Force it to be positive & within bounds:
    n = Math.abs(n) % (flav.length + 1);
    String[] results = new String[n];
    boolean[] picked =
      new boolean[flav.length];
    for (int i = 0; i < n; i++) {
      int t;
      do
        t = (int)(Math.random() * flav.length);
      while (picked[t]);
      results[i] = flav[t];
      picked[t] = true;
    }
    return results;
  }
  public static void main(String[] args) {
    for(int i = 0; i < 20; i++) {
      System.out.println(
        "flavorSet(" + i + ") = ");
      String[] fl = flavorSet(flav.length);
      for(int j = 0; j < fl.length; j++)
        System.out.println("\t" + fl[j]);
      monitor.expect(new Object[] {
        "%%flavorSet\\(\\d+\\) = ",
        new TestExpression("%%\\t(Chocolate|Strawberry|"
          + "Vanilla Fudge Swirl|Mint Chip|Mocha Almond "
          + "Fudge|Rum Raisin|Praline Cream|Mud Pie)", 8)
      });
    }
  }
} ///:~
