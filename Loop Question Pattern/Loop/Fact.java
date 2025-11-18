import java.util.Scanner;

public class Fact {

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter the value of no =");
        int no=sc.nextInt();
        int fact=1;
        for(int i=no;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(" factorial = "+fact);
     }
}