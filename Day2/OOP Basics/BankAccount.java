package Day2;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String  accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void deposite(double depositeAmount){
        balance+=depositeAmount;
        System.out.println("Current amount : "+balance);
    }

    public void withDraw(double withdraw){
        if (balance>0) {
            if (withdraw > balance) {
                System.out.println("Insufficient amount");
            }
            balance -= withdraw;
            System.out.println("Current amount : "+balance);
        }
        System.out.println("No Money withdraw Cancelled");
    }

    public void displayBankDetails(){
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Account Balance : "+balance);
    }

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("SAN2003",150000);
        ba1.displayBankDetails();
        ba1.deposite(200);
        ba1.withDraw(150200);

    }
}
