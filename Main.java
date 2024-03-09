import controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("aaa", "aaa", "aaa");
        controller.createStudent("bbb", "bbb", "bbb");
        controller.getAllStudent();
        controller.createStudent("ccc", "ccc", "ccc");
        controller.createStudent("ddd", "ddd", "ddd");
        controller.getAllStudent();

    }
    
    
    
}
