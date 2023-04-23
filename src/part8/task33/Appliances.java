package part8.task33;

public abstract class Appliances implements OnOff {
    abstract String getName();

    String name;


    @Override
    public void plugIn() {
        name = getName();
        System.out.println(name + " включен в розетку!");
    }

    @Override
    public void plugUN() {
        name = getName();
        System.out.println(name + " выключен из розетки!");
    }
}
