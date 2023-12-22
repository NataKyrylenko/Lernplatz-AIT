package Lectione.Lectione32;

class ChargeToLower implements WordString{
    public String changeString(String word){
        if(word.length() == 4){
            word= word.toLowerCase();
        }
        return word;
    }
    
}
