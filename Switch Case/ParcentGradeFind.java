import java.util.Scanner;

public class ParcentGradeFind 
{
 public static void main(String[] args) 
 {
    Scanner sc=new Scanner(System.in);
    System.out.print(" enter the marks of Hindi =");
    int Hindi=sc.nextInt();
    System.out.print(" enter the marks of English =");
    int English=sc.nextInt();
    System.out.print(" enter the marks of Maths =");
    int Maths=sc.nextInt();
    System.out.print(" enter the marks of Physics =");
    int Physics=sc.nextInt();
    System.out.print(" enter the marks of Chemistry =");
    int Chemistry=sc.nextInt();

    double Parcent=(Hindi+English+Maths+Physics+Chemistry)/5;

    System.out.println("Parcents ="+Parcent);
    int check;

    if (Parcent>=75) 
    {
        check =1;
    }
    else if(Parcent>=60 && Parcent<75)
    {
           check=2;
    }
    else if(Parcent>=50 && Parcent<60)
    {
          check=3;
    }
    else if(Parcent>=33 && Parcent<50)
    {
        check=4;
    }
    else
    {
        check=5;
    }
    switch (check) {
        case 1:
            { 
             System.out.println("A Grade");    
            break;
            }
            case 2:
            { 
             System.out.println("B Grade");    
            break;
            }
            case 3:
            { 
             System.out.println("C Grade");    
            break;
            }
            case 4:
            { 
             System.out.println("D Grade");    
            break;
            }
            case 5:
            { 
             System.out.println("Fail");    
            break;
            }
    
        default:
        System.out.println("envalid choice");
            break;
    }
 }   
}
