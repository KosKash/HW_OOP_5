import controller.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("fff", "fff", "fff");
        controller.createStudent("aaa", "aaa", "aaa");
        controller.createStudent("bbb", "bbb", "bbb");

        controller.createTeacher("ttt", "ttt", "ttt");


        controller.printStudents();
        controller.printTeacher();

        List<Integer> idStudens = new ArrayList<>(Arrays.asList(1,2,3));

        System.out.println(controller.createGroup(1, idStudens));


    }
}
