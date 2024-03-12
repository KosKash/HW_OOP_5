package servise;

import modell.*;

import java.util.ArrayList;
import java.util.List;


public class DataService {
    private List<User> users = new ArrayList<>();

    public void create(String firstName, String secondName, String lastName, Type type) {
        int id = getFreeId(type);
        if (type == Type.STUDENT) {
            users.add(new Student(firstName, secondName, lastName, id));
        } else if (type == Type.TEACHER) {
            users.add(new Teacher(firstName, secondName, lastName, id));
        }

    }

    private int getFreeId(Type type) {
        boolean isStudent = type == Type.STUDENT;
        int lastId = 1;
        for (User user : users) {
            if (user instanceof Student && isStudent)
                lastId = ((Student) user).getStudentId() + 1;
            else if (user instanceof Teacher && !isStudent) {
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
        }
        return lastId;
    }

    public List<Student> getStudent() {
        List<Student> studentList = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Student)
                studentList.add((Student) user);

        }
        return studentList;
    }

    public List<Teacher> getTeacher() {
        List<Teacher> teacherList = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Teacher)
                teacherList.add((Teacher) user);

        }
        return teacherList;
    }

    public List<User> getAllStudent() {
        List<User> studentList = new ArrayList<>();
        for (User user : users) {
            if (user instanceof User)
                studentList.add(user);
        }
        return studentList;
    }


    public Group createGroup(int teacherId, List<Integer> student) {
        Teacher teacher = null;
        List<Student> students = new ArrayList<>();

        for (User user : users) {
            if (user instanceof Teacher && ((Teacher) user).getTeacherId() == teacherId)
                teacher = (Teacher) user;
        }
        for (User user : users) {
            for (Integer i : student) {
                if (user instanceof Student && ((Student) user).getStudentId().equals(i))
                    students.add((Student) user);
            }
        }
        return new Group(teacher, students);
    }

}
//package service;
//
//        import model.Student;
//        import model.Teacher;
//        import model.Type;
//        import model.User;
//
//        import java.util.ArrayList;
//        import java.util.List;
//
//public class DataService {
//    private List<User> users = new ArrayList<>();
//    public void create(String firstName, String secondName, String lastName, Type type){
//        int id = getFreeId(type);
//        if(type == Type.STUDENT){
//            users.add(new Student(firstName,secondName,lastName, id));
//        }else if(type == Type.TEACHER){
//            users.add(new Teacher(firstName,secondName,lastName, id));
//        }
//
//    }
//    private int getFreeId(Type type){
//        boolean isStudent = type == Type.STUDENT;
//        int lastId = 1;
//        for (User user : users) {
//            if(user instanceof Student && isStudent)
//                lastId = ((Student) user).getStudentId() + 1;
//            else if (user instanceof Teacher && !isStudent) {
//                lastId = ((Teacher) user).getTeacherId() + 1;
//            }
//        }
//        return lastId;
//    }
//
//    public List<User> getUsers() {
//        return users;
//    }
//}
