import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUSA380);
    }

    @Test
    public void planeHasType(){
        assertEquals(PlaneType.AIRBUSA380, plane.getPlaneType());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(350, plane.planeType.getCapacity());
    }

    @Test
    public void planeHasTotalWeight(){
        assertEquals(400000, plane.planeType.getTotalWeight());
    }
}
