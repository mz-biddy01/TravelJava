import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;

    @Before
    public void before(){
        flight = new Flight(Type.BOEING777, 777, "GLA", "EDI", new Date(2021,3,30));
        passenger1 = new Passenger("Helen", 2);
        passenger2 = new Passenger("Allison", 2);
        passenger3 = new Passenger("Sweetie", 2);
        passenger4 = new Passenger("Jackson", 2);

    }
    @Test
    public void passengersStartAt0(){
        assertEquals(0, flight.getPassengerCount());
    }

//    @Test
//    public void canAddPassengersToFlight(){
//        flight.addPassengers(passenger1);
//        flight.addPassengers(passenger2);
//        flight.addPassengers(passenger3);
//        flight.addPassengers(passenger4);
//        assertEquals(4, flight.getPassengerCount());
//    }

    @Test
    public void canReturnAvailableSeats() {
        assertEquals(4, flight.getAvailableSeats());

    }

    @Test
    public void canBookPassengerToFlight() {
        flight.bookPassengers(passenger1);
        flight.bookPassengers(passenger2);
        assertEquals(2, flight.getPassengerCount());
    }

    @Test
    public void canBookMorePassengers(){
        flight.bookPassengers(passenger1);
        flight.bookPassengers(passenger2);
        assertEquals(2, flight.getPassengerCount());
    }

    @Test
    public void noMoreBookingsAtFullCapacity(){
        flight.bookPassengers(passenger1);
        flight.bookPassengers(passenger2);
        flight.bookPassengers(passenger3);
        flight.bookPassengers(passenger4);
        flight.bookPassengers(passenger4); // the fifth booking should be ignored
        assertEquals(4, flight.getPassengerCount());
    }

}
