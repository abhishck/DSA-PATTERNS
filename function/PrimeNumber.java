public class PrimeNumber {

    public static boolean isPrime(int n){
        
        for(int i=2 ;i<n;i++){
            if(n%i==0){
               return false;
            
           
            }
        }
        return true;
        }
    
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter the number : ");
        int num=sc.nextInt();
        System.out.println(isPrime(num)); 
    }
}
