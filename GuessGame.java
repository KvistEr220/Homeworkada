import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum number (A) ");
        int maxNumber = scanner.nextInt();

        
        int randomNumber = (int) (Math.random() * maxNumber) + 1;

        int attempts = 0;
        int guess;

        System.out.println("Guess the number between 1 and " + maxNumber + ":");

        while (true) {
            attempts++;
            System.out.print("Enter your guess (or use EOF to exit): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Exiting the game.");
                break;
            }
            guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("Congratulations! You won! The number was: "+ guess);
                break;
            } else if (guess < randomNumber) {
                System.out.println("Try higher!");
            } else {
                System.out.println("Try lower!");
            }
        }

        System.out.println("It took " + attempts + " attempts to get the number!");
        scanner.close();
    }
}