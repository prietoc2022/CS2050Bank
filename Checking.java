import java.util.ArrayList;
import java.util.Random;
public class Checking extends Accounts{

    public Checking() {
        super("Checking Account", (int) (Math.random()*200000));

    }


    @Override
    public String toString() {
        return "Checking Account: \nAccountNumber:" + accountNumber + ", AccountName:" + accountName + "]";
    }

//    public void setAccountNumber() {
//        Random rand = new Random();
//        accountNumber = new Random().nextInt(2000000);
//        setAccountNumber();
//        getAccountNumber(accountNumber);
//
//   }

//   public void accountName() {
//
//        Random rand = new Random();
//        accountStack temp = new accountStack();
//        ArrayList<String> name = new ArrayList<>();
//        name.add("Daphne Ward");
//        name.add("Drew Bledsoe");
//        name.add("Nathan MacKinnon");
//        name.add("Charlie Blackmon");
//        name.add("Nolan Arenado");
//        name.add("Tom Criuse");
//        name.add("Cale Makar");
//        name.add("Shohei Ohtani");
//        name.add("Haley McKlinney");
//        name.add("Paige Lowary");
//        name.add("Scarlett Johansson");
//        name.add("Reagan Ridley");
//        name.add("Taylor Swift");
//        name.add("Lolena Brian");
//        name.add("Megan Maroney");
//        name.add("Simone Biles");
//        name.add("Tom Brady");
//        name.add("Gabriel Landeskog");
//        name.add("Trust me Bro");
//        name.add("Lorraine Warren");
//        name.add("Linus Ullmark");
//        name.add("Brenton Doyle");
//        name.add("Lebron James");
//        name.add("Steph Curry");
//        name.add("Britney Spears");
//        name.add("Barry Bonds");
//        name.add("Scarlett Jones");
//        name.add("Gru Blanchard");
//        name.add("John Doe");
//        name.add("Jane Smith");
//        name.add("Michael Johnson");
//        name.add("Emily Davis");
//        name.add("David Brown");
//        name.add("Jessica Williams");
//        name.add("Daniel Miller");
//        name.add("Sophia Wilson");
//        name.add("James Moore");
//        name.add("Olivia Taylor");
//        name.add("William Anderson");
//        name.add("Isabella Thomas");
//        name.add("Ethan Lee");
//        name.add("Mia Harris");
//        name.add("Alexander Martin");
//        name.add("Charlotte White");
//        name.add("Benjamin Lewis");
//        name.add("Amelia Walker");
//        name.add("Lucas Hall");
//        name.add("Ava Young");
//        name.add("Henry Allen");
//        name.add("Ella King");
//        name.add("Samuel Wright");
//        name.add("Chloe Scott");
//        name.add("Jack Green");
//
//        int index = rand.nextInt(name.size());
//        tempName = name.get(index);
//        temp.push(tempName);
//
//        setAccountName(tempName);
//        getAccountName();
//    }

}




