package week25.optionals;

import com.google.common.base.Function;

import java.util.Optional;

public class OptionalMap {
    public static void main(String[] args) {
        Optional<String> nonEmptyOptional = Optional.of("SEBD Advanced ATA Term 4");
        Optional<String> emptyOptional = Optional.empty();
        /*
         * map() - If a value is present, apply the provided mapping function to it, and
         * if the result is non-null, return an Optional describing the result.
         * Otherwise return an empty Optional.
         */
        /*----------------------------------------------------------*/
        Function<String, String> function = s -> s.substring(0, 1).length() == 0 ? null : s;

        System.out.println(nonEmptyOptional.map(function));
        System.out.println(nonEmptyOptional.map(String::toLowerCase));
        System.out.println(emptyOptional.map(function));
    }
}
