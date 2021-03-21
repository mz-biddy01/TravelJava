public enum Type {

    BOEING737(25, 100),
    BOEING747(20, 100),
    BOEING767(35, 140),
    BOEING777(4, 80),
    BOEING787(30, 150);

    private final int capacity;
    private final int totalWeight;

    Type(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return capacity;
    }

    public  int getTotalWeight() {
        return totalWeight;
    }

}
