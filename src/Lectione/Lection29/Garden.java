package Lectione.Lection29;

public class Garden {
    public static void growPlants(Plant[] plants, int numberOfYears){
        System.out.println("Growing plants for " + numberOfYears + " years");
        for(int i = 0; i< numberOfYears; i++){
            for(Plant plant: plants){
                plant.seasons();
                
         }
        }
        for(Plant plant: plants) {
            System.out.println("     " + plant.getName() + " has height " + plant.getHeight()+ " and is " + plant.getAge() + " years old");
        }

        
    }  
    public static void main(String[] args) {
        Plant tree = new Tree("Pine Tree", 100,1);
        Plant flower = new Flower("Tulip", 5,1);
        Plant[] plants = {tree, flower};
        int yearToGrow = 2;

        growPlants(plants, yearToGrow);

        
    }
    

}
