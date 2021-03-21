import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(Type.BOEING777);
    }

    @Test
    public void planeHasAType(){
        assertEquals(Type.BOEING777, plane.getType());
    }

}
