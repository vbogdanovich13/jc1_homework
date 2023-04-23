package part8.task35;


public class SalesDepartment extends FinancialDepartment{

    private int percentageOfSales; // процент сотрудника по закрытым сделкам
    private int transactionRevenue; // выручка по закрытым сделкам

    public SalesDepartment(String positions, float workedHours, float salary, int percentageOfSales, int transactionRevenue) {
        super(positions, workedHours, salary);
        this.percentageOfSales = percentageOfSales;
        this.transactionRevenue = transactionRevenue;
    }


    public int getFullSalary(String positions, float workedHours, float salary, int percentageOfSales, int transactionRevenue) {
        return (int) ((salary/hoursForMonth)*workedHours) + (transactionRevenue/100)*percentageOfSales;
    }

}
