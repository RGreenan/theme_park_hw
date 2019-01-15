package stallTests;

import org.junit.Before;
import org.junit.Test;
import stall.CandyFlossStall;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Sugarville", "Michelle Michaels", 6);
    }


    @Test
    public void hasName(){
        assertEquals("Sugarville", candyFlossStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Michelle Michaels", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(6, candyFlossStall.getParkingSpot());
    }
}
