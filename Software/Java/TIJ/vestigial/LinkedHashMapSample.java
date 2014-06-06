//: vestigial:LinkedHashMapSample.java
// Printing sorted and unsorted lists of months 
// using HashMap and LinkedHashMap.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package vestigial;
import java.util.*;
import java.text.*;

public class LinkedHashMapSample {
  public static void main(String[] args) {
    String[] 
      englishMonths = new DateFormatSymbols().getMonths(),
      frenchMonths = 
        new DateFormatSymbols(Locale.FRENCH).getMonths();
    // LinkedHashMap is an ordered map
    Map orderedMap = new LinkedHashMap();
    // HashMap is an unordered map
    Map unorderedMap = new HashMap();
    for (int i = 0, n = englishMonths.length; i < n; i++) {
      orderedMap.put(englishMonths[i], frenchMonths[i]);
      unorderedMap.put(englishMonths[i], frenchMonths[i]);
    }
    System.out.println("Ordered: " + orderedMap);
    System.out.println("Unordered: " + unorderedMap);
  }
} ///:~
