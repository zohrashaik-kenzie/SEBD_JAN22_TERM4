package week25.optionals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapsWithStreams {

    public static void main (String[] args){

        //map with streams
        List<Integer> listOfIntegersMap = Arrays.asList("5", "10", "15", "20")
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(listOfIntegersMap);

        //flatmap with streams
        List<String> listOfIntegersFlatMap = Arrays.asList(Arrays.asList("5", "10"), Arrays.asList("15", "20"))
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(listOfIntegersFlatMap);

    }
}
