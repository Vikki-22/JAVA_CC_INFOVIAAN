import java.util.Scanner;

public class EvanOddConvert 
{
    public static void main(String[] args) 
    {
         Scanner sc=new Scanner(System.in);
         System.out.print(" enter the number you want upgrade (for addition 1)  = ");
         int number=sc.nextInt();
         int increase=(number%2==0 ?1:0);
         switch (increase) {
            case 1:
                {
                    System.out.println("no is even ="+number);
                    number=number+1;
                   System.out.println("this no is even no and i convert the no into the odd for using add 1 ="+number); 
                break;
                }
                case 0:
                {
                    System.out.println("no is odd ="+number);
                    number=number+1;
                   System.out.println("this no is odd no and i convert the no into the even for using add 1 ="+number); 
                break;
                }
            default: System.out.println(" you enter the Zero");
                break;
         }
    }
}
