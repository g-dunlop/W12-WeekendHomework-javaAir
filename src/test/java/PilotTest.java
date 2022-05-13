import People.Pilot;
import People.RankType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Pete Mitchell", RankType.CAPTAIN, "Jb2875" );
    }

    @Test
    public void hasName(){
        assertEquals("Pete Mitchell", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(RankType.CAPTAIN, pilot.getRankType());
    }

    @Test
    public void hasLicenseNumber(){
        assertEquals("Jb2875", pilot.getLicenseNumber());
    }

    @Test
    public void canChangeName(){
        pilot.setName("Tom Kazansky");
        assertEquals("Tom Kazansky", pilot.getName());
    }

    @Test
    public void canChangeRankType(){
        pilot.setRankType(RankType.FIRST_OFFICER);
        assertEquals(RankType.FIRST_OFFICER, pilot.getRankType());
    }

    @Test
    public void canChangeLicenseNumber(){
        pilot.setLicenseNumber("Ja7649");
        assertEquals("Ja7649", pilot.getLicenseNumber());
    }
}
