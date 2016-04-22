import java.util.Calendar;

/**
 * Created by Стивен on 22.04.2016.
 */
public class AlarmClock {
    private String name;

    private int hours;
    private int minutes;
    private int seconds;
    private int secondsTemp;

    private int hoursAlarm;
    private int minutesAlarm;
    private int secondsAlarm;

    Calendar calendar = Calendar.getInstance();

    public AlarmClock() {
        name = "Default clock!";
        hours = 0;//calendar.get(Calendar.HOUR_OF_DAY);
        minutes = 0;//calendar.get(Calendar.MINUTE);
        seconds = 0;//calendar.get(Calendar.SECOND);
        secondsTemp = 0;//calendar.get(Calendar.SECOND);

        hoursAlarm = minutesAlarm = secondsAlarm = 0;
        System.out.println("Current time:" + hours + ":" + minutes + ":" + seconds);
    }

    public void stNanmeClock(String name) {
        this.name = name;
    }

    public void setCurrentTimeManual(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        System.out.println("Current time:" + hours + ":" + minutes + ":" + seconds);

    }

    public void setCurrentTimeAutomat() {
        hours = calendar.get(Calendar.HOUR_OF_DAY);
        minutes = calendar.get(Calendar.MINUTE);
        seconds = calendar.get(Calendar.SECOND);
        if (seconds != secondsTemp) {
            System.out.println("Current time:" + hours + ":" + minutes + ":" + seconds);
            secondsTemp = seconds;
        }

    }

    public void setAlarmTime(int hours, int minutes, int seconds) {
        hoursAlarm = hours;
        minutesAlarm = minutes;
        secondsAlarm = seconds;
        System.out.println("Alarm clock set:" + hoursAlarm + ":" + minutesAlarm + ":" + secondsAlarm);
    }

    public void fireAlarm() {
        System.out.println("Wake up!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public boolean isAlarmTime() {
        setCurrentTimeAutomat();
        if (this.hours == hoursAlarm && this.minutes == minutesAlarm) {

            return true;
        }
        return false;
    }

}
