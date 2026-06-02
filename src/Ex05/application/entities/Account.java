package Ex05.application.entities;

public class Account {
    private final int accountNumber;
    private String holder;
    private double balance;

    public Account(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;

        if (balance <= 0.0) {
            System.out.println("You cannot open an overdrawn account");
        } else {
            this.balance = balance;
        }
    }

    public Account(int accountNumber, String holder) {
        this.accountNumber = accountNumber;
        this.holder = holder;
    }

    public void accountStatus() {
        System.out.println("[      Status       ] Account Status [      Status       ]");
        System.out.println("Account number: " + accountNumber);
        System.out.println("Holder: " + holder);
        if (balance == 0.0) {
            System.out.println("No initial balance");
        } else {
            System.out.println("Balance: $" + balance);
        }
        System.out.println("**********************************************");
    }

    public void interactiveMenu() {
        System.out.println("[      Menu       ] Menu [      Menu       ]");
        System.out.println("1 - Deposit");
        System.out.println("2 - Withdraw");
        System.out.println("3 - Change holder");
        System.out.println("4 - Get Account Status");
        System.out.println("0 - Exit");
        System.out.println("**********************************************");


    }

    public void withdraw(double amount) {
        System.out.println("Success!");
        balance -= amount + 5.0;

        accountStatus();

        if (balance < 0) {
            System.out.println("You're Overdrawn $ " + balance);
        }

    }

    public void deposit(double amount) {
        System.out.println("Success!");
        balance += amount;

        accountStatus();
    }



    public String getHolder() {
        return holder;
    }

    public void setHolder(String updatedName) {
        holder = updatedName;
    }



}
