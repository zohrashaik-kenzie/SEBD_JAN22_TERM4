package week25.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeStream {
    Stream<Employee> stream;

    public EmployeeStream(Stream<Employee> stream) {
        this.stream = stream;
    }

    public EmployeeStream() {
    }

    public EmployeeStream(List list) {
        this.stream = list.stream();
    }

    public void convertStreamToArray(){
        Employee[] employees = stream.toArray(Employee []::new);
        for(Employee employee:employees){
            System.out.println(employee);
        }
    }

    public void convertStreamToList(){
        List<Employee> employees = stream.collect(Collectors.toList());
        for(Employee employee:employees){
            System.out.println(employee);
        }
    }

    public void convertStreamToMap(){
        Map<String, String> tenured = stream
                .filter(employee -> employee != null)
                .collect(Collectors.toMap(Employee::getLastName, Employee::getFirstName));
        for (Map.Entry<String, String> entry : tenured.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }

    public void groupBy() {
        Map<Character, List<Employee>> nameMap = stream
                .filter(employee -> employee != null)
                .collect(Collectors.groupingBy(Employee::getFirstNameFirstLetter));

        for (Map.Entry<Character, List<Employee>> entry : nameMap.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for(Employee employee : entry.getValue()){
                System.out.println(employee);
            }
        }
    }
    public void groupByConcurrent() {
        Map<Character, Long> countMap  = stream
                .filter(employee -> employee != null)
                .collect(Collectors.groupingByConcurrent(Employee::getFirstNameFirstLetter,
                        Collectors.counting()));

        for (Map.Entry<Character, Long> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public void printStream(){
        this.stream.forEach(p -> System.out.println(p));
    }


}
