public class sevanteen 
{
    public static void main(String[] args) 
    {
        for(int i=1;i<=5;i++){
            for(int k=i;k<=4;k++)
            {
              System.out.print(" ");

            }
            for(int j=1;j<=i;j++)
            { 
                if(i==1||i==5||j==1||i==2){
                System.out.print("* ");
                 }
                 else{
                    System.out.print(" ");
                 }
            }
            System.out.println();
        }
    }
}
