import org.junit.Before;
import org.junit.Test;
import people.CabinCrewMember;
import people.Rank;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Carol", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void cabinCrewMemberHasName(){
        assertEquals("Carol", cabinCrewMember.getName());
    }

    @Test
    public void cabinCrewMemberHasRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void cabinCrewMemberCanMakeAnnouncement(){
        assertEquals("Attention all passengers, the buffet cart will be along shortly", cabinCrewMember.relayMessage(", the buffet cart will be along shortly"));
    }
}
