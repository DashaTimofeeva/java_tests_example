package ru.stqa.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    hello("Dasha");
    hello("world");
    hello("Zhuzha");

    double l = 9;
    System.out.println("Площадь квадрата со стороной " + l + " равна " + area(l));

    double a = 4;
    double b = 5;
    System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " равна " + area(a, b));

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(double len) {
    return len * len;
  }

  public static double area(double a, double b) {
    return a * b;
  }
}