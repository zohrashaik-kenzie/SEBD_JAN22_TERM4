package week25.optionals;

import java.util.Optional;

public class OptionalIsPresent {
    public static void main(String[] args) {
        //isPresent() - returns true if value Present otherwise false
        /*----------------------------------------------------------*/
        Optional test1 = Optional.of("SEBD ATA Term 4"); //
        Optional test2 = Optional.empty();

        System.out.println(test1.isPresent()); //true
        System.out.println(test2.isPresent());//false

    }
}
