package modell;

public class Student extends User {
    private Integer studentId;

    @Override
    public String toString() {
        return "Student { " +
                "studentId= " + studentId +
                super.toString()+
                "}\n";
    }

    public Student(String firstName, String secondName, String lastName, Integer studentId) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    public Integer getStudentId() {
        return studentId;
    }
}
