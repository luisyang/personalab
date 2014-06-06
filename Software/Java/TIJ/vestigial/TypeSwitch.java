//: c??:TypeSwitch.java
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
public class TypeSwitch {
  public void operation() {}
  TypeSwitch[] cases = {
    new TypeSwitch() {
      public void operation() {
        System.out.println("1");
      }
    },
    new TypeSwitch() {
      public void operation() {
        System.out.println("1");
      }
    },
    new TypeSwitch() {
      public void operation() {
        System.out.println("1");
      }
    },
  };
  public static void main(String[] args) {
    
  }
} ///:~