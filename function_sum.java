import java.util.*;
public class function_sum {
    public static int calculate_sum(int num1, int num2){
      int sum = num1 + num2;
      System.out.println("sum is:"+sum);
      return sum;
    }
    public static void main(String[] args) {
        Scanner SC =new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int a = SC.nextInt();
        System.out.println("Enter the number 2:");
        int b = SC.nextInt();
        calculate_sum(a,b);
    }
}
