import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;
import People.RankType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

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
    public void hasPlane(){
        assertEquals(plane1, flight.getPlane() );
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("GLA769", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("EDI", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("08:30", flight.getDepartureTime());
    }

    @Test
    public void canGetNumberOfPassengers(){
        assertEquals(0, flight.getNumberOfPassengers());
    }

    @Test
    public void canGetNumberOfCabinCrewMembers(){
        assertEquals(0, flight.getNumberOfCabinCrewMembers());
    }

    @Test
    public void canGetNumberOfPilots(){
        assertEquals(0, flight.getNumberOfPilots());
    }

    @Test
    public void canReturnNumberOfEmptySeats(){
        flight.addPassengerToFlight(passenger1);
        assertEquals(149, flight.getNumberOfEmptySeats());
    }

    @Test
    public void canAddPassengerToFlight(){
        flight.addPassengerToFlight(passenger1);
        assertEquals(1, flight.getNumberOfPassengers());
    }

    @Test
    public void canAddPilotToFlight(){
        flight.addPilotToFlight(pilot1);
        assertEquals(1, flight.getNumberOfPilots());
    }

    @Test
    public void canAddCabinCrewMemberToFlight(){
        flight.addCabinCrewMemberToFlight(cabinCrewMember1);
        assertEquals(1, flight.getNumberOfCabinCrewMembers());
    }


}
