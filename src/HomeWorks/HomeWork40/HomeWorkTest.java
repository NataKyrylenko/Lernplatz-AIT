package HomeWorks.HomeWork40;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;

public class HomeWorkTest {
    
    private HomeWork homework;
    @BeforeEach
    public void setUp(){
        homework = new HomeWork();

    }
    @Test
    public void testAb_true() {
        Map<String,String> actual = new HashMap<>();
        actual.put("a","Hi");
        actual.put("b","There");

        Map<String,String> expected = new HashMap<>();
        expected.put("a", "Hi");
        expected.put("b","There");
         expected.put("ab","HiThere");
         assertEquals(expected,homework.ab(actual));

    }
    @Test
    public void testAb_noA() {
        Map<String,String> actual = new HashMap<>();
        actual.put("c","Hi");
        actual.put("b","There");

         assertEquals(actual,homework.ab(actual));
    }
    @Test
    public void testAb_noB() {
        Map<String,String> actual = new HashMap<>();
        actual.put("a","Hi");
    
         assertEquals(actual,homework.ab(actual));
    }

    @Test
    public void testWhenEmpty(){
        Map<String,String> actual = new HashMap<>();
        assertEquals(actual,homework.ab(actual));
    }
}
