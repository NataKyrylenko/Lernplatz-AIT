package HomeWorks.HomeWork41;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterNameTest {

    private CounterName counterName;
    @BeforeEach
    public void setUp(){
        counterName = new CounterName();
    }

    @Test
    void testFindNumberOccurence_When2() {
        List<String> actual = Arrays.asList("John", "Mary", "Peter", "John");
        assertEquals(2, counterName.findNumberOccurence(actual, "John"));

    }
    @Test
    void testFindNumberOccurence_When1() {
        List<String> actual = Arrays.asList("John", "Mary", "Peter", "John");
        assertEquals(1, counterName.findNumberOccurence(actual, "Peter"));
        
    }
    @Test
    void testFindNumberOccurence_When0() {
        List<String> actual = Arrays.asList("John", "Mary", "Peter", "John");
        assertEquals(0, counterName.findNumberOccurence(actual, "Anna"));
        
    }
    @Test
    void testFindNumberOccurence_When2John() {
        List<String> actual = Arrays.asList("John", "John");
        assertEquals(2, counterName.findNumberOccurence(actual, "John"));
        
    }
}
