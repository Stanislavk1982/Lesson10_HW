import java.util.Calendar;

/**
 * Created by Стивен on 22.04.2016.
 */
public class MainClock {
    public static void main(String[] args) throws InterruptedException {
        int i = 0;
       // int i1, i2, i3;
        Calendar calendar = Calendar.getInstance();

        AlarmClock alarmClock = new AlarmClock();
        alarmClock.setCurrentTimeAutomat();
        alarmClock.setAlarmTime(00, 20, 00);

        while (i == 0) {
            Thread.sleep(2000);
            //    i1 = calendar.get(Calendar.HOUR_OF_DAY);
            //   i2 = calendar.get(Calendar.MINUTE);
            //   i3 = calendar.get(Calendar.SECOND);
            //   alarmClock.setCurrentTimeManual(i1, i2, i3);

            //
           if (alarmClock.isAlarmTime()) {
                alarmClock.fireAlarm();
                break;
            }

        }
    }
}
