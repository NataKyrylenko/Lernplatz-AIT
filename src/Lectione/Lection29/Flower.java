package Lectione.Lection29;

public class Flower extends Plant{
    private static final int FLOWER_GROW_SEASON = 15;

    public Flower(String name, int height, int age){
        super(name, height, age);
    }
    
    public void doSummer(){
        
        System.out.println(getName() + " does not grown in Summer, but flourishing, the height is " + getHeight());
    }
    public void doAutumn(){
        setHeight(0);
        System.out.println(getName() + " is cut to zero in Autumn " + getHeight());
       }
    
     public int getGrowPerSeason(){
        return FLOWER_GROW_SEASON;
     }
    

}
