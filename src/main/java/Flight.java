import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;


public class Flight {

    private Type type;
    private int number;
    private String destination;
    private String airport;
    private Date time;
    private ArrayList<Passenger> passengers;


    public Flight(Type type, int number, String destination, String airport, Date time){
        this.type = type;
        this.number = number;
        this.destination = destination;
        this.airport = airport;
        this.time = time;
        this.passengers = new ArrayList<Passenger>();
    }

    public Type getType() {
        return type;
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    public String getAirport() {
        return airport;
    }


    public Date getTime() {
        return time;
    }

    public int getPassengerCount(){
        return this.passengers.size();
    }


    public int getAvailableSeats() {
        return this.type.getCapacity();
    }

    public void bookPassengers(Passenger passenger){
        if (getAvailableSeats() <= type.getCapacity()) {
            this.passengers.add(passenger);
        }
        else {
            System.out.println("Flight is full. Can't accept more passengers");
        }
    }

//    public void bookMorePassengers(Passenger passenger3) {
//        if (getAvailableSeats() < type.getCapacity()) {
//            this.passengers.add(passenger3);
//        }
//    }
//
//    public boolean noMoreBooking() {
//        if(getPassengerCount() == type.getCapacity()){
//        }
//        return false;
//    }
}

