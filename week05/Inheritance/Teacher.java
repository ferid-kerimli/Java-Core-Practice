package week05.Inheritance;

public class Teacher extends Person {
    private String department;
    private String courses;

    public Teacher(String firstName, String lastName, String gender, String department, String courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    // Getter and Setter methods
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Teacher: firstName=" + getFirstName() + ", lastName=" + getLastName() + ", gender=" + getGender() + ", department=" + department + ", courses=" + courses;
    }

    public boolean equals(Teacher t) {
        return super.equals(t) && this.department.equals(t.getDepartment()) && this.courses.equals(t.getCourses());
    }
}
