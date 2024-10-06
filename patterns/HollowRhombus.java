public class HollowRhombus {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if ((i + j == 3) || (i + j == 4) || (i + j == 5) && i!=5) {
                    System.out.print(" ");

                } else {
                    System.out.print("*");
                }
            }
            // for (int j = 1; j <= 5 - i; j++) {
            //     if ((i + j == 8) || (i + j == 9)) {
            //         System.out.print("*");
            //     } else {
            //         System.out.print(" ");
            //     }
            // }
            System.out.println();
        }
    }
}
