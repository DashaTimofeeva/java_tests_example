package ru.stqa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistanceForOrigin() {
    Point p1 = new Point();
    p1.x = 0;
    p1.y = 0;
    Point p2 = new Point();
    p2.x = 0;
    p2.y = 0;
    Assert.assertEquals(p1.distance(p2), 0.0);
  }

  @Test
  public void testDistanceForNaturalNumbers() {
    Point p1 = new Point();
    p1.x = 10;
    p1.y = 3;
    Point p2 = new Point();
    p2.x = 4;
    p2.y = 1;
    Assert.assertEquals(p1.distance(p2), 6.324555320336759);
  }

  @Test
  public void testDistanceForNegativeNumbers() {
    Point p1 = new Point();
    p1.x = -1;
    p1.y = -1;
    Point p2 = new Point();
    p2.x = -4;
    p2.y = -4;
    Assert.assertEquals(p1.distance(p2), 4.242640687119285);
  }

  @Test
  public void testDistanceForCombinationNumbers() {
    Point p1 = new Point();
    p1.x = -1;
    p1.y = 0;
    Point p2 = new Point();
    p2.x = 4;
    p2.y = 15;
    Assert.assertEquals(p1.distance(p2), 15.811388300841896);
  }

  @Test
  public void testDistanceForBigNumbers() {
    Point p1 = new Point();
    p1.x = 1098;
    p1.y = 10986;
    Point p2 = new Point();
    p2.x = 340;
    p2.y = 15986;
    Assert.assertEquals(p1.distance(p2), 5057.130016125747);

  }

  @Test
  public void testDistanceFoFractionalNumbers() {
    Point p1 = new Point();
    p1.x = 2.654343;
    p1.y = 1.000006;
    Point p2 = new Point();
    p2.x = 28.076;
    p2.y = 10.76;
    Assert.assertEquals(p1.distance(p2), 27.23083045934672);

  }

  @Test(enabled=false)
  public void testDistanceFailTest() {
    Point p1 = new Point();
    p1.x = 1;
    p1.y = 17;
    Point p2 = new Point();
    p2.x = 40;
    p2.y = 5;
    Assert.assertEquals(p1.distance(p2), 0);
  }
}
