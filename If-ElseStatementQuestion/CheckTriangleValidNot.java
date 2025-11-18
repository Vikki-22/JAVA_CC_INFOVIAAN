import java.util.Scanner;

public class CheckTriangleValidNot 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the a degree");
        int a=sc.nextInt();
        System.out.println("enter the b degree");
        int b=sc.nextInt();
        System.out.println("enter the c degree");
        int c=sc.nextInt();
        if((a+b)>c && (b+c)>a && (a+c)>b && (a+b+c)<180 )
        {
            System.out.println("The Triangle is valid");
        }
        else
        {
            System.out.println("The triangle is not valid");
        }
    }
}
