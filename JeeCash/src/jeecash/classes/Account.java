package jeecash.classes;

public class Account {

    private long accountNumber;
    private long balance;
    private String name;
    private int pin;
    
     Account[] setData = {
            new Account(1287039, 100, "Md. Atiqul Islam", 12345),
            new Account(1287046, 200, "Halima Akter", 12345),
            new Account(1287271, 300, "Atiqur Rahman", 12345),
            new Account(1287283, 400, "Md. Arifur Rahman", 12345),
            new Account(1287315, 500, "Sathe Khanom", 12345),
            new Account(1287462, 600, "Abdullah Al Masud", 12345),
            new Account(1287470, 10000000, "Eiasin Prodhan", 12345),
            new Account(1287519, 700, "Md. Rahmatullah", 12345),
            new Account(1287528, 800, "Md. Rahim Khan", 12345),
            new Account(1287647, 900, "Md. Sadiar Rahman", 12345),
            new Account(1287675, 1000, "Md. Rakib Islam", 12345),
            new Account(1287748, 1100, "Samim Junayet Istiaq", 12345),
            new Account(1287759, 1200, "Rejaul Karim", 12345),
            new Account(1287799, 1300, "Md. Parvej Hossen", 12345)
        };

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

    public void cashIn(long inputAccountNumber, int inputPin, long inputAmount) {
        if (inputAccountNumber == this.accountNumber) {
            if (inputPin == pin) {
                if (inputAmount > 0) {
                    long oldBalance = balance;
                    balance += inputAmount;
                    setBalance(balance);
                    System.out.println("Cash In successfull. Your old balance was "+ oldBalance +" .Now you have " + balance + " taka.");
                } else {
                    System.err.println("You have entered invalid value.");
                }
            } else {
                System.err.println(name + ", You have entered wrong pin. Try again.");
            }

        } else {
            System.err.println("Account not found.");
        }
    }

    public void cashOut(long inputAccountNumber, int inputPin, long inputAmount) {
        if (inputAccountNumber == this.accountNumber) {
            if (inputPin == pin) {
                if (inputAmount <= this.balance) {
                    long oldBalance = balance;
                    balance -= inputAmount;
                    setBalance(balance);
                    System.out.println("Cash Out Successfull. Your old balance was "+ oldBalance +" .Now you have " + balance + " taka.");
                } else {
                    System.err.println("Insufficient balance or invalid input.");
                }
            } else {
                System.err.println(name + ", You have entered wrong pin. Try again.");
            }

        } else {
            System.err.println("Account not found.");
        }
    }

    public void changePin(long inputAccountNumber, int oldPin, int newPin, int newPinAgain) {
        if (inputAccountNumber == accountNumber) {
            if (oldPin == pin) {
                if (newPin == newPinAgain) {
                    pin = newPin;
                    System.out.println(name + ", you have changed your pin. Your new pin is " + newPin + ".");
                } else {
                    System.err.println("Password not matching");
                }
            } else {
                System.err.println(name + ", you have entered wrong old pin.");
            }
        } else {
            System.err.println("Account not found.");
        }
    }

    public void accountDetails(long accountNumberInput, int inputPin) {
        if (accountNumberInput == accountNumber) {
            if (inputPin == pin) {
                System.out.println("Account Detials");
                System.out.println("Name: " + name);
                System.out.println("Balance: " + balance);
                System.out.println("Account Number: " + accountNumber);
            } else {

                System.err.println(name + ", You have entered wrong pin.");
            }
        } else {
            System.err.println("Account not found");
        }
    }

}
