package part8.task33;

public class Fridge extends LargeHomeAppliances {
    public String brandName;


    public String color;

    public Fridge(String brandName, String color) {
        this.brandName = "холодильник " + brandName;
        this.color = color;
    }

    public String getName() {
        return brandName;
    }


}
