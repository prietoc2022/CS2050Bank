import java.io.Serializable;
import java.lang.*;
import java.util.*;
public abstract class Accounts implements Serializable {
    protected String accountName;
    protected int accountNumber;


    public Accounts(String name, int accountNumber) {
        this.accountName = name;
        this.accountNumber = accountNumber;
    }//unused, save


    public String getAccountName() {
        return accountName;
    }

    protected int getAccountNumber(int accountNumber) {

        return this.accountNumber;
    }

    /*public void getAccountBalance() {
        System.out.println("Account Balance: " + accountBalance);

    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;

    }*/

}