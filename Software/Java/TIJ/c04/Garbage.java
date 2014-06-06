//: c04:Garbage.java
// Demonstration of the garbage
// collector and finalization
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;

class Chair {
  static volatile boolean gcrun = false;
  static volatile boolean finalizing = false;
  static volatile boolean gcforced = false;
  static volatile int created = 0;
  static volatile int finalized = 0;
  int i;
  Chair() {
    i = ++created;
    if(created == 47)
      System.out.println("Created 47");
    if(created > 10000 && !gcforced) {
      System.out.println("High limit hit without " +
        "finalization -- forcing garbage collection");
      System.runFinalization();
      System.gc();
      gcforced = true; // So it only does it once
    }
  }
  public void finalize() {
    if(!gcrun) {
      // The first time finalize() is called:
      gcrun = true;
      System.out.println(
        "Beginning to finalize after " +
        created + " Chairs have been created");
    }
    if(i == 47) {
      System.out.println(
        "Finalizing Chair #47, " +
        "Setting flag to stop Chair creation");
      finalizing = true;
    }
    finalized++;
    if(finalized >= created)
      System.out.println(
        "All " + finalized + " finalized");
  }
}

public class Garbage {
  static Test monitor = new Test();
  public static void main(String[] args) {
    // As long as the flag hasn't been set, make Chairs:
    while(!Chair.finalizing)
      new Chair();
    System.out.println(
      "After all Chairs have been created:\n" +
      "total created = " + Chair.created +
      ", total finalized = " + Chair.finalized);
    // Optional arguments force garbage
    // collection & finalization:
    if(args.length > 0) {
      if(args[0].equals("gc") ||
         args[0].equals("all")) {
        System.out.println("gc():");
        System.gc();
      }
      if(args[0].equals("finalize") ||
         args[0].equals("all")) {
        System.out.println("runFinalization():");
        System.runFinalization();
      }
    }
    monitor.expect(new Object[] {
      "Created 47",
      "%%Beginning to finalize after" +
        " \\d{1,10} Chairs have been created",
      "Finalizing Chair #47, Setting flag to stop Chair " +
        "creation",
      "After all Chairs have been created:",
      "%%total created = \\d{1,10}, " +
        "total finalized = \\d{1,10}",
      }, Test.AT_LEAST);
  }
} ///:~
