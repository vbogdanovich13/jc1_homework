package part8.task33;

public class Toaster extends SmallHomeAppliaces{
    public String brandName;
    public String color;

    public Toaster(String brandName, String color) {
        this.brandName = "тостер " + brandName;
        this.color = color;
    }
    public String getName() {
        return brandName;
    }
}
