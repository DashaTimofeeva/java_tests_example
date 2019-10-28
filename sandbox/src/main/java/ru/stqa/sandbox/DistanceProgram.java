package ru.stqa.sandbox;

public class DistanceProgram {

  public static void main(String[] args) {

    Point p1 = new Point();
    p1.x = 1;
    p1.y = 1;

    Point p2 = new Point();
    p2.x = 0;
    p2.y = 0;

    double res = p1.distance(p2);
    System.out.println("Расстояние между точками с координатами: p1 = (" + p1.x + ", " + p1.y + "), " +
            "p2 = (" + p2.x + ", " + p2.y + "), равно: " + res);

  }
}
