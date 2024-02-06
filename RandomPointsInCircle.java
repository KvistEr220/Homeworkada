import java.util.Random;

public class RandomPointsInCircle {
    public static void main(String[] args) {
        
        int n = 1;
        if (args.length == 1) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Sorry, the input is bad. Using 1");
            }
        }

        Random random = new Random();

        for (int i = 0; i < n; i++) {

            double x = -1 + 2 * random.nextDouble();
            double y = -1 + 2 * random.nextDouble();

  
            if (x * x + y * y <= 1) {
                System.out.println("Random point " + (i + 1) + ": (" + x + ", " + y + ")");
            } else {
                System.out.println("Random point " + (i + 1) + ": Outside the circle");
            }
        }
    }
}