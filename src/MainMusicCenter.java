import java.util.Scanner;

/**
 * Created by Стивен on 23.04.2016.
 */
public class MainMusicCenter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MusicCenter musicCenter= new MusicCenter();
        System.out.println("Please turn on Musi Center");
        musicCenter.turnOn(scanner.next());
        System.out.println("Enter mode of Music Center");
        musicCenter.modeCenter(scanner.next());
        //musicCenter.radioOn();
    }
}
