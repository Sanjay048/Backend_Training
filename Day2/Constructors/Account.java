//Write a program with a class Account that has overloaded constructors to initialize accountNumber and balance in different ways.


package Day2;

public class Account {
    private int accountNumber;
    private double balance;

    public Account(){
        this.accountNumber=0;
        this.balance=0.0;
    }
    public Account(int accountNumber){
        this.accountNumber=accountNumber;
        this.balance=0.0;
    }
    public Account(int accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void displayAccountDetails(){
        System.out.println("Account Number : "+accountNumber+"\nBalance : "+balance);
    }

    public static void main(String[] args) {
        Account ac1 = new Account();
        ac1.displayAccountDetails();

        Account ac2 = new Account(2121048);
        ac2.displayAccountDetails();

        Account ac3 = new Account(2121048,50000);
        ac3.displayAccountDetails();
    }
}
