import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by Стивен on 23.04.2016.
 */
public class MicroWave {
    private String mode;
    private int grill;
    private int seconds;
    Scanner scanner = new Scanner(System.in);
    Calendar calendar = Calendar.getInstance();

    public MicroWave() {
        this.mode = "";
        this.grill = 0;
        this.seconds = 0;
    }

    public void turnOnMode(String mode) {
        switch (mode) {
            case "gamburger":
                this.mode = "gamburger"; // preheat gamburger
                turnOnGamburger();
                break;
            case "grill":
                this.mode = "grill"; // use grill
                turnOnGrill();
                break;
        }
    }

    public void turnOnGamburger() {
        if (this.mode == "gamburger") {
            timer();
            System.out.println("You can eat you heates gamburger");
        }
    }

    public void turnOnGrill() {
        if (this.mode == "grill") {
            System.out.print("Please select heating element: 1 - upper, 2-low, 3-both: ");
            this.grill = scanner.nextInt();
            timer();
            System.out.println("You can eat you grilled chiken");
        }
    }

    public void timer() {
        System.out.print("Please enter the cooking time in secons: ");
        this.seconds = scanner.nextInt();
        int tempSeconds1, tempSeconds2 = 0;
        do {
            calendar = Calendar.getInstance();

            tempSeconds1 = calendar.get(Calendar.SECOND);
            if (tempSeconds1 != tempSeconds2) {
                this.seconds--;
                tempSeconds2 = tempSeconds1;
                System.out.println(this.seconds);
            }

        } while (this.seconds != 0);
    }
}
