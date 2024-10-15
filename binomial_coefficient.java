import java.util.*;

public class binomial_coefficient {

    //creating a function for calculating factorial of values
    public static int factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
         fact=fact*i;
        }
        return fact;
    }

    //creating a function for calculating the binomial coefficient 
    public static int binomial_coefficient(){
        Scanner SC =new Scanner(System.in);

        //taking value of n and r 
        System.out.println("Enter the value of n :");
        int n=SC.nextInt();
        System.err.println("Enter the value of r :");
        int r=SC.nextInt();

        //calculating factorial of n and r
        int facto_n = factorial(n);
        int facto_r = factorial(r);
        int facto_n_minus_r = factorial(n-r);

        //applying formula of binomial coefficient : n!/(r! * (n-r)!)
        int bc=facto_n/(facto_r*(facto_n_minus_r));
        System.out.println("The binomial coefficent for the input values is : "+bc);
        return bc;
    }
    public static void main(String[] args) {
        binomial_coefficient();
    }
}
