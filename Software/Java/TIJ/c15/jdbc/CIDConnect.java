//: c15:jdbc:CIDConnect.java
// Database connection information for
// the community interests database (CID).
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.

public class CIDConnect {
  // All the information specific to CloudScape:
  public static String dbDriver = 
    "COM.cloudscape.core.JDBCDriver";
  public static String dbURL =
    "jdbc:cloudscape:d:/docs/_work/JSapienDB";
  public static String user = "";
  public static String password = "";
} ///:~