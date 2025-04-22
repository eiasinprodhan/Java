package arrayofobjects;

public class Student {
    String name;
    String email;
    int roll;
    int mark;
    String subject;

    public Student() {
    }

    public Student(String name, String email, int roll, int mark, String subject) {
        this.name = name;
        this.email = email;
        this.roll = roll;
        this.mark = mark;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    
    
    public void getInfo(){
        System.out.println("Student's Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Roll: " + roll);
        System.out.println("Mark: " + mark);
        System.out.println("Subject: " + subject);
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", email=" + email + ", roll=" + roll + ", mark=" + mark + ", subject=" + subject + '}';
    }
    
    
}
