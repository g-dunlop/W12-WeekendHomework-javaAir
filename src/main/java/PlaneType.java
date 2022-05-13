

public enum PlaneType {

    BOEING747(366, 400000),
    BOEING737(150, 100000),
    AIRBUSA380(350, 400000),
    AIRBUSA320(150, 100000);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
