public class Main {
    public static void main(String[] args) {
        Grade grade = new Grade("수학",100.0);
        Student student = new Student("1","류",grade);

        Student.printInfo();
    }
}