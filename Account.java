public class Account extends User {
    //purpose of this class is to determine the type of account being used
   private int accountNumber;
   private double balance;
   

   public int getAccountNumber(){

       return accountNumber;
   }
   public int setAccountNumber(int accountNumber){

       return this.accountNumber = accountNumber;
   }

    public double getBalance() {

       return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static boolean verification(String input){ //checks if the input has both int amd char in them
        boolean letter = false;
        boolean number = false;
        for(char c : input.toCharArray()){
            if(Character.isLetter(c)){
                letter = true;
            }
            else if(Character.isDigit(c)){
                number = true;
            }
            if(letter && number){
                return true;
            }
        }
        return false;
    }
    // Account data does here

    }




