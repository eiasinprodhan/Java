package classtestquestion.pkg1.tclass;

public class Student extends Person {

    private int studentId;

    public Student() {
    }

    public Student(int studentId) {
        this.studentId = studentId;
    }

    public Student(int studentId, String name, int age) {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public void getStudentDetials() {
        super.getStudentDetials();
        System.out.println("Student ID: " + studentId);
    }

}
