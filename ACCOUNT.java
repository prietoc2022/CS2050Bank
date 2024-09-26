import java.lang.*;
public abstract class ACCOUNT {
     String accountName;
     int accountNumber;
     double accountBalance;

    public ACCOUNT(String username, int accountNumber, double accountBalance) {
        this.accountName = username;
        this.accountNumber= accountNumber;
        this.accountBalance = accountBalance;
    }


   public void getAccountName() {
        System.out.println("Name: " + accountName);

   }
   public void setAccountName(String accountName) {
       this.accountName = accountName;

   }
   public void getAccountNumber(int accountNumber) {
        System.out.println("Account Number"+accountNumber);
       this.accountNumber = accountNumber;

   }
   public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;

   }
   public void getAccountBalance() {
        System.out.println("Account Balance: " + accountBalance);

   }
   public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;

   }

    public int getAccountNumber() {
        return accountNumber;
    }
}
