
package learnmap;


public class Student {
    private String name;
    private String subject;
    private String tspName;
    private String teacherName;
    private String status;
    private String phone;

    public Student() {
    }

    public Student(String name, String subject, String tspName, String teacherName, String status, String phone) {
        this.name = name;
        this.subject = subject;
        this.tspName = tspName;
        this.teacherName = teacherName;
        this.status = status;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTspName() {
        return tspName;
    }

    public void setTspName(String tspName) {
        this.tspName = tspName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    

    

    @Override
    public String toString() {
        
        return "Student's Details: \n" + "Name: " + name + "\nSubject: " + subject + "\nTSP Name: " + tspName + "\nTeacher's Name: " + teacherName + "\nStatus: " + status + "\nPhone: " + phone;
    }
    

}
