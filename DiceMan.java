import java.util.Scanner;

public class DiceMan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter your guess (or 0 to exit): ");
            int userGuess = scanner.nextInt();

            if (userGuess == 0) {
                System.out.println("Exiting the game.");
                break;
            } else if (userGuess < 2 || userGuess > 12) {
                System.out.println("Error: Please enter a number between 2 and 12.");
                continue;
            }

            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            int computerGuess = dice1 + dice2;

            System.out.println("Computer's guess: " + computerGuess);

            if (userGuess == computerGuess) {
                System.out.println("Congratulations! You guessed correctly. The number indeed was: " +  computerGuess);
            } else {
                System.out.println("Sorry, the computer wins this round. It was:" +  computerGuess);
            }
        }

        scanner.close();
    }
}
