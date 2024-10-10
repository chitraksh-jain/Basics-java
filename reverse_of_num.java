import java.util.*;
public class reverse_of_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=1;
        while(num!=0){
           n=num%10;
           num/=10;
           System.out.print(n);
        }  
    }
}
