package week05.Inheritance;

public class PhdStudent extends Student {
    private String department;
    private String courses;

    public PhdStudent(String firstName, String lastName, String gender, int studentId, String department,
            String courses) {
        super(firstName, lastName, gender, studentId);
        this.department = department;
        this.courses = courses;
    }

    // Getter and setter methods
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
        return "PhdStudent: firstName=" + getFirstName() + ", lastName=" + getLastName() + ", gender=" + getGender() + ", studentId=" + getStudentId() + ", department=" + department + ", courses=" + courses;
    }

    public boolean equals(PhdStudent pStud) {
        return super.equals(pStud) && this.department.equals(pStud.getDepartment()) && this.courses.equals(pStud.getCourses());
    }
}
