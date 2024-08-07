import java.util.*;
public class average{
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter three numbers:");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float avg=(a+b+c)/3;
        System.out.print(avg);
        sc.close();
    }
}