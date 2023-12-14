package HomeWorks.HomeWork26;

class Circle extends Figures{
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double area(){
        return Math.PI * (radius*radius);
    }
}
