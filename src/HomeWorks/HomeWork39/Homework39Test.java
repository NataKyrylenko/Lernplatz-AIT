package HomeWorks.HomeWork39;

import static org.junit.Assert.assertEquals;

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


    
}
