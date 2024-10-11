public class BinomialCoefficient {
    public static int calculateN(int n){
        int fact=1;
        for (int i =1;i<=n;i++){
            fact*=i;
        }
       return fact;
    }

    public static int calculateR(int r){
        int fact=1;
        for (int i =1;i<=r;i++){
            fact*=i;
        }
       return fact;
    }

    public static int calculatediff(int diff){
        int fact=1;
        for (int i =1;i<=diff;i++){
            fact*=i;
        }
       return fact;
    }

    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n=sc.nextInt();
        System.out.println("enter the value of r : ");
        int r=sc.nextInt();
        // int diff=n-r;
        int result=calculateN(n)/(calculateR(r)*calculatediff(n-r));
        
        System.out.println("Binomial Coefficient of "+ n + " and "+r+" is "+result);
    }
}
