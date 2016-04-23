import java.util.Scanner;

/**
 * Created by Стивен on 23.04.2016.
 */
public class MusicCenter {

    private double frequency;
    private int track;
    private boolean on;
    private String mode;
    Scanner scanner = new Scanner(System.in);

    public MusicCenter() {
        on = false;
        frequency = 0.0;
        track = 0;
    }

    public void turnOn(String on) {
        switch (on) {
            case "on":
                this.on = true;
                System.out.println("Music center is on");
                break;
            default:
                System.out.println("Please turn on Music center");
                break;
        }

    }

    public void modeCenter(String mode) {
        switch (mode) {
            case "radio":
                this.mode = "radio";
                radioOn();
                break;
            case "mp3":
                this.mode = "mp3";
                mp3On();
                break;

        }
    }

    public void radioOn() {
        if (on && mode == "radio") {
            System.out.println("Please enter frequany witch you wont to lesten");
            this.frequency = scanner.nextDouble();
            System.out.println("Now you are listening " + frequency + " radiostantion");
        } else {
            System.out.println("Please tern on mode: radio");
        }

    }

    public void mp3On() {
        if (on && mode == "mp3") {
            System.out.println("Please enter number of track");
            this.track = scanner.nextInt();
            System.out.println("Now you are listening treck # " + track);
        } else {
            System.out.println("Please turn on mode: mp3");
        }
    }
}
