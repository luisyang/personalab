//: c05:ChocolateChip.java
// Can't access friendly member
// in another class.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import c05.dessert.*;

public class ChocolateChip extends Cookie {
  static Test monitor = new Test();
  public ChocolateChip() {
   System.out.println(
     "ChocolateChip constructor");
  }
  public static void main(String[] args) {
    ChocolateChip x = new ChocolateChip();
    //! x.bite(); // Can't access bite
    monitor.expect(new String[] {
      "Cookie constructor",
      "ChocolateChip constructor"
    });
  }
} ///:~