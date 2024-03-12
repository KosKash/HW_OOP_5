package modell;

import java.util.List;

public class Group {
    private List <Student> studentGroup;
    private Teacher teacher;
    
    
    public Group(List<Student> studentGroup, Teacher teacher) {
        this.studentGroup = studentGroup;
        this.teacher = teacher;
    }


    public List<Student> getStudentGroup() {
        return studentGroup;
    }


    public void setStudentGroup(List<Student> studentGroup) {
        this.studentGroup = studentGroup;
    }


    public Teacher getTeacher() {
        return teacher;
    }


    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
  
   
   


}
