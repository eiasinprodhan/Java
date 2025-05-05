package classtestquestion.pkg4;

public class SavingAccount extends Account{
    private double interestRate;

    public SavingAccount() {
    }

    public SavingAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingAccount(double interestRate, int accountNumber, int balance) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void getAccountDetails() {
        super.getAccountDetails();
        System.out.println("Interest Rate: " + interestRate);
    }
    
    public void deposit(int depositAmmount){
        System.out.println("Your account number " + super.getAccountNumber() 
                + " has been creadited " + depositAmmount + " taka and now your balance is " + (depositAmmount + super.getBalance()));
    }
    
    
}
