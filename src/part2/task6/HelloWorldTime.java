package part2.task6;

public class HelloWorldTime {
    public static void main(String[] args) {
        int s = 1914400;
        int sec;
        int m;
        int min, h, week, day, d, hour;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hour = h % 24;
        d = (h - hour) / 24;
        day = h % 24;
        week = d / 7;
        System.out.println(week + " недель " + day + " суток " + hour + "  часов " + min + " минут " + sec + " секунд");
    }
}