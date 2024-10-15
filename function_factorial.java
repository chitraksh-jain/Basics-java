import java.util.*;
public class function_factorial {
    public  static int factorial(int n){
        int fact=1;
       for(int i=1;i<=n;i++){
        fact=fact*i;
       }
       System.out.println("factorial of "+n+" is: "+fact);
        return fact;
    }
    public static void main(String[] args) {
    Scanner SC=new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = SC.nextInt();
        factorial(num);
    }
}
