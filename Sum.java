import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        int firstInt = scanner.nextInt();
        
        
        int secondInt = scanner.nextInt();
        
     
        scanner.close();
        
    
        int sum = firstInt + secondInt;
        
        System.out.println( sum);
    }
}