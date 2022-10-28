package optionals;

import java.util.Optional;

public class OptionalOrElseThrow {
    public static void main(String[] args) {
        Optional<String> nonEmptyOptional = Optional.of("SEBD Advanced ATA Term 4");
        Optional<String> emptyOptional = Optional.empty();

        // orElseThrow() - Return the contained value, if present, otherwise
        //throw an exception to be created by the provided supplier.
        /*----------------------------------------------------------*/
        System.out.println(nonEmptyOptional.orElseThrow(NullPointerException::new));
        System.out.println(emptyOptional.orElseThrow(NullPointerException::new));
    }
}
