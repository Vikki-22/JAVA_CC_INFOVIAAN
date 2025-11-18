import java.util.Scanner;

public class SumAvarage 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int i=1;
        int sum=0;
        int avg;
        while(i<=10)
        {
        System.out.print(" enter value =");
        int no=sc.nextInt();
        sum=sum+no;
        i++;
        }
        avg=sum/10;
        System.out.println(" sum of all 10 no ="+sum);
        System.out.println(" avarage of all 10 no ="+avg);
    }
    
}
