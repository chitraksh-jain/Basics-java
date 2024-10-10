
import java.util.*;

public class largest {
   public static void main(String args[]) {
      System.out.println("enter the two numbers to compare");
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      if (num1 > num2) {
         System.out.print("num1 is greater than num 2");
      } else if (num1 == num2) {
         System.out.print("both are equal");
      } else {
         System.out.print("num 2 is greater than num 1");
      }
   }
}
