package school;

public class School {

    public static void main(String[] args) {
        Student student = new Student();
        
        //Student student = new Student(1287470,"Eiasin Prodhan","eiasinprodhan@gmail.com","01888118271","Jani Na","JEE","29/02/2020");
        
        student.setId(1287470);
        student.setName("Eiasin Prodhan");
        student.setEmail("eiasinprodhan@gmail.com");
        student.setMobile("01888118271");
        student.setPassword("Jani Na");
        student.setBatch("JEE");
        student.setDob("29/02/2020");
        
        student.getStudentDetails();
    }
    
}
