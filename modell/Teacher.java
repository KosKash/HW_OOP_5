package modell;

public class Teacher extends User{
    private int teacherId;

    public Teacher(String firstName, String secondName, String lastName, int teacherId) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher [teacherId=" + teacherId + " " + super.toString() + "]";
    }

        

    
}
