import java.util.Scanner;

public class MaxMinNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of no1 = ");
        int no1 = sc.nextInt();
        System.out.print("enter the value of no2 = ");
        int no2 = sc.nextInt();

        // max case
        int maxcase = (no1 > no2 ? 1 : 0);
        System.out.println("max case ");
        switch (maxcase) {
            case 1: {
                System.out.println("no1 is max");
                System.out.println(" no2 is min");
                break;
            }
            case 0: {
                System.out.println("no2 is max");
                System.out.println(" no1 is min");
                break;
            }
            default: {
                System.out.println("the no are same");
                break;
            }
        }
        int mincase = (no1 < no2 ? 1 : 0);
        System.out.println("min case");

        switch (mincase) {
            case 1: {
                System.out.println(" no1 is min");
                System.out.println("no2 is max");
                break;
            }
            case 0: {
                System.out.println(" no2 is min");
                System.out.println("no1 is max");
                break;
            }

            default:
            {  System.out.println("the no are same");
                break;
            }
        }
    }
}
