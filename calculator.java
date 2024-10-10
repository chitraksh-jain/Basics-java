import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Num 1:");
        double num1=sc.nextInt();
        System.out.println("Enter Num 2:");
        double num2=sc.nextInt();
        System.out.println("Enter the Operator(+,-,*,/,%):");
        String operator=sc.next();
        switch (operator) {
            case "+": 
            System.out.println(num1+num2); 
            break;
            case "-":   
            System.out.println(num1-num2);
            break;
            case"*":
            System.out.println(num1*num2);
            break;
            case"/":
            System.out.println(num1/num2);
            break;
            case"%":
            System.out.println(num1%num2);
            break;
            default:
            System.out.println("please choose operator given below:");
                
        }
    }
}
