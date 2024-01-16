package HomeWorks.HomeWork36;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(10.0);

        System.out.println("Circle perimeter: " + circle.findPerimeter());
        System.out.println("Circle area: " + circle.findArea());

        Shape rectangle = new Rectangle(10.0,15.0);
        System.out.println("Rectangle perimeter: " + rectangle.findPerimeter());
        System.out.println("Rectangle area: " + rectangle.findArea());

        Shape[] shapes ={circle,rectangle};

        ShapeCalculator shapeCalculator = new ShapeCalculator();
        System.out.println("Total square is: " + shapeCalculator.totalSquare(shapes));
    
    }
}
