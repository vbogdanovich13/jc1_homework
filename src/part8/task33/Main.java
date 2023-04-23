package part8.task33;

public class Main {
    public static void main(String[] args) {
        Appliances appliances1 = new Fridge("LIEBHER","white");
        Appliances appliances2 = new Iron("TEFAL","blue");
        Appliances appliances3 = new AirConditioner("Haier","black");
        Appliances appliances4 = new Toaster("Smeg","red");

        appliances1.plugIn();
        appliances2.plugUN();
        appliances3.plugIn();
        appliances4.plugUN();


    }
}
