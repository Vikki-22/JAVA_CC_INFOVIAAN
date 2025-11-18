import java.util.Scanner;

public class CheckVowel 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the alphabat for check you enter alphabat is vowel or not =");
        Character ch=sc.next().charAt(0);
        if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println("It's a Vowel Character");
        }
        else{
            System.out.println("It's not a Vowel Character");
        }
    }
}
