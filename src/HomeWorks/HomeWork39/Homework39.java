package HomeWorks.HomeWork39;

import java.util.List;

public class Homework39 {
    String findString(List<String> list){
        String minString = list.get(0);
        int indexMinElt = 0;
        String maxString = list.get(0);
        int indexMaxElt = 0;

        for(int i = 0; i<list.size(); i++){
            if(list.get(i).length() < minString.length()){
                minString = list.get(i);
                indexMinElt = i;
            }else if(list.get(i).length() > maxString.length()){
                maxString = list.get(i);
                indexMaxElt = i;
            }
        }
        if(indexMinElt < indexMaxElt){
            return minString;
        }
        return maxString;
    }
}
