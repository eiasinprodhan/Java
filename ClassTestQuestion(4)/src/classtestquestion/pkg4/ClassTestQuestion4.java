
package classtestquestion.pkg4;

public class ClassTestQuestion4 {

    
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(0.10, 168658480, 100);
        sa.getAccountDetails();
        sa.deposit(500);
        
        System.out.println("\n-------------------\n");
       
        CurrentAccount ca = new CurrentAccount(500, 1658458850, 800);
        ca.getAccountDetails();
        ca.withdraw(1400);
    }
    
}
