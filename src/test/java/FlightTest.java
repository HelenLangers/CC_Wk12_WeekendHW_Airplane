import flight.Flight;
import org.junit.Before;
import people.CabinCrewMember;
import people.Passenger;
import people.Pilot;
import people.Rank;

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

}
