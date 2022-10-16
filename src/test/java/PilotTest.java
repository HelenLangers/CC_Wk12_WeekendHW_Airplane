import org.junit.Before;
import org.junit.Test;
import people.Pilot;
import people.Rank;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Gilbert", Rank.CAPTAIN, "324t324");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Gilbert", pilot.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void pilotHasLicenseNumber(){
        assertEquals("324t324", pilot.getPilotLicenseNumber());
    }

}
