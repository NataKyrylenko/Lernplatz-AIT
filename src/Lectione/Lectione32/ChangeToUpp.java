package Lectione.Lectione32;

class ChangeToUpp implements WordsChecker {
    public boolean checkWord(String word){
        return word.length()==3;
    }
    public String transformWord(String word){
        return word.toUpperCase();
    }
    
}
