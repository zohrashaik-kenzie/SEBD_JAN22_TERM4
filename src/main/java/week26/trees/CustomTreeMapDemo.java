package week26.trees;
// Java Program to Demonstrate TreeMap
// using Comparator Constructor

// Importing required classes
import java.util.*;

class Student {

    // Attributes of a student
    int roll_number;
    String name, address;

    // Constructor
    public Student(int roll_number, String name, String address)
    {

        // This keyword refers to current object itself
        this.roll_number = roll_number;
        this.name = name;
        this.address = address;
    }

    // Method of this class
    // To print student details
    public String toString()
    {
        return this.roll_number + " " + this.name + " "
                + this.address;
    }
}

class SortbyRollNumber implements Comparator<Student> {

    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b)
    {
        return a.roll_number - b.roll_number;
    }
}

// Class 3
// Main class
public class CustomTreeMapDemo {

    // Main driver method
    public static void main(String[] args)
    {

        System.out.println("TreeMap using "
                + "TreeMap(Comparator)"
                + " constructor:\n");
        // Creating an empty TreeMap
        TreeMap<Student, Integer> treeMap
                = new TreeMap<>(
                new SortbyRollNumber());

        // Mapping string values to int keys
        treeMap.put(new Student(901, "John Smith", "123 Main Street, Chicago, IL"), 2);
        treeMap.put(new Student(801, "Jane Doe", "1220 Jefferson Avenue, NYC, NY"), 3);
        treeMap.put(new Student(802, "Doe Smith", "425 Maple Lane, Boston, MA"), 1);

        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + treeMap);
    }
}
