package Lectione.Lectione44;

public class Product {
    String name;
    int price;
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "name=" + name + ", price=" + price;
    }
    
}
