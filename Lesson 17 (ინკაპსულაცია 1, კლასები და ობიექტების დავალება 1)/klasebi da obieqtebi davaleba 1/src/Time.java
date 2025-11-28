public class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    void displayTime() {
        System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
