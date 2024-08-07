import java.util.*;
public class GST {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("enter the price of pen:");
       Float pen=sc.nextFloat();
       System.out.print("enter the price of pencil:");
       Float pencil=sc.nextFloat();
       System.out.print("enter the price of eraser:");
       Float eraser=sc.nextFloat();
       double gst =pen*0.18 + pencil*0.18 + eraser*0.18;
       double total=pen+pencil+eraser+gst;
       System.out.println("The total bill including GST is:"+total);
    }
}
