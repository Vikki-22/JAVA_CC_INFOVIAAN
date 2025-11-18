import java.util.Scanner;

public class NOConvertPosiNegi
 {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no you want change posi to negi and negi to posi = ");
        int no=sc.nextInt();

        int change=(no>0?1:0);
        switch (change) {
            case 0:
                {
                    no=-no;
                    System.out.println(" number change into positive ="+no);
                    break;
                }
                  case 1:
                {
                    no=(no-(no*2));
                    System.out.println(" number change into negative ="+no);
                    break;
                }
        
        
            default:
                break;
        }
    }
}
