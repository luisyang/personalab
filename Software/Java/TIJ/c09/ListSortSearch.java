//: c09:ListSortSearch.java
// Sorting and searching Lists with 'Collections.'
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import com.bruceeckel.util.*;
import java.util.*;

public class ListSortSearch {
  static Test monitor = new Test();
  public static void main(String[] args) {
    List list = new ArrayList();
    Collections2.fill(list,
      Collections2.capitals, 25);
    System.out.println(list + "\n");
    Collections.shuffle(list);
    System.out.println("After shuffling: "+list);
    Collections.sort(list);
    System.out.println(list + "\n");
    Object key = list.get(12);
    int index =
      Collections.binarySearch(list, key);
    System.out.println("Location of " + key +
      " is " + index + ", list.get(" +
      index + ") = " + list.get(index));
    AlphabeticComparator comp =
      new AlphabeticComparator();
    Collections.sort(list, comp);
    System.out.println(list + "\n");
    key = list.get(12);
    index =
      Collections.binarySearch(list, key, comp);
    System.out.println("Location of " + key +
      " is " + index + ", list.get(" +
      index + ") = " + list.get(index));
    monitor.expect(new Object[] {
      "[Algiers, Luanda, Porto-Novo, Gaberone, " +
        "Ouagadougou, Bujumbura, Yaounde, Praia, " +
        "Bangui, N'djamena, Moroni, Brazzaville, " +
        "Dijibouti, Cairo, Malabo, Asmara, Addis " + 
        "Ababa, Libreville, Banjul, Accra, Conakry, -, " +
        "Bissau, Yamoussoukro, Nairobi]",
      "",
      "%%After shuffling: \\[((" +
        "Algiers|Luanda|Porto-Novo|Gaberone|Ouagadougou|" +
        "Bujumbura|Yaounde|Praia|Bangui|N'djamena|" +
        "Moroni|Brazzaville|Dijibouti|Cairo|Malabo|" +
        "Asmara|Addis Ababa|Libreville|Banjul|Accra|" +
        "Conakry|-|Bissau|Yamoussoukro|Nairobi)(, )" +
        "{0,1}){25}\\]",
      "[-, Accra, Addis Ababa, Algiers, Asmara, Bangui, "
        + "Banjul, Bissau, Brazzaville, Bujumbura, Cairo, "
        + "Conakry, Dijibouti, Gaberone, Libreville, "
        + "Luanda, Malabo, Moroni, N'djamena, Nairobi, "
        + "Ouagadougou, Porto-Novo, Praia, Yamoussoukro, "
        + "Yaounde]",
      "",
      "Location of Dijibouti is 12, list.get(12) = "
        + "Dijibouti",
      "[-, Accra, Addis Ababa, Algiers, Asmara, Bangui, "
        + "Banjul, Bissau, Brazzaville, Bujumbura, Cairo, "
        + "Conakry, Dijibouti, Gaberone, Libreville, "
        + "Luanda, Malabo, Moroni, N'djamena, Nairobi, "
        + "Ouagadougou, Porto-Novo, Praia, Yamoussoukro, "
        + "Yaounde]",
      "",
      "Location of Dijibouti is 12, list.get(12) = "
        + "Dijibouti"
    });
  }
} ///:~
