import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        scanner.close();

        if (number < 0) {
            System.out.println("The number is negative");
        } else if (number > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("Zero");
        }
    }
}
