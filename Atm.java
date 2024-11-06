import java.util.*;
class BankAccount {
    public static double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
}
class Atm {
    private static BankAccount account;
    public Atm(BankAccount account) {
        this.account = account;
    }
    public static void checkBalance() {
        System.out.println("The current balance :$"+account.balance);
    }
    public static void deposit(double amount) {
        account.balance+=amount;
        System.out.println("Thankyou for Depositing!");
    }
    public static void withdraw(double amount) {
        if ((amount>0)&&(amount<=account.balance)) {
            account.balance -= amount;
            System.out.println("Withdrew: $"+amount);
        } else if (amount>account.balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
    } 
}
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(500); // Initial balance of $500
        Atm atm = new Atm(userAccount);
        Scanner sc=new Scanner(System.in);
        boolean exit=false;
            while(!exit) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
        }
    }
