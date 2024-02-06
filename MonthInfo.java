import java.util.Scanner;

public class MonthInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int monthNumber = scanner.nextInt();
        scanner.close();

        String monthName;
        int daysInMonth;

        switch (monthNumber) {
            case 1:
                monthName = "January";
                daysInMonth = 31;
                break;
            case 2:
                monthName = "February";
                daysInMonth = 28; 
                break;
            case 3:
                monthName = "March";
                daysInMonth = 31;
                break;
            case 4:
                monthName = "April";
                daysInMonth = 30;
                break;
            case 5:
                monthName = "May";
                daysInMonth = 31;
                break;
            case 6:
                monthName = "June";
                daysInMonth = 30;
                break;
            case 7:
                monthName = "July";
                daysInMonth = 31;
                break;
            case 8:
                monthName = "August";
                daysInMonth = 31;
                break;
            case 9:
                monthName = "September";
                daysInMonth = 30;
                break;
            case 10:
                monthName = "October";
                daysInMonth = 31;
                break;
            case 11:
                monthName = "November";
                daysInMonth = 30;
                break;
            case 12:
                monthName = "December";
                daysInMonth = 31;
                break;
            default:
                monthName = "No such month";
                daysInMonth = -1;
        }

        System.out.println(monthName + " has " + daysInMonth);
    }
}
