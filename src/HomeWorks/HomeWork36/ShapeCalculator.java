package HomeWorks.HomeWork36;

public class ShapeCalculator {
    public double totalSquare( Shape[] shapes){
        double res = 0;

        for( Shape shape : shapes){
            res += shape.findArea();
        }

        return res;
    }
}
