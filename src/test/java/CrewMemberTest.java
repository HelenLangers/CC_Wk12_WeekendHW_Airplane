import org.junit.Before;
import org.junit.Test;
import people.CrewMember;
import people.Rank;

import static org.junit.Assert.assertEquals;

public class CrewMemberTest {

    CrewMember crewMember;

    @Before
    public void before(){
        crewMember = new CrewMember("David", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void crewMemberHasName(){
        assertEquals("David", crewMember.getName());
    }

    @Test
    public void crewMemberHasRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, crewMember.getRank());
    }
}
