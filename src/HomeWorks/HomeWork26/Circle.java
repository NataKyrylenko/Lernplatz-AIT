package HomeWorks.HomeWork26;

class Circle extends Figures{
    private double radius;
    
    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }
    
    public double area(){
        return Math.PI * (radius*radius);
    }

    public String toString(){
        return super.toString() + radius;
    }
}
