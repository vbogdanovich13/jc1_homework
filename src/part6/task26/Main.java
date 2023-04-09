package part6.task26;

public class Main {
    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine();
        while (true) {
            cashMachine.printMenu();
            cashMachine.readMenuNumber();
        }

    }
}