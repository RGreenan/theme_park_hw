package stallTests;

import org.junit.Before;
import org.junit.Test;
import stall.TobaccoStall;

import static org.junit.Assert.assertEquals;


public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Smokems", "Melvin Throttle", 4);
    }

    @Test
    public void hasName(){
        assertEquals("Smokems", tobaccoStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Melvin Throttle", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(4, tobaccoStall.getParkingSpot());
    }

}
