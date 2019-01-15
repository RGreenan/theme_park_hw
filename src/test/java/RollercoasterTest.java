import attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("The Face-Melter");
    }

    @Test
    public void hasName(){
        assertEquals("The Face-Melter", rollercoaster.getName());
    }

}
