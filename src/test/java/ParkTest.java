import attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("Green Hill Zone");
    }

    @Test
    public void hasName(){
        assertEquals("Green Hill Zone", park.getName());
    }
}
