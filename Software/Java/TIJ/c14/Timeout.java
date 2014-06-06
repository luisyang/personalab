//: c14:Timeout.java
// Set a time limit on the execution of a program
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.

class Timeout extends Thread {
  private int delay;
  private String message;
  public Timeout(int delay, String msg) {
    this.delay = delay;
    message = msg;
    setDaemon(true);
    start(); 
  }
  public void run() {
    try {
      sleep(delay);
    } catch(InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println(message);
    System.exit(0);
  }
} ///:~