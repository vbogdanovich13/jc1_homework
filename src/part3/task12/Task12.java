package part3.task12;

public class Task12 {
    public static void main(String[] args) {
        int day = 3;
        System.out.println(getWekSchedlue(day));

    }

    public static String getWekSchedlue(int day) {
        String text;
        if (day == 1) {
            text = "Понедельник: запланирован рабочий день.";
        } else if (day == 2) {
            text = "Вторник: запланирован рабочий день.";
        } else if (day == 3) {
            text = "Среда: запланирован рабочий день.";
        } else if (day == 4) {
            text = "Четверг: запланирован рабочий день.";
        } else if (day == 5) {
            text = "Пятница: запланирован сокращенный рабочий день.";
        } else if (day == 6) {
            text = "Суббота: запланирован отдых за городом.";
        } else if (day == 7) {
            text = "Воскресенье: запланирован поход в кинотеатр.";
        } else {
            text = "Дня с таким номером не существует";
        }
        return text;
    }

}
