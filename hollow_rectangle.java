public class hollow_rectangle{
    public static void fun_hollow_rectangle(int totrows ,int totcolumns){
        for(int i=1;i<=totrows;i++){
            for(int j=1;j<=totcolumns;j++){
               if(i==1 || i==totrows || j==1 || j==totcolumns){
                System.out.print("*");
               }
               else{
                System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       fun_hollow_rectangle(4,5);
    }
}  
