// check the user is eligiable or not for vote

import java.util.Scanner;

public class VoteEligiable {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age =");
        int age =sc.nextInt();
        if(age>20)
        {
             System.out.println("You are eligiable for vote ");
        }
        else{
        System.out.println("your are not eligiable for vote");
    }
    }
    
}
