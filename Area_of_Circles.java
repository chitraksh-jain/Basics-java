import java.util.*;
 public class Area_of_Circles{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter radius of circle:");
     float rad = sc.nextFloat();
     float pi=22/7f;
     System.out.print(pi*rad*rad);
     sc.close();
  }
 }
