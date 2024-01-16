package Lectione.Lectione32;

public class Main {

    public static void main(String[] args) {
        String input = "aaa BBB dEF cFRgh bbb";

        WordsTransformer wt = new WordsTransformer();

        WordsChecker wcUpper = new ChangeToUpp();
        System.out.println(wt.transform(input,wcUpper));

        WordsChecker wcLower = new ChargeToLower();
        System.out.println(wt.transform(input,wcLower));

        WordsChecker wStar = new ChargeStar();
        System.out.println(wt.transform(input,wStar));


    }
    
    
    
}
