//: c03:ListCharacters.java
// Demonstrates "for" loop by listing
// all the ASCII characters.
// {Broken}
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;

public class ListCharacters {
  static Test monitor = new Test();
  public static void main(String[] args) {
    for( char c = 0; c < 128; c++)
      if (c != 26 )  // ANSI Clear screen
        System.out.println(
          "value: " + (int)c +
          " character: " + c);
    monitor.expect("ListCharacters.out");
  }
} ///:~
