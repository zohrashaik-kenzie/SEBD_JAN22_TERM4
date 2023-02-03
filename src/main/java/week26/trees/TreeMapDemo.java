package week26.trees;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        // Creating TreeMap of even numbers
        TreeMap<Integer, String> evenNumbers = new TreeMap<>();

        // Using put()
        evenNumbers.put( 2,"Two");
        evenNumbers.put( 4, "Four");

        // Using putIfAbsent()
        evenNumbers.putIfAbsent( 6, "Six");
        System.out.println("TreeMap of even numbers: " + evenNumbers);

        //Creating TreeMap of numbers
        TreeMap<Integer, String> oddNumbers = new TreeMap<>();
        oddNumbers.put(5, "Five");
        oddNumbers.put(3, "Three");
        oddNumbers.put(9, "Nine");
        oddNumbers.put(7, "Seven");
        oddNumbers.put(11, "Eleven");

        System.out.println("TreeMap of odd numbers: " + oddNumbers);

        // Using putAll()

        oddNumbers.putAll(evenNumbers);
        System.out.println("TreeMap of numbers: " + oddNumbers);
    }
}
