import java.util.Scanner;

class BankAccount {
    private float balance;

    public BankAccount(float initialBalance) {
        this.balance = initialBalance;
    }

    public float getBalance() {
        return balance;
    }

    public void deposit(float amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(float amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance. Transaction failed.");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }
}

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    float depositAmount = sc.nextFloat();
                    account.deposit(depositAmount);
                    checkBalance();
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    float withdrawAmount = sc.nextFloat();
                    account.withdraw(withdrawAmount);
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }

    public void checkBalance() {
        System.out.println("Your current balance is ₹" + account.getBalance());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial account balance: ");
        float initialBalance = sc.nextFloat();

        BankAccount userAccount = new BankAccount(initialBalance);
        ATM atm = new ATM(userAccount);

        atm.showMenu();
    }
}
