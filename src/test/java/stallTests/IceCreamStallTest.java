package stallTests;

import org.junit.Before;
import org.junit.Test;
import stall.IceCreamStall;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Icies", "Ronnie James", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Icies", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Ronnie James", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(2, iceCreamStall.getParkingSpot());
    }
}
