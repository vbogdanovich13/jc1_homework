package part6.task26;

public class Money {
    private int twenty;
    private int fifty;
    private int hundred;

    public void addTwentyes(int number) {
        twenty = twenty + number;
    }
    public void addFifties(int number) {
        fifty = fifty + number;
    }
    public void addHundred(int number) {
        hundred = hundred + number;
    }

    public void removeTwentyes(int number) {
        twenty = twenty - number;
    }
    public void removeFifties(int number) {
        fifty = fifty - number;
    }
    public void removeHundred(int number) {
        hundred = hundred - number;
    }

    public int getTwenty() {
        return twenty;
    }

    public int getFifty() {
        return fifty;
    }

    public int getHundred() {
        return hundred;
    }

    public int calculateBalance() {
        return (twenty * 20) + (fifty * 50) + (hundred * 100);
    }


    public Money(int twenty, int fifty, int hundred) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.hundred = hundred;
    }
}
