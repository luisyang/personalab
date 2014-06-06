//: c09:FillTest.java
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import com.bruceeckel.util.*;
import java.util.*;

public class FillTest {
  static Test monitor = new Test();
  static Generator sg =
    new Arrays2.RandStringGenerator(7);
  public static void main(String[] args) {
    List list = new ArrayList();
    Collections2.fill(list, sg, 25);
    System.out.println(list + "\n");
    List list2 = new ArrayList();
    Collections2.fill(list2,
      Collections2.capitals, 25);
    System.out.println(list2 + "\n");
    Set set = new HashSet();
    Collections2.fill(set, sg, 25);
    System.out.println(set + "\n");
    Map m = new HashMap();
    Collections2.fill(m, Collections2.rsp, 25);
    System.out.println(m + "\n");
    Map m2 = new HashMap();
    Collections2.fill(m2,
      Collections2.geography, 25);
    System.out.println(m2);
    monitor.expect(new Object[] {
      "%%\\[([a-zA-Z]{7}, ){24}[a-zA-Z]{7}\\]",
      "",
      "[Algiers, Luanda, Porto-Novo, Gaberone, " +
        "Ouagadougou, Bujumbura, Yaounde, Praia, " +
        "Bangui, N'djamena, Moroni, Brazzaville, " +
        "Dijibouti, Cairo, Malabo, Asmara, Addis Ababa, " +
        "Libreville, Banjul, Accra, Conakry, -, Bissau, " +
        "Yamoussoukro, Nairobi]",
      "",
        "%%\\[([a-zA-Z]{7}, ){24}[a-zA-Z]{7}\\]",
      "",
      "%%\\{([a-zA-Z]{10}=[a-zA-Z]{10}"
        + ", ){24}[a-zA-z]{10}=[a-zA-z]{10}\\}",
      "",
      "%%\\{((ERITREA=Asmara|CAPE "
        + "VERDE=Praia|GABON=Libreville|BENIN=Porto-Novo|"
        + "THE GAMBIA=Banjul|ETHIOPIA=Addis Ababa|"
        + "EGYPT=Cairo|CHAD=N'djamena|GUINEA=-|"
        + "DJIBOUTI=Dijibouti|CETE D'IVOIR \\(IVORY "
        + "COAST\\)=Yamoussoukro|KENYA=Nairobi|CENTRAL"
        + " AFRICAN REPUBLIC=Bangui|ALGERIA=Algiers|"
        + "CAMEROON=Yaounde|BURKINA FASO=Ouagadougou|"
        + "EQUATORIAL GUINEA=Malabo|GHANA=Accra|"
        + "COMOROS=Moroni|BISSAU=Bissau|BURUNDI=Bujumbura|"
        + "CONGO=Brazzaville|ANGOLA=Luanda|"
        + "BOTSWANA=Gaberone)(, ){0,1}){24}\\}"
    });
  }
} ///:~
