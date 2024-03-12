package modell;

import java.util.List;

public class Group {
    private Teacher teacher;
    private List<Student> studentList;

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "Group{\n" +
                "teacher:\n" + teacher + "\n" +
                "studentList:\n" + studentList +
                "}\n";
    }

    public Group(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }
}
