import java.util.Scanner;
import java.lang.Math;

public class Calculatour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timesRannn = 0;
        double[] results = new double[10];
        while (timesRannn < 10) {
            if (timesRannn == 10) {
                System.out.println(timesRannn);
                break;
            }
            System.out.println("Enter your first and second numbers");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            System.out.println("Enter your operator");
            String operator = scanner.next();
            if (operator.equals("+")) {
                System.out.println("Your answer is " + (a + b));
                results[timesRannn] = (a + b);
            } else if (operator.equals("-")) {
                System.out.println("Your answer is " + (a - b));
                results[timesRannn] = (a - b);
            } else if (operator.equals("*")) {
                System.out.println("Your answer is " + (a * b));
                results[timesRannn] = (a * b);
            } else if (operator.equals("/")) {
                System.out.println("Your answer is " + (a / b));
                results[timesRannn] = (a / b);
            } else if (operator.equals("^")) {
                System.out.println("Your answer is " + Math.pow(a, b));
                results[timesRannn] = Math.pow(a, b);
            } else if (operator.equals("q")) {
                timesRannn += 1;
                break;
            }
            timesRannn += 1;
        }
        System.out.println("Here are your results");
        for (double result : results) {
            System.out.println(result);
            /// now try running that
        }
        // you NNEEEEDD THE CURLY BRACKET
        // DANIEL SHUT UP - Liam Muray
        // Just Run The Program Daniel
        System.out.println("Here are the amount of times you ran.");
        System.out.println(timesRannn);
    }
}

// stop at 10 results
// @ 10 results, stop and print all results
