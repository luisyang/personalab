//: c11:DirList3.java
// Building the anonymous inner class "in-place."
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import java.io.*;
import java.util.*;
import com.bruceeckel.util.*;

public class DirList3 {
  static Test monitor = new Test();
  public static void main(final String[] args) {
    File path = new File(".");
    String[] list;
    if(args.length == 0)
      list = path.list();
    else 
      list = path.list(new FilenameFilter() {
        public boolean 
        accept(File dir, String n) {
          String f = new File(n).getName();
          return f.indexOf(args[0]) != -1;
        }
      });
    Arrays.sort(list,
      new AlphabeticComparator());
    for(int i = 0; i < list.length; i++)
      System.out.println(list[i]);
    monitor.expect(new Object[] {
      new TestExpression("%%\\S+", list.length)
    });
  }
} ///:~
