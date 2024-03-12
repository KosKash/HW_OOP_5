package service;

import java.util.ArrayList;
import java.util.List;


import modell.Student;
import modell.Teacher;
import modell.User;


public class GroupServise  {

    public List<User> createGroup(Teacher teacher, List<Student>studentGroup){
        List<User> group = new ArrayList<>();
        group.add(teacher);
        for (User student : studentGroup) {
            group.add(student);
        }
        return group;
    }
    
}
