package HomeWorks.HomeWork27;

class PizzaHawaii extends Pizza{

    public PizzaHawaii(String name){
        super(name);
    }
    public void prepare(){
        System.out.println("Preparing " + name + " pizza");
    }
    
}
