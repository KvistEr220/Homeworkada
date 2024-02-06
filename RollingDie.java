public class RollingDie {
    public static void main(String[] args) {
        double randomNumber = Math.random();
        double[] probabilities = { 1.0 / 8, 1.0 / 8, 1.0 / 8, 1.0 / 8, 1.0 / 4, 1.0 / 4 };
        
        double cumulativeProbability = 0.0;
        int result = 0;

        for (int i = 0; i < 6; i++) {
            cumulativeProbability += probabilities[i];
            if (randomNumber <= cumulativeProbability) {
                result = i + 1;
                break;
            }
        }

        System.out.println(result);
    }
}
