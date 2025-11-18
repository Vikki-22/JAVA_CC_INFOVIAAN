public class twa 
{
    public static void main(String[] args) 
    {
        System.out.println("first way--------------");
        for(int i=5;i>=1;i--)
        {
                for(int k=i; k<=4;k++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++)
                {
                System.out.print("*");
                }
            System.out.println();
        }
        // second way
        System.out.println();
        System.out.println("second way------");
         for(int i=1;i<=5;i++)
        {
                for(int k=i; k<=4;k++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++)
                {
                System.out.print("*");
                }
            System.out.println();
        }
    }
    
}
