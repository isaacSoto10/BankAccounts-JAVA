package BankAccount;

public class BankAccountTest{
    public static void main(String[] args){

        BankAccount account1 = new BankAccount();
        
        System.out.println("The bank account number for this account is : " + account1.getAccountNumber());
        account1.getCheckingBalance();
        account1.getSavingsBalance();
        account1.depositChecking(100.0);
        account1.depositSaving(1000.0);
        account1.withdrawalChecking(100);
        System.out.println(account1.getCheckingBalance());
        account1.withdrawalSavings(75);
        System.out.println(account1.getSavingsBalance());
        account1.total();
        System.out.println("The total amount in both the checking and savings accounts for this account is : $" + account1.total());
        
   }
}