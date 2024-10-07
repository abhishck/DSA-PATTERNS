  public class LargestOfTwoNumbers{

   static void largestNumber(int x,int y){
        if(x>y){
            System.out.println(x+" is the larger than "+y);
        }
        else{
            System.out.println(y+" is the larger than "+x);
        }
    }
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter the first number:");
        int num1=sc.nextInt();
        System.out.println("enter the second number:");
        int num2=sc.nextInt();
         largestNumber(num1, num2);
    }

  }