import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Helen", 2);
    }

    @Test
    public void canGetPassengerName(){
        assertEquals("Helen", passenger.getName());
    }

    @Test
    public void canGetGetPassengerBag(){
        assertEquals(2, passenger.getBags());
    }

//    @Test
//    public void passengerStartAt0(){
//        assertEquals(0, passenger.getPassengerCount());
//    }
}
