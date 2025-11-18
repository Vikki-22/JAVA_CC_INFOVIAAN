//  check the no is even or odd

import java.util.Scanner;

public class EvenOdd 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter the value of a");
        int no=sc.nextInt();
        if(no%2==0)
        {
            System.out.println("The no is odd no"+no);
        }
        else{
            System.out.println(" The no is even no "+no);
        }
         
    }
}
