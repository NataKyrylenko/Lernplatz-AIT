package Lectione.Lectione45;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class BuiltIn {
    public static void main(String[] args) {
        Predicate<Integer> isNegative = a -> a < 0;
        System.out.println(isNegative.test(3));
        System.out.println(isNegative.test(-3));

        BinaryOperator<Integer> plus = (a,b) -> a+b;
        System.out.println(plus.apply(1,2));

        BiFunction<Integer, Integer, String> concate = (a,b) -> Integer.toString(a) + b;
        System.out.println(concate.apply(1, 2));

        UnaryOperator<Integer> square = a -> a * a;
        System.out.println(square.apply(2));

        Function<Integer,String> modify = i -> String.valueOf(i) + " years";
        System.out.println(modify.apply(50));

        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Hallo");

        Supplier<String> supplier = () -> "Hello suplier !!";
        System.out.println(supplier.get());


    }
}
