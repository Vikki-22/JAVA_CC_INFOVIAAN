import java.util.Scanner;

public class OddSum 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of N term =");
        int N=sc.nextInt();
        int sum=0;
        for(int i=1; i<=N;i++){
            if(i%2==0)
            {

            }
            else
            {
             System.out.println(i);
             sum=sum+i;
            }
            i++;
        }
        System.out.println("sum of odd Number ="+sum);
    }
}
