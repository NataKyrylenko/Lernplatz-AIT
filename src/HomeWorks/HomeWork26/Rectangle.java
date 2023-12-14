package HomeWorks.HomeWork26;

class Rectangle extends Figures {

    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    
    public double area(){
        return width*length;
    }
}
