import java.util.Scanner;

public class divisor 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter the no to find factors =");
        int no=sc.nextInt();
        for(int i=1;i<=no;i++)
        {
                if(no%i==0){
                    System.out.print(i +"  ");
                }
        }
    }
    
}
