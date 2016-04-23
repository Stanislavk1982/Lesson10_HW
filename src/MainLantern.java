import java.util.Scanner;

/**
 * Created by Стивен on 23.04.2016.
 */
public class MainLantern {
    public static void main(String[] args) {
        ResueLantern resueLantern = new ResueLantern();
        Scanner scanner= new Scanner(System.in);
        resueLantern.inputBattary(scanner.nextInt());
        System.out.println("Select mode of lantern");
        resueLantern.turnOnLantern(scanner.next());
    }
}
