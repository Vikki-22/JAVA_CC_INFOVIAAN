import java.util.Scanner;

public class SquareCube 
{
    public static void main(String[] args) {
        int Square;
        int Cube;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no you want square and cube");
        int no=sc.nextInt();
        for(int i=0;i<1;i++){
            Square=no*no;
            Cube=no*no*no;
            System.out.println("Square = "+Square);
            System.out.println("Cube = "+Cube);
        }
    }
}
