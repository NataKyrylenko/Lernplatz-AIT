package HomeWorks.HomeWork26;

class Rectangle extends Figures {

    private double width;
    private double length;

    public Rectangle(String name, double width, double length){
        super(name);
        this.width = width;
        this.length = length;
    }
    
    public double area(){
        return width*length;
    }
}
