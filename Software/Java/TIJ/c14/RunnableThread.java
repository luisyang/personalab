//: c14:RunnableThread.java
// SimpleThread using the Runnable interface.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;

public class RunnableThread implements Runnable {
  static Test monitor = new Test();
  private int countDown = 5;
  public String toString() {
    return "#" + Thread.currentThread().getName() +
      ": " + countDown;
  }
  public void run() {
    while(true) {
      System.out.println(this);
      if(--countDown == 0) return;
    }
  }
  public static void main(String[] args) {
    for(int i = 1; i <= 5; i++)
      new Thread(new RunnableThread(), "" + i).start();
    monitor.expect(new String[] {
      "#1: 5",
      "#2: 5",
      "#3: 5",
      "#5: 5",
      "#1: 4",
      "#4: 5",
      "#2: 4",
      "#3: 4",
      "#5: 4",
      "#1: 3",
      "#4: 4",
      "#2: 3",
      "#3: 3",
      "#5: 3",
      "#1: 2",
      "#4: 3",
      "#2: 2",
      "#3: 2",
      "#5: 2",
      "#1: 1",
      "#4: 2",
      "#2: 1",
      "#3: 1",
      "#5: 1",
      "#4: 1"
    }, Test.IGNORE_ORDER + Test.DELAY_SHORT);
  }
} ///:~
