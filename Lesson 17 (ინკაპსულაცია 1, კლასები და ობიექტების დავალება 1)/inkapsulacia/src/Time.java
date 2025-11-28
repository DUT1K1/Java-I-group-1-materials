public class Time {
    private final int hour;
    private final int minute;
    private final int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void printTime() {
        System.out.println(hour + ":" + minute + ":" + second);
    }

    public int add(final int a, int b) {
        b += 10;
//        a += 10;
        return a + b;
    }
}
