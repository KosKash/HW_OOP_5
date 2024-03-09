package view;

import java.util.List;

import modell.Student;

public class StudentView implements IUsersView<Student> {

    @Override
    public void printOnConsole(Student user) {
        System.out.println(user);
    }

    @Override
    public void printOnConsoleArr(List<Student> users) {
        for (Student student : users) {
            System.out.println(student);
        }

    }

}
