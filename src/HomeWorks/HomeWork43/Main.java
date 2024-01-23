package HomeWorks.HomeWork43;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
       System.out.println( findSum("text.txt"));

       File file = new File("longText.txt");
       System.out.println(findLongest(file));

    }

    public static int findSum(String fileName){
        int sum = 0;
        String intString;
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            while((intString = br.readLine()) != null){
                sum += Integer.parseInt(intString);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return sum;
    }


    public static String findLongest(File fileName){
        String longest = "";
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = br.readLine()) != null){
                if (line.length() > longest.length()){
                    longest = line;
                }
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        return longest;
    }
    
}
