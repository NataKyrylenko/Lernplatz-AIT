package HomeWorks.HomeWork31;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2, 3);
        Circle circle = new Circle(3);

        System.out.println("Perimetr of Rectangle = " + rectangle.findPerimeter());
        System.out.println("Perimetr of Circle  = " + circle.findPerimeter());

        System.out.println("Area of Rectangle = " + rectangle.findArea());
        System.out.println("Area of Circle = " + circle.findArea());


        Shape[] shapes = {rectangle, circle};
        double calcArea = totalArea(shapes);
        double calcPerimeter = totalPerimeter(shapes);
        System.out.println("Total area of Shapes = " + calcArea);
        System.out.println("Total perimeter of Shapes = " + calcPerimeter);
 }
        public static double totalArea(Shape[] shapes){
            double calcArea = 0;
            for(Shape shape: shapes){
                calcArea +=shape.findArea();
            }
            return calcArea;
        }

        public static double totalPerimeter(Shape[] shapes){
            double calcPerimeter = 0;
            for(Shape shape: shapes){
                calcPerimeter +=shape.findPerimeter();
            }
            return calcPerimeter;
        }
}
