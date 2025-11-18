import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) 
    {
        int rem;
        int rev =0;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value for find the reverse =");
        n=sc.nextInt();
        while (n>0) 
        {
         rem=n%10;
         rev=(rev*10)+rem;
         n=n/10;   
        }
        System.out.println(" reverse no ="+rev);
    }
    
}
