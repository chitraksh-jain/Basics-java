import java.util.*;
public class area_of_rectangle{
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      System.out.print("enter the length and breadth of rectangle:");
      float length = sc.nextFloat();
      float breadth = sc.nextFloat();
      float result = length * breadth;
      System.out.println("the area of the rectangle is :");
      System.out.println(result);
      sc.close();
    }

}