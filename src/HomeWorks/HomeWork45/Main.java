package HomeWorks.HomeWork45;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
     public static void main(String[] args) {
        BiFunction<Integer, String, String> concatable = (a, b) -> Integer.toString(a) + b;
        System.out.println(concatable.apply(1, "3"));

        Predicate<String> checkable = s -> s.length() == 3;
        System.out.println(checkable.test("abc"));
        System.out.println(checkable.test("abcd"));

        checkable = s -> s.length() % 2 == 0;
        System.out.println(checkable.test("abc"));
        System.out.println(checkable.test("abcd"));

        Function<String, String> transformable = String::toUpperCase;
        System.out.println(transformable.apply("abcDe"));

        Function<String, String> transformable1 = s -> s.length() == 4 ? "****" : s;
        System.out.println(transformable1.apply("ab"));
        System.out.println(transformable1.apply("abcd"));
    }



/* 
    Concatable concatable = (a,b) -> Integer.toString(a) + b;
        System.out.println(concatable.concat(1,3));

        Checkable checkable = s -> s.length() == 3;
        System.out.println(checkable.check("abc"));
        System.out.println(checkable.check("abcd"));

        System.out.println("checkable even");
        checkable = s -> s.length() % 2 == 0;
        System.out.println(checkable.check("abc"));
        System.out.println(checkable.check("abcd"));

        Transformable transformable = String::toUpperCase;
        System.out.println(transformable.modify("abcDe"));

        Transformable transformable1 = s -> s.length() == 4 ? "****":s;
        System.out.println(transformable1.modify("ab"));
        System.out.println(transformable1.modify("abcd"));

    */
}
