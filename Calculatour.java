import java.util.Scanner;

public class Calculatour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first and second numbers");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        String operator = scanner.next();
        if (operator.equals("+")) {
            System.out.println("Your answer is " + (a + b));
        } else if (operator.equals("-")) {
            System.out.println("Your answer is " + (a - b));
        } else if (operator.equals("*")) {
            System.out.println("Your answer is " + (a * b));
        } else if (operator.equals("/")) {
            System.out.println("Your answer is " + (a / b));
        }
        Math.pow(a, b);
        String power = scanner.next();
        if (power.equals("^")) {
            System.out.println("Enter your number and power");
            System.out.println("Your answer is " + (a * a));
        }

    }

}
