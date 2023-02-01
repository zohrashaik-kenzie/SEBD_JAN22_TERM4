package week25.optionals;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalIfPresent {
    public static void main(String[] args) {
        Optional<String> nonEmptyOptional = Optional.of("SEBD ATA Term 4 Week 25");
        Optional<String> emptyOptional = Optional.empty();
        Optional nonEmptyOrEmptyOptional2 = Optional.ofNullable("");

        // ifPresent() - if value present invoke specified Consumer
        /*----------------------------------------------------------*/

        Consumer<String> consumer = s -> System.out.println(s);
        System.out.println("Let's see if the consumer is invoked here?");
        nonEmptyOptional.ifPresent(consumer); //SEBD ATA Term 4 Week 25
        System.out.println("Is it invoked here?");
        emptyOptional.ifPresent(consumer); //
        System.out.println("----");
        nonEmptyOrEmptyOptional2.ifPresent(consumer);
    }
}
