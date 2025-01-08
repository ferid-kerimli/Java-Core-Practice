package week12;

import java.util.Arrays;
import java.util.Comparator;

class Employee {
    private String firstName;
    private int age;
    private int salary;

    public Employee(String firstName, int age, int salary) {
        this.firstName = firstName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeArray {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Farid", 18, 90000),
                new Employee("Rashad", 19, 100000),
                new Employee("Omar", 19, 0)
        };

        // sorting according to firstname
        Arrays.sort(employees, Comparator.comparing(Employee::getFirstName));
        System.out.println("Sorted by firstname:");
        Arrays.stream(employees).forEach(System.out::println);

        // sorting according to ages
        Arrays.sort(employees, Comparator.comparingInt(Employee::getAge));
        System.out.println("\nSorted by age:");
        Arrays.stream(employees).forEach(System.out::println);

        // Sorting according to salary
        Arrays.sort(employees, Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Sorted by salary:");
        Arrays.stream(employees).forEach(System.out::println);
    }
}
