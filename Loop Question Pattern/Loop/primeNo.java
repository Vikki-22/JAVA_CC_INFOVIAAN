import java.util.Scanner;

public class primeNo 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no to check no is prime or not = ");
        int no=sc.nextInt();
        boolean flag=false;
        for( int i=3;i<=no;i++)
        {
            if(no%i==0)
            {
                flag=true;
                break;

            }
           
        }
     if(flag=true){
        System.out.println("no is a prime no");
     }
     else{
        System.out.println("no is not prime no");
     }
     
    }
}
