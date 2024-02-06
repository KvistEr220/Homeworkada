import java.util.Scanner;

public class CoinTossing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();


        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 0; i < n; i++) {
            double randomValue = Math.random();
            if (randomValue < 0.5) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        double headsProbability = (double) headsCount / n;
        double tailsProbability = (double) tailsCount / n;

        System.out.println("Number of heads: " + headsCount);
        System.out.println("Number of tails: " + tailsCount);
        System.out.println("Probability of heads: " + headsProbability);
        System.out.println("Probability of tails: " + tailsProbability);
    }
}
