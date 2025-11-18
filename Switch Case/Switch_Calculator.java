import java.util.*;
public class Switch_Calculator {
    public static void main(String[] args) {

        System.out.println(" Calculator:-");
        System.out.println("--------please choose any no 1 to 4----------");
        System.out.println("1 for additon");
        System.out.println("2 for substraction");
        System.out.println("3 for multiply");
        System.out.println("4 for division");
        Scanner ob = new Scanner(System.in);

            int var = ob.nextInt();
        System.out.println("enter the first no");

        int no1 = ob.nextInt();
        System.out.println("enter the second no");

        int no2 = ob.nextInt();
       
        switch (var)
        {
            case 1:
                {
                    int sum=no1+no2;

                System.out.println("Sum="+sum);
                break;
            }
            case 2:
            {
                int sub=no1-no2;
                System.out.println("Substraction="+sub);
                break;
            }
            case 3:
            {
                int mul=no1*no2;

                System.out.println("Multiply="+mul);
                break;
            }
            case 4:
            {
                int div=no1/no2;

                System.out.println("Division="+div);
                break;
            }
            default:
            {
                System.out.println("Envalid choice");
            }
        }
    }
}
