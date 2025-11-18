import java.util.Scanner;

public class Digit 
{
    public static void main(String[] args) {
        int no;
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the no to find how many digit in this no = ");
        no =sc.nextInt();
        int count =0;
        while(no!=0){
            count++;
            no=no/10;
        }
        System.out.println(" total digit in this no ="+count);
    }
}
