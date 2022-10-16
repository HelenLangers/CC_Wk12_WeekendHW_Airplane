import org.junit.Before;
import org.junit.Test;
import people.CabinCrewMember;
import people.Rank;

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
}
