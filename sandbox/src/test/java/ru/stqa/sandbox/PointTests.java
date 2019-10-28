package ru.stqa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistanceForOrigin() {
    Point p1 = new Point(0, 0);
    Point p2 = new Point(0, 0);
    Assert.assertEquals(p1.distance(p2), 0.0);
  }

  @Test
  public void testDistanceForNaturalNumbers() {
    Point p1 = new Point(10, 3);
    Point p2 = new Point(4, 1);
    Assert.assertEquals(p1.distance(p2), 6.324555320336759);
  }

  @Test
  public void testDistanceForNegativeNumbers() {
    Point p1 = new Point(-1, -1);
    Point p2 = new Point(-4, -4);
    Assert.assertEquals(p1.distance(p2), 4.242640687119285);
  }

  @Test
  public void testDistanceForCombinationNumbers() {
    Point p1 = new Point(-1, 0);
    Point p2 = new Point(4, 15);
    Assert.assertEquals(p1.distance(p2), 15.811388300841896);
  }

  @Test
  public void testDistanceForBigNumbers() {
    Point p1 = new Point(1098, 10986);
    Point p2 = new Point(340, 15986);
    Assert.assertEquals(p1.distance(p2), 5057.130016125747);

  }

  @Test
  public void testDistanceFoFractionalNumbers() {
    Point p1 = new Point(2.654343, 1.000006);
    Point p2 = new Point(28.076, 10.76);
    Assert.assertEquals(p1.distance(p2), 27.23083045934672);

  }

  @Test(enabled=false)
  public void testDistanceFailTest() {
    Point p1 = new Point(1, 17);
    Point p2 = new Point(40, 5);
    Assert.assertEquals(p1.distance(p2), 0);
  }
}
