import java.util.Scanner;

public class CheckAlpha
{
    public static void main(String[] args) 
    {
        // Scanner sc=new Scanner(System.in);
        // String ac=sc.nextLine();

       int a='A';
       
        if(a>='a'||a<='z'||a>='A'||a<='Z')
        {
               System.out.println("The Given Character is Character");
        }
        else{
            System.out.println("the given character is number");
        }
    }

}