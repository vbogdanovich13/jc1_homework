package part8.task35;

public class Main {
    public static void main(String[] args) {
        FinancialDepartment employee1 = new AccountingDepartment("Account", 115,1000);
        System.out.println("Заработная плата за прошлый месяц работника в должности " + employee1.getName() + " составляет " + employee1.getFullSalary() + " $");//почасовая
        ProductionDepartment employee2 = new SewingFactory("Seamstress", 10,1000);
        System.out.println("Заработная плата за прошлый месяц работника в должности " + employee2.getName() + " составляет " + employee2.getFullSalary() + " $"); //процентная

        SalesDepartment employee3 = new SalesDepartment("Salesman", 120, 1200, 6,1800);
        System.out.println("Заработная плата за прошлый месяц работника в должности " + employee3.getName() + " состовляет " + employee3.getFullSalary() + " $"); //смешанная
    }

}
