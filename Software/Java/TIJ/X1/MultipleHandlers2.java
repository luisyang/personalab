//: X1:MultipleHandlers2.java
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import java.util.logging.*;
public class MultipleHandlers2 {
  static Test monitor = new Test();
  private static Logger logger =
    Logger.getLogger("MultipleHandlers2");
  public static void main(String[] args)
  throws Exception {
    FileHandler logFile =
      new FileHandler("MultipleHandlers2.xml");
    logger.addHandler(logFile);
    logger.addHandler(new ConsoleHandler());
    logger.setUseParentHandlers(false);
    logger.warning("Output to multiple handlers");
    monitor.expect(new Object[] {
      "%%.* MultipleHandlers2 main",
      "WARNING: Output to multiple handlers"
    });
  }
} ///:~