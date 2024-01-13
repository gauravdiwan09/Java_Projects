import java.util.Scanner;

public class ATM {

    double pin = 1234;
    double account = 12345678;
    double balance = 0;

    // Scanner for user input
    Scanner scanner = new Scanner(System.in);

    public void deposit() {
        System.out.println("Enter the amount you want to deposit:");
        double money1 = scanner.nextInt();
        balance += money1;
        System.out.println("Your money has been deposited successfully.");
    }

    public void withdrawal() {
        System.out.println("Enter the amount you want to withdraw:");
        double money2 = scanner.nextInt();
        if (money2 > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= money2;
            System.out.println("Your money has been withdrawn successfully.");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance + " Rupees");
    }

    public void menu() {
        System.out.println("Namaste, Ajay Prajapat!");
        System.out.println("Select function by its number:");
        System.out.println("Deposit(1)   Withdrawal(2)   Check Balance(3)   Exit(4)");
        int n = scanner.nextInt();

        switch (n) {
            case 1:
                System.out.println("Enter your pin:");
                long pin2 = scanner.nextInt();
                if (pin == pin2) {
                    deposit();
                    menu();
                } else {
                    System.out.println("Incorrect pin! Enter correct pin.");
                    menu();
                }
                break;

            case 2:
                System.out.println("Enter your pin:");
                pin2 = scanner.nextInt();
                if (pin == pin2) {
                    withdrawal();
                    menu();
                } else {
                    System.out.println("Incorrect pin! Enter correct pin.");
                    menu();
                }
                break;

            case 3:
                System.out.println("Enter your pin:");
                pin2 = scanner.nextInt();
                if (pin == pin2) {
                    checkBalance();
                    menu();
                } else {
                    System.out.println("Incorrect pin! Enter correct pin.");
                    menu();
                }
                break;

            case 4:
                System.out.println("Exiting the ATM. Goodbye!");
                System.exit(2);
                break;

            default:
                System.out.println("Something went wrong! Please try again...");
                menu();
                break;
        }
    }

    public static void enter(){
        ATM atm = new ATM();
        System.out.println("Enter your account number:");
        long acc = atm.scanner.nextInt();

        if (atm.account == acc) {
            atm.menu();
        }
        else{
            System.out.println("Incorrect account number! please re-enter");
            enter();
        }
    }

    public static void main(String[] args) {
        enter();
    }
}
