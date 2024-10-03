import java.util.Scanner;

public class HelloWorld 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?" );
        String name = scanner.next();
        System.out.println("Nice to meet you, " + name);
        System.out.println("Give me a number and I'll double it.");
        // Crazy? I was crazy once. The locked me in a room. A rubber room. A rubber room with rats. Rats? Rats make me crazy. Crazy? I was crazy once. The locked me in a room. A rubber room. A rubber room with rats. Rats? Rats make me crazy.
        double x = scanner.nextDouble();
        System.out.println("The new answer is" + (2 * x));
        // Take in 2 numbers from the scanner
        // and add them together, and print the output
        
    }    
}
