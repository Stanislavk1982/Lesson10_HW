import java.util.Calendar;

/**
 * Created by Стивен on 22.04.2016.
 */
public class MainClock {
    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        AlarmClock alarmClock = new AlarmClock();
        alarmClock.setCurrentTimeAutomat();
        alarmClock.setAlarmTime(20, 38, 00);

        while (i == 0) {

            if (alarmClock.isAlarmTime()) {
                alarmClock.fireAlarm();
                break;
            }

        }
    }
}
