public class ArrMethod {
     
     int[] sumAll(int x[])
 {  
        int v[]= new int (x.length);
        for (int i=0;i<x.length; i++)
        {
           v[i]=x[i]*x[i];

        }
        return v;
    }
    
        public static void main(String args[])
        {
    int a[]= {10,20,30,40,50};
    ArrMethod ob=new ArrMethod();
     ob.sumAll(a);
        }
        }

    
