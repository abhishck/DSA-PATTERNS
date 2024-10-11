public class Factorial{

    public static void factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
            
        }
        System.out.println("factorial of "+n+" = "+fact);
    }
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter the number: ");
        int a=sc.nextInt();
        factorial(a);
    }
}