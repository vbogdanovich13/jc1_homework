package part8.task33;

public class AirConditioner extends LargeHomeAppliances{
    public String brandName;
    public String color;

    public AirConditioner(String brandName, String color) {
        this.brandName = "кондиционер " + brandName;
        this.color = color;
    }
    public String getName() {
        return brandName;
    }
}
