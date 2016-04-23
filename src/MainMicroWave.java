import java.util.Scanner;

/**
 * Created by Стивен on 23.04.2016.
 */
public class MainMicroWave {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MicroWave microWave=new MicroWave();
        System.out.print("Please select the opereting mode of microwave (grill or gamburger): ");
        microWave.turnOnMode(scanner.next());
    }
}
