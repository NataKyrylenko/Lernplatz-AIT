package Lectione.Lectione43;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main1 {

    //Reader
    //Writer
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output.txt", true)){
            String word = "Hello Java";
            writer.write(word);
            writer.append('\n');
            writer.append('!');

            writer.flush();   
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //FileReader
        try(FileReader reader = new FileReader("output.txt")){
            int ch;
            while ((ch = reader.read()) != -1 ){
                System.out.println((char)ch);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        
        //BufferedWriter(Writer out)

       try( BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("buffered.txt"))){
        String sentence = "Hello Java and everybody else!";
        bufferedWriter.write(sentence);
        bufferedWriter.newLine();

       }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //BufferedReader
        System.out.println("Buffered reader");
        try(BufferedReader br = new BufferedReader(new FileReader("buffered.txt"))) {
            String str;
            while((str = br.readLine()) != null){
                System.out.println(str);
                
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
