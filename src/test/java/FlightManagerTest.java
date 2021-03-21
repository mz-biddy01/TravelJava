import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;

    @Before
    public void before(){
        flightManager = new FlightManager(Type.BOEING777);

    }

    @Test
    public void planeTotalCapacity(){
        assertEquals(80, flightManager.getTotalWeight());
    }

    @Test
    public void getPassengersBagsCapacity(){
        assertEquals(40, flightManager.baggageCapacity());
    }
    @Test
    public void getEachPassengerBaggageWeight(){
        assertEquals(10, flightManager.passengerBaggage());
    }

    @Test
    public void getTotalBaggageWeight(){
        assertEquals(40, flightManager.totalBaggageWeight());
    }

    @Test
    public void getOverallBaggageRemains(){
        assertEquals(40, flightManager.overallWeightRemain());
    }
}
