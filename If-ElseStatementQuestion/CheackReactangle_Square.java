import java.util.Scanner;

public class CheackReactangle_Square
 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of reactangle");
         int length=sc.nextInt();
         System.out.println("enter the breadth of reactangle");
         int breadth=sc.nextInt();
         if(length==breadth)
         {
            System.out.println("It's a valid Square ");
         }
         else{
            System.out.println(" Its not a Square");
         }
    }
 }
