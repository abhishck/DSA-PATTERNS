public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int a=30,b=26,c=10;
        if(a>b){
            if(b>c)
            System.out.println(a+"is the greatest among all");
        }else if(b>c){
            System.out.println(b+"is the greatest among all");
        }else{
            System.out.println(c+"is the greatest among all");
        }
    }
}
