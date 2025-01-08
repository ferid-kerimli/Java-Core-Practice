package week12;

import java.util.Collection;
import java.util.function.Predicate;

interface specificProperty<T> {
    boolean check(T item);
}

class Utility {
    static <T> long count(Collection<T> c, Predicate<T> p) {
        return c.stream().filter(p).count();
    }

    static <T> Collection<T> filter(Collection<T> c, Predicate<T> p) {
        return c.stream().filter(p).toList();
    }
}

public class SpecificProperty {
    public static void main(String[] args) {
        specificProperty<Integer> isOdd = n -> n % 2 != 0;

        specificProperty<Point> isInFirstQuadrant = point -> point.getX() > 0 && point.getY() > 0;

        specificProperty<String> isPangram = str -> str.chars().filter(Character::isAlphabetic).distinct().count() == 26;

        specificProperty<Person> isOlderThan20 = person -> person.getAge() > 20;

        System.out.println(isOdd.check(5)); // Output: true
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}