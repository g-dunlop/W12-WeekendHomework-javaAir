import People.CabinCrewMember;
import People.RankType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Jenny", RankType.PURSER);
    }

    @Test
    public void hasName(){
        assertEquals("Jenny", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(RankType.PURSER, cabinCrewMember.getRankType());
    }

    @Test
    public void canChangeName(){
        cabinCrewMember.setName("Benny");
        assertEquals("Benny", cabinCrewMember.getName());
    }

    @Test
    public void canChangeRankType(){
        cabinCrewMember.setRankType(RankType.FLIGHT_ATTENDANT);
        assertEquals(RankType.FLIGHT_ATTENDANT, cabinCrewMember.getRankType());
    }
}
