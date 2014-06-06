//: com:bruceeckel:simpletest:InterceptStandardIS.java
// Intercepts System.in to produce random characters when 
// read() is called, to generate console input.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package vestigial;
import java.io.*;
import java.util.Random;

//public class InterceptStandardIS extends InputStream {
//  private transient Random r = new Random();
//  private InputStream stdin;
//  private static final String ssource = 
//    "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
//    + System.getProperty("line.separator");
//  private char[] src = ssource.toCharArray();
//  public InterceptStandardIS() {
//    stdin = System.in;
//    System.setIn(new BufferedInputStream(this));
//  }
//  public void cleanup() { System.setIn(stdin); }
//  public int read() {
//    return (int)src[Math.abs(r.nextInt()) % src.length];
//  }
//}

public class InterceptStandardIS extends InputStream {
  private InputStream stdin;
  public InterceptStandardIS() {
    stdin = System.in;
    System.setIn(new BufferedInputStream(this));
  }
  public void cleanup() { System.setIn(stdin); }
  char[] input = ("test" + 
    System.getProperty("line.separator")).toCharArray();
  int index;
  public int read() {
    return (int)input[index = (index + 1) % input.length];
  }
} ///:~
