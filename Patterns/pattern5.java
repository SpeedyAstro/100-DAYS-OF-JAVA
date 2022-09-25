
public class pattern5 {
    public static void main(String[] args) {
        System.out.println();
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 5-i ; j>0 ; j--){
                System.out.print(" ");
            }
            for(int k = 0 ; k <i;k++){
                System.out.print("*");
            }
            for(int l = 1 ; l < i ; l++){
                System.out.print("*");
            }
            System.out.println();
            // System.out.println("*");
        }
    }
}
