//: c12:PetCount2.java
// Using class literals.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package c12;
import com.bruceeckel.simpletest.*;
import java.util.*;

public class PetCount2 {
  static Test monitor = new Test();
  public static void main(String[] args) 
  throws Exception {
    ArrayList pets = new ArrayList();
    Class[] petTypes = {
      // Class literals:
      Pet.class,
      Dog.class,
      Pug.class,
      Cat.class,
      Rodent.class,
      Gerbil.class,
      Hamster.class,
    };
    try {
      for(int i = 0; i < 15; i++) {
        // Offset by one to eliminate Pet.class:
        int rnd = 1 + (int)(
          Math.random() * (petTypes.length - 1));
        pets.add(
          petTypes[rnd].newInstance());
      }
    } catch(InstantiationException e) {
      System.err.println("Cannot instantiate");
      throw e;
    } catch(IllegalAccessException e) {
      System.err.println("Cannot access");
      throw e;
    }
    HashMap h = new HashMap();
    for(int i = 0; i < petTypes.length; i++)
      h.put(petTypes[i].toString(),
        new Counter());
    for(int i = 0; i < pets.size(); i++) {
      Object o = pets.get(i);
      if(o instanceof Pet)
        ((Counter)h.get("class c12.Pet")).i++;
      if(o instanceof Dog)
        ((Counter)h.get("class c12.Dog")).i++;
      if(o instanceof Pug)
        ((Counter)h.get("class c12.Pug")).i++;
      if(o instanceof Cat)
        ((Counter)h.get("class c12.Cat")).i++;
      if(o instanceof Rodent)
        ((Counter)h.get("class c12.Rodent")).i++;
      if(o instanceof Gerbil)
        ((Counter)h.get("class c12.Gerbil")).i++;
      if(o instanceof Hamster)
        ((Counter)h.get("class c12.Hamster")).i++;
    }
    for(int i = 0; i < pets.size(); i++)
      System.out.println(pets.get(i).getClass());
    Iterator keys = h.keySet().iterator();
    while(keys.hasNext()) {
      String nm = (String)keys.next();
      Counter cnt = (Counter)h.get(nm);
      System.out.println(
        nm.substring(nm.lastIndexOf('.') + 1) + 
        " quantity: " + cnt.i);
    }
    monitor.expect(new Object[] {
      new TestExpression("%%class c12\\.(Dog|Pug|Cat|" +
        "Rodent|Gerbil|Hamster)", pets.size()),
      new TestExpression("%%(Pet|Dog|Pug|Cat|Rodent|" +
        "Gerbil|Hamster) quantity: \\d{1," +
        String.valueOf(pets.size()).length() + "}", 
        petTypes.length)
    });
  }
} ///:~
