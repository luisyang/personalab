//: c15:WhoAmI.java
// Finds out your network address when
// you're connected to the Internet.
// {RunByHand} Must be connected to the Internet
// {Args: www.google.com}
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import java.net.*;

public class WhoAmI {
  public static void main(String[] args) 
      throws Exception {
    if(args.length != 1) {
      System.err.println(
        "Usage: WhoAmI MachineName");
      System.exit(1);
    }
    InetAddress a = 
      InetAddress.getByName(args[0]);
    System.out.println(a);
  }
} ///:~