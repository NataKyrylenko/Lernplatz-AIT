package HomeWorks.HomeWork27;

public class Pizza {

    String name;

    public Pizza (String name){
        this.name = name;
    }

    private void prepare(){
        System.out.println("Preparing " + name + " pizza");
    }

    private void bake(){
        System.out.println("Backing " + name + " pizza");
    }

    private void pack(){
        System.out.println("Packing " + name + " pizza");
    }

    public void orderPizza(){
        prepare();
        bake();
        pack();
    }
}
