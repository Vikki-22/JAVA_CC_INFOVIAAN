import java.util.*;
public class eight 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no = ");
        int no=sc.nextInt();
        for(int i=1;i<=no;i++)
        {
            for(int j=1;j<=no;j++)
            {
                if(i==1 || j==1|| i==no|| j==no)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
