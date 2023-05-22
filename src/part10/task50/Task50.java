package part10.task50;

public class Task50 {

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers("src//part10//task50///file50.txt");
        randomNumbers.writeFile();
        System.out.println();
        randomNumbers.readFile();
        System.out.println("\nСреднее арифметическое: " + randomNumbers.average());

    }


}
