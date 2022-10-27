package week25.streams;

public class Employee {
    String firstName;
    String lastName;
    int tenure;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTenure() {
        return tenure;
    }

    public char getFirstNameFirstLetter(){
        return this.firstName.charAt(0);
    }

    public Employee( String firstName, String lastName, int tenure) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tenure = tenure;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
