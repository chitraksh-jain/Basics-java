import java .util.*;
public class factorial{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number:");
        int n= sc.nextInt();
        int fact = 1;
        int i=n;
        while(i>=1){
            fact*=i;
            i--;
        }   
         System.out.println("the factorial of "+n+" is :"+fact); 
    }
}