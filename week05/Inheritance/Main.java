package week05.Inheritance;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Farid", "Karimli", "Male");
        Teacher teacher = new Teacher("Farid", "Karimli", "Male", "IT", "Programming Principles II");
        Student student = new Student("Farid", "Karimli", "Male", 18176);
        PhdStudent phdStudent = new PhdStudent("Farid", "Karimli", "Male", 18176, "IT", "Programming Principles II");

        System.out.println(person);
        System.out.println(teacher);
        System.out.println(student);
        System.out.println(phdStudent);
    }
}
