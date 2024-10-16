public class decimal_binary {
    public static void decimal_binary(int n) {
        int power=0;
        int binary=0;
        while(n>0){
            int rem =n%2;
            binary=binary+rem *(int)Math.pow(10,power);
            n=n/2;
            power++;

        }
        System.out.println(binary);
    }
    public static void main(String[] args) {
        decimal_binary(7);
    }
}
