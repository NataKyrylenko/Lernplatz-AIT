package HomeWorks.HomeWork26;

class Rectangle extends Figures {

    public Rectangle(double radius, double width, double length){
        super(radius, width, length);
    }

    public double area(double width, double length){
        return getWidth()*getLength();
    }
    
}
