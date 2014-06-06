//: X1:LogToFile2.java
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import java.util.logging.*;

public class LogToFile2 {
  static Test monitor = new Test();
  private static Logger logger =
    Logger.getLogger("LogToFile2");
  public static void main(String[] args)
  throws Exception {
    FileHandler logFile =
     new FileHandler("LogToFile2.txt");
    logFile.setFormatter(new SimpleFormatter());
    logger.addHandler(logFile);
    logger.info("A message logged to the file");
    monitor.expect(new Object[] {
      "%%.* LogToFile2 main",
      "INFO: A message logged to the file"
    });
  }
} ///:~