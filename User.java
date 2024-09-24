//Cheyenne Prieto
// CS 2050
// Program 4
// Account number: 1965
import java.util.Scanner;
public abstract class User {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account customer = new Account();
        Savings savingsAccount = new Savings();
        Checking checkingAccount = new Checking();

        customer.setAccountNumber(1965);
        customer.setBalance(100);


        System.out.println("Welcome to the Bank! Please enter your account number.");
        int accountNumber = Integer.parseInt(input.nextLine());



        try {// account number verification
            if (accountNumber < 0) {
                System.out.println("Invalid account number, please enter a positive account number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter the account number to continue.");
        }

        try{
            if (accountNumber > 0 && accountNumber != customer.getAccountNumber()) {
                System.out.println("Enter a valid account number.");
                return;
            }
        }catch (Exception e) {

        }

        if (customer.getAccountNumber() == 1965) {
            System.out.println("Welcome! Which account would you like to view? (Checking/Saving)");
            String accountType = input.nextLine();
            try{ // account type verification
                if (accountType.equalsIgnoreCase("Checking")) {
                    checkingAccount.checking();
                }else if (accountType.equalsIgnoreCase("Saving")) {
                    savingsAccount.savings();
                } else{
                    System.out.println("Invalid input. Choose Checking or Saving account.");
                }

            } catch (NullPointerException e) {
                System.out.println("Invalid input. Please enter checking or saving account.");

            }


        } else if (customer.getAccountNumber() != 1965) {
            System.out.println("Invalid account number, please enter a valid account number.");

        }
    }
}


