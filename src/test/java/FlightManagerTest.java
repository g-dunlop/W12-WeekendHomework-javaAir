import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;
import People.RankType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Plane plane1;
    Pilot pilot1;
    Pilot pilot2;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void before(){
        flightManager = new FlightManager();
        plane1 = new Plane(PlaneType.BOEING737);
        passenger1 = new Passenger("Wesley Snipes", 3);
        passenger2 = new Passenger("Jodie Foster", 1);
        pilot1 = new Pilot("Pete Mitchell", RankType.CAPTAIN, "JR7568");
        pilot2 = new Pilot("Nick Bradshaw", RankType.FIRST_OFFICER, "TG1234");
        cabinCrewMember1 = new CabinCrewMember("Dave Grohl", RankType.PURSER);
        cabinCrewMember2 = new CabinCrewMember("Taylor Hawkins", RankType.FLIGHT_ATTENDANT);
        ArrayList<Pilot> pilots = new ArrayList<>();
        ArrayList<CabinCrewMember> cabinCrewMembers = new ArrayList<>();
        ArrayList<Passenger> passengers = new ArrayList<>();
        flight = new Flight(plane1, "GLA769", "EDI", "GLA", "08:30");
    }



    @Test
    public void canCalculateBaggageWeightReservedPerGuest(){
        flight.addPassengerToFlight(passenger1);
        flight.addPassengerToFlight(passenger2);
        flightManager.addPassengerBaggageWeightToHashmap(flight);
        assertEquals(333.33, flightManager.getPassengerBaggageWeight(passenger2), 0.5);
    }

    @Test
    public void canCalculateHowMuchWeightIsLeftForBaggage(){
        flight.addPassengerToFlight(passenger1);
        flight.addPassengerToFlight(passenger2);
        flightManager.addPassengerBaggageWeightToHashmap(flight);
        assertEquals(48668.00, flightManager.calculateBaggageSpaceRemaining(flight), 0.5 );
    }

}
