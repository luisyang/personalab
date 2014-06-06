//: X1:PrintableLogRecord.java
// Override LogRecord toString()
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import java.util.ResourceBundle;
import java.util.logging.*;

public class PrintableLogRecord extends LogRecord {
  static Test monitor = new Test();
  public static String nl =
    System.getProperty("line.separator");
  public PrintableLogRecord(Level level, String str) {
    super(level, str);
  }
  public String toString() {
    String result = "Level<" + getLevel() + ">" + nl;
    result += "LoggerName<" + getLoggerName() + ">" + nl;
    result += "Message<" + getMessage() + ">" + nl;
    result += "CurrentMillis<" + getMillis() + ">" + nl;
    Object objParams[] = getParameters();
    result += "Params";
    if(objParams == null)
      result += "<" + null +">" + nl;
    else
      for(int i = 0; i < objParams.length; i++)
        result += "  Param # <" + i + " value " +
                  objParams[i].toString() + ">" + nl;
    ResourceBundle rb = getResourceBundle();
    if(rb == null)
      result += "ResourceBundle<" + null + ">" + nl;
    else
      result += "ResourceBundle<" +
        rb.toString() + ">" + nl;
    String strName = getResourceBundleName();
    if(strName == null)
      result += "ResourceBundleName<" + null + ">" + nl;
    else
      result += "ResourceBundleName<" + strName + ">" + nl;
    result += "SequencNumber<" +
              getSequenceNumber() + ">" + nl;
    Object objSrcName = getSourceClassName();
    if(objSrcName == null)
      result += "SourceClassName<" + null + ">" + nl;
    else
      result += "SourceClassName<" + objSrcName + ">" + nl;
    result += "SourceMethodName<" +
              getSourceMethodName() + ">" + nl;
    result += "Thread Id<" + getThreadID() + ">" + nl;
    Throwable t = getThrown();
    if(t == null)
      result += "Thrown<" + null + ">";
    else
      result += "Thrown<" + t.toString() + ">";
    return result;
  }
  public static void main(String[] args) {
    PrintableLogRecord logRecord =
      new PrintableLogRecord(Level.FINEST,
        "Simple Log Record");
    System.out.println(logRecord);
    monitor.expect(new Object[] {
      "Level<FINEST>",
      "LoggerName<null>",
      "Message<Simple Log Record>",
      "%%CurrentMillis<.+>",
      "Params<null>",
      "ResourceBundle<null>",
      "ResourceBundleName<null>",
      "SequencNumber<0>",
      "SourceClassName<null>",
      "SourceMethodName<null>",
      "Thread Id<10>",
      "Thrown<null>"
    });
  }
} ///:~
