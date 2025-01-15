public class inverted_half_pyramid {
        public static void inverted_half_pyramid(int totrows ,int totcolumns){
            for(int i=1;i<=totrows;i++){
                for(int j=1;j<=totrows-i;j++){
                   System.out.print(" ");
                }
                for (int k=1; k<=i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
           inverted_half_pyramid(4,5);
        }
    }  
    

