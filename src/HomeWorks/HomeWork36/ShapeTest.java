package HomeWorks.HomeWork36;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShapeTest {
    Rectangle rectangle = new Rectangle(0,0);
    Circle circle = new Circle(0);


    @Test
    public void testFindArea() {
        assertEquals(6,rectangle.findArea(4,4));
        assertEquals(3, circle.findArea(4,5));
    }


    @Test
    public void testFindPerimeter() {

    }
    
}
