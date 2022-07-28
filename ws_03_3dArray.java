public class ws_03_3dArray{
    public static void main(String[] args) {
        // Declaring an 3d array
        int [][][] a = new int [2][3][2];
        a[0][0][0] = 10;
        a[0][0][1] = 20;
        a[1][0][0] = 50;
        // int [][]b[];
        // int []c[][];
        int [][][] d = {{{10,20},{30,40,50,22},{60,70,80}}};
        System.out.println(d); //print hashcode
        System.out.println(d[0]);//print hashcode coz printing array
        System.out.println(d[0][0]);//print hashcode
        System.out.println(d[0][0][0]);//print 10
        for(int i=0;i<d.length;i++){
            for(int j=0;j<d[i].length;j++){
                for(int k=0;k<d[i][j].length;k++){
                    System.out.print(d[i][j][k]+" ");
                }
                System.out.println();
            } 
        }
    }
}
