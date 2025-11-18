import java.util.Scanner;

public class FIndFirstLastNO 
{
    public static void main(String[] args) 
    {
        long no;
        System.out.print("enter the no to find first digit and digit ");
       
        Scanner sc= new Scanner(System.in);
        no=sc.nextLong();
        long no2=(no%10);
         System.out.println("----find first and last digit----");
        while(no>=10)
        {
             no=no/10;
        }
        System.out.println("Firt Digit ="+no);
        System.out.println(" Last Digit ="+no2);
        //  Arithmatic Operation 
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("----Arithmatic Operation----");
        long sum=no+no2;
        long sub=no-no2;
        long mul=no*no2;
        long div=no/no2;
        System.out.println("sum ="+sum);
        System.out.println("sub ="+sub);
        System.out.println("mul ="+mul);
        System.out.println("div ="+div);
        // Swap first last no
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Swaping  no");
        System.out.println(no +"  " +no2);
        no=no+no2;
        no2=no-no2;
        no=no-no2;
        System.out.println(no +"  "+no2);
    }
}
