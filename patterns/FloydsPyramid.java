public class FloydsPyramid {
    public static void main(String[] args) {
        int n=1;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter the number of rows:");
        int m=sc.nextInt();
        for(int i=1;i<=m;i++){
            // for printing numbers
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
    
}
