package controller;

import modell.TypeUser;
import service.DataService;
import view.StudentView;

public class Controller {
    DataService ds = new DataService();

    StudentView sv = new StudentView();

    public void createStudent(String firstName, String secondName, String lastName){
        ds.create(firstName, secondName, lastName, TypeUser.STUDENT);
    }

    public void getAllStudent(){
        sv.printOnConsoleArr(ds.getAllStudent());
    }

}
