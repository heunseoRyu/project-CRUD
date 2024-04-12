import java.util.ArrayList;

public class Student extends Grade{

    private String Name;
    private String StudentID;

    static ArrayList<Student> grades = new ArrayList<>();

    static public void printInfo(){
        grades.forEach(System.out::println);
    }

    public Student(String name, String studentID,Grade grade) {
        super(grade);
        this.Name = name;
        this.StudentID = studentID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }
}
