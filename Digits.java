import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        scanner.close();

        int sum = 0;
        int product = 1;
        int count = 0;
        int temp = Math.abs(num);

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
            count++;
        }

        double average = (double) sum / count;

        System.out.println("Sum " + sum);
        System.out.println("Product " + product);
        System.out.println("Average " + average);
    }
}
