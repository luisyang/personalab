//: c09:TestArrays2.java
// Test and demonstrate Arrays2 utilities
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import com.bruceeckel.util.*;

public class TestArrays2 {
  static Test monitor = new Test();
  public static void main(String[] args) {
    int size = 6;
    // Or get the size from the command line:
    if(args.length != 0) {
      size = Integer.parseInt(args[0]);
      if (size < 3) {
        System.out.println("arg must be >= 3");
        System.exit(1);
      }
    }
    boolean[] a1 = new boolean[size];
    byte[] a2 = new byte[size];
    char[] a3 = new char[size];
    short[] a4 = new short[size];
    int[] a5 = new int[size];
    long[] a6 = new long[size];
    float[] a7 = new float[size];
    double[] a8 = new double[size];
    String[] a9 = new String[size];
    Arrays2.fill(a1, 
      new Arrays2.RandBooleanGenerator());
    Arrays2.print(a1);
    Arrays2.print("a1 = ", a1);
    Arrays2.print(a1, size/3, size/3 + size/3);
    Arrays2.fill(a2,
      new Arrays2.RandByteGenerator());
    Arrays2.print(a2);
    Arrays2.print("a2 = ", a2);
    Arrays2.print(a2, size/3, size/3 + size/3);
    Arrays2.fill(a3,
      new Arrays2.RandCharGenerator());
    Arrays2.print(a3);
    Arrays2.print("a3 = ", a3);
    Arrays2.print(a3, size/3, size/3 + size/3);
    Arrays2.fill(a4,
      new Arrays2.RandShortGenerator());
    Arrays2.print(a4);
    Arrays2.print("a4 = ", a4);
    Arrays2.print(a4, size/3, size/3 + size/3);
    Arrays2.fill(a5,
      new Arrays2.RandIntGenerator());
    Arrays2.print(a5);
    Arrays2.print("a5 = ", a5);
    Arrays2.print(a5, size/3, size/3 + size/3);
    Arrays2.fill(a6,
      new Arrays2.RandLongGenerator());
    Arrays2.print(a6);
    Arrays2.print("a6 = ", a6);
    Arrays2.print(a6, size/3, size/3 + size/3);
    Arrays2.fill(a7,
      new Arrays2.RandFloatGenerator());
    Arrays2.print(a7);
    Arrays2.print("a7 = ", a7);
    Arrays2.print(a7, size/3, size/3 + size/3);
    Arrays2.fill(a8,
      new Arrays2.RandDoubleGenerator());
    Arrays2.print(a8);
    Arrays2.print("a8 = ", a8);
    Arrays2.print(a8, size/3, size/3 + size/3);
    Arrays2.fill(a9,
      new Arrays2.RandStringGenerator(7));
    Arrays2.print(a9);
    Arrays2.print("a9 = ", a9);
    Arrays2.print(a9, size/3, size/3 + size/3);
    monitor.expect(new Object[] {
      "%%\\(((true|false), ){" 
        + (size - 1) + "}(true|false)\\)",
      "%%a1 =  \\(((true|false), ){" 
        + (size - 1) + "}(true|false)\\)", 
      "%%\\[" + size/3 + ":" 
        + (size/3 + size/3) + "\\] \\(((true|false), ){" 
        + (size/3 - 1) + "}(true|false)\\)",
      "%%\\(((-){0,1}\\d{1,3}, ){" 
        + (size - 1) + "}(-){0,1}\\d{1,3}\\)",
      "%%a2 =  \\(((-){0,1}\\d{1,3}"
        + ", ){" + (size - 1) + "}(-){0,1}\\d{1,3}\\)",
      "%%\\[" + size/3 + ":" 
        + (size/3 + size/3) + "\\] \\(((-){0,1}\\d{1,3}"
        + ", ){" + (size/3 - 1) + "}(-){0,1}\\d{1,3}\\)",
      "%%\\(([a-zA-Z], ){" 
        + (size - 1) + "}[a-zA-Z]\\)",
      "%%a3 =  \\(([a-zA-Z], ){" 
        + (size - 1) + "}[a-zA-Z]\\)", 
      "%%\\[" + size/3 + ":" 
        + (size/3 + size/3) + "\\] \\(([a-zA-Z], ){" 
        + (size/3 - 1) + "}[a-zA-Z]\\)",
      "%%\\(((-){0,1}\\d{1,5}, ){" 
        + (size - 1) + "}(-){0,1}\\d{1,5}\\)",
      "%%a4 =  \\(((-){0,1}\\d{1,5}"
        + ", ){" + (size - 1) + "}(-){0,1}\\d{1,5}\\)",
      "%%\\[" + size/3 + ":" 
        + (size/3 + size/3) + "\\] \\(((-){0,1}\\d{1,5}"
        + ", ){" + (size/3 - 1) + "}(-){0,1}\\d{1,5}\\)",
      "%%\\(((-){0,1}\\d{1,4}, ){" 
        + (size - 1) + "}(-){0,1}\\d{1,4}\\)",
      "%%a5 =  \\(((-){0,1}\\d{1,4}"
        + ", ){" + (size - 1) + "}(-){0,1}\\d{1,4}\\)",
      "%%\\[" + size/3 + ":" 
        + (size/3 + size/3) + "\\] \\(((-){0,1}\\d{1,4}"
        + ", ){" + (size/3 - 1) + "}(-){0,1}\\d{1,4}\\)",
      "%%\\(((-){0,1}\\d{1,19}, ){" 
        + (size - 1) + "}(-){0,1}\\d{1,19}\\)",
      "%%a6 =  \\(((-){0,1}\\d{1,19}"
        + ", ){" + (size - 1) + "}(-){0,1}\\d{1,19}\\)",
      "%%\\[" + size/3 + ":" 
        + (size/3 + size/3) + "\\] \\(((-){0,1}\\d{1,19},"
        + " ){" + (size/3 - 1) + "}(-){0,1}\\d{1,19}\\)",
      "%%\\((\\d\\.\\d+(E-){0,1}"
        + "\\d+, ){" + (size - 1) + "}\\d\\.\\d+"
        + "(E-){0,1}\\d+\\)",
      "%%a7 =  \\((\\d\\.\\d+"
        + "(E-){0,1}\\d+, ){" + (size - 1) + "}\\d\\.\\d+"
        + "(E-){0,1}\\d+\\)",
      "%%\\[" + size/3 + ":" 
        + (size/3 + size/3) + "\\] \\((\\d\\.\\d+"
        + "(E-){0,1}\\d+, ){" + (size/3 - 1) + "}"
        + "\\d\\.\\d+(E-){0,1}\\d+\\)",
      "%%\\((\\d\\.\\d+(E-){0,1}"
        + "\\d+, ){" + (size - 1) + "}\\d\\.\\d+"
        + "(E-){0,1}\\d+\\)",
      "%%a8 =  \\((\\d\\.\\d+"
        + "(E-){0,1}\\d+, ){" + (size - 1) + "}\\d\\.\\d+"
        + "(E-){0,1}\\d+\\)",
      "%%\\[" + size/3 + ":" 
        + (size/3 + size/3) + "\\] \\((\\d\\.\\d+"
        + "(E-){0,1}\\d+, ){" + (size/3 - 1) + "}"
        + "\\d\\.\\d+(E-){0,1}\\d+\\)",
      "%%\\((([a-zA-Z]){7}, ){" 
        + (size - 1) + "}([a-zA-Z]){7}\\)",
      "%%a9 =  \\((([a-zA-Z]){7}, ){" 
        + (size - 1) + "}([a-zA-Z]){7}\\)", 
      "%%\\[" + size/3 + ":" 
        + (size/3 + size/3) + "\\] \\((([a-zA-Z]){7}, ){" 
        + (size/3 - 1) + "}([a-zA-Z]){7}\\)"
    });
  }
} ///:~
