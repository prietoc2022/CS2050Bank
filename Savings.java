import java.util.Scanner;
public class Savings extends User {
    public void person (String name, int DOB, double balance ){


    }
    public void savings() {
        Account user = new Account();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            if (input.equalsIgnoreCase("Withdraw")) {
                System.out.println("Withdraw");

            } else if (input.equalsIgnoreCase("Deposit")) {
                System.out.println("Deposit");


            } else if (user.verification(input)) {
                System.out.println("Invalid input: Enter deposit or withdraw.");
            } else if (input.isBlank()) {
                System.out.println("Invalid input: Enter deposit or withdraw.");
            } else if (!input.equalsIgnoreCase("Withdraw") || !input.equalsIgnoreCase("Deposit")) {
                System.out.println("Invalid input: Enter deposit or withdraw.");
            }

        } catch (Exception e) {
            System.out.println("Invalid input: Enter deposit or withdraw.");
        }
    }
}