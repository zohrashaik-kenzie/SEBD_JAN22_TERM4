package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalOrElseGet {
    public static void main(String[] args) {
        Optional<String> nonEmptyOptional = Optional.of("SEBD Advanced ATA Term 4");
        Optional<String> emptyOptional = Optional.empty();

        /* orElseGet - Return the value if present, otherwise invoke other
        and return the result of that invocation.*/
        /*----------------------------------------------------------*/
        Supplier<String> supplier = () -> "No more courses are offered this term";

        System.out.println(nonEmptyOptional.orElseGet(supplier));
        System.out.println(emptyOptional.orElseGet(supplier));
    }
}
