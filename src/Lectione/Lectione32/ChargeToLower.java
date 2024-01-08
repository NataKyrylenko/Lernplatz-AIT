package Lectione.Lectione32;

class ChargeToLower implements WordString{
    public boolean checkWord(String word){
        return word.length() == 4;
    }
    
    public String transformWord(String word){
        return word.toLowerCase();
    }
}
