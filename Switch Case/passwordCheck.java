import java.util.Scanner;

public class passwordCheck 
{
    public static void main(String[] args)
    {
        int pasword =171922;
         Scanner cs=new Scanner(System.in);
         System.out.println("enter the pass ");
         int enterpass=cs.nextInt();
         int check=(pasword==enterpass?1:0);
         switch (check) {
            case 1:{
                System.out.println(" password is correct");
                break;
            }
            case 0:
            {
            System.out.println("password is incorrect");
            break;
            }
            default:
                break;
         }
    }
}
