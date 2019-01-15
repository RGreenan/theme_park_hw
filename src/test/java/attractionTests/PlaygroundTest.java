package attractionTests;

import attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void before(){
        playground = new Playground("The Fun Palace");
    }

    @Test
    public void hasName(){
        assertEquals("The Fun Palace", playground.getName());
    }
}
