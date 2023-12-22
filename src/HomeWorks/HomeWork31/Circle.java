package HomeWorks.HomeWork31;

class Circle implements Shape{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double findArea(){
        return Math.round(Math.PI * radius * radius); // S= p*r2
    }
    public double findPerimeter(){
        return Math.round(2 * Math.PI * radius); // C=2*p*r
    }

    
}
