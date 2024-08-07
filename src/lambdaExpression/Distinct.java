package lambdaExpression;

import java.util.stream.Stream;

public class Distinct {
    public static void main(String[] args) {
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 1).limit(10);
        infiniteStream.forEach(System.out::println);
// Output: 0 1 2 3 4 5 6 7 8 9

    }
}
