import java.util.Scanner;

public class Triangle
 {
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the value of ab=");
       int ab=sc.nextInt(); 
       System.out.println("enter the value of abc=");
       int bc=sc.nextInt(); 
       System.out.println("enter the value of ac=");
       int ac=sc.nextInt(); 
       if(ab==bc && bc==ac && ac==ab)
       {
        System.out.println("The Triangle is Equilateral.");
       }
       else if(ab==bc|| bc==ac ||ac==ab)
       {
        System.out.println("The Triangle is Isoscales.");
       }
       else
       {
              System.out.println("The triangle is scalee");
       }
    }
    
}
