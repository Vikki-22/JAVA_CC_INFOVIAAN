public class Array3dd
 {
    public static void main(String[] args) 
    {
        int arr[][][]= { 
            {
                {1,2,3},
                {4,5,6},
                {7,8,9}
                

            },
            { 
                {10,11,12},
                {13,14,15},
                {16,17,18}
               

            },
            {
                {19,20,21},
                {22,23,24},
                {25,26,27}
            
            }

        };
        System.out.println("3D Array Elements:");
        System.out.println("---------For Each Loop----------");
        for(int layer[][]:arr)
        {
               for(int row[]:layer)
               {
                for(int element:row){
                    System.out.print(element+" ");
                }
                          System.out.println();
               }
        }
    }
 }
