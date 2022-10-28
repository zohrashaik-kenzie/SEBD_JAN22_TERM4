package optionals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalStreamMap {
    public static void main(String[] args){
        List<String> rawNumbers = Arrays.asList("1", null, "3", "2", "1", null); // [1, null, 3, 2, 1, null]

        List<Optional<String>> numbers = rawNumbers
                .stream()
                .map(Optional::ofNullable)                                                                                                                                                                                                                    // .map(number -> Integer.parseInt(number))
                .collect(Collectors.toList());

        System.out.println(numbers);

        List<String> rawNumbers2 = Arrays.asList("1", null, "3", "2", "1", null); // [1, null, 3, 2, 1, null]

        rawNumbers = null;
       List<String> numbers2 = Optional.ofNullable(rawNumbers) // WOWEE
                .orElse(Collections.emptyList()).stream().collect(Collectors.toList());

        System.out.println(numbers2);
    }
}

