import java.util.Scanner;

public class NoIsPositiveNegativeZerp 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the you want chek the no is positive negative or zero");
        int number=sc.nextInt();

        int check=(number>=0?1:0);
        switch (check) {
            case 1:
                 System.out.println(" the no is positive no ="+number);
                break;

                case 0:
                 System.out.println(" the no is negative no ="+number);
                break;
            default:
            System.out.println(" the no is Zero....");
                break;
        }
    }
}
