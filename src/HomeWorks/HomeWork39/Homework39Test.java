package HomeWorks.HomeWork39;


import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class Homework39Test {
    Homework39 homework = new Homework39();
    @Test
    public void shortestLongest_onElement_test(){
        assertEquals("a",homework.findString(Arrays.asList("a")));
    }
    @Test
    public void shortestLongest_shortestFirst_test(){
        assertEquals("a",homework.findString(Arrays.asList("bb", "a", "ee", "ccc")));
    }
    @Test
    public void shortestLongest_longesFirst_test(){
        assertEquals("a",homework.findString(Arrays.asList("bb", "aaa", "ee", "c")));
    }

    
}
