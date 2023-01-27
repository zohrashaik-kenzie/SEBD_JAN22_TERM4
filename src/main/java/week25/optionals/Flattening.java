package week25.optionals;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Flattening {

        public static void main(String[] str)
        {

            List<String> listOfCountries=Arrays.asList("ireland","India","China","Nepal","Bhutan", "iceland");
            List<String> iCountries = listOfCountries.stream()
                     .map(String::toUpperCase)
                     .filter(country -> country.startsWith("I"))
                     .collect(Collectors.toList());
            System.out.println(iCountries);

            List<List<String>> listListCountries=Arrays.asList(Arrays.asList("United States","Canada", "Mexico"),
                    Arrays.asList("India","Pakistan","China"),
                    Arrays.asList("France","Germany", "ireland"),
                    Arrays.asList("Poland","Iceland","Scotland", "LaLaLand"));

            iCountries = listListCountries.stream()
                    .flatMap(lCountries -> lCountries.stream())
                    .map(String::toUpperCase)
                    .filter(country -> country.contains("LAND"))
                    .collect(Collectors.toList());
            System.out.println(iCountries);
        }
    }

