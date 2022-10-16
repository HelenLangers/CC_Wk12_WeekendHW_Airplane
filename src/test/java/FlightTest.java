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
        flight = new Flight("KEH3895", 2, "EDI", "MIL", "19:45");
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
        flight.bookPassenger(passenger1);
        assertEquals(1, flight.getPassengerListLength());
    }

    @Test
    public void cannotAddPassengers(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        assertEquals(2, flight.getPassengerListLength());
    }

    @Test
    public void flightHasFlightNumber(){
        assertEquals("KEH3895", flight.getFlightNumber());
    }

    @Test
    public void flightHasCapacity(){
        assertEquals(2, flight.getCapacity());
    }

    @Test
    public void flightHasDepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void flightHasDestinationAirport(){
        assertEquals("MIL", flight.getDestinationAirport());
    }

    @Test
    public void flightHasDepartureTime(){
        assertEquals("19:45", flight.getDepartureTime());
    }

    @Test
    public void returnRemainingSeats(){
        flight.bookPassenger(passenger1);
        assertEquals(1, flight.remainingSeats());
    }

    @Test
    public void canSetFlightNumber(){
        flight.setFlightNumber("LAN398");
        assertEquals("LAN398", flight.getFlightNumber());
    }

    @Test
    public void canSetCapacity(){
        flight.setCapacity(5);
        assertEquals(5, flight.getCapacity());
    }

    @Test
    public void canSetDepartureAirport(){
        flight.setDepartureAirport("GLA");
        assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void canSetDestinationAirport(){
        flight.setDestinationAirport("LHW");
        assertEquals("LHW", flight.getDestinationAirport());
    }

    @Test
    public void canSetDepartureTime(){
        flight.setDepartureTime("20:30");
        assertEquals("20:30", flight.getDepartureTime());
    }

}
