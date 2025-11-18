import java.util.Scanner;

public class Fibbonacci 
{
    public static void main(String[] args) 
    {
        System.out.print(" enter the value for fabbonacci series =");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first=0;
        int sec=1;
        int i=1;
        System.out.print("series = ");
        while (i<=10) 
        {
            int sum=first+sec;
            System.out.print(first+"  ");
            first=sec;
            sec=sum;
            i++;
        }
    }
}
