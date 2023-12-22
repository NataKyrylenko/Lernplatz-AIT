package HomeWorks.HomeWork31;

class Rectangle implements Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double findArea(){
        return length * width;
    }

    public double findPerimeter(){
        return 2 * (length + width);
    }
}
