package part6.task26;


import java.util.Scanner;

public class CashMachine {
    Money money = new Money(10, 10, 10);


    public void printMenu() {
        System.out.println("Welcome to CashMachine");
        System.out.println("1.Withdraw");
        System.out.println("2.Deposite");
        System.out.println("3.Check Balance");
        System.out.println("4.Exit");
    }

    public void readMenuNumber() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:
                withdrawMoney(sc);
                break;
            case 2:
                System.out.println("Enter Amount to deposite (only banknotes 20$, 50$, 100$)");
                addMoney(sc.nextInt());
                System.out.println("Balance Amount is:   " + money.calculateBalance());
                System.out.println("Money has been deposited succefully");
                System.out.println(" ");
                break;
            case 3:
                System.out.println("Balance of your Account is:  [ " + money.calculateBalance() + "$ ]");
                System.out.println(" ");
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println(" ");
        }
    }

    private void withdrawMoney(Scanner sc) {
        System.out.println("Enter Amount to be Withdraw");
        int withdraw = sc.nextInt();
        if (withdraw % 20 == 0 || withdraw % 50 == 0 || (withdraw - 20) % 50 == 0 || (withdraw - 50) % 20 == 0) {
            int balance = money.calculateBalance();
            if (balance >= withdraw) {
                withdraw(withdraw);
                System.out.println("Balance Amount is:   " + money.calculateBalance());
                System.out.println("Please collect money");
            } else {
                System.out.println("You don't have enough money for withdraw");
            }
        } else {
            System.out.println("Amount to withdraw (only banknotes 20$, 50$, 100$)");
        }
        System.out.println(" ");
    }


    public void addMoney(int deposite) {
        int hundredNumbers = deposite / 100;
        money.addHundred(hundredNumbers);
        deposite = deposite - hundredNumbers * 100;
        int fiftyNumbers = deposite / 50;
        money.addFifties(fiftyNumbers);
        deposite = deposite - fiftyNumbers * 50;
        int twentyNumbers = deposite / 20;
        money.addTwentyes(twentyNumbers);
        deposite = deposite - twentyNumbers * 20;
        System.out.println("Take change: [ " + deposite + "$ ]");
    }

    public void withdraw(int withdraw) {
        int hundredNumbers = Math.min(withdraw / 100, money.getHundred());
        money.removeHundred(hundredNumbers);
        withdraw = withdraw - hundredNumbers * 100;
        int fiftyNumbers = Math.min(withdraw / 50, money.getFifty());
        money.removeFifties(fiftyNumbers);
        withdraw = withdraw - fiftyNumbers * 50;
        int twentyNumbers = Math.min(withdraw / 20, money.getTwenty());
        money.removeTwentyes(twentyNumbers);
        System.out.println("Amount banknotes 100$ = " + "[ " + hundredNumbers + " pcs.]" + ", 50$ = [ " + fiftyNumbers + " pcs.], " + "20$ = [ " + twentyNumbers + " pcs.]");
    }


}
