// Find the largest no of three no

import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the bno of a");
        int a=sc.nextInt();
         System.out.println("enter the bno of b");
         int b=sc.nextInt();
          System.out.println("enter the bno of c");
          int c=sc.nextInt();


          if(a>=b &&a>=c)
          {
              System.out.println("a is large no");
          }
          else if(b>=a && b>=c)
          {
            System.out.println("b is big");
          }
          else{ 
            System.out.println("c is max");
          
          }
    }
}
