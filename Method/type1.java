public class type1
{
    public void FabbonacciSeries(int n)
    {
       int a=0;
        int b=1;
     
     for(int i=1; i<=n; i++)
     {   
       
       int Series=a+b;
        System.out.println(a);

      a=b;
      b=Series;
     
     }
    }
  public static void main(String args[]){
   type1 obj=new type1();
   obj.FabbonacciSeries(10);

  }
}