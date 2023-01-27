package week25.optionals;

import java.util.Optional;
import java.util.function.Predicate;

public class OptionalFilter {
    public static void main(String[] args) {
        Optional<String> nonEmptyOptional = Optional.of("SEBD Advanced ATA Term 4");
        Optional<String> emptyOptional = Optional.empty();

        /* filter() - If a value is present, and value matches the given predicate,
         return an Optional otherwise return an empty Optional. */
        /*----------------------------------------------------------*/
        Predicate<String> predicate = s -> s.contains("ATA");
        System.out.println(nonEmptyOptional.filter(predicate)); //
        System.out.println(nonEmptyOptional.filter(s -> s.equals("ATA")));
        System.out.println(emptyOptional.filter(predicate));
        System.out.println(nonEmptyOptional.filter(s -> s.startsWith("S"))); //
    }
}
