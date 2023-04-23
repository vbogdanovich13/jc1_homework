package part8.task35;


public class ProductionDepartment extends FactoryDepartments {
    private int manufacturedProducts;
    private int percentageOfRevenue;


    public ProductionDepartment(String positions, int percentageOfRevenue, int manufacturedProducts) {
        super(positions);
        this.percentageOfRevenue = percentageOfRevenue;
        this.manufacturedProducts = manufacturedProducts;
    }

    static final float priceOfWorkOneProduct = 5;
    public int getFullSalary() {
        return (int) ((manufacturedProducts * priceOfWorkOneProduct)/100 * percentageOfRevenue);
    }
}
