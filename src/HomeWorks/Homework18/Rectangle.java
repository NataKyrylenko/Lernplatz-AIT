package HomeWorks.Homework18;

public class Rectangle {

    public int lenght;
    public int width;
    

    public Rectangle(int lenght, int width){
        System.out.print("Perimeter of the rectangle is= " + 2 * (lenght+width) + ". ");
        System.out.println("Area of the rectangle is= "+ (lenght*width) + ". ");
    }
}
