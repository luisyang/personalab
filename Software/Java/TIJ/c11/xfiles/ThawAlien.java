//: c11:xfiles:ThawAlien.java
// Try to recover a serialized file without the 
// class of object that's stored in that file.
// {ThrowsException}
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import java.io.*;

public class ThawAlien {
  public static void main(String[] args) 
  throws IOException, ClassNotFoundException {
    ObjectInputStream in =
      new ObjectInputStream(
        new FileInputStream("X.file"));
    Object mystery = in.readObject();
    System.out.println(mystery.getClass());
  }
} ///:~