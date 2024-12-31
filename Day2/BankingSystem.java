package Day2;
import java.util.*;
public class BankingSystem {
    private String accountName;
    private int accountNumber;
    private double balance;

    public BankingSystem(String accountName, int accountNumber, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposite(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Current Amount : "+balance);
        }
        else System.out.println("Invalid Amount");
    }

    public void withDraw(double amount){
        if (amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Current Amount : "+balance);
        }
        else System.out.println("Insufficient Amount");
    }

    public void checkBalance(){
        System.out.println("Your Balance : "+balance);
    }

    public void displayBankDetails(){
        System.out.println("Account Details");
        System.out.println("Account Name : " +accountName+"\nAccount Number : " +accountNumber+"\nBalance : "+balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to SANJI Bank");

        System.out.print("Enter your Account Name : ");
        String accountName = sc.nextLine();

        System.out.print("Enter your Account Number : ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter the Deposite Amount : ");
        double balance = sc.nextDouble();

        BankingSystem ac1 = new BankingSystem(accountName,accountNumber,balance);
        int choice=0;
        while (choice!=5){
            System.out.println("------------------------------");
            System.out.println("           Bank Menu          ");
            System.out.println("------------------------------");
            System.out.println("1.Depostie\n2.WithDraw\n3.CheckBalance\n4.AccountDetails\n5.Exit");
            System.out.println("------------------------------");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
                switch (choice){
                    case 1:
                        System.out.print("Enter the Deposite Amount : ");
                        double depositeAmount = sc.nextInt();
                        ac1.deposite(depositeAmount);
                        break;
                    case 2:
                        System.out.print("Enter the WithDraw Amount : ");
                        double withDrawAmount = sc.nextInt();
                        ac1.withDraw(withDrawAmount);
                        break;
                    case 3:
                        ac1.checkBalance();
                        break;
                    case 4:
                        ac1.displayBankDetails();
                        break;
                    case 5:
                        System.out.println("Thank You");
                        break;
                    default:
                        System.out.println("Invalid choice");
            }
        }
    }
}
