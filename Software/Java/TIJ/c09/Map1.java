//: c09:Map1.java
// Things you can do with Maps.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import java.util.*;
import com.bruceeckel.util.*;

public class Map1 {
  static Test monitor = new Test();
  static Collections2.StringPairGenerator geo =
    Collections2.geography;
  static Collections2.RandStringPairGenerator
    rsp = Collections2.rsp;
  // Producing a Set of the keys:
  public static void printKeys(Map m) {
    System.out.print("Size = " + m.size() +", ");
    System.out.print("Keys: ");
    System.out.println(m.keySet());
  }
  // Producing a Collection of the values:
  public static void printValues(Map m) {
    System.out.print("Values: ");
    System.out.println(m.values());
  }
  public static void test(Map m) {
    Collections2.fill(m, geo, 25);
    // Map has 'Set' behavior for keys:
    Collections2.fill(m, geo.reset(), 25);
    printKeys(m);
    printValues(m);
    System.out.println(m);
    String key = CountryCapitals.pairs[4][0];
    String value = CountryCapitals.pairs[4][1];
    System.out.println("m.containsKey(\"" + key +
      "\"): " + m.containsKey(key));
    System.out.println("m.get(\"" + key + "\"): "
      + m.get(key));
    System.out.println("m.containsValue(\""
      + value + "\"): " +
      m.containsValue(value));
    Map m2 = new TreeMap();
    Collections2.fill(m2, rsp, 25);
    m.putAll(m2);
    printKeys(m);
    key = m.keySet().iterator().next().toString();
    System.out.println("First key in map: "+key);
    m.remove(key);
    printKeys(m);
    m.clear();
    System.out.println("m.isEmpty(): "
      + m.isEmpty());
    Collections2.fill(m, geo.reset(), 25);
    // Operations on the Set change the Map:
    m.keySet().removeAll(m.keySet());
    System.out.println("m.isEmpty(): "
      + m.isEmpty());
  }
  public static void main(String[] args) {
    System.out.println("Testing HashMap");
    test(new HashMap());
    System.out.println("Testing TreeMap");
    test(new TreeMap());
    monitor.expect(new Object[] {
      "Testing HashMap",
      "Size = 24, Keys: [BURUNDI, KENYA, BISSAU, EGYPT, " +
        "DJIBOUTI, EQUATORIAL GUINEA, CAPE VERDE, THE " +
        "GAMBIA, ERITREA, GHANA, CENTRAL AFRICAN " +
        "REPUBLIC, CAMEROON, BENIN, GUINEA, CETE " +
        "D'IVOIR (IVORY COAST), ANGOLA, CONGO, " +
        "BOTSWANA, ETHIOPIA, CHAD, COMOROS, GABON, " +
        "BURKINA FASO, ALGERIA]",
      "Values: [Bujumbura, Nairobi, Bissau, Cairo, " +
        "Dijibouti, Malabo, Praia, Banjul, Asmara, " +
        "Accra, Bangui, Yaounde, Porto-Novo, -, " +
        "Yamoussoukro, Luanda, Brazzaville, Gaberone, " +
        "Addis Ababa, N'djamena, Moroni, Libreville, " +
        "Ouagadougou, Algiers]",
      "{BURUNDI=Bujumbura, KENYA=Nairobi, " +
        "BISSAU=Bissau, EGYPT=Cairo, " +
        "DJIBOUTI=Dijibouti, EQUATORIAL GUINEA=Malabo, " +
        "CAPE VERDE=Praia, THE GAMBIA=Banjul, " +
        "ERITREA=Asmara, GHANA=Accra, CENTRAL AFRICAN " +
        "REPUBLIC=Bangui, CAMEROON=Yaounde, " +
        "BENIN=Porto-Novo, GUINEA=-, CETE D'IVOIR " +
        "(IVORY COAST)=Yamoussoukro, ANGOLA=Luanda, " +
        "CONGO=Brazzaville, BOTSWANA=Gaberone, " +
        "ETHIOPIA=Addis Ababa, CHAD=N'djamena, " +
        "COMOROS=Moroni, GABON=Libreville, BURKINA " +
        "FASO=Ouagadougou, ALGERIA=Algiers}",
      "m.containsKey(\"BURKINA FASO\"): true",
      "m.get(\"BURKINA FASO\"): Ouagadougou",
      "m.containsValue(\"Ouagadougou\"): true",
      "%%Size = 49, Keys: " +
        "\\[(.*?, ){48}.*?\\]",
      "%%First key in map: [a-zA-Z]*",
      "%%Size = 48, Keys: " +
        "\\[(.*?, ){47}.*?\\]",
      "m.isEmpty(): true",
      "m.isEmpty(): true",
      "Testing TreeMap",
      "Size = 49, Keys: [ALGERIA, ANGOLA, BENIN, " +
        "BISSAU, BOTSWANA, BURKINA FASO, BURUNDI, " +
        "CAMEROON, CAPE VERDE, CENTRAL AFRICAN " +
        "REPUBLIC, CETE D'IVOIR (IVORY COAST), CHAD, " +
        "COMOROS, CONGO, DJIBOUTI, EGYPT, EQUATORIAL " +
        "GUINEA, ERITREA, ETHIOPIA, GABON, GHANA, " +
        "GUINEA, KENYA, LESOTHO, LIBERIA, LIBYA, " +
        "MADAGASCAR, MALAWI, MALI, MAURITANIA, " +
        "MAURITIUS, MOROCCO, MOZAMBIQUE, NAMIBIA, " +
        "NIGER, NIGERIA, RWANDA, SAO TOME E PRINCIPE, " +
        "SENEGAL, SEYCHELLES, SIERRA LEONE, SOMALIA, " +
        "SOUTH AFRICA, SUDAN, SWAZILAND, TANZANIA, THE " +
        "GAMBIA, TOGO, TUNISIA]",
      "Values: [Algiers, Luanda, Porto-Novo, Bissau, " +
        "Gaberone, Ouagadougou, Bujumbura, Yaounde, " +
        "Praia, Bangui, Yamoussoukro, N'djamena, " +
        "Moroni, Brazzaville, Dijibouti, Cairo, Malabo, " +
        "Asmara, Addis Ababa, Libreville, Accra, -, " +
        "Nairobi, Maseru, Monrovia, Tripoli, " +
        "Antananarivo, Lilongwe, Bamako, Nouakchott, " +
        "Port Louis, Rabat, Maputo, Windhoek, Niamey, " +
        "Abuja, Kigali, Sao Tome, Dakar, Victoria, " +
        "Freetown, Mogadishu, Pretoria/Cape Town, " +
        "Khartoum, Mbabane, Dodoma, Banjul, Lome, Tunis]",
      "{ALGERIA=Algiers, ANGOLA=Luanda, " +
        "BENIN=Porto-Novo, BISSAU=Bissau, " +
        "BOTSWANA=Gaberone, BURKINA FASO=Ouagadougou, " +
        "BURUNDI=Bujumbura, CAMEROON=Yaounde, CAPE " +
        "VERDE=Praia, CENTRAL AFRICAN REPUBLIC=Bangui, " +
        "CETE D'IVOIR (IVORY COAST)=Yamoussoukro, " +
        "CHAD=N'djamena, COMOROS=Moroni, " +
        "CONGO=Brazzaville, DJIBOUTI=Dijibouti, " +
        "EGYPT=Cairo, EQUATORIAL GUINEA=Malabo, " +
        "ERITREA=Asmara, ETHIOPIA=Addis Ababa, " +
        "GABON=Libreville, GHANA=Accra, GUINEA=-, " +
        "KENYA=Nairobi, LESOTHO=Maseru, " +
        "LIBERIA=Monrovia, LIBYA=Tripoli, " +
        "MADAGASCAR=Antananarivo, MALAWI=Lilongwe, " +
        "MALI=Bamako, MAURITANIA=Nouakchott, " +
        "MAURITIUS=Port Louis, MOROCCO=Rabat, " +
        "MOZAMBIQUE=Maputo, NAMIBIA=Windhoek, " +
        "NIGER=Niamey, NIGERIA=Abuja, RWANDA=Kigali, " +
        "SAO TOME E PRINCIPE=Sao Tome, SENEGAL=Dakar, " +
        "SEYCHELLES=Victoria, SIERRA LEONE=Freetown, " +
        "SOMALIA=Mogadishu, SOUTH AFRICA=Pretoria/Cape " +
        "Town, SUDAN=Khartoum, SWAZILAND=Mbabane, " +
        "TANZANIA=Dodoma, THE GAMBIA=Banjul, TOGO=Lome, " +
        "TUNISIA=Tunis}",
      "m.containsKey(\"BURKINA FASO\"): true",
      "m.get(\"BURKINA FASO\"): Ouagadougou",
      "m.containsValue(\"Ouagadougou\"): true",
      "%%Size = 74, Keys: " +
        "\\[(.*?, ){73}.*?\\]",
      "%%First key in map: [a-zA-Z]*",
      "%%Size = 73, Keys: " +
        "\\[(.*?, ){72}.*?\\]",
      "m.isEmpty(): true",
      "m.isEmpty(): true"
    });
  }
} ///:~