import java.util.Scanner;

public class seven{
     public static void main(String args[])
     {
        System.out.println("enter tne no  of n= ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
            
          for(int i=1;i<=n;i++)
         
          {
           
              for(int j=1;j<=i;j++)
              { 
                  if(j%2==0){
                    System.out.print("0");
                  }
                  else{
                    System.out.print("1");
                  }
            
              }
              System.out.println();
           
            
          }

     }
    
}
