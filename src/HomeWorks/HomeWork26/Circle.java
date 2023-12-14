package HomeWorks.HomeWork26;

class Circle extends Figures{
    
    public Circle(double radius, double width,double length){
        super(radius,width,length);
    }
    
    public double area(double radius){
        return Math.PI * (getRadius()*2);
    }
}
