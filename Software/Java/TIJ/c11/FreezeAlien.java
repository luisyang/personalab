//: c11:FreezeAlien.java
// Create a serialized output file.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import java.io.*;

public class FreezeAlien {
  // Throw exceptions to console:
  public static void main(String[] args) 
  throws IOException {
    ObjectOutput out = 
      new ObjectOutputStream(
        new FileOutputStream("X.file"));
    Alien zorcon = new Alien();
    out.writeObject(zorcon);
  }
} ///:~