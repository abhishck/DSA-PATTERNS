public class BinaryToDecimal {

    public static void binToDec(int binNum){
        int dec=0;
        int myNum=binNum;
        int pow=0;
        while(binNum>0){
           int rem=binNum%10;
           dec=dec+(int)(Math.pow(2,pow)*rem);
           pow++;
           binNum=binNum/10;
        }
        System.out.println("conversion of "+myNum+ " into decimal is: "+dec);
        
    }
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter the binary number: ");
        int binNum=sc.nextInt();
        binToDec(binNum);
    }
}
