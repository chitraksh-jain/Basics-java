public class binary_decimal {
    public static void binary_to_decimal(long n){
        double decimal=0;
        long last_digit=0;
        int power=0;
       for(int i=1;i<=5;i++){
            last_digit=n%10;
             decimal=decimal+(last_digit * Math.pow(2,power));
             n=n/10;
             power++;
        }
        System.out.println(decimal);
    }
    public static void main(String[] args) {
        binary_to_decimal(10010);
    }
}
