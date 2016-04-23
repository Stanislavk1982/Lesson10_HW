/**
 * Created by Стивен on 23.04.2016.
 */
public class ResueLantern {
    private int battary;

   public ResueLantern() {
       battary =0;
       System.out.println("Lantern is off because is no batteries");
   }


    public void inputBattary(int battary) {
        if (battary > 0 && battary < 4) {
            this.battary = battary;
            System.out.println("You set " + battary+" battery");
        } else {
            System.out.println("You can insert only from one to three batteries");
        }

    }

    public void redLLight() {
        if (battary > 0 && battary < 4) {
            System.out.println("The red light is on!!!!!!!!!!!");
        } else {
            System.out.println("Insert at least 1 baterry to turn on lantern in red light");
        }
    }

    public void whiteLight() {
        if (battary > 1 && battary < 4) {
            System.out.println("The white light is on!!!!!");
        } else {
            System.out.println("Insert at least 2 batteries and you can turn on lantern in white light" );
        }
    }

    public void flashingLight() {
        if (battary == 3) {
            System.out.println("Blam-blam-bla-blam-blam-blam");
        } else {
            System.out.println("Insert 3 batteries and you can turn on latern in flashing moide");
        }

    }
    public void turnOnLantern (String c) {
        switch (c) {
            case "r":
                redLLight();
                break;
            case"w":
                whiteLight();
            case"f":
                flashingLight();
                break;
            default:
                System.out.println("You enter incorrect mode of Lantern");
        }

    }
}
