package part6.task25;

public class Time implements Comparable<Time> {
    private Integer sec;
    private Integer min;
    private Integer hour;

    public static void main(String[] args) {
        Time time1 = new Time(58, 43, 19);
        Time time2 = new Time(1523);
        time1.printTime();
        System.out.println(time1.convertTimeToSeconds());
        time1.compareTo(time2);
    }

    public Time(int sec, int min, int hour) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    public Time(Integer s) {
        this.sec = s % 60;
        int m = (s - sec) / 60;
        this.min = m % 60;
        this.hour = (m - min) / 60;
    }

    public void printTime() {
        System.out.println(hour + " " + min + " " + sec);
    }

    public int convertTimeToSeconds() {
        int s = sec + (min * 60) + (hour * 60 * 60);
        return s;
    }


    public int compareTo(Time t) {
        Integer a = t.convertTimeToSeconds();
        Integer b = convertTimeToSeconds();
        int result = b.compareTo(a);
        if (result == 0) {
            System.out.println("Временные промежутки равны.");
        } else if (result > 0) {
            System.out.println("Данный промежуток времени больше сравниваемого.");
        } else {
            System.out.println("Данный промежуток времени меньше сравниваемого.");
        }
        return result;
    }


}

