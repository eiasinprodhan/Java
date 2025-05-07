package jeecash.classes;

public class Account {

    private long accountNumber;
    private long balance;
    private String name;
    private int pin;

    public Account() {
    }

    public Account(long accountNumber, long balance, String name, int pin) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.pin = pin;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void accountDetails(long accountNumberInput) {
        if (accountNumberInput == accountNumber) {
            System.out.println("Account Detials");
            System.out.println("Name: " + name);
            System.out.println("Balance: " + balance);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.err.println("Account Not Found");
        }
    }

    public void cashIn(long inputAccountNumber, long amount) {
        if (inputAccountNumber == this.accountNumber) {
            if (amount > 0) {
                balance += amount;
                setBalance(balance);
                accountDetails(inputAccountNumber);
            } else {
                System.err.println("Invalid input.");
            }

        } else {
            System.err.println("Wrong account number.");
        }
    }

    public void cashOut(long inputAccountNumber, long amount) {
        if (inputAccountNumber == this.accountNumber) {
            if (amount <= this.balance) {
                balance -= amount;
                setBalance(balance);
                accountDetails(inputAccountNumber);
            } else {
                System.err.println("Insufficient balance or wrong input.");
            }

        } else {
            System.err.println("Wrong account number.");
        }
    }

}
