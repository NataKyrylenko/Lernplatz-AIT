package Lectione.Lectione32;

class ChangeToUpp implements WordString {
    public String changeString(String word){
        if(word.length() == 3){
            word= word.toUpperCase();
        }
        return word;
    }
    
}
