package part8.task35;

public class FinancialDepartment extends FactoryDepartments {
    private float workedHours;
    private float salary;


    public FinancialDepartment(String positions, float workedHours, float salary) {
        super(positions);
        this.workedHours = workedHours;
        this.salary = salary;
    }
    public int getFullSalary() {
        return (int) ((salary/hoursForMonth)*workedHours);
    }




}
