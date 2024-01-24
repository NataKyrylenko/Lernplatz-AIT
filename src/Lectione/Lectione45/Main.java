package Lectione.Lectione45;

public class Main {
    public static void main(String[] args) {
        Operationable<Integer> operationable = (x,y) -> (x+y);
        System.out.println(operationable.calculate(1, 2));

        Operationable<String> stringOperationable = (x,y) -> (x+y);
        System.out.println(stringOperationable.calculate("1", "2"));
        
        int[] ints = {10,20,30,40,50};
        IsMoreInterface condition = num -> num > 20;
        System.out.println(condition.isMore(15));
        System.out.println(condition.isMore(25));

        System.out.println(sumIfCond(ints, condition));

        condition = num -> num < 30;
        System.out.println(sumIfCond(ints, condition));

        System.out.println("/////////////////////////////////////////////////////////////");

        Concatable concatable = (a,b) -> Integer.toString(a) + b;
        System.out.println(concatable.concat(1, 2));

        Checkable checkable = string -> string.length() ==3;
        System.out.println(checkable.check("abc"));
        System.out.println(checkable.check("abcd"));
        
        checkable = string -> string.length() %2 ==0;
        System.out.println(checkable.check("abcd")); //check even
        System.out.println(checkable.check("abc"));

        Transformable transformable = string -> string.toUpperCase();
        System.out.println(transformable.modify("abcD"));
    
        Transformable transformable1 = string -> string.length() == 4 ? "****" : string;
        System.out.println(transformable1.modify("ab"));
        System.out.println(transformable1.modify("abcd"));

    }

    public static int sumIfCond(int[]ints, IsMoreInterface lambdaExpression){
        int sum = 0;
        for(int element:ints){
            if(lambdaExpression.isMore(element)){
                sum +=element;

            }
        }
        return sum;
    }
    
}
