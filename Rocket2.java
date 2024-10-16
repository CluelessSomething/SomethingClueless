import java.util.Scanner;

public class Rocket2 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Countdown Time");
        int time = scanner.nextInt();
        for (int i = time; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("BLAST off?");
    }
}