package Lectione.Lectione40;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OurHashMapTest {


    @Test
    public void testSizeNewElts() {
        OurMape <Integer,String> actual = new OurHashMap<>();
        actual.put(3,"f");
        actual.put(2,"b");
        actual.put(1,"c");
        assertEquals(0, actual.size());
    }

    

   
}
