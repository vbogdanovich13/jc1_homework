package part8.task33;

public class Iron extends SmallHomeAppliaces{
    public String brandName;
    public String color;

    public Iron(String brandName, String color) {
        this.brandName = "утюг " + brandName;
        this.color = color;
    }
    public String getName() {
        return brandName;
    }


}

