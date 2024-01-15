package Lectione.Lection37;


public class Main_ {
    public static void main(String[] args) {
        OurList<Integer> ourList = new OurArrayList<>();
        
        ourList.append(52);
        ourList.append(7);
        ourList.append(48);
        ourList.append(20);
        ourList.append(32);
        ourList.append(85);
        System.out.println(ourList);

        ourList.remove(32);
        ourList.set(44, 2);

        ourList.removeById(1);
        for(int i = 0; i<ourList.size(); i++){
            System.out.println(ourList.get(i));
             
         }
        ourList.clear();
        System.out.println("after clear");

        for(int i = 0; i<ourList.size(); i++){
           System.out.println(ourList.get(i));
            
        }

        
        
    }

    
}
