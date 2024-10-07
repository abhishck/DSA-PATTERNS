import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your salary:");
        float salary=sc.nextFloat();
        float tax=0;
        if(salary<500000){
            System.out.println("your tax is"+ tax);
        }else if(salary>=500000 && salary<=1000000){
            tax=0.2f*(salary) ;
            System.out.println("your tax is"+ tax);

        }else{
            tax=0.3f*(salary);
            System.out.println("your tax is"+ tax);
        }

    }
}
