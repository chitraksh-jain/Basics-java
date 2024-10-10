public class swap{
    public static void main(String args[]){
        int num1=30;
        int num2=20;
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("after swap the value of num 1 is:"+num1+" and num2 is:"+num2);
    }
}
