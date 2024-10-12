import java.io.Serializable;
import java.util.List;

public class Customer implements Serializable {

    private String name;
    private int customerID = 0;
    private Accounts account;


    public Customer (String name, int customerID, Accounts account) {
       this.name=name;
       this.customerID=customerID;
       this.account=account;
    }
    public Accounts getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }
   public int getCustomerID() {
        return customerID;
   }

    @Override
    public String toString() {
        return "Customer Name: " + name + ", CustomerID: CID0000" + customerID ;
    }



}