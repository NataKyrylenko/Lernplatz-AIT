package Lectione.Lectione32;

class ChargeStar implements WordString{
    public String changeString(String word){
        if(word.length() == 5){
            word= "*****";
        }
        return word;
    }
    
}
