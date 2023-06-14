package ChapterThree;

public class Clock {
    private int hour;
    private int minute;
    private int second;
    public Clock(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void hour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void minute(int minute) {
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void second(int second) {
        this.second = second;
    }

    public int getSecond() {
        return second;
    }
}
