package classtestquestion.pkg4;

public class CurrentAccount extends Account{
    private int overdraftLimit;

    public CurrentAccount() {
    }

    public CurrentAccount(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public CurrentAccount(int overdraftLimit, int accountNumber, double balance) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public int getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void getAccountDetails() {
        super.getAccountDetails();
        System.out.println("Over Draft Limit: " + overdraftLimit);
    }
    
    public void withdraw(int withdrawAmmount){
        if(withdrawAmmount > (overdraftLimit + super.getBalance())){
            System.out.println("You can't withdraw more than " + (overdraftLimit + super.getBalance()));
        }
        else{
            double finalResult = (super.getBalance() - withdrawAmmount);
            if(finalResult<0){
                System.out.println("You have withdrawn " + withdrawAmmount + " taka. Now you have to pay " + ((-1) * finalResult));
            }
            else{
                System.out.println("You have withdrawn " + withdrawAmmount + " taka. Now you have " + (finalResult));
            }
        }
    }
    
    
}
