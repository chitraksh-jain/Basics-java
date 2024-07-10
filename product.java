import java.util.*;
public class product{
    public static void main(String args[]){
        System.out.println("Enter Two Number:");
        Scanner sc= new Scanner(System.in);
        float num1= sc.nextFloat();
        float num2 =sc.nextFloat();
        float sum=num1*num2;
        System.out.print(sum);
    }
}