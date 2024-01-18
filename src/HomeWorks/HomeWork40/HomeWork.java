package HomeWorks.HomeWork40;

import java.util.HashMap;
import java.util.Map;

public class HomeWork {
    public static void main(String[] args) {
        HomeWork homeWork = new HomeWork();
        Map<String,String> actual = new HashMap<>();
        actual.put("a","Hi");
        actual.put("b","There");
        System.out.println(actual);
    }


    public Map <String,String> ab (Map<String,String> mapAB){
        if(mapAB.containsKey("a") && mapAB.containsKey("b")){
            mapAB.put("ab", mapAB.get("a").concat(mapAB.get("b")));
            
        }return mapAB;
    }
    
}
