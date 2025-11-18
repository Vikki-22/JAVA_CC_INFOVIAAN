public class Array2d {

    public static void main(String[] args) {
        {
            int ar[][] = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };
            System.out.println("2D Array Elements:");
            System.out.println("---------Simple loop----------");
            for (int i = 0; i < ar.length; i++) {
                for (int j = 0; j < ar[i].length; j++) {
                    System.out.print(ar[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("---------print using for each loop----------");
            for (int[] row : ar) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }
    }
}