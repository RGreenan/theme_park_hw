import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor(20, 6.2, 25.50);
    }

    @Test
    public void hasAge(){
        assertEquals(20, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(6.2, visitor.getHeight(),0.01);
    }

    @Test
    public void hasMoney(){
        assertEquals(25.50, visitor.getMoney(),0.01);
    }
}
