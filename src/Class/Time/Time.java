package Class.Time;

public class Time {
    public int hour;
    public int minute;
    public int second;

    // 모든 필드를 0으로 초기화한다.
    public Time() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    // 인자로 전달된 값으로 해당 필드를 초기화 하고, 유효 번위를 벗어나는 값이 전달되면 해당 필드를 0으로 초기화한다.
    public Time(int hour, int minute, int second) {
        if (0 <= hour && hour <= 23) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
        if (0 <= minute && minute <= 59) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
        if (0 <= second && second <= 59) {
            this.second = second;
        } else {
            this.second = 0;
        }

    }

    // Time 객체의 상태를 문자열로 변환
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
