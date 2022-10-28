package optionals;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        /*
         * Optional.empty() returns an empty Optional.
         */

        String string = null;

        Optional emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        Optional nullOptional = Optional.empty();
        /*
         * Optional.of("something") returns non empty Optional.
         * it cannot be null - what happens if it is null?
         * how do we avoid that?
         */
        Optional nonEmptyOptional = Optional.of("Week 25");
        System.out.println(nonEmptyOptional); //Option[Testing]
        /*
         * Optional.ofNullable("somevalue") returns non empty Optional.
         * If value is null, will get Optional.empty()
         */
        Optional test1 = Optional.ofNullable(string); //Optional.empty
        System.out.println(test1);

        Optional test2 = Optional.ofNullable(null); //Optional.empty
        Optional test3 = Optional.ofNullable(Optional.empty());//Optional.empty
        Optional test4 = Optional.ofNullable(nullOptional); //Optional.empty Optional[Optional.empty]


//        System.out.println(nonEmptyOptional);
//
        System.out.println(test2);
        System.out.println(test3);
       System.out.println(test4);
    }
}
