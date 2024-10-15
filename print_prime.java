public class print_prime {
    public static boolean isprime(int n){
         
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
             return false;
            }
        }
       return true;
    }

    public static void print_prime(int range) {
        for(int i=3;i<=range;i++){
            isprime(i);
            if(isprime(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        print_prime(20);
    }
}

