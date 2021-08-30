package course.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testPoint(){
        Point p1 = new Point(1,5);
        Point p2 = new Point(7,10);
        Assert.assertEquals(p1.distance(p2), 5);
    }

    @Test
    public void testPoint2(){
        Point p1 = new Point(1,5);
        Point p2 = new Point(7,10);
        Assert.assertNotEquals(p1.distance(p2), 4);
    }

}
