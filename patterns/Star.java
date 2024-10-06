import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        // input the number of rows
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // outer loop for rows
        for (int i = 1; i <= n; i++) {
            // inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
}