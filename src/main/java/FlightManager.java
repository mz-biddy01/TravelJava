public class FlightManager {

    private Type type;


    public FlightManager(Type type){
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public int getTotalWeight(){
        return this.type.getTotalWeight();
    }

    public int baggageCapacity(){
        return this.type.getTotalWeight() / 2;
    }

    public int passengerBaggage(){
        return baggageCapacity() / this.type.getCapacity();
    }

    public int totalBaggageWeight(){
        return passengerBaggage() * this.type.getCapacity();

    }

    public int overallWeightRemain(){
        return this.type.getTotalWeight() - totalBaggageWeight();
    }


}
