public class ela 
{
    public static void main(String[] args) {
        int n=1;
        int j=1;
        for(int i=1;i<=5;i++)
        {
             int m=j;
            for(j=1;j<=i;j++)
            {
                
                System.out.print(m+" ");
                m--;
            }
            System.out.println();
            m=m+i;
           
        }
    }
    
}
