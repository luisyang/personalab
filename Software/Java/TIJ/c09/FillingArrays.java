//: c09:FillingArrays.java
// Using Arrays.fill()
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import com.bruceeckel.util.*;
import java.util.*;

public class FillingArrays {
  static Test monitor = new Test();
  public static void main(String[] args) {
    int size = 6;
    // Or get the size from the command line:
    if(args.length != 0)
      size = Integer.parseInt(args[0]);
    boolean[] a1 = new boolean[size];
    byte[] a2 = new byte[size];
    char[] a3 = new char[size];
    short[] a4 = new short[size];
    int[] a5 = new int[size];
    long[] a6 = new long[size];
    float[] a7 = new float[size];
    double[] a8 = new double[size];
    String[] a9 = new String[size];
    Arrays.fill(a1, true);
    Arrays2.print("a1 = ", a1);
    Arrays.fill(a2, (byte)11);
    Arrays2.print("a2 = ", a2);
    Arrays.fill(a3, 'x');
    Arrays2.print("a3 = ", a3);
    Arrays.fill(a4, (short)17);
    Arrays2.print("a4 = ", a4);
    Arrays.fill(a5, 19);
    Arrays2.print("a5 = ", a5);
    Arrays.fill(a6, 23);
    Arrays2.print("a6 = ", a6);
    Arrays.fill(a7, 29);
    Arrays2.print("a7 = ", a7);
    Arrays.fill(a8, 47);
    Arrays2.print("a8 = ", a8);
    Arrays.fill(a9, "Hello");
    Arrays2.print("a9 = ", a9);
    // Manipulating ranges:
    Arrays.fill(a9, 3, 5, "World");
    Arrays2.print("a9 = ", a9);
    monitor.expect(new String[] {
      "a1 =  (true, true, true, true, true, true)",
      "a2 =  (11, 11, 11, 11, 11, 11)",
      "a3 =  (x, x, x, x, x, x)",
      "a4 =  (17, 17, 17, 17, 17, 17)",
      "a5 =  (19, 19, 19, 19, 19, 19)",
      "a6 =  (23, 23, 23, 23, 23, 23)",
      "a7 =  (29.0, 29.0, 29.0, 29.0, 29.0, 29.0)",
      "a8 =  (47.0, 47.0, 47.0, 47.0, 47.0, 47.0)",
      "a9 =  (Hello, Hello, Hello, Hello, Hello, Hello)",
      "a9 =  (Hello, Hello, Hello, World, World, Hello)"
    });
  }
} ///:~