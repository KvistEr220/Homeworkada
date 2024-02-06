import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        System.out.println("Enter floating-point values (press Ctrl+D on Unix/Linux or Ctrl+Z on Windows to end input):");

        while (scanner.hasNextDouble()) {
            double num = scanner.nextDouble();
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        scanner.close();

        if (min == Double.POSITIVE_INFINITY && max == Double.NEGATIVE_INFINITY) {
            System.out.println("No number detected");
        } else {
            System.out.println("Minimum value: " + min);
            System.out.println("Maximum value: " + max);
        }
    }
}
