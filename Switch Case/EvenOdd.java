import java.util.Scanner;

public class EvenOdd 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the for check you enerted no is even or odd = ");
        int no=sc.nextInt();
        int check=((no%2==0)?1:0);
        switch (check) {
            case 1:
            {
                System.out.println(" the no is even no ="+no);
                break;
            }
            case 0:
            {
                System.out.println("the no is odd no = "+no);
                break;
            }
        
            default:
            System.out.println(" you don't enter a valid number");
                break;
        }
    }
}
