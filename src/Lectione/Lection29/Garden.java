package Lectione.Lection29;

public class Garden {
    public void growPlants(int years){
        Flower tulip = new Flower("Tulip", 0, 0);
        Tree pineTree = new Tree("Pine Tree", 3, 2);

        for(int i = 0; i < years; i++){
            System.out.println("Growing plants for year " + (i + 1) + " : ");
            tulip.seasons();
            pineTree.seasons();
        }
    }

    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.growPlants(2);
    }
    
}
