package ru.stqa.sandbox;

public class DistanceProgram {

  public static void main(String[] args) {

    Point p = new Point(-4, 9, 16, 2);

    System.out.println("Расстояние между точками с координатами: p1 = (" + p.x1 + ", " + p.y1 + "), " +
            "p2 = (" + p.x2 + ", " + p.y2 + "), равно: " + p.distance());

  }
}
