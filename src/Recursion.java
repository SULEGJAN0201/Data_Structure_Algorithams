import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the Number :");
        int number= s.nextInt();

        Recursion R = new Recursion();
       int value = R.sum(number);
        System.out.println("Sum of "+number+" is "+value);
    }
    public  int sum(int num){
        if (num==1){
            return 1;
        }
     return   num+ sum(num-1);
    }
}
