package ru.stqa.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    hello("Dasha");
    hello("world");
    hello("Zhuzha");

    Square s = new Square(9);
    System.out.println("Площадь квадрата со стороной " + s.l + " равна " + s.area());

    Rectangle r = new Rectangle(4, 5);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area());

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }


}