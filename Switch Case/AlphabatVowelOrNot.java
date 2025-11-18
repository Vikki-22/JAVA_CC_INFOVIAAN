import java.util.Scanner;

public class AlphabatVowelOrNot 
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the character for check alphabat is vowel or constaent = ");
        Character ch=sc.nextLine().charAt(0);
        switch (ch) {
            case 'a':
                {
                    
                System.out.println(" a is vowel");
                break;
                }
                 case 'e':
                {
                System.out.println(" e is vowel");
                break;
                }

                 case 'i':
                {
                System.out.println(" i is vowel");
                break;
                }

                 case 'o':
                {
                System.out.println(" o is vowel");
                break;
                }

                 case 'u':
                {
                System.out.println(" u is vowel");
                break;
                }

            default:
            System.out.println("your enter character is constent = "+ch);
                break;
        }
    }
}
