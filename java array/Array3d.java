public class Array3d {
    public static void main(String[] args) {
        {
            int ar[][][] = {
                    {
                            {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                    },
                    {
                            {10, 11, 12},
                            {13, 14, 15},
                            {16, 17, 18}
                    },
                    {
                            {19, 20, 21},
                            {22, 23, 24},
                            {25, 26, 27}
                    }
            };
            System.out.println("3D Array Elements:");
            System.out.println("---------Simple loop----------");
         for(int i=0; i<3; i++) {
                for(int j=0; j<ar[i].length; j++) 
                {
                    for(int k=0; k<ar[i][j].length; k++) 
                    {
                        System.out.print(ar[i][j][k] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            
          
            }
        }
    }
}
