import People.Passenger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FlightManager {

    private Flight flight;
    private HashMap<String, Double> customerBaggageWeights;

    public FlightManager(){
        this.customerBaggageWeights = new HashMap<>();
    }

    public int getNumberOfBaggageReservations(Flight flight){
        return flight.getNumberOfPassengers();
    }

    public void addPassengerBaggageWeightToHashmap(Flight flight){
        ArrayList<Passenger> passengers = flight.getPassengers();
        Plane plane = flight.getPlane();
        double weightOfBag = (plane.planeType.getTotalWeight()/2)/plane.planeType.getCapacity();

        for (int i=0; i<flight.getNumberOfPassengers(); i++){
            Passenger passenger = passengers.get(i);
            customerBaggageWeights.put(passenger.getName(), passenger.getNumberOfBags() * weightOfBag);
        }
    }

    public double getPassengerBaggageWeight(Passenger passenger){
        return this.customerBaggageWeights.get(passenger.getName());
    }

    public double calculateBaggageSpaceRemaining(Flight flight){
        Plane plane = flight.getPlane();
        float baggageCapacity = plane.planeType.getTotalWeight()/2;
        double totalWeightUsed = 0;
        for (Map.Entry<String, Double> set : customerBaggageWeights.entrySet()){
            totalWeightUsed += set.getValue();
        }
        return baggageCapacity - totalWeightUsed;
    }
}
