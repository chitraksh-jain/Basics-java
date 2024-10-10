import java.util.*;
public class income_tax_calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter your income /year:");
        double income=sc.nextDouble();
        double tax;
        if(income<=500000){
            System.out.println("No Tax");
        }
        else if(income>500000 && income<=999999){
            tax=income*0.2;
            System.out.println("you have to pay Tax"+tax);
        }
        else{
            tax=income*0.3;
            System.out.println("you have to pay tax:"+tax);
        }        
    }
}
