import java.util.Scanner;

public class SumProduct 
{
    public static void main(String[] args) {
        int sum=0;
        double avg = 0;
        for(int i=1;i<=10;i++)
        {
           Scanner sc =new Scanner(System.in);
           System.out.println(" enter the no = ");
           int no=sc.nextInt();
           
           
       
           sum=sum+no;
            
        }
        avg=sum/10;
        System.out.println("avg ="+avg);
        System.out.println(" total sum ="+sum);
        
    }
}
