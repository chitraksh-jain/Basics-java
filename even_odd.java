import  java.util.*;
public class even_odd {
    public static void main(String args[]){
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt();
        if(num1 % 2==0){
            System.out.println("even");
        }
        else{
             System.out.println("odd");
        }
    }
}
