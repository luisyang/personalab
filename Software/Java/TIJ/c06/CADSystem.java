//: c06:CADSystem.java
// Ensuring proper cleanup.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
package c06;
import com.bruceeckel.simpletest.*;
import java.util.*;

class Shape {
  Shape(int i) {
    System.out.println("Shape constructor");
  }
  void cleanup() {
    System.out.println("Shape cleanup");
  }
}

class Circle extends Shape {
  Circle(int i) {
    super(i);
    System.out.println("Drawing a Circle");
  }
  void cleanup() {
    System.out.println("Erasing a Circle");
    super.cleanup();
  }
}

class Triangle extends Shape {
  Triangle(int i) {
    super(i);
    System.out.println("Drawing a Triangle");
  }
  void cleanup() {
    System.out.println("Erasing a Triangle");
    super.cleanup();
  }
}

class Line extends Shape {
  private int start, end;
  Line(int start, int end) {
    super(start);
    this.start = start;
    this.end = end;
    System.out.println("Drawing a Line: " +
           start + ", " + end);
  }
  void cleanup() {
    System.out.println("Erasing a Line: " +
           start + ", " + end);
    super.cleanup();
  }
}

public class CADSystem extends Shape {
  static Test monitor = new Test();
  private Circle c;
  private Triangle t;
  private Line[] lines = new Line[10];
  CADSystem(int i) {
    super(i + 1);
    for(int j = 0; j < 10; j++)
      lines[j] = new Line(j, j*j);
    c = new Circle(1);
    t = new Triangle(1);
    System.out.println("Combined constructor");
  }
  void cleanup() {
    System.out.println("CADSystem.cleanup()");
    // The order of cleanup is the reverse 
    // of the order of initialization
    t.cleanup();
    c.cleanup();
    for(int i = lines.length - 1; i >= 0; i--)
      lines[i].cleanup();
    super.cleanup();
  }
  public static void main(String[] args) {
    CADSystem x = new CADSystem(47);
    try {
      // Code and exception handling...
    } finally {
      x.cleanup();
    }
    monitor.expect(new String[] {
      "Shape constructor",
      "Shape constructor",
      "Drawing a Line: 0, 0",
      "Shape constructor",
      "Drawing a Line: 1, 1",
      "Shape constructor",
      "Drawing a Line: 2, 4",
      "Shape constructor",
      "Drawing a Line: 3, 9",
      "Shape constructor",
      "Drawing a Line: 4, 16",
      "Shape constructor",
      "Drawing a Line: 5, 25",
      "Shape constructor",
      "Drawing a Line: 6, 36",
      "Shape constructor",
      "Drawing a Line: 7, 49",
      "Shape constructor",
      "Drawing a Line: 8, 64",
      "Shape constructor",
      "Drawing a Line: 9, 81",
      "Shape constructor",
      "Drawing a Circle",
      "Shape constructor",
      "Drawing a Triangle",
      "Combined constructor",
      "CADSystem.cleanup()",
      "Erasing a Triangle",
      "Shape cleanup",
      "Erasing a Circle",
      "Shape cleanup",
      "Erasing a Line: 9, 81",
      "Shape cleanup",
      "Erasing a Line: 8, 64",
      "Shape cleanup",
      "Erasing a Line: 7, 49",
      "Shape cleanup",
      "Erasing a Line: 6, 36",
      "Shape cleanup",
      "Erasing a Line: 5, 25",
      "Shape cleanup",
      "Erasing a Line: 4, 16",
      "Shape cleanup",
      "Erasing a Line: 3, 9",
      "Shape cleanup",
      "Erasing a Line: 2, 4",
      "Shape cleanup",
      "Erasing a Line: 1, 1",
      "Shape cleanup",
      "Erasing a Line: 0, 0",
      "Shape cleanup",
      "Shape cleanup"
    });
  }
} ///:~