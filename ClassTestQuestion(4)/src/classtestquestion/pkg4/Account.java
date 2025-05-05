package classtestquestion.pkg4;

public class Account {
    private int accountNumber;
    private double balance;

    public Account() {
    }

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void getAccountDetails(){
        System.out.println("Account Number: " + accountNumber + "\nBalance: " + balance);
    }
}
