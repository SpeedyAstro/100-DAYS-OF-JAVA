public class ws_02_2dArray {
    public static void main(String[] args) {
        int [][]a= new int [2][3]; // 2 rows and 3 columns
        a[0][0] = 10;
        a[0][1] = 20;
        a[1][1] = 50;
        int [][]b = new int [3][]; //size of b[0] is 3 and it is not linked to any other array
        int [][]c = new int [3][];
        c[0] = new int [5];
        c[1] = new int [2];
        // int [][] a1,b1; // a1 and b1 both 2D array
        // int [] a2[],b2; // a2 2D array b2 1D array
        // int [] a3[],b3[]; // both are 2D array
        int [][]n = {{10,20,30},{40,50,60}};
        // Jagged Array -
        // Intializing array
        int [][] y = new int [2][];
        a[0] = new int [4];
        a[1] = new int [3];
        int [][] x = {{10,20,30},{40,12},{70,80,90}};
        //printing the values of array
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
    }
}
