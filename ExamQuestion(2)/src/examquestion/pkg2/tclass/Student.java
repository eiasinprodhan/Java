package examquestion.pkg2.tclass;


public class Student extends Person{
    private int studentId;
    private int registrationNo;

    public Student() {
    }

    public Student(int studentId, int registrationNo) {
        this.studentId = studentId;
        this.registrationNo = registrationNo;
    }

    public Student(int studentId, int registrationNo, String name, int age, String subject) {
        super(name, age, subject);
        this.studentId = studentId;
        this.registrationNo = registrationNo;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(int registrationNo) {
        this.registrationNo = registrationNo;
    }

    @Override
    public void personDetails() {
        System.out.println("Student's Detials: ");
        super.personDetails();
        System.out.println("Student ID: " + studentId);
        System.out.println("Registration No: " + registrationNo);
        
    }
    
    
    
}
