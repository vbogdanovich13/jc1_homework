package part8.task35;

public class FactoryDepartments {

    public String positions;

    public FactoryDepartments(String positions) {
        this.positions = positions;
    }
    static final float hoursForMonth = 160;


    public String getName() {
        return positions;
    }

}

