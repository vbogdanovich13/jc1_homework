package part8.task38;


public enum SeasonsYear {
    WINTER(90, "Зима"), SPRING(92, "Весна"), SUMMER(92, "Лето"), AUTUMN(91, "Осень");
    private int countOfDays;
    private String description;


    SeasonsYear(int countOfDays, String description) {
        this.countOfDays = countOfDays;
        this.description = description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public void setCountOfDays(int countOfDays) {
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
