//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {

        public static void main(String[] args) {

            Savings savings = new Savings("cprieto", 1234, 100.0);
            Checking checking= new Checking("cprieto", 1234, 100.0);
            System.out.println("Saving Account Name:"+savings.accountName+"\nAccount Number: "+savings.accountNumber+"\nAccount Balance: "+savings.accountBalance);
            System.out.println("Checking Account Name: "+checking.accountName+"\nAccount Number: "+checking.accountNumber+"\nAccount Balance: "+checking.accountBalance);


        }

    }
