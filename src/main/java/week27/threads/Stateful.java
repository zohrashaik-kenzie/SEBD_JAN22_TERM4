package week27.threads;

import java.util.HashSet;
import java.util.Set;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Stateful {
    public static void main(String[] args) {

        Set<Integer> seen = new HashSet<>();

        IntStream stream = IntStream.of(1, 2, 3, 1, 2, 3);

// Stateful lambda expression

        IntUnaryOperator mapUniqueLambda = (int i) -> {
            if (!seen.contains(i)) {
                seen.add(i);
                return i;
            }
            else {
                return 0;
            }
        };

        int sum = stream.parallel().map(mapUniqueLambda).peek(i ->   System.out.println("Stream member: " + i)).sum();

        System.out.println("Sum: " + sum);
    }
}
