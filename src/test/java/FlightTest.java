import flight.Flight;
import org.junit.Before;
import org.junit.Test;
import people.CabinCrewMember;
import people.Passenger;
import people.Pilot;
import people.Rank;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot1;
    Pilot pilot2;
    CabinCrewMember cabinCrewMember;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        flight = new Flight("KEH3895", 4, "EDI", "MIL", "19:45");
        pilot1 = new Pilot("Bill", Rank.CAPTAIN, "9347qt8");
        pilot2 = new Pilot("Gillian", Rank.FIRST_OFFICER, "230954fs");
        cabinCrewMember = new CabinCrewMember("Dave", Rank.LEAD_ATTENDANT);
        passenger1 = new Passenger("Mike", 1);
        passenger2 = new Passenger("Helen", 2);
        passenger3 = new Passenger("Jasmin", 3);
    }

    @Test
    public void canAddPilot(){
        flight.addPilot(pilot1);
        assertEquals(1, flight.getPilotListLength());
    }

    @Test
    public void canAddCrewMembers(){
        flight.addCrewMember(cabinCrewMember);
        assertEquals(1, flight.getCabinCrewListLength());
    }

    @Test
    public void canAddPassengers(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.getPassengerListLength());
    }

    @Test
    public void flightHasFlightNumber(){
        assertEquals("KEH3895", flight.getFlightNumber());
    }

}
