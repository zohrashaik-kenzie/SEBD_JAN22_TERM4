package week25.streams;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStream {

    Stream<Integer> stream;

    public CreateStream() {
    }

    public CreateStream(Stream<Integer> stream) {
        this.stream = stream;
    }

    public void createStreamFromNumbers(){
        this.stream = Stream.of(2,2,4,5,12,6,21,32,14,63);
    }

    public void createStreamFromArray(Integer[] array){
        this.stream = Stream.of(array);
    }

    public void createStreamFromList(List list){
        this.stream = list.stream();
    }

    public void createStreamFromGenerate(int limit){
        this.stream = Stream
                .generate(() -> (new Random()).nextInt(100)).limit(limit);
    }

    public void collectToList(){
         List<Integer> evenNumbersList = stream.filter(element -> element%2 == 0)
                .collect(Collectors.toList());
        System.out.print(evenNumbersList);
    }

    public void collectToArray() {
        Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
        System.out.print(evenNumbersArr);
    }


    public void printStream(){
         this.stream.forEach(p -> System.out.println(p));
    }


}
