//  check the no is even or odd no

import java.util.Scanner;

public class posi_Negi {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no ");
        int no=sc.nextInt();
        if(no>0)
        {
            System.out.println("The no is positive no" +no);
        
        }
        else{
            System.out.println("the no is negative no"+no);
        }

      }
}
