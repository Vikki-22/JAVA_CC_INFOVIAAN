import java.util.Scanner;

public class MarksCalculate {

    public static void main(String[] args) {
         
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of studend");
        String name=sc.nextLine();
        System.out.println("enter the roll no of studend");
        int RollNO=sc.nextInt();
        System.out.println("first subject marks");
        int phy=sc.nextInt();
        System.out.println("Second subject marks");
        int chy=sc.nextInt();
        System.out.println("third subjct marks");
        int maths=sc.nextInt();

        double avg= ( (maths+phy+chy)/3);
        if(avg>=75)
        {
            System.out.println("First div"+avg);
        }
        else if(avg>=60&&avg<=75)
        {
            System.out.println("second div");

        }
        else if(avg<=33);
    {
        System.out.println("fail");

    }
 
    }}
