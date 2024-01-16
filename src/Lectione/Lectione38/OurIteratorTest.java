package Lectione.Lectione38;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class OurIteratorTest {
    
    private OurIterator ourIterator;

    @Before
    public void setUp(){
        ourIterator = new OurIterator();
    }


    @Test
    public void testReturnElmMoreN() {
        List<Integer> expected = Arrays.asList(1);
        List<Integer> actual = Arrays.asList(1);

        assertEquals(expected,ourIterator.returnElmMoreN(actual, 4));
    }
}
