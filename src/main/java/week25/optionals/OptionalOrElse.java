package week25.optionals;

import java.util.Optional;

public class OptionalOrElse {
    public static void main(String[] args) {
        Optional<String> nonEmptyOptional = Optional.of("SEDB Advanced ATA Term 4");
        Optional<String> emptyOptional = Optional.empty();

        // orElse() - Return the value if present, otherwise return other.
        /*----------------------------------------------------------*/
        System.out.println(nonEmptyOptional.orElse("No course Present"));
        System.out.println(emptyOptional.orElse("No course present"));
    }
}
