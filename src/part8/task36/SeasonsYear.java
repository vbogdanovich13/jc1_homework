package part8.task36;

public enum SeasonsYear {
    WINTER(90, "Зима"), SPRING(92, "Весна"), SUMMER(92, "Лето"), AUTUMN(91, "Осень");
    private int countOfDays;
    private String description;

    SeasonsYear(int countOfDays, String description) {
        this.countOfDays = countOfDays;
        this.description = description;
    }




}
