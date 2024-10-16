import java.util.Random;
import java.util.Scanner;

public class Passward {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int nuMgUesS = 0;
        Random r = new Random();
        int password = r.nextInt(100);
        while (guess != password) {
            System.out.println("Enter password");
            guess = scanner.nextInt();
            if (guess > password) {
                System.out.println("Too high SUCKER!! HAHHAAHAHAHAHAHAHAHAHAHHAH NIMROD");
            } else if (guess < password) {
                System.out.println("Too low SUCKER!! HAHHAAHAHAHAHAHAHAHAHAHHAH NIMROD");
            } else if (guess == password) {
                System.out.println("grrr");
            }
            nuMgUesS += 1;
        }
        System.out.println("You tried " + nuMgUesS + " times succer. You STOOOOOPID!");
    }
}
