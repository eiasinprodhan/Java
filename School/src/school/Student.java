package school;

public class Student {

    private int id;
    private String name;
    private String email;
    private String mobile;
    private String password;
    private String batch;
    private String dob;

    public Student() {
    }

    public Student(int id, String name, String email, String mobile, String password, String batch, String dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
        this.batch = batch;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void getStudentDetails() {
        System.err.println("Details of " + this.name + ": ");
        System.out.println(
                "Id: " + this.id + "\n"
                + "Name: " + this.name + "\n"
                + "Email: " + this.email + "\n"
                + "Mobile: " + this.mobile + "\n"
                + "Password: " + this.password + "\n"
                + "Batch: " + this.batch + "\n"
                + "DOB: " + this.dob
        );
    }

}
