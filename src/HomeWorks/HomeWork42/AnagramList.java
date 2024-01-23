package HomeWorks.HomeWork42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramList {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("john");
        names.add("mary");
        names.add("jonh");
        names.add("bill");
        names.add("njoh");
        names.add("amry");

    
    }


    public List<String> findAnagrams (String name, List<String> strings){
        Map<String, List<String>>anagrams = new HashMap<>();
        for(String s : strings){
            String sortedKey = sortAnagram(s);
            if(anagrams.containsKey(sortedKey)){
                List<String> value = anagrams.get(sortedKey);
                value.add(s);
                anagrams.put(sortedKey, value);
            }else{
                List<String> value = new ArrayList<>();
                value.add(s);
                anagrams.put(sortedKey, value);
            }

        }
        return anagrams.getOrDefault(sortAnagram(name), List.of());
}
        private String sortAnagram(String str){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }
    
    
}
