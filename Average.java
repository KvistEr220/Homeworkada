import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.println("EOF enabled");

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            sum += num;
            count++;
        }
        scanner.close();

        if (count == 0) {
            System.out.println("No input");
        } else {
            double average = (double) sum / count;
            System.out.println(average);
        }
    }
}
