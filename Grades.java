import java.util.Scanner;

public class Grades {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students");
        int students = scanner.nextInt();
        int[] grades = new int[students];
        for (int i = 0; i < students; i++) {
            System.out.println("Please enter grade");
            grades[i] = scanner.nextInt();
        }
        // grades.legnth
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        for (int i = 0; i < students; i++) {
            sum = sum + grades[i];
        }
        int average = sum / students;
        System.out.println("The average is" + average);
    }
}resluts[timesRannn]=