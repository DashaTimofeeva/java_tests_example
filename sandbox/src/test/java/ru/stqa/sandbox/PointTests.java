package ru.stqa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistanceForOrigin() {
    Point p = new Point(0, 0, 0, 0);
    Assert.assertEquals(p.distance(), 0.0);

  }

  @Test
  public void testDistanceForNaturalNumbers() {
    Point p = new Point(10, 3, 4, 1);
    Assert.assertEquals(p.distance(), 6.324555320336759);

  }

  @Test
  public void testDistanceForNegativeNumbers() {
    Point p = new Point(-1, -1, -4, -4);
    Assert.assertEquals(p.distance(), 4.242640687119285);

  }

  @Test
  public void testDistanceForCombinationNumbers() {
    Point p = new Point(-1, 0, 4, 15);
    Assert.assertEquals(p.distance(), 15.811388300841896);

  }

  @Test
  public void testDistanceForBigNumbers() {
    Point p = new Point(1098, 10986, 340, 15986);
    Assert.assertEquals(p.distance(), 5057.130016125747);

  }

  @Test
  public void testDistanceFoFractionalNumbers() {
    Point p = new Point(2.654343, 1.000006, 28.076, 10.76);
    Assert.assertEquals(p.distance(), 27.23083045934672);

  }

  @Test(enabled=false)
  public void testDistanceFailTest() {
    Point p = new Point(1, 17, 40, 5);
    Assert.assertEquals(p.distance(), 0);

  }

}
