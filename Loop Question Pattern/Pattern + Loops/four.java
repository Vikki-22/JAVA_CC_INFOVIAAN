import java.util.Scanner;

public class four{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your no = ");
        int n=sc.nextInt();
        
          for(int i=1;i<=n;i++)
         
          {
             int no=1;
              for(int j=1;j<=i;j++)
              { 
                  System.out.print(no+" ");
                  no++;
              }
              System.out.println();
           
            
          }

     }
    
}
