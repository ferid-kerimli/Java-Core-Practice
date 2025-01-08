package week11;

import java.io.*;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person[] personsArray = new Person[] {
                new Person("Farid", 18),
                new Person("Omar", 17),
                new Person("Rashad", 19)
        };
    }
}

class PersonSerializationExample {
    public static void savePersonsToFile(Person[] persons, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(persons);
            System.out.println("Persons saved to file: " + filename);
        } catch (IOException e) {
            System.err.println("Error saving persons to file: " + e.getMessage());
        }
    }

    public static void readPersonsFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Person[] persons = (Person[]) ois.readObject();
            System.out.println("Persons read from file: ");
            for (Person person : persons) {
                System.out.println(person);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading persons from file: " + e.getMessage());
        }
    }
}
