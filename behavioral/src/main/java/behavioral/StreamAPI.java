package behavioral;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {

    //  HOW DOES STREAM API WORKS??


    public static void main(String[] args) {

        List<Integer> data = List.of(1, 2, 3, 4, 6, 7, 9, 11);

        Stream<Integer> sortedData = data.stream().sorted();

        // Map accepts a Function object as a parameter. It will perform an action
        // It will execute the method apply and perform something to the data
        Function<Integer, Integer> multiplyByTwo = d -> d * 2;
        Stream<Integer> sortedDataMultiplied = sortedData.map(multiplyByTwo);

        // Filter accepts a Predicate
        // It will execute the method test, which will execute a condition and then return
        // a boolean. In other words, if it follows the specified condition it will return true, otherwise false
        Predicate<Integer> predicate = d -> d % 2 != 1;
        Stream<Integer> sortedDataMultipliedFiltered = sortedDataMultiplied.filter(predicate);

        // reduce receives an accumulator
        BinaryOperator<Integer> binOperator = (Integer n1, Integer n2) -> n1 + n2;

        Integer optInt = sortedDataMultipliedFiltered.reduce(0, binOperator);

        System.out.println(optInt);
        // forEach accepts a consumer
        Consumer<Integer> consumer = System.out::println;
    }
}
