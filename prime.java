import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
     int num = sc.nextInt();
     int prime=0;
     for(int i=2;i<num;i++){
        if(num%i==0){
            prime=0;
            break;
        }
        else{
            prime=1;
        }        
     }
     if(prime==1){
     System.out.println("prime");
    }
    else{
        System.out.println("not a prime");
    }
}
}