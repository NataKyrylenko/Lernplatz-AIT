package Lectione.Lectione32;

class ChargeStar implements WordsChecker{
    public boolean checkWord(String word){
        return word.length() == 5;
    }
    
    public String transformWord(String word){
        return "*****";
    }
}
    

