public class DisplayTime {
    private int hour;
    private int minute;
    private int seconds;

    public void setTime(int h, int m, int s) {
        hour = ((h >= 0 && h < 24) ? h : 0);
        minute = ((m >= 0 && m < 60) ? m : 0);
        seconds = ((s >= 0 && s < 60) ? s : 0);
    }


    public String to24Time() {
        return String.format("%02d:%02d:%02d", hour, minute, seconds);
    }

    public String to12HourTime() {
        return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 0 : hour % 12), minute, seconds, (hour < 12) ? "AM" : "PM");
    }


}
