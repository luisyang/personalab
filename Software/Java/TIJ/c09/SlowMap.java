//: c09:SlowMap.java
// A Map implemented with ArrayLists.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import com.bruceeckel.simpletest.*;
import java.util.*;
import com.bruceeckel.util.*;

public class SlowMap extends AbstractMap {
  static Test monitor = new Test();
  private ArrayList
    keys = new ArrayList(),
    values = new ArrayList();
  public Object put(Object key, Object value) {
    Object result = get(key);
    if(!keys.contains(key)) {
      keys.add(key);
      values.add(value);
    } else
      values.set(keys.indexOf(key), value);
    return result;
  }
  public Object get(Object key) {
    if(!keys.contains(key))
      return null;
    return values.get(keys.indexOf(key));
  }
  public Set entrySet() {
    Set entries = new HashSet();
    Iterator
      ki = keys.iterator(),
      vi = values.iterator();
    while(ki.hasNext())
      entries.add(new MPair(ki.next(), vi.next()));
    return entries;
  }
  public static void main(String[] args) {
    SlowMap m = new SlowMap();
    Collections2.fill(m,
      Collections2.geography, 25);
    System.out.println(m);
    monitor.expect(new Object[] {
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
