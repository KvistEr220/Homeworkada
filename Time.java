import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);

        int totalSeconds = scanner.nextInt();

        
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}