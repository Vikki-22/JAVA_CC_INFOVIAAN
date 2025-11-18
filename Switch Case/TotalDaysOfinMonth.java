import java.util.Scanner;

public class TotalDaysOfinMonth
{
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the name of month for check how many days present this momnth =  ");
    int MonthName=sc.nextInt();

    switch (MonthName) {
        case 1:
            {
                System.out.println(" January =31days");
            break;
            }
             case 2:
            {
                System.out.println(" Feburary =29days");
            break;
            }
             case 3:
            {
                System.out.println(" March =31days");
            break;
            }
             case 4:
            {
                System.out.println(" Aprail =30days");
            break;
            }
             case 5:
            {
                System.out.println("May =31days");
            break;
            }
             case 6:
            {
                System.out.println(" June =30days");
            break;
            }
             case 7:
            {
                System.out.println(" Julay =31days");
            break;
            }
              case 8:
            {
                System.out.println("  August =31days");
            break;
            }
              case 9:
            {
                System.out.println(" September =30days");
            break;
            }
              case 10:
            {
                System.out.println(" octomber =31days");
            break;
            }
              case 11:
            {
                System.out.println(" November =30days");
            break;
            }
              case 12:
            {
                System.out.println(" December =31days");
            break;
            }
        default:
               System.out.println("invalid choice");
            break;
    }
}
}