import java.util.*;
public class recursion {
    public static int factorial(int num){
        if(num==1 || num==0)
            return 1;

        return num * factorial(num-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int result=factorial(num);
        System.out.println("The factorial of "+num+" is = "+result);
    }
}
