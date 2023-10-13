package onlyjava;

public class MultipleConstructor {
    private int hour;
    private int minute;
    private int seconds;

    public MultipleConstructor() 
        this(0, 0, 0);
    }

    public MultipleConstructor(int h) {
        this(h, 0, 0);
    }

    public MultipleConstructor(int h, int m) {
        this(h, m, 0);
    }

    public MultipleConstructor(int h, int m, int s) {
        setTimeForConstructor(h, m, s);
    }

    public void setTimeForConstructor(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public void setSecond(int s) {
        seconds = ((s >= 0 && s < 60) ? s : 0);

    }

    public void setMinute(int m) {
        minute = ((m >= 0 && m < 60) ? m : 0);

    }

    public void setHour(int h) {
        hour = ((h >= 0 && h < 24) ? h : 0);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public String to24HourTime() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSeconds());
    }
}
