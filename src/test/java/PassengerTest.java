import org.junit.Before;
import org.junit.Test;
import people.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Mike", 1);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Mike", passenger.getName());
    }
}
