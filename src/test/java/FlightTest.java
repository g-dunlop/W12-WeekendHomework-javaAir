import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;
import org.junit.Before;

import java.util.ArrayList;

public class FlightTest {

    Flight flight;
    Plane plane1;
    Pilot pilot;
    Pilot pilot1;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.BOEING737);
        ArrayList<Pilot> pilots = new ArrayList<>();
        ArrayList<CabinCrewMember> cabinCrewMembers = new ArrayList<>();
        ArrayList<Passenger> passengers = new ArrayList<>();
        flight = new Flight(plane1, "GLA769", "EDI", "GLA", "08:30");
    }

    
}
