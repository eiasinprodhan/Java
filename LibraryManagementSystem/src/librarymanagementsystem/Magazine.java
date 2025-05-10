package librarymanagementsystem;

public class Magazine extends Item{
    int issueNumber;
    String frequency;

    public Magazine() {
    }

    public Magazine(int issueNumber, String frequency) {
        this.issueNumber = issueNumber;
        this.frequency = frequency;
    }

    public Magazine(int issueNumber, String frequency, String title, String author, int yearPublished) {
        super(title, author, yearPublished);
        this.issueNumber = issueNumber;
        this.frequency = frequency;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Issue Number: " + issueNumber
        +"\nFrequency: " + frequency);
    }
    
    
}
