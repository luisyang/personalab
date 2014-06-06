//: c09:Stacks.java
// Demonstration of Stack Class.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import java.util.*;

public class Stacks {
  static Test monitor = new Test();
  static String[] months = { 
    "January", "February", "March", "April",
    "May", "June", "July", "August", "September",
    "October", "November", "December" };
  public static void main(String[] args) {
    Stack stk = new Stack();
    for(int i = 0; i < months.length; i++)
      stk.push(months[i] + " ");
    System.out.println("stk = " + stk);
    // Treating a stack as a Vector:
    stk.addElement("The last line");
    System.out.println(
      "element 5 = " + stk.elementAt(5));
    System.out.println("popping elements:");
    while(!stk.empty())
      System.out.println(stk.pop());
    monitor.expect(new String[] {
      "stk = [January , February , March , April , May " +
        ", June , July , August , September , October , " +
        "November , December ]",
      "element 5 = June ",
      "popping elements:",
      "The last line",
      "December ",
      "November ",
      "October ",
      "September ",
      "August ",
      "July ",
      "June ",
      "May ",
      "April ",
      "March ",
      "February ",
      "January "
    });
  }
} ///:~