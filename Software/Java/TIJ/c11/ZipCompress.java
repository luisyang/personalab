//: c11:ZipCompress.java
// Uses Zip compression to compress any
// number of files given on the command line.
// {Args: ZipCompress.java}
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import java.io.*;
import java.util.*;
import java.util.zip.*;

public class ZipCompress {
  static Test monitor = new Test();
  // Throw exceptions to console:
  public static void main(String[] args)
  throws IOException {
    FileOutputStream f =
      new FileOutputStream("test.zip");
    CheckedOutputStream csum =
      new CheckedOutputStream(
        f, new Adler32());
    ZipOutputStream out =
      new ZipOutputStream(
        new BufferedOutputStream(csum));
    out.setComment("A test of Java Zipping");
    // No corresponding getComment(), though.
    for(int i = 0; i < args.length; i++) {
      System.out.println(
        "Writing file " + args[i]);
      BufferedReader in =
        new BufferedReader(
          new FileReader(args[i]));
      out.putNextEntry(new ZipEntry(args[i]));
      int c;
      while((c = in.read()) != -1)
        out.write(c);
      in.close();
    }
    out.close();
    // Checksum valid only after the file
    // has been closed!
    System.out.println("Checksum: " +
      csum.getChecksum().getValue());
    // Now extract the files:
    System.out.println("Reading file");
    FileInputStream fi =
       new FileInputStream("test.zip");
    CheckedInputStream csumi =
      new CheckedInputStream(
        fi, new Adler32());
    ZipInputStream in2 =
      new ZipInputStream(
        new BufferedInputStream(csumi));
    ZipEntry ze;
    while((ze = in2.getNextEntry()) != null) {
      System.out.println("Reading file " + ze);
      int x;
      while((x = in2.read()) != -1)
        System.out.write(x);
    }
    if (args.length == 1)
      monitor.expect(new Object[] {
        "Writing file " + args[0],
        "%%Checksum: \\d{1,19}",
        "Reading file",
        "Reading file " + args[0]},
        args[0]);
    System.out.println("Checksum: " +
      csumi.getChecksum().getValue());
    in2.close();
    // Alternative way to open and read
    // zip files:
    ZipFile zf = new ZipFile("test.zip");
    Enumeration e = zf.entries();
    while(e.hasMoreElements()) {
      ZipEntry ze2 = (ZipEntry)e.nextElement();
      System.out.println("File: " + ze2);
      // ... and extract the data as before
    }
    if (args.length == 1)
      monitor.expect(new Object[] {
        "%%Checksum: \\d{1,19}",
        "File: " + args[0]
      });
  }
} ///:~
