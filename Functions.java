public class Functions {
    public static double add(double x, double y) {
        return 2 * x + 4 * y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static void main(String... args) {
        double x = add(5, 7);
        System.out.println(x);
    }
}
