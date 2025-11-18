public class Agecalculate 
{
    public int age(int y)
    {
        int currentyear=2025;
        int age=currentyear-y;
        return age;
    }

    public static void main(String[] args)
     {
        Agecalculate ob=new Agecalculate();
       System.out.println( ob.age(2004));;
     }
}
