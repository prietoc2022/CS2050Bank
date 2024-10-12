import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Program6 {
    public static void main(String[] args) throws IOException {
        Queue<Customer> queue = new LinkedList<>();
        accountStack checkStack = new accountStack();
        accountStack saveStack = new accountStack();

        for (int i = 1; i <= 10; i++) {


            String customerName = "Customer " + i;
            int customerID = 1000 + i;

            String accountName = "Account Name: " + i;
            int accountNumber = 2000 + i;

            Accounts account = new Savings(accountName, accountNumber);
            Customer customer = new Customer(customerName, customerID, account);

            // Add the customer to the queue
            queue.add(customer);
        }

        // Add Savings Accounts to stack
        System.out.println("Savings Accounts: ");
        System.out.println("-----------------------------");
        for (int i = 0; i < 10; i++) {
            Savings newSavings = new Savings();
            saveStack.push(newSavings);
            System.out.println(saveStack.peek());

        }
        //Add Savings Accounts to stack
        System.out.println("Checking Accounts: ");
        System.out.println("----------------------------");
        for (int i = 0; i < 10; i++) {
           Checking newChecking = new Checking();
           checkStack.push(newChecking);
           System.out.println(checkStack.peek());

        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Customers.txt"))) {
            oos.writeObject(queue);
            System.out.println("File written.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Customers.txt"))) {
            Queue<Customer> deserializedQueue = (Queue<Customer>) ois.readObject();
            System.out.println("Deserialized customer queue:");
            for (Customer customer : deserializedQueue) {
                System.out.println(customer);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }




    }

