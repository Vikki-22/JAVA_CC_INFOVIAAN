import java.util.*;
public class nine 
{
    public static void main(String[] args) {
        System.out.println(" enter the no of n= ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i =1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
              if(i%2==0)
              {
                    System.out.print("0");
              }
              else{
                System.out.print("12");
              }
            }
            System.out.println();
        }
    }
}
