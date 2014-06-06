//: c09:Enumerations.java
// Java 1.0/1.1 Vector and Enumeration.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import java.util.*;
import com.bruceeckel.util.*;

public class Enumerations {
  static Test monitor = new Test();
  public static void main(String[] args) {
    Vector v = new Vector();
    Collections2.fill(
      v, Collections2.countries, 100);
    Enumeration e = v.elements();
    while(e.hasMoreElements())
      System.out.println(e.nextElement());
    // Produce an Enumeration from a Collection:
    e = Collections.enumeration(new ArrayList());
    monitor.expect(new String[] {
      "ALGERIA",
      "ANGOLA",
      "BENIN",
      "BOTSWANA",
      "BURKINA FASO",
      "BURUNDI",
      "CAMEROON",
      "CAPE VERDE",
      "CENTRAL AFRICAN REPUBLIC",
      "CHAD",
      "COMOROS",
      "CONGO",
      "DJIBOUTI",
      "EGYPT",
      "EQUATORIAL GUINEA",
      "ERITREA",
      "ETHIOPIA",
      "GABON",
      "THE GAMBIA",
      "GHANA",
      "GUINEA",
      "GUINEA",
      "BISSAU",
      "CETE D'IVOIR (IVORY COAST)",
      "KENYA",
      "LESOTHO",
      "LIBERIA",
      "LIBYA",
      "MADAGASCAR",
      "MALAWI",
      "MALI",
      "MAURITANIA",
      "MAURITIUS",
      "MOROCCO",
      "MOZAMBIQUE",
      "NAMIBIA",
      "NIGER",
      "NIGERIA",
      "RWANDA",
      "SAO TOME E PRINCIPE",
      "SENEGAL",
      "SEYCHELLES",
      "SIERRA LEONE",
      "SOMALIA",
      "SOUTH AFRICA",
      "SUDAN",
      "SWAZILAND",
      "TANZANIA",
      "TOGO",
      "TUNISIA",
      "UGANDA",
      "DEMOCRATIC REPUBLIC OF THE CONGO (ZAIRE)",
      "ZAMBIA",
      "ZIMBABWE",
      "AFGHANISTAN",
      "BAHRAIN",
      "BANGLADESH",
      "BHUTAN",
      "BRUNEI",
      "CAMBODIA",
      "CHINA",
      "CYPRUS",
      "INDIA",
      "INDONESIA",
      "IRAN",
      "IRAQ",
      "ISRAEL",
      "JAPAN",
      "JORDAN",
      "KUWAIT",
      "LAOS",
      "LEBANON",
      "MALAYSIA",
      "THE MALDIVES",
      "MONGOLIA",
      "MYANMAR (BURMA)",
      "NEPAL",
      "NORTH KOREA",
      "OMAN",
      "PAKISTAN",
      "PHILIPPINES",
      "QATAR",
      "SAUDI ARABIA",
      "SINGAPORE",
      "SOUTH KOREA",
      "SRI LANKA",
      "SYRIA",
      "TAIWAN (REPUBLIC OF CHINA)",
      "THAILAND",
      "TURKEY",
      "UNITED ARAB EMIRATES",
      "VIETNAM",
      "YEMEN",
      "AUSTRALIA",
      "FIJI",
      "KIRIBATI",
      "MARSHALL ISLANDS",
      "MICRONESIA",
      "NAURU",
      "NEW ZEALAND"
    });
  }
} ///:~