import java.util.Scanner;

public class PrintDayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day number(0-6)");
        int dayNumber = sc.nextInt();
        switch (dayNumber) {
            case 0:
                System.out.println("monday");
                break;
            case 1:
                System.out.println("tuesday");
                break;
            case 2:
                System.out.println("wednesday");
                break;
            case 3:
                System.out.println("thursday");
                break;
            case 4:
                System.out.println("friday");
                break;
            case 5:
                System.out.println("saturday");
                break;
            case 6:
                System.out.println("sunday");
                break;

            default:
            System.out.println("invalid choice");
                break;
        }
    }
}