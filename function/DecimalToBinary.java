import java.util.Scanner;

public class DecimalToBinary {

    public static void decToBin(int decNum){
        int bin=0;
        int pow=0;
        int myNum=decNum;
        while(decNum>0){
            int rem=decNum%2;
            bin= bin+(int)(Math.pow(10,pow)*rem);
            pow++;
            decNum=decNum/2;
        }
        System.out.println("conversion of "+myNum+ " into binary is: "+bin);
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("enter the decimal number : ");
        int decNum=sc.nextInt();
        decToBin(decNum);
    }
}
