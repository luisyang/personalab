//: X1:LogToFile.java
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import java.util.logging.*;

public class LogToFile {
  static Test monitor = new Test();
  private static Logger logger =
    Logger.getLogger("LogToFile");
  public static void main(String[] args)
  throws Exception {
    logger.addHandler(new FileHandler("LogToFile.xml"));
    logger.info("A message logged to the file");
    monitor.expect(new Object[] {
      "%%.* LogToFile main",
      "INFO: A message logged to the file"
    });
  }
} ///:~