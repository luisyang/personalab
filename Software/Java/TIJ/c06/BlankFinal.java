//: c06:BlankFinal.java
// "Blank" final data members.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.

class Poppet { 
  int i;
  public Poppet(int ii) { i = ii; }
}

public class BlankFinal {
  final int i = 0; // Initialized final
  final int j; // Blank final
  final Poppet p; // Blank final reference
  // Blank finals MUST be initialized
  // in the constructor:
  BlankFinal() {
    j = 1; // Initialize blank final
    p = new Poppet(1);
  }
  BlankFinal(int x) {
    j = x; // Initialize blank final
    p = new Poppet(x);
  }
  public static void main(String[] args) {
    new BlankFinal();
    new BlankFinal(47);
  }
} ///:~