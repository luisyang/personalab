//: c11:Redirecting.java
// Demonstrates standard I/O redirection.
// {Depends: junit.jar}
// {Broken}
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import junit.framework.*;
import java.io.*;

public class Redirecting {
  // Throw exceptions to console:
  public static void main(String[] args) 
  throws IOException {
    PrintStream console = System.out;
    BufferedInputStream in = 
      new BufferedInputStream(
        new FileInputStream(
          "Redirecting.java"));
    PrintStream out =
      new PrintStream(
        new BufferedOutputStream(
          new FileOutputStream("test.out")));
    System.setIn(in);
    System.setOut(out);
    System.setErr(out);

    BufferedReader br = 
      new BufferedReader(
        new InputStreamReader(System.in));
    String s;
    while((s = br.readLine()) != null)
      System.out.println(s);
    out.close(); // Remember this!
    System.setOut(console);
    junit.textui.TestRunner.run(RedirectingTest.class);
  }
  public static class RedirectingTest extends TestCase {
    public RedirectingTest(String name) {
      super(name);
    }
    public void testRedirecting() {
      try {
        BufferedReader in1 = 
          new BufferedReader(
            new FileReader("Redirecting.java"));
        BufferedReader in2 = 
          new BufferedReader(new FileReader("test.out"));
        String line;
        while ((line = in1.readLine()) != null)
          assertEquals(line, in2.readLine());
      } 
      catch (IOException e) {
        fail(e.toString());
      }
    }
  }
} ///:~
