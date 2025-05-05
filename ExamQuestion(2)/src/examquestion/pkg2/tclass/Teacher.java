package examquestion.pkg2.tclass;

public class Teacher extends Person {

    private int exprienceYear;
    private String tspName;

    public Teacher() {
    }

    public Teacher(int exprienceYear, String tspName) {
        this.exprienceYear = exprienceYear;
        this.tspName = tspName;
    }

    public Teacher(int exprienceYear, String tspName, String name, int age, String subject) {
        super(name, age, subject);
        this.exprienceYear = exprienceYear;
        this.tspName = tspName;
    }

    public int getExprienceYear() {
        return exprienceYear;
    }

    public void setExprienceYear(int exprienceYear) {
        this.exprienceYear = exprienceYear;
    }

    public String getTspName() {
        return tspName;
    }

    public void setTspName(String tspName) {
        this.tspName = tspName;
    }

    @Override
    public void personDetails() {
        System.out.println("Teacher's Details: ");
        super.personDetails();
        System.out.println("Exprience Years: " + exprienceYear);
        System.out.println("TSP Name: " + tspName);
        System.out.println("----------");
    }
}
